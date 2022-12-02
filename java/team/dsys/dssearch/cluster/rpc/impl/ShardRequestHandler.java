package team.dsys.dssearch.cluster.rpc.impl;

import cluster.proto.*;
import io.afloatdb.kv.proto.*;
import io.afloatdb.raft.proto.*;
import io.grpc.stub.StreamObserver;
import io.microraft.Ordered;
import io.microraft.RaftNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.function.Supplier;

import static io.microraft.QueryPolicy.EVENTUAL_CONSISTENCY;
import static io.microraft.QueryPolicy.LINEARIZABLE;
import static team.dsys.dssearch.cluster.module.ClusterServiceModule.RAFT_NODE_SUPPLIER_KEY;
import static team.dsys.dssearch.cluster.rpc.utils.CustomedExceptions.wrap;

@Singleton
public class ShardRequestHandler extends ShardRequestHandlerGrpc.ShardRequestHandlerImplBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShardRequestHandler.class);

    private final RaftNode raftNode;

    @Inject
    public ShardRequestHandler(@Named(RAFT_NODE_SUPPLIER_KEY) Supplier<RaftNode> raftNodeSupplier) {
        this.raftNode = raftNodeSupplier.get();
    }

    @Override
    public void put(PutRequest request, StreamObserver<ShardResponse> responseObserver) {
        // TODO (basri) build the proxy logic here (invocation logic)
        PutOp op = PutOp.newBuilder().setKey(request.getKey()).setVal(request.getVal())
                .setPutIfAbsent(request.getPutIfAbsent()).build();
        System.out.println("current raftnode is......debug siying" + raftNode.getLocalEndpoint().getId());
        raftNode.<PutResult> replicate(op)
                .whenComplete((Ordered<PutResult> result, Throwable throwable) -> {
                    // TODO [basri] bottleneck. offload to IO thread...
                    if (throwable == null) {
                        responseObserver.onNext(ShardResponse.newBuilder().setCommitIndex(result.getCommitIndex())
                                .setPutResult(PutResult.newBuilder()
                                        .setOldVal(result.getResult().getOldVal()).build())
                                .build());
                    } else {
                        responseObserver.onError(wrap(throwable));
                    }
                    responseObserver.onCompleted();
                });
    }

    @Override
    public void set(SetRequest request, StreamObserver<ShardResponse> responseObserver) {
        PutOp op = PutOp.newBuilder().setKey(request.getKey()).setVal(request.getVal()).build();
        raftNode.<io.afloatdb.raft.proto.PutResult> replicate(op)
                .whenComplete((Ordered<io.afloatdb.raft.proto.PutResult> result, Throwable throwable) -> {
                    // TODO [basri] bottleneck. offload to IO thread...
                    if (throwable == null) {
                        responseObserver.onNext(ShardResponse.newBuilder().setCommitIndex(result.getCommitIndex())
                                .setSetResult(io.afloatdb.kv.proto.SetResult.newBuilder()
                                        .setOldValExisted(result.getResult().hasOldVal()).build())
                                .build());
                    } else {
                        responseObserver.onError(wrap(throwable));
                    }
                    responseObserver.onCompleted();
                });
    }

    @Override
    public void get(GetRequest request, StreamObserver<ShardResponse> responseObserver) {
        GetOp op = GetOp.newBuilder().setKey(request.getKey()).build();
        raftNode.<io.afloatdb.raft.proto.GetResult> query(op,
                        request.getMinCommitIndex() == -1 ? LINEARIZABLE : EVENTUAL_CONSISTENCY,
                        Math.max(0, request.getMinCommitIndex()))
                .whenComplete((Ordered<io.afloatdb.raft.proto.GetResult> result, Throwable throwable) -> {
                    // TODO [basri] bottleneck. offload to IO thread...
                    if (throwable == null) {
                        responseObserver.onNext(ShardResponse.newBuilder().setCommitIndex(result.getCommitIndex())
                                .setGetResult(
                                        io.afloatdb.kv.proto.GetResult.newBuilder().setVal(result.getResult().getVal()))
                                .build());
                    } else {
                        responseObserver.onError(wrap(throwable));
                    }
                    responseObserver.onCompleted();
                });
    }

    @Override
    public void contains(ContainsRequest request, StreamObserver<ShardResponse> responseObserver) {
        GetOp op = GetOp.newBuilder().setKey(request.getKey()).build();
        raftNode.<io.afloatdb.raft.proto.GetResult> query(op,
                        request.getMinCommitIndex() == -1 ? LINEARIZABLE : EVENTUAL_CONSISTENCY,
                        Math.max(0, request.getMinCommitIndex()))
                .whenComplete((Ordered<io.afloatdb.raft.proto.GetResult> result, Throwable throwable) -> {
                    // TODO [basri] bottleneck. offload to IO thread...
                    if (throwable == null) {
                        io.afloatdb.kv.proto.ContainsResult.Builder builder2 = io.afloatdb.kv.proto.ContainsResult
                                .newBuilder();
                        if (!result.getResult().hasVal()) {
                            builder2.setSuccess(false);
                        } else if (request.hasVal()) {
                            builder2.setSuccess(request.getVal().equals(result.getResult().getVal()));
                        } else {
                            builder2.setSuccess(true);
                        }
                        responseObserver.onNext(ShardResponse.newBuilder().setCommitIndex(result.getCommitIndex())
                                .setContainsResult(builder2.build()).build());
                    } else {
                        responseObserver.onError(wrap(throwable));
                    }
                    responseObserver.onCompleted();
                });
    }

    @Override
    public void delete(DeleteRequest request, StreamObserver<ShardResponse> responseObserver) {
        RemoveOp op = RemoveOp.newBuilder().setKey(request.getKey()).build();
        raftNode.<io.afloatdb.raft.proto.RemoveResult> replicate(op)
                .whenComplete((Ordered<io.afloatdb.raft.proto.RemoveResult> result, Throwable throwable) -> {
                    // TODO [basri] bottleneck. offload to IO thread...
                    if (throwable == null) {
                        responseObserver.onNext(ShardResponse.newBuilder().setCommitIndex(result.getCommitIndex())
                                .setDeleteResult(io.afloatdb.kv.proto.DeleteResult.newBuilder()
                                        .setSuccess(result.getResult().getSuccess()).build())
                                .build());
                    } else {
                        responseObserver.onError(wrap(throwable));
                    }
                    responseObserver.onCompleted();
                });
    }

    @Override
    public void remove(RemoveRequest request, StreamObserver<ShardResponse> responseObserver) {
        RemoveOp.Builder builder = RemoveOp.newBuilder().setKey(request.getKey());
        if (request.hasVal()) {
            builder.setVal(request.getVal());
        }
        raftNode.<io.afloatdb.raft.proto.RemoveResult> replicate(builder.build())
                .whenComplete((Ordered<io.afloatdb.raft.proto.RemoveResult> result, Throwable throwable) -> {
                    // TODO [basri] bottleneck. offload to IO thread...
                    if (throwable == null) {
                        io.afloatdb.kv.proto.RemoveResult.Builder builder2 = io.afloatdb.kv.proto.RemoveResult
                                .newBuilder().setSuccess(result.getResult().getSuccess());
                        if (!request.hasVal() && result.getResult().hasOldVal()) {
                            builder2.setOldVal(result.getResult().getOldVal());
                        }
                        responseObserver.onNext(ShardResponse.newBuilder().setCommitIndex(result.getCommitIndex())
                                .setRemoveResult(builder2.build()).build());
                    } else {
                        responseObserver.onError(wrap(throwable));
                    }
                    responseObserver.onCompleted();
                });
    }

    @Override
    public void replace(ReplaceRequest request, StreamObserver<ShardResponse> responseObserver) {
        ReplaceOp op = ReplaceOp.newBuilder().setKey(request.getKey()).setOldVal(request.getOldVal())
                .setNewVal(request.getNewVal()).build();
        raftNode.<io.afloatdb.raft.proto.ReplaceResult> replicate(op)
                .whenComplete((Ordered<io.afloatdb.raft.proto.ReplaceResult> result, Throwable throwable) -> {
                    // TODO [basri] bottleneck. offload to IO thread...
                    if (throwable == null) {
                        responseObserver.onNext(ShardResponse.newBuilder().setCommitIndex(result.getCommitIndex())
                                .setReplaceResult(io.afloatdb.kv.proto.ReplaceResult.newBuilder()
                                        .setSuccess(result.getResult().getSuccess()).build())
                                .build());
                    } else {
                        responseObserver.onError(wrap(throwable));
                    }
                    responseObserver.onCompleted();
                });
    }

    @Override
    public void size(SizeRequest request, StreamObserver<ShardResponse> responseObserver) {
        raftNode.<io.afloatdb.raft.proto.SizeResult> query(SizeOp.getDefaultInstance(),
                        request.getMinCommitIndex() == -1 ? LINEARIZABLE : EVENTUAL_CONSISTENCY,
                        Math.max(0, request.getMinCommitIndex()))
                .whenComplete((Ordered<io.afloatdb.raft.proto.SizeResult> result, Throwable throwable) -> {
                    // TODO [basri] bottleneck. offload to IO thread...
                    if (throwable == null) {
                        responseObserver.onNext(ShardResponse.newBuilder().setCommitIndex(result.getCommitIndex())
                                .setSizeResult(io.afloatdb.kv.proto.SizeResult.newBuilder()
                                        .setSize(result.getResult().getSize()))
                                .build());
                    } else {
                        responseObserver.onError(wrap(throwable));
                    }
                    responseObserver.onCompleted();
                });
    }

    @Override
    public void clear(ClearRequest request, StreamObserver<ShardResponse> responseObserver) {
        raftNode.<io.afloatdb.raft.proto.ClearResult> replicate(ClearOp.getDefaultInstance())
                .whenComplete((Ordered<io.afloatdb.raft.proto.ClearResult> result, Throwable throwable) -> {
                    // TODO [basri] bottleneck. offload to IO thread...
                    if (throwable == null) {
                        responseObserver.onNext(ShardResponse.newBuilder().setCommitIndex(result.getCommitIndex())
                                .setClearResult(io.afloatdb.kv.proto.ClearResult.newBuilder()
                                        .setSize(result.getResult().getSize()).build())
                                .build());
                    } else {
                        responseObserver.onError(wrap(throwable));
                    }
                    responseObserver.onCompleted();
                });
    }

}
