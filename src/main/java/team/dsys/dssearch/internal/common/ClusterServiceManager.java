package team.dsys.dssearch.internal.common;

import cluster.external.shard.proto.GetShardRequest;
import cluster.external.shard.proto.PutShardRequest;
import cluster.external.shard.proto.ShardResponse;

public interface ClusterServiceManager {

    String getClusterReport();
    String getShardReport();
    ShardResponse putShardInfo(PutShardRequest request);
    ShardResponse getShardInfo(GetShardRequest request);



}
