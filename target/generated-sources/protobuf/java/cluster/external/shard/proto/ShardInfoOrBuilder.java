// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShardRequest.proto

package cluster.external.shard.proto;

public interface ShardInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.ShardInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string shardId = 3;</code>
   * @return The shardId.
   */
  java.lang.String getShardId();
  /**
   * <code>string shardId = 3;</code>
   * @return The bytes for shardId.
   */
  com.google.protobuf.ByteString
      getShardIdBytes();

  /**
   * <code>bool isPrimary = 4;</code>
   * @return The isPrimary.
   */
  boolean getIsPrimary();
}
