// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShardRequest.proto

package cluster.external.shard.proto;

public interface GetShardResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.GetShardResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .proto.DataNodeInfo dataNodeInfo = 1;</code>
   */
  java.util.List<cluster.external.shard.proto.DataNodeInfo> 
      getDataNodeInfoList();
  /**
   * <code>repeated .proto.DataNodeInfo dataNodeInfo = 1;</code>
   */
  cluster.external.shard.proto.DataNodeInfo getDataNodeInfo(int index);
  /**
   * <code>repeated .proto.DataNodeInfo dataNodeInfo = 1;</code>
   */
  int getDataNodeInfoCount();
  /**
   * <code>repeated .proto.DataNodeInfo dataNodeInfo = 1;</code>
   */
  java.util.List<? extends cluster.external.shard.proto.DataNodeInfoOrBuilder> 
      getDataNodeInfoOrBuilderList();
  /**
   * <code>repeated .proto.DataNodeInfo dataNodeInfo = 1;</code>
   */
  cluster.external.shard.proto.DataNodeInfoOrBuilder getDataNodeInfoOrBuilder(
      int index);
}
