// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RaftRpc.proto

package cluster.internal.raft.proto;

public interface PutOpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.PutOp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.proto.DataNodeInfo dataNodeInfo = 1;</code>
   * @return Whether the dataNodeInfo field is set.
   */
  boolean hasDataNodeInfo();
  /**
   * <code>.proto.DataNodeInfo dataNodeInfo = 1;</code>
   * @return The dataNodeInfo.
   */
  cluster.external.shard.proto.DataNodeInfo getDataNodeInfo();
  /**
   * <code>.proto.DataNodeInfo dataNodeInfo = 1;</code>
   */
  cluster.external.shard.proto.DataNodeInfoOrBuilder getDataNodeInfoOrBuilder();

  /**
   * <code>repeated .proto.ShardInfo shardInfo = 2;</code>
   */
  java.util.List<cluster.external.shard.proto.ShardInfo> 
      getShardInfoList();
  /**
   * <code>repeated .proto.ShardInfo shardInfo = 2;</code>
   */
  cluster.external.shard.proto.ShardInfo getShardInfo(int index);
  /**
   * <code>repeated .proto.ShardInfo shardInfo = 2;</code>
   */
  int getShardInfoCount();
  /**
   * <code>repeated .proto.ShardInfo shardInfo = 2;</code>
   */
  java.util.List<? extends cluster.external.shard.proto.ShardInfoOrBuilder> 
      getShardInfoOrBuilderList();
  /**
   * <code>repeated .proto.ShardInfo shardInfo = 2;</code>
   */
  cluster.external.shard.proto.ShardInfoOrBuilder getShardInfoOrBuilder(
      int index);
}