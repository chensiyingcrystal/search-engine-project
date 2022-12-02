package team.dsys.dssearch.cluster.rpc;

import cluster.proto.RaftCommunicationServiceGrpc;
import cluster.proto.RaftMessageRequest;
import cluster.proto.RaftMessageResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import io.microraft.RaftEndpoint;
import io.microraft.model.message.RaftMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import team.dsys.dssearch.cluster.config.ClusterServiceConfig;
import team.dsys.dssearch.cluster.lifecycle.ProcessTerminationLogger;

import javax.annotation.Nonnull;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.Objects.requireNonNull;
import static java.util.concurrent.Executors.newSingleThreadScheduledExecutor;
import static team.dsys.dssearch.cluster.module.ClusterServiceModule.*;
import static team.dsys.dssearch.cluster.rpc.utils.CustomedExceptions.runSilently;
import static team.dsys.dssearch.cluster.rpc.utils.Serialization.wrap;

@Singleton
public class RaftRpcServiceImpl implements RaftRpcService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RaftRpcService.class);

    private final RaftEndpoint localEndpoint;
    private final Map<RaftEndpoint, String> addresses;
    //key: targeat endpoint, value: raftmessagesender
    private final Map<RaftEndpoint, StreamObserver<RaftMessageRequest>> stubs = new ConcurrentHashMap<>();
    private final Set<RaftEndpoint> initializingEndpoints = Collections.newSetFromMap(new ConcurrentHashMap<>());
    private final ProcessTerminationLogger processTerminationLogger;
    private final ScheduledExecutorService executor = newSingleThreadScheduledExecutor();
    private final long grpcTimeoutSecs;

    @Inject
    public RaftRpcServiceImpl(@Named(NODE_ENDPOINT_KEY) RaftEndpoint nodeEndpoint,
                              @Named(CONFIG_KEY) ClusterServiceConfig config,
                              @Named(RAFT_ENDPOINT_ADDRESSES_KEY) Map<RaftEndpoint, String> addresses,
                              ProcessTerminationLogger processTerminationLogger) {
        this.localEndpoint = nodeEndpoint;
        this.addresses = new ConcurrentHashMap<>(addresses);
        this.processTerminationLogger = processTerminationLogger;
        this.grpcTimeoutSecs = config.getRpcConfig().getGrpcTimeoutSecs();
    }

    @Override
    public void addAddress(@Nonnull RaftEndpoint endpoint, @Nonnull String address) {
        requireNonNull(endpoint);
        requireNonNull(address);

        String currentAddress = addresses.put(endpoint, address);
        if (currentAddress == null) {
            LOGGER.info("{} added address: {} for {}", localEndpoint.getId(), address, endpoint.getId());
        } else if (!currentAddress.equals(address)) {
            LOGGER.warn("{} replaced current address: {} with new address: {} for {}", localEndpoint.getId(),
                    currentAddress, address, endpoint.getId());
        }
    }

    @Override
    public Map<RaftEndpoint, String> getAddresses() {
        return new HashMap<>(addresses);
    }

    /**
     * Send raftmessage from current node to target node
     */
    @Override
    public void send(@Nonnull RaftEndpoint target, @Nonnull RaftMessage message) {
        if (localEndpoint.equals(target)) {
            LOGGER.error("{} cannot send Raft message to itself...", localEndpoint.getId());
            return;
        } else if (!addresses.containsKey(target)) {
            LOGGER.error("{} unknown target: {}", localEndpoint.getId(), target);
            return;
        }

        StreamObserver<RaftMessageRequest> raftMessageSender = stubs.containsKey(target) ? stubs.get(target) : connect(target);

        if (raftMessageSender != null) {
            executor.submit(() -> {
                try {
                    raftMessageSender.onNext(wrap(message));
                } catch (Throwable t) {
                    if (LOGGER.isDebugEnabled()) {
                        LOGGER.error(localEndpoint.getId() + " failure during sending " + message.getClass().getSimpleName()
                                + " to " + target, t);
                    } else {
                        LOGGER.error("{} failure during sending {} to {}. Exception: {} Message: {}", localEndpoint.getId(),
                                message.getClass().getSimpleName(), target, t.getClass().getSimpleName(),
                                t.getMessage());
                    }
                }
            });
        }
    }

    /**
     * Check the availability of target node
     * @param endpoint
     * @return
     */
    @Override
    public boolean isReachable(@Nonnull RaftEndpoint endpoint) {
        return stubs.containsKey(endpoint);
    }


    private StreamObserver<RaftMessageRequest> connect(RaftEndpoint target) {
        if (!initializingEndpoints.add(target)) {
            return null;
        }

        try {
            String address = addresses.get(target);
            ManagedChannel channel = ManagedChannelBuilder.forTarget(address).disableRetry().usePlaintext().build();
            RaftCommunicationServiceGrpc.RaftCommunicationServiceStub replicationStub = RaftCommunicationServiceGrpc.newStub(channel);
            //to-do: .withDeadlineAfter(rpcTimeoutSecs, SECONDS);
            StreamObserver<RaftMessageRequest> raftMessageSender = replicationStub.handleRaftMessage(new ResponseStreamObserver(target));

            stubs.put(target, raftMessageSender);

            return stubs.get(target);
        } finally {
            initializingEndpoints.remove(target);
        }
    }



    private class ResponseStreamObserver implements StreamObserver<RaftMessageResponse> {
        private RaftEndpoint targetEndpoint;


        private ResponseStreamObserver(RaftEndpoint targetEndpoint) {
            this.targetEndpoint = targetEndpoint;
        }

        @Override
        public void onNext(RaftMessageResponse response) {
            LOGGER.warn("{} received {} from Raft RPC stream to {}", localEndpoint.getId(), response,
                    targetEndpoint.getId());
        }

        @Override
        public void onError(Throwable t) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.error(localEndpoint.getId() + " streaming Raft RPC to " + targetEndpoint.getId()
                        + " has failed.", t);
            } else {
                LOGGER.error("{} Raft RPC stream to {} has failed. Exception: {} Message: {}", localEndpoint.getId(),
                        targetEndpoint.getId(), t.getClass().getSimpleName(), t.getMessage());
            }

        }

        @Override
        public void onCompleted() {
            LOGGER.warn("{} Raft RPC stream to {} has completed.", localEndpoint.getId(),
                    targetEndpoint.getId());
        }

    }

}