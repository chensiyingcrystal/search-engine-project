package team.dsys.dssearch.cluster.client;

import cluster.proto.*;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import team.dsys.dssearch.cluster.rpc.RaftRpcServiceImpl;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.Executors.newSingleThreadScheduledExecutor;

public class ClientTest {
    public static void main(String[] args) throws Exception {
        ClientTest client = new ClientTest();
        client.remoteCall("apple", 15);


    }

    public void remoteCall(String key, int val) throws ExecutionException, InterruptedException {
        PutRequest request = PutRequest.newBuilder().setKey(key).setVal(Val.newBuilder().setNum(val).build()).build();
        String address = "localhost:6702";
        ManagedChannel channel = ManagedChannelBuilder.forTarget(address).disableRetry().directExecutor().usePlaintext().build();
        System.out.println("test:" + channel.getState(true));
        ShardRequestHandlerGrpc.ShardRequestHandlerBlockingStub stub = ShardRequestHandlerGrpc.newBlockingStub(channel);
        ScheduledExecutorService executor = newSingleThreadScheduledExecutor();
        ShardResponse shardResponseListenableFuture = stub.put(request);
//        shardResponseListenableFuture.addListener(
//                new Runnable() {
//                    @Override
//                    public void run() {
//                        try {
//                            ShardResponse response = shardResponseListenableFuture.get();
//                            System.out.println("Got response" + response);
//                        } catch (InterruptedException e) {
//                            System.out.println(e);
//                        } catch (ExecutionException e) {
//                            System.out.println(e);
//                        }
//                    }
//                }, executor
//        );
        System.out.println("heello" + shardResponseListenableFuture);
    }


}
