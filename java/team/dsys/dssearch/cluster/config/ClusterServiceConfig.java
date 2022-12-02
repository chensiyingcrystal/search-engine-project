package team.dsys.dssearch.cluster.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import io.microraft.RaftConfig;
import team.dsys.dssearch.cluster.exception.ClusterServerException;

import javax.annotation.Nonnull;

import static io.microraft.RaftConfig.DEFAULT_RAFT_CONFIG;
import static java.util.Objects.requireNonNull;

public final class ClusterServiceConfig {

    private Config config;
    private NodeEndpointConfig nodeEndpointConfig;
    private ClusterConfig clusterConfig;
    private RaftConfig raftConfig;
    private GrpcConfig grpcConfig;

    private ClusterServiceConfig() {
    }

    @Nonnull
    public static ClusterServiceConfig from(@Nonnull Config config) {
        return newBuilder().setConfig(requireNonNull(config)).build();
    }

    @Nonnull
    public static ClusterServerConfigBuilder newBuilder() {
        return new ClusterServerConfigBuilder();
    }

    @Nonnull
    public Config getConfig() {
        return config;
    }

    @Nonnull
    public NodeEndpointConfig getNodeEndpointConfig() {
        return nodeEndpointConfig;
    }

    @Nonnull
    public ClusterConfig getClusterConfig() {
        return clusterConfig;
    }

    @Nonnull
    public RaftConfig getRaftConfig() {
        return raftConfig;
    }

    @Nonnull
    public GrpcConfig getRpcConfig() {
        return grpcConfig;
    }

    @Override
    public String toString() {
        return "ClusterServerConfig info {" + "config=" + config + ", NodeEndpointConfig=" + nodeEndpointConfig
                + ", ClusterConfig=" + clusterConfig + ", raftConfig=" + raftConfig + ", GrpcConfig=" + grpcConfig
                + '}';
    }

    public static class ClusterServerConfigBuilder {

        private ClusterServiceConfig clusterServiceConfig = new ClusterServiceConfig();

        @Nonnull
        public ClusterServerConfigBuilder setConfig(@Nonnull Config config) {
            clusterServiceConfig.config = requireNonNull(config);
            return this;
        }

        @Nonnull
        public ClusterServerConfigBuilder setNodeEndpointConfig(@Nonnull NodeEndpointConfig nodeEndpointConfig) {
            clusterServiceConfig.nodeEndpointConfig = requireNonNull(nodeEndpointConfig);
            return this;
        }

        @Nonnull
        public ClusterServerConfigBuilder setClusterConfig(@Nonnull ClusterConfig clusterConfig) {
            clusterServiceConfig.clusterConfig = requireNonNull(clusterConfig);
            return this;
        }

        @Nonnull
        public ClusterServerConfigBuilder setRaftConfig(@Nonnull RaftConfig raftConfig) {
            clusterServiceConfig.raftConfig = requireNonNull(raftConfig);
            return this;
        }

        @Nonnull
        public ClusterServerConfigBuilder setRpcConfig(@Nonnull GrpcConfig grpcConfig) {
            clusterServiceConfig.grpcConfig = requireNonNull(grpcConfig);
            return this;
        }

        @Nonnull
        public ClusterServiceConfig build() {
            if (clusterServiceConfig == null) {
                throw new ClusterServerException("ClusterServer config is empty!");
            }

            if (clusterServiceConfig.config == null) {
                try {
                    clusterServiceConfig.config = ConfigFactory.load();
                } catch (Exception e) {
                    throw new ClusterServerException("Could not load Config!", e);
                }
            }

            try {
                if (clusterServiceConfig.config.hasPath("cluster")) {

                    Config config = clusterServiceConfig.config.getConfig("cluster");

                    if (clusterServiceConfig.nodeEndpointConfig == null && config.hasPath("node-endpoint")) {
                        clusterServiceConfig.nodeEndpointConfig = NodeEndpointConfig
                                .from(config.getConfig("node-endpoint"));
                    }

                    if (clusterServiceConfig.clusterConfig == null && config.hasPath("group")) {
                        clusterServiceConfig.clusterConfig = ClusterConfig.from(config.getConfig("group"));
                    }

                    if (clusterServiceConfig.raftConfig == null) {
                        clusterServiceConfig.raftConfig = DEFAULT_RAFT_CONFIG;
                    }

                    if (clusterServiceConfig.grpcConfig == null && config.hasPath("grpc")) {
                        clusterServiceConfig.grpcConfig = GrpcConfig.from(config.getConfig("grpc"));
                    }
                }
            } catch (Exception e) {
                if (e instanceof ClusterServerException) {
                    throw (ClusterServerException) e;
                }

                throw new ClusterServerException("Could not build cluster from current config!", e);
            }

            if (clusterServiceConfig.nodeEndpointConfig == null) {
                throw new ClusterServerException("Local endpoint config is missing!");
            }

            if (clusterServiceConfig.clusterConfig == null) {
                throw new ClusterServerException("Cluster config is missing!");
            }

            if (clusterServiceConfig.raftConfig == null) {
                throw new ClusterServerException("Raft config is missing!");
            }

            if (clusterServiceConfig.grpcConfig == null) {
                clusterServiceConfig.grpcConfig = GrpcConfig.newBuilder().build();
            }

            ClusterServiceConfig builtClusterServiceConfig = this.clusterServiceConfig;
            this.clusterServiceConfig = null;
            return builtClusterServiceConfig;
        }

    }

}