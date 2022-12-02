package team.dsys.dssearch.cluster.rpc;

import cluster.proto.RaftCommunicationServiceGrpc;
import cluster.proto.RaftMessageRequest;
import cluster.proto.RaftMessageResponse;
import io.grpc.stub.StreamObserver;
import io.microraft.RaftEndpoint;
import io.microraft.RaftNode;
import io.microraft.model.message.RaftMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import team.dsys.dssearch.cluster.lifecycle.ProcessTerminationLogger;

import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

import static team.dsys.dssearch.cluster.module.ClusterServiceModule.RAFT_NODE_SUPPLIER_KEY;
import static team.dsys.dssearch.cluster.rpc.utils.Serialization.unwrap;

@Singleton
public class RaftMessageHandler extends RaftCommunicationServiceGrpc.RaftCommunicationServiceImplBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(RaftMessageHandler.class);

    private final RaftNode raftNode;
    private final RaftEndpoint localEndpoint;
    private final ProcessTerminationLogger processTerminationLogger;
    private final Set<RaftMessageStreamObserver> streamObservers = Collections.newSetFromMap(new ConcurrentHashMap<>());

    @Inject
    public RaftMessageHandler(@Named(RAFT_NODE_SUPPLIER_KEY) Supplier<RaftNode> raftNodeSupplier,
                              ProcessTerminationLogger processTerminationLogger) {
        this.raftNode = raftNodeSupplier.get();
        this.localEndpoint = this.raftNode.getLocalEndpoint();
        this.processTerminationLogger = processTerminationLogger;
    }

    @PreDestroy
    public void shutdown() {
        streamObservers.forEach(RaftMessageStreamObserver::onCompleted);
        streamObservers.clear();

        processTerminationLogger.logInfo(LOGGER, localEndpoint.getId() + " RaftMessageHandler is shut down.");
    }


    @Override
    public StreamObserver<RaftMessageRequest> handleRaftMessage(StreamObserver<RaftMessageResponse> responseObserver) {
        RaftMessageStreamObserver observer = new RaftMessageStreamObserver();
        streamObservers.add(observer);
        return observer;
    }

    private class RaftMessageStreamObserver implements StreamObserver<RaftMessageRequest> {

        private volatile RaftEndpoint sender;

        @Override
        public void onNext(RaftMessageRequest proto) {
            RaftMessage message = unwrap(proto);
            if (sender == null) {
                sender = message.getSender();
            }

            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("{} received {}.", localEndpoint.getId(), message);
            }

            raftNode.handle(message);
        }

        @Override
        public void onError(Throwable t) {
            if (sender != null) {
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.error(localEndpoint.getId() + " failure on Raft RPC stream of " + sender.getId(), t);
                } else {
                    LOGGER.error("{} failure on Raft RPC stream of {}. Exception: {} Message: {}",
                            localEndpoint.getId(), sender.getId(), t.getClass().getSimpleName(), t.getMessage());
                }
            } else {
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.error(localEndpoint.getId() + " failure on Raft RPC stream.", t);
                } else {
                    LOGGER.error("{} failure on Raft RPC stream. Exception: {} Message: {}", localEndpoint.getId(),
                            t.getClass().getSimpleName(), t.getMessage());
                }
            }
        }

        @Override
        public void onCompleted() {
            LOGGER.debug("{} Raft RPC stream of {} completed.", localEndpoint.getId(),
                    sender != null ? sender.getId() : null);
            streamObservers.remove(this);
        }

    }

}
