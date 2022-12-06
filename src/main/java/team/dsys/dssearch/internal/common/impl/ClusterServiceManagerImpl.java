package team.dsys.dssearch.internal.common.impl;

import cluster.proto.*;
import com.typesafe.config.ConfigFactory;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.checkerframework.checker.units.qual.C;
import org.checkerframework.checker.units.qual.Time;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import team.dsys.dssearch.cluster.config.ClusterServiceConfig;
import team.dsys.dssearch.internal.common.ClusterServiceManager;
import team.dsys.dssearch.internal.common.config.ClusterServerCommonConfig;
import team.dsys.dssearch.internal.common.message.CommonResponse;
import team.dsys.dssearch.internal.common.message.GetShardRequest;
import team.dsys.dssearch.internal.common.message.GetShardResponse;
import team.dsys.dssearch.internal.common.message.PutShardRequest;

import javax.annotation.PostConstruct;
import java.net.InetSocketAddress;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

import static com.google.common.base.Strings.isNullOrEmpty;


public class ClusterServiceManagerImpl implements ClusterServiceManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClusterServiceManagerImpl.class);

    private final Integer dataNodeId;
    private final ClusterServerCommonConfig config;
    private Map<String, InetSocketAddress> clusterServerAddress = new LinkedHashMap<>();
    private final AtomicReference<ClusterEndpointsInfo> clusterEndpointsInfoCache = new AtomicReference<>(); //update the value atomically(e.g., thread-safe)
    private volatile LeaderStub leaderStub;




    public ClusterServiceManagerImpl(Integer dataNodeId, String configFilePath) {
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

    private void createClusterServerStub() {
        //todo: add Timeout exception
        //todo: randomly pick, if one failed, try another
        //randomly pick an address from server address
        Object[] values = clusterServerAddress.values().toArray();
        String randomAddress = ((InetSocketAddress) values[new Random().nextInt(values.length)]).getAddress().toString();
        //connect to that server
//        System.out.println(randomAddress.getAddress().toString()); //localhost/127.0.0.1
        ManagedChannel randomConnectedServerChannel = ManagedChannelBuilder.forTarget(randomAddress).usePlaintext().build();
        ClusterListenServiceGrpc.ClusterListenServiceStub stub = ClusterListenServiceGrpc.newStub(randomConnectedServerChannel);
        LOGGER.info("{} created the cluster server stub for address: {} ", dataNodeId, randomAddress);

        ClusterEndpointsRequest request = ClusterEndpointsRequest.newBuilder().setClientId(dataNodeId.toString()).build();
        stub.listenClusterEndpoints(request, new ClusterEndpointsResponseObserver(randomAddress));

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
                LOGGER.info("{} received response {} from cluster server: {}", dataNodeId, address);
                tryUpdateClusterEndpointsInfo(endpointsInfo);
            } catch(Exception e) {
                LOGGER.error("Response {} from address: {} failed", response, address);
            }
        }

        @Override
        public void onError(Throwable t) {
            LOGGER.error("For {}, Cluster Observer of {} failed. Message: ", dataNodeId, address, t.getMessage());

        }

        @Override
        public void onCompleted() {
            LOGGER.info("For {}, Cluster Observer of {} completed ", dataNodeId, address);
        }


    }

    private void tryUpdateClusterEndpointsInfo(ClusterEndpointsInfo updatedEndpointsInfo) {
        ClusterEndpointsInfo currentEndpointsInfo = clusterEndpointsInfoCache.get();
        if (currentEndpointsInfo == null || currentEndpointsInfo.getTerm() < updatedEndpointsInfo.getTerm()
        || currentEndpointsInfo.getEndpointsCount() < updatedEndpointsInfo.getEndpointsCount()
        || currentEndpointsInfo.getEndpointsCommitIndex() < updatedEndpointsInfo.getEndpointsCommitIndex()
        || !currentEndpointsInfo.getLeaderId().equals(updatedEndpointsInfo.getLeaderId())) {

            if (clusterEndpointsInfoCache.compareAndSet(currentEndpointsInfo, updatedEndpointsInfo)) {
                LOGGER.info("{} updated cluster endpoints info: ", dataNodeId);

                tryUpdateLeaderInfo(updatedEndpointsInfo);
            }
        }

        return;
    }



    private void tryUpdateLeaderInfo(ClusterEndpointsInfo updatedEndpointsInfo) {
        if (!isNullOrEmpty(updatedEndpointsInfo.getLeaderId()) && (leaderStub == null || !updatedEndpointsInfo.getLeaderId().equals(leaderStub.leaderId))) {
            LOGGER.info("{} update leaderId; updated Id is: {}", dataNodeId, leaderStub.leaderId);

            //get leader address first
            String updatedLeaderAddress = updatedEndpointsInfo.getEndpointsMap().get(updatedEndpointsInfo.getLeaderId());
            //build channel and stub
            ManagedChannel updatedToLeaderChannel = ManagedChannelBuilder.forTarget(updatedLeaderAddress).usePlaintext().build();
            ShardRequestHandlerGrpc.ShardRequestHandlerFutureStub updatedLeaderStub = ShardRequestHandlerGrpc.newFutureStub(updatedToLeaderChannel);
            leaderStub = new LeaderStub(updatedEndpointsInfo.getLeaderId(), updatedLeaderStub);

        }
    }

    public String getClusterReport() {
        //todo:
        return null;
    }



    @Override
    public Map<String, InetSocketAddress> getClusterServerAddress() {
        return clusterServerAddress;
    }

    @Override
    public CommonResponse putShardInfo(PutShardRequest request) {
        return null;
    }

    @Override
    public GetShardResponse getShardInfo(GetShardRequest request) {
        return null;
    }

    public static void main(String[] args) {
//        String p = "/Users/chensiying/cs61b/search-engine-project/src/main/java/team/dsys/dssearch/internal/common/config/cluster.conf";
//        ClusterServiceManager manager = new ClusterServiceManagerImpl(1, p);
//        System.out.println(manager.getClusterServerAddress());

    }
}
