// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RaftRpc.proto

package cluster.internal.raft.proto;

public interface GetOpResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.GetOpResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
   */
  java.util.List<cluster.external.shard.proto.ShardInfoWithDataNodeInfo> 
      getShardInfoWithDataNodeInfoList();
  /**
   * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
   */
  cluster.external.shard.proto.ShardInfoWithDataNodeInfo getShardInfoWithDataNodeInfo(int index);
  /**
   * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
   */
  int getShardInfoWithDataNodeInfoCount();
  /**
   * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
   */
  java.util.List<? extends cluster.external.shard.proto.ShardInfoWithDataNodeInfoOrBuilder> 
      getShardInfoWithDataNodeInfoOrBuilderList();
  /**
   * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
   */
  cluster.external.shard.proto.ShardInfoWithDataNodeInfoOrBuilder getShardInfoWithDataNodeInfoOrBuilder(
      int index);
}
