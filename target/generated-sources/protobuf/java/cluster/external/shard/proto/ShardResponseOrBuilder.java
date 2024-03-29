// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShardRequest.proto

package cluster.external.shard.proto;

public interface ShardResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.ShardResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 commitIndex = 1;</code>
   * @return The commitIndex.
   */
  long getCommitIndex();

  /**
   * <code>.proto.CommonResponse commonResponse = 2;</code>
   * @return Whether the commonResponse field is set.
   */
  boolean hasCommonResponse();
  /**
   * <code>.proto.CommonResponse commonResponse = 2;</code>
   * @return The commonResponse.
   */
  cluster.external.shard.proto.CommonResponse getCommonResponse();
  /**
   * <code>.proto.CommonResponse commonResponse = 2;</code>
   */
  cluster.external.shard.proto.CommonResponseOrBuilder getCommonResponseOrBuilder();

  /**
   * <code>.proto.GetShardResponse getShardResponse = 3;</code>
   * @return Whether the getShardResponse field is set.
   */
  boolean hasGetShardResponse();
  /**
   * <code>.proto.GetShardResponse getShardResponse = 3;</code>
   * @return The getShardResponse.
   */
  cluster.external.shard.proto.GetShardResponse getGetShardResponse();
  /**
   * <code>.proto.GetShardResponse getShardResponse = 3;</code>
   */
  cluster.external.shard.proto.GetShardResponseOrBuilder getGetShardResponseOrBuilder();

  public cluster.external.shard.proto.ShardResponse.ResultCase getResultCase();
}
