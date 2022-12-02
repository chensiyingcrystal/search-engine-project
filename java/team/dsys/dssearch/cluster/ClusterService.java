package team.dsys.dssearch.cluster;

//import team.dsys.dssearch.shard.*;

/**
 * cluster nodes communicates using RPC
 */

import io.microraft.RaftEndpoint;
import io.microraft.report.RaftNodeReport;
import team.dsys.dssearch.cluster.config.ClusterServiceConfig;

import javax.annotation.Nonnull;

public interface ClusterService {

    // todo: marker, defined in grpc as a rpc method
    Integer getNodeByShardId(long shardId);


//    static ClusterService bootstrap(ClusterServiceConfig config) {
//        return new ClusterBootstrapper(requireNonNull(config)).get();
//    }
//
//    static ClusterService join(ClusterServiceConfig config, boolean votingMember) {
//        return new ClusterJoiner(requireNonNull(config), votingMember).get();
//    }

    @Nonnull
    ClusterServiceConfig getConfig();

    @Nonnull
    RaftEndpoint getNodeEndpoint();

    @Nonnull
    RaftNodeReport getRaftNodeReport();

    void shutdown();

    boolean isShutdown();

    void awaitTermination();

}


