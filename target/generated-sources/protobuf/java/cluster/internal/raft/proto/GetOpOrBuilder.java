// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RaftRpc.proto

package cluster.internal.raft.proto;

public interface GetOpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.GetOp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int32 shardId = 1;</code>
   * @return A list containing the shardId.
   */
  java.util.List<java.lang.Integer> getShardIdList();
  /**
   * <code>repeated int32 shardId = 1;</code>
   * @return The count of shardId.
   */
  int getShardIdCount();
  /**
   * <code>repeated int32 shardId = 1;</code>
   * @param index The index of the element to return.
   * @return The shardId at the given index.
   */
  int getShardId(int index);

  /**
   * <code>int64 minCommitIndex = 2;</code>
   * @return The minCommitIndex.
   */
  long getMinCommitIndex();
}
