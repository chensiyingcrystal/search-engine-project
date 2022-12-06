package team.dsys.dssearch.internal.common;

import cluster.external.shard.proto.GetRequest;
import cluster.external.shard.proto.PutRequest;
import cluster.external.shard.proto.ShardResponse;

public interface ClusterServiceManager {

    String getClusterReport();
    String getShardReport();
    ShardResponse putShardInfo(PutRequest request);
    ShardResponse getShardInfo(GetRequest request);



}
