package team.dsys.dssearch.cluster;

//import team.dsys.dssearch.shard.*;

import cluster.proto.*;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.TypeLiteral;
import com.netflix.governator.guice.LifecycleInjector;
import com.netflix.governator.lifecycle.LifecycleManager;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.microraft.RaftEndpoint;
import io.microraft.RaftNode;
import io.microraft.report.RaftNodeReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import team.dsys.dssearch.cluster.config.ClusterServiceConfig;
import team.dsys.dssearch.cluster.config.NodeEndpointConfig;
import team.dsys.dssearch.cluster.exception.ClusterServerException;
import team.dsys.dssearch.cluster.lifecycle.TerminationAware;
import team.dsys.dssearch.cluster.module.ClusterServiceModule;
import team.dsys.dssearch.cluster.raft.RaftNodeEndpoint;
import team.dsys.dssearch.cluster.raft.report.RaftNodeReportSupplier;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

import static com.google.inject.name.Names.named;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static team.dsys.dssearch.cluster.module.ClusterServiceModule.RAFT_NODE_SUPPLIER_KEY;

public class ClusterServiceImpl implements ClusterService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClusterService.class);

    private final ClusterServiceConfig config;
    private final RaftEndpoint nodeEndpoint;
    private final Injector injector;
    private final LifecycleManager lifecycleManager;
    private final RaftNode raftNode;
    private final Supplier<RaftNodeReport> raftNodeReportSupplier;
    private final AtomicReference<Status> status = new AtomicReference<>(Status.LATENT);
    private final AtomicBoolean processTerminationFlag = new AtomicBoolean();
    private volatile boolean terminationCompleted;

    private ClusterServiceImpl(ClusterServiceConfig config, RaftEndpoint nodeEndpoint, List<RaftEndpoint> initialEndpoints,
                         Map<RaftEndpoint, String> endpointAddresses) {
        try {
            this.config = config;
            this.nodeEndpoint = nodeEndpoint;
            Module module = new ClusterServiceModule(config, nodeEndpoint, initialEndpoints, endpointAddresses,
                    processTerminationFlag);
            this.injector = LifecycleInjector.builder().withModules(module).build().createInjector();
            this.lifecycleManager = injector.getInstance(LifecycleManager.class);

            //lifecycleManager.start();
            status.set(Status.RUNNING);

            Supplier<RaftNode> raftNodeSupplier = injector.getInstance(Key.get(new TypeLiteral<Supplier<RaftNode>>() {
            }, named(RAFT_NODE_SUPPLIER_KEY)));
            this.raftNode = raftNodeSupplier.get();
            this.raftNodeReportSupplier = injector.getInstance(RaftNodeReportSupplier.class);


            registerShutdownHook();
        } catch (Throwable t) {
            shutdown();
            throw new ClusterServerException("Could not start server!", t);
        }
    }

    private static RaftEndpointProto toProtoRaftEndpoint(NodeEndpointConfig endpointConfig) {
        return RaftEndpointProto.newBuilder().setId(endpointConfig.getId()).build();
    }

    private void registerShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            processTerminationFlag.set(true);

            if (!isShutdown()) {
                System.out.println(nodeEndpoint.getId() + " shutting down...");
            }

            shutdown();
        }));
    }

    @Nonnull
    @Override
    public ClusterServiceConfig getConfig() {
        return config;
    }

    @Nonnull
    @Override
    public RaftEndpoint getNodeEndpoint() {
        return nodeEndpoint;
    }

    @Nonnull
    @Override
    public RaftNodeReport getRaftNodeReport() {
        return raftNodeReportSupplier.get();
    }

    @Override
    public void shutdown() {
        if (status.compareAndSet(Status.RUNNING, Status.SHUTTING_DOWN)) {
            try {
                lifecycleManager.close();
            } finally {
                status.set(Status.SHUT_DOWN);
            }
        } else {
            status.compareAndSet(Status.LATENT, Status.SHUT_DOWN);
        }
    }

    @Override
    public boolean isShutdown() {
        return status.get() == Status.SHUT_DOWN;
    }

    @Override
    public void awaitTermination() {
        if (terminationCompleted) {
            return;
        }

        injector.getAllBindings().values().stream()
                .filter(binding -> binding.getProvider().get() instanceof TerminationAware)
                .map(binding -> (TerminationAware) binding.getProvider().get())
                .forEach(TerminationAware::awaitTermination);
        terminationCompleted = true;
    }

    public RaftNode getRaftNode() {
        return raftNode;
    }

    private enum Status {
        LATENT, RUNNING, SHUTTING_DOWN, SHUT_DOWN
    }

    public static class ClusterBootstrapper implements Supplier<ClusterServiceImpl> {
        final ClusterServiceConfig config;

        public ClusterBootstrapper(ClusterServiceConfig config) {
            this.config = config;
        }

        @Override
        public ClusterServiceImpl get() {
            RaftEndpointProto localEndpoint = toProtoRaftEndpoint(config.getNodeEndpointConfig());
            List<RaftEndpoint> initialEndpoints = getInitialEndpoints(config);
            Map<RaftEndpoint, String> endpointAddresses = getEndpointAddresses(config);
            return new ClusterServiceImpl(config, RaftNodeEndpoint.wrap(localEndpoint), initialEndpoints, endpointAddresses);
        }

        private List<RaftEndpoint> getInitialEndpoints(ClusterServiceConfig config) {
            List<RaftEndpoint> initialEndpoints = config.getClusterConfig().getInitialEndpoints().stream()
                    .map(ClusterServiceImpl::toProtoRaftEndpoint).map(RaftNodeEndpoint::wrap).collect(toList());
            if (initialEndpoints.size() < 2) {
                throw new ClusterServerException(
                        "Cannot bootstrap new AfloatDB cluster with " + initialEndpoints.size() + " endpoint!");
            }

            return initialEndpoints;
        }

        private Map<RaftEndpoint, String> getEndpointAddresses(ClusterServiceConfig config) {
            return config.getClusterConfig().getInitialEndpoints().stream().collect(
                    toMap(c -> RaftNodeEndpoint.wrap(toProtoRaftEndpoint(c)), NodeEndpointConfig::getAddress));
        }

    }

    public static class ClusterJoiner implements Supplier<ClusterServiceImpl> {

        final ClusterServiceConfig config;
        final List<RaftEndpoint> initialMembers = new ArrayList<>();
        final Map<RaftEndpoint, String> endpointAddresses = new HashMap<>();
        final RaftEndpointProto localEndpoint;
        final boolean votingMember;

        public ClusterJoiner(ClusterServiceConfig config, boolean votingMember) {
            this.config = config;
            this.localEndpoint = toProtoRaftEndpoint(config.getNodeEndpointConfig());
            this.votingMember = votingMember;
        }

        public ClusterServiceImpl get() {
            String joinAddress = config.getClusterConfig().getJoinTo();
            if (joinAddress == null) {
                throw new ClusterServerException("Join address is missing!");
            }

            LOGGER.debug("{} joining as {} via {}", localEndpoint.getId(),
                    votingMember ? "voting member" : "non-voting member", joinAddress);

            GetRaftNodeReportResponse reportResponse = getReport(joinAddress);

            verifyReport(joinAddress, reportResponse);

            if (reportResponse.getReport().getCommittedMembers().getMemberList().contains(localEndpoint)) {
                populateDBInitState(reportResponse);

                LOGGER.warn(
                        "{} already joined to the Raft group before. AfloatDB will be created with initial "
                                + "endpoints: {} and addresses: {}",
                        localEndpoint.getId(), initialMembers, endpointAddresses);

                return new ClusterServiceImpl(config, RaftNodeEndpoint.wrap(localEndpoint), initialMembers,
                        endpointAddresses);
            }

            String localAddress = config.getNodeEndpointConfig().getAddress();
            AddRaftEndpointAddressRequest request = AddRaftEndpointAddressRequest.newBuilder()
                    .setEndpoint(localEndpoint).setAddress(localAddress).build();

            for (RaftEndpointProto endpoint : reportResponse.getReport().getEffectiveMembers().getMemberList()) {
                String address = reportResponse.getEndpointAddressOrDefault(endpoint.getId(), null);
                broadcastLocalAddress(request, endpoint, address);
            }

            addRaftEndpoint(reportResponse);

            LOGGER.info("{} joined to the Raft group. AfloatDB is created with initial endpoints: {} and "
                    + "addresses: {}", localEndpoint.getId(), initialMembers, endpointAddresses);

            return new ClusterServiceImpl(config, RaftNodeEndpoint.wrap(localEndpoint), initialMembers, endpointAddresses);
        }

        private GetRaftNodeReportResponse getReport(String joinAddress) {
            ManagedChannel reportChannel = createChannel(joinAddress);
            GetRaftNodeReportResponse reportResponse;
            try {
                reportResponse = ManagementRequestHandlerGrpc.newBlockingStub(reportChannel)
                        .getRaftNodeReport(GetRaftNodeReportRequest.getDefaultInstance());
            } finally {
                reportChannel.shutdownNow();
            }

            return reportResponse;
        }

        private ManagedChannel createChannel(String address) {
            return ManagedChannelBuilder.forTarget(address).usePlaintext().disableRetry().directExecutor().build();
        }

        private void verifyReport(String joinAddress, GetRaftNodeReportResponse reportResponse) {
            RaftNodeReportProto report = reportResponse.getReport();
            if (report.getStatus() != RaftNodeStatusProto.ACTIVE) {
                throw new ClusterServerException(
                        "Cannot join via " + joinAddress + " because the Raft node status is " + report.getStatus());
            }

            if (report.getEffectiveMembers().getLogIndex() != report.getCommittedMembers().getLogIndex()) {
                throw new ClusterServerException(
                        "Cannot join via " + joinAddress + " because there is another ongoing " + "membership change!");
            }

            for (RaftEndpointProto endpoint : report.getEffectiveMembers().getMemberList()) {
                if (reportResponse.getEndpointAddressOrDefault(endpoint.getId(), null) == null) {
                    throw new ClusterServerException("Cannot join via " + joinAddress + " because the address of the Raft "
                            + "endpoint: " + endpoint.getId() + " is not known!");
                }
            }

            if (report.getTerm().getLeaderEndpoint() == null) {
                throw new ClusterServerException(
                        "Cannot join via " + joinAddress + " because the Raft leader is not " + "known!");
            }
        }

        private void broadcastLocalAddress(AddRaftEndpointAddressRequest request, RaftEndpointProto target,
                                           String targetAddress) {
            LOGGER.info("{} sending local address: {} to {} at {}", localEndpoint.getId(), request.getAddress(),
                    target.getId(), targetAddress);
            ManagedChannel channel = createChannel(targetAddress);
            try {
                ManagementRequestHandlerGrpc.newBlockingStub(channel).addRaftEndpointAddress(request);
            } catch (Throwable t) {
                throw new ClusterServerException("Could not add Raft endpoint address to " + target + " at " + targetAddress,
                        t);
            } finally {
                channel.shutdownNow();
            }
        }

        private void addRaftEndpoint(GetRaftNodeReportResponse reportResponse) {
            RaftNodeReportProto report = reportResponse.getReport();
            RaftEndpointProto leaderEndpoint = report.getTerm().getLeaderEndpoint();
            String leaderAddress = reportResponse.getEndpointAddressOrDefault(leaderEndpoint.getId(), null);
            ManagedChannel leaderChannel = createChannel(leaderAddress);
            long groupMembersCommitIndex = report.getCommittedMembers().getLogIndex();

            LOGGER.info("{} adding Raft endpoint as {} at group members commit index: {} via the Raft leader: {} at {}",
                    localEndpoint.getId(), votingMember ? "voting member" : "non-voting member",
                    groupMembersCommitIndex, leaderEndpoint.getId(), leaderAddress);

            AddRaftEndpointRequest request = AddRaftEndpointRequest.newBuilder().setEndpoint(localEndpoint)
                    .setVotingMember(votingMember).setGroupMembersCommitIndex(groupMembersCommitIndex).build();
            try {
                ManagementRequestHandlerGrpc.newBlockingStub(leaderChannel).addRaftEndpoint(request);
            } catch (Throwable t) {
                throw new ClusterServerException(localEndpoint.getId() + " failure during add Raft endpoint via the Raft "
                        + "leader: " + leaderEndpoint + " at " + leaderAddress, t);
            } finally {
                leaderChannel.shutdownNow();
            }

            populateDBInitState(reportResponse);
        }

        private void populateDBInitState(GetRaftNodeReportResponse reportResponse) {
            for (RaftEndpointProto endpoint : reportResponse.getReport().getInitialMembers().getMemberList()) {
                initialMembers.add(RaftNodeEndpoint.wrap(endpoint));
            }

            for (RaftEndpointProto endpoint : reportResponse.getReport().getEffectiveMembers().getMemberList()) {
                String address = reportResponse.getEndpointAddressOrDefault(endpoint.getId(), null);
                endpointAddresses.put(RaftNodeEndpoint.wrap(endpoint), address);
            }
        }

    }


}
