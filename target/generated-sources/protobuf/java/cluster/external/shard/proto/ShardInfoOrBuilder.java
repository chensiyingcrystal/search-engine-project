// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShardRequest.proto

package cluster.external.shard.proto;

public interface ShardInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.ShardInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 shardId = 3;</code>
   * @return The shardId.
   */
  int getShardId();

  /**
   * <pre>
   *primary shard: true
   * </pre>
   *
   * <code>bool isPrimary = 4;</code>
   * @return The isPrimary.
   */
  boolean getIsPrimary();
}
