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
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.Objects.requireNonNull;
import static java.util.concurrent.Executors.newSingleThreadScheduledExecutor;
import static java.util.concurrent.TimeUnit.SECONDS;
import static team.dsys.dssearch.cluster.module.ClusterServiceModule.*;
import static team.dsys.dssearch.cluster.rpc.utils.CustomedExceptions.runSilently;
import static team.dsys.dssearch.cluster.rpc.utils.Serialization.wrap;

@Singleton
public class RaftRpcServiceImpl implements RaftRpcService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RaftRpcService.class);

    private final RaftEndpoint localEndpoint;
    private final Map<RaftEndpoint, String> addresses;
    private final Map<RaftEndpoint, RaftRpcContext> stubs = new ConcurrentHashMap<>();
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

    @PreDestroy
    public void shutdown() {
        stubs.values().forEach(RaftRpcContext::shutdownSilently);
        stubs.clear();
        executor.shutdownNow();

        processTerminationLogger.logInfo(LOGGER, localEndpoint.getId() + " RaftMessageDispatcher is shut down.");
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

    @Override
    public void send(@Nonnull RaftEndpoint target, @Nonnull RaftMessage message) {
        RaftRpcContext stub = getOrCreateStub(requireNonNull(target));
        if (stub != null) {
            executor.submit(() -> {
                stub.send(message);
            });
        }
    }

    @Override
    public boolean isReachable(@Nonnull RaftEndpoint endpoint) {
        return stubs.containsKey(endpoint);
    }

    private RaftRpcContext getOrCreateStub(RaftEndpoint target) {
        if (localEndpoint.equals(target)) {
            LOGGER.error("{} cannot send Raft message to itself...", localEndpoint.getId());
            return null;
        }

        RaftRpcContext context = stubs.get(target);
        if (context != null) {
            return context;
        } else if (!addresses.containsKey(target)) {
            LOGGER.error("{} unknown target: {}", localEndpoint.getId(), target);
            return null;
        }

        return connect(target);
    }

    private RaftRpcContext connect(RaftEndpoint target) {
        if (!initializingEndpoints.add(target)) {
            return null;
        }

        try {
            String address = addresses.get(target);
            ManagedChannel channel = ManagedChannelBuilder.forTarget(address).disableRetry().usePlaintext()
                    // .directExecutor()
                    .build();

            RaftCommunicationServiceGrpc.RaftCommunicationServiceStub replicationStub = RaftCommunicationServiceGrpc.newStub(channel);
            // .withDeadlineAfter(rpcTimeoutSecs, SECONDS);
            RaftRpcContext context = new RaftRpcContext(target, channel);
            context.raftMessageSender = replicationStub.handleRaftMessage(new ResponseStreamObserver(context));

            stubs.put(target, context);

            return context;
        } finally {
            initializingEndpoints.remove(target);
        }
    }

    private void checkChannel(RaftRpcContext context) {
        if (stubs.remove(context.targetEndpoint, context)) {
            context.shutdownSilently();
        }

        delayChannelCreation(context.targetEndpoint);
    }

    private void delayChannelCreation(RaftEndpoint target) {
        if (initializingEndpoints.add(target)) {
            LOGGER.debug("{} delaying channel creation to {}.", localEndpoint.getId(), target.getId());
            try {
                executor.schedule(() -> {
                    initializingEndpoints.remove(target);
                }, 1, SECONDS);
            } catch (RejectedExecutionException e) {
                LOGGER.warn("{} could not schedule task for channel creation to: {}.", localEndpoint.getId(),
                        target.getId());
                initializingEndpoints.remove(target);
            }
        }
    }

    private class RaftRpcContext {
        final RaftEndpoint targetEndpoint;
        final ManagedChannel channel;
        StreamObserver<RaftMessageRequest> raftMessageSender;

        RaftRpcContext(RaftEndpoint targetEndpoint, ManagedChannel channel) {
            this.targetEndpoint = targetEndpoint;
            this.channel = channel;
        }

        void shutdownSilently() {
            runSilently(raftMessageSender::onCompleted);
            runSilently(channel::shutdown);
        }

        public void send(@Nonnull RaftMessage message) {
            try {
                raftMessageSender.onNext(wrap(message));
            } catch (Throwable t) {
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.error(localEndpoint.getId() + " failure during sending " + message.getClass().getSimpleName()
                            + " to " + targetEndpoint, t);
                } else {
                    LOGGER.error("{} failure during sending {} to {}. Exception: {} Message: {}", localEndpoint.getId(),
                            message.getClass().getSimpleName(), targetEndpoint, t.getClass().getSimpleName(),
                            t.getMessage());
                }
            }
        }
    }

    private class ResponseStreamObserver implements StreamObserver<RaftMessageResponse> {
        final RaftRpcContext context;

        private ResponseStreamObserver(RaftRpcContext context) {
            this.context = context;
        }

        @Override
        public void onNext(RaftMessageResponse response) {
            LOGGER.warn("{} received {} from Raft RPC stream to {}", localEndpoint.getId(), response,
                    context.targetEndpoint.getId());
        }

        @Override
        public void onError(Throwable t) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.error(localEndpoint.getId() + " streaming Raft RPC to " + context.targetEndpoint.getId()
                        + " has failed.", t);
            } else {
                LOGGER.error("{} Raft RPC stream to {} has failed. Exception: {} Message: {}", localEndpoint.getId(),
                        context.targetEndpoint.getId(), t.getClass().getSimpleName(), t.getMessage());
            }

            checkChannel(context);
        }

        @Override
        public void onCompleted() {
            LOGGER.warn("{} Raft RPC stream to {} has completed.", localEndpoint.getId(),
                    context.targetEndpoint.getId());
        }

    }

}