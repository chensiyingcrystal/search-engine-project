package team.dsys.dssearch.internal.common.impl;

import cluster.proto.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import team.dsys.dssearch.internal.common.ClusterServiceManager;
import team.dsys.dssearch.internal.common.config.ClusterServerCommonConfig;
import team.dsys.dssearch.internal.common.message.CommonResponse;
import team.dsys.dssearch.internal.common.message.GetShardRequest;
import team.dsys.dssearch.internal.common.message.GetShardResponse;
import team.dsys.dssearch.internal.common.message.PutShardRequest;

import java.net.InetSocketAddress;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

import static com.google.common.base.Strings.isNullOrEmpty;
import static java.util.concurrent.TimeUnit.SECONDS;


public class ClusterServiceManagerImpl implements ClusterServiceManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClusterServiceManagerImpl.class);

    private final Integer dataNodeId;
    private final ClusterServerCommonConfig config;
    private Map<String, String> clusterServerAddress = new LinkedHashMap<>();
    private final AtomicReference<ClusterEndpointsInfo> clusterEndpointsInfoCache = new AtomicReference<>(); //update the value atomically(e.g., thread-safe)
    private volatile LeaderStub leaderStub;
    private static final long CREATE_STUB_TIME_LIMIT = SECONDS.toMillis(60);


    public ClusterServiceManagerImpl(Integer dataNodeId, String configFilePath) throws TimeoutException {
        this.dataNodeId = dataNodeId;
        this.config = ClusterServerCommonConfig.getClusterCommonConfig(configFilePath);
        this.clusterServerAddress = config.getClusterServerAddress();
        createClusterServerStub();
    }

    private class LeaderStub {
        private String leaderId;
        private ShardRequestHandlerGrpc.ShardRequestHandlerFutureStub stub;

        LeaderStub(String leaderId, ShardRequestHandlerGrpc.ShardRequestHandlerFutureStub stub) {
            this.leaderId = leaderId;
            this.stub = stub;
        }
    }

    private void createClusterServerStub() throws TimeoutException {
        //todo: randomly pick, if one failed, try another
        //randomly pick an address from server address
        Object[] values = clusterServerAddress.values().toArray();
        String randomAddress = ((String) values[new Random().nextInt(values.length)]);
        ManagedChannel randomConnectedServerChannel = ManagedChannelBuilder.forTarget(randomAddress).disableRetry().directExecutor().usePlaintext().build();
        ClusterListenServiceGrpc.ClusterListenServiceStub stub = ClusterListenServiceGrpc.newStub(randomConnectedServerChannel);
        LOGGER.info("DataNode {} created the cluster server stub for address: {} ", dataNodeId, randomAddress);

        ClusterEndpointsRequest request = ClusterEndpointsRequest.newBuilder().setClientId(dataNodeId.toString()).build();
        long startTime = System.currentTimeMillis();
        stub.listenClusterEndpoints(request, new ClusterEndpointsResponseObserver(randomAddress));

        while (clusterEndpointsInfoCache.get() == null) {
            if (System.currentTimeMillis() - startTime > CREATE_STUB_TIME_LIMIT) {
                LOGGER.error("Failed to connect to server {} because of TimeOut Exception", randomAddress);
                throw new TimeoutException("Connecting to server timeout..");
            }

        }

        randomConnectedServerChannel.shutdownNow();

    }

    private class ClusterEndpointsResponseObserver implements StreamObserver<ClusterEndpointsResponse> {
        String address;

        ClusterEndpointsResponseObserver(String address) {
            this.address = address;
        }

        @Override
        public void onNext(ClusterEndpointsResponse response) {
            ClusterEndpointsInfo endpointsInfo = response.getEndpointsInfo();
            try {
                LOGGER.info("DataNode {} received response from cluster server: {}", dataNodeId, address);
                tryUpdateClusterEndpointsInfo(endpointsInfo);
            } catch(Exception e) {
                LOGGER.error("Response from address: {} failed", address);
            }
        }

        @Override
        public void onError(Throwable t) {
            LOGGER.error("For DataNode {}, Cluster Observer of {} failed. Message: ", dataNodeId, address, t.getMessage());

        }

        @Override
        public void onCompleted() {
            LOGGER.info("For DataNode {}, Cluster Observer of {} completed ", dataNodeId, address);
        }


    }

    private void tryUpdateClusterEndpointsInfo(ClusterEndpointsInfo updatedEndpointsInfo) {
        ClusterEndpointsInfo currentEndpointsInfo = clusterEndpointsInfoCache.get();
        if (currentEndpointsInfo == null || currentEndpointsInfo.getTerm() < updatedEndpointsInfo.getTerm()
        || currentEndpointsInfo.getEndpointsCount() < updatedEndpointsInfo.getEndpointsCount()
        || currentEndpointsInfo.getEndpointsCommitIndex() < updatedEndpointsInfo.getEndpointsCommitIndex()
        || !currentEndpointsInfo.getLeaderId().equals(updatedEndpointsInfo.getLeaderId())) {

            LOGGER.info("DataNode {} updated cluster endpoints info... ", dataNodeId);
            clusterEndpointsInfoCache.set(updatedEndpointsInfo);
            tryUpdateLeaderInfo(updatedEndpointsInfo);
        }

        return;
    }



    private void tryUpdateLeaderInfo(ClusterEndpointsInfo updatedEndpointsInfo) {
        if (!isNullOrEmpty(updatedEndpointsInfo.getLeaderId()) && (leaderStub == null || !updatedEndpointsInfo.getLeaderId().equals(leaderStub.leaderId))) {
            LOGGER.info("DataNode {} update leaderId; updated Id is: {}", dataNodeId, updatedEndpointsInfo.getLeaderId());

            //get leader address first
            String updatedLeaderAddress = updatedEndpointsInfo.getEndpointsMap().get(updatedEndpointsInfo.getLeaderId());
            //build channel and stub
            ManagedChannel updatedToLeaderChannel = ManagedChannelBuilder.forTarget(updatedLeaderAddress).usePlaintext().build();
            ShardRequestHandlerGrpc.ShardRequestHandlerFutureStub updatedLeaderStub = ShardRequestHandlerGrpc.newFutureStub(updatedToLeaderChannel);
            leaderStub = new LeaderStub(updatedEndpointsInfo.getLeaderId(), updatedLeaderStub);

        }
    }

    @Override
    public String getClusterReport() {
        //cluster info(update leader info)
        return this.clusterEndpointsInfoCache.get().toString();
    }

    @Override
    public String getShardReport() {
        //todo: shard Info(including dataNodeid, address, each shard's id and isPrimary
        return null;
    }

    @Override
    public CommonResponse putShardInfo(PutShardRequest request) {
        return null;
    }

    @Override
    public GetShardResponse getShardInfo(GetShardRequest request) {
        //randomly pick node where the shard exists
        return null;
    }



    public static void main(String[] args) throws TimeoutException {
        String p = "/Users/chensiying/cs61b/search-engine-project/src/main/java/team/dsys/dssearch/internal/common/config/cluster.conf";
        ClusterServiceManagerImpl manager = new ClusterServiceManagerImpl(1, p);
        System.out.println(manager.getClusterReport());

    }
}
