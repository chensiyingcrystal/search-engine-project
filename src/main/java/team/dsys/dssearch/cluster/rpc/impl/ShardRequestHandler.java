package team.dsys.dssearch.cluster.rpc.impl;

import cluster.proto.*;
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
        PutOp op = PutOp.newBuilder().setKey(request.getKey()).setVal(request.getVal())
                .setPutIfAbsent(request.getPutIfAbsent()).build();
        raftNode.<PutOpResult> replicate(op)
                .whenComplete((Ordered<PutOpResult> result, Throwable throwable) -> {
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
        raftNode.<PutOpResult> replicate(op)
                .whenComplete((Ordered<PutOpResult> result, Throwable throwable) -> {
                    if (throwable == null) {
                        responseObserver.onNext(ShardResponse.newBuilder().setCommitIndex(result.getCommitIndex())
                                .setSetResult(SetResult.newBuilder()
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
        raftNode.<GetResult> query(op,
                        request.getMinCommitIndex() == -1 ? LINEARIZABLE : EVENTUAL_CONSISTENCY,
                        Math.max(0, request.getMinCommitIndex()))
                .whenComplete((Ordered<GetResult> result, Throwable throwable) -> {
                    if (throwable == null) {
                        responseObserver.onNext(ShardResponse.newBuilder().setCommitIndex(result.getCommitIndex())
                                .setGetResult(
                                        GetResult.newBuilder().setVal(result.getResult().getVal()))
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
        raftNode.<GetResult> query(op,
                        request.getMinCommitIndex() == -1 ? LINEARIZABLE : EVENTUAL_CONSISTENCY,
                        Math.max(0, request.getMinCommitIndex()))
                .whenComplete((Ordered<GetResult> result, Throwable throwable) -> {
                    if (throwable == null) {
                        ContainsResult.Builder builder2 = ContainsResult
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
    public void remove(RemoveRequest request, StreamObserver<ShardResponse> responseObserver) {
        RemoveOp.Builder builder = RemoveOp.newBuilder().setKey(request.getKey());
        if (request.hasVal()) {
            builder.setVal(request.getVal());
        }
        raftNode.<RemoveResult> replicate(builder.build())
                .whenComplete((Ordered<RemoveResult> result, Throwable throwable) -> {
                    if (throwable == null) {
                        RemoveResult.Builder builder2 = RemoveResult
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
        raftNode.<ReplaceResult> replicate(op)
                .whenComplete((Ordered<ReplaceResult> result, Throwable throwable) -> {
                    if (throwable == null) {
                        responseObserver.onNext(ShardResponse.newBuilder().setCommitIndex(result.getCommitIndex())
                                .setReplaceResult(ReplaceResult.newBuilder()
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
        raftNode.<SizeResult> query(SizeOp.getDefaultInstance(),
                        request.getMinCommitIndex() == -1 ? LINEARIZABLE : EVENTUAL_CONSISTENCY,
                        Math.max(0, request.getMinCommitIndex()))
                .whenComplete((Ordered<SizeResult> result, Throwable throwable) -> {
                    if (throwable == null) {
                        responseObserver.onNext(ShardResponse.newBuilder().setCommitIndex(result.getCommitIndex())
                                .setSizeResult(SizeResult.newBuilder()
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
        raftNode.<ClearResult> replicate(ClearOp.getDefaultInstance())
                .whenComplete((Ordered<ClearResult> result, Throwable throwable) -> {
                    if (throwable == null) {
                        responseObserver.onNext(ShardResponse.newBuilder().setCommitIndex(result.getCommitIndex())
                                .setClearResult(ClearResult.newBuilder()
                                        .setSize(result.getResult().getSize()).build())
                                .build());
                    } else {
                        responseObserver.onError(wrap(throwable));
                    }
                    responseObserver.onCompleted();
                });
    }

}
