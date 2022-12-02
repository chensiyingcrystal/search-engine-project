package team.dsys.dssearch.cluster;

//import team.dsys.dssearch.shard.*;
import io.microraft.RaftEndpoint;
import io.microraft.report.RaftNodeReport;
import team.dsys.dssearch.cluster.config.ClusterServiceConfig;

import javax.annotation.Nonnull;

import static java.util.Objects.requireNonNull;

public interface ClusterService {

    // todo: marker, defined in grpc as a rpc method
    //Integer getNodeByShardId(long shardId);

    static ClusterService bootstrap(ClusterServiceConfig config) {
        return new ClusterServiceImpl.ClusterBootstrapper(requireNonNull(config)).get();
    }

    static ClusterService join(ClusterServiceConfig config, boolean votingMember) {
        return new ClusterServiceImpl.ClusterJoiner(requireNonNull(config), votingMember).get();
    }

    /**
     * Get local ClusterServiceConfig (encompassing local node endpoint, initial endpoint and raft setting info)
     * @return ClusterServiceConfig
     */
    @Nonnull
    ClusterServiceConfig getConfig();

    /**
     * Get current node's (join or newly start) id in a cluster(e.g. node2)
     * @return RaftEndpoint
     */
    @Nonnull
    RaftEndpoint getNodeEndpoint();

    /**
     * Get current cluster's info, including cluster's members, their status, terms(election, snapshot, etc.)
     * @return
     */
    @Nonnull
    RaftNodeReport getRaftNodeReport();

    void shutdown();

    boolean isShutdown();

    void awaitTermination();

}


