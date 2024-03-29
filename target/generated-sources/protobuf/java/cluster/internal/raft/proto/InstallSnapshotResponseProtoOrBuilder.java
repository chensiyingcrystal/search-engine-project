// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RaftRpc.proto

package cluster.internal.raft.proto;

public interface InstallSnapshotResponseProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.InstallSnapshotResponseProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string groupId = 1;</code>
   * @return The groupId.
   */
  java.lang.String getGroupId();
  /**
   * <code>string groupId = 1;</code>
   * @return The bytes for groupId.
   */
  com.google.protobuf.ByteString
      getGroupIdBytes();

  /**
   * <code>.proto.RaftEndpointProto sender = 2;</code>
   * @return Whether the sender field is set.
   */
  boolean hasSender();
  /**
   * <code>.proto.RaftEndpointProto sender = 2;</code>
   * @return The sender.
   */
  cluster.internal.raft.proto.RaftEndpointProto getSender();
  /**
   * <code>.proto.RaftEndpointProto sender = 2;</code>
   */
  cluster.internal.raft.proto.RaftEndpointProtoOrBuilder getSenderOrBuilder();

  /**
   * <code>int32 term = 3;</code>
   * @return The term.
   */
  int getTerm();

  /**
   * <code>int64 snapshotIndex = 4;</code>
   * @return The snapshotIndex.
   */
  long getSnapshotIndex();

  /**
   * <code>int32 requestedSnapshotChunkIndex = 5;</code>
   * @return The requestedSnapshotChunkIndex.
   */
  int getRequestedSnapshotChunkIndex();

  /**
   * <code>int64 querySequenceNumber = 6;</code>
   * @return The querySequenceNumber.
   */
  long getQuerySequenceNumber();

  /**
   * <code>int64 flowControlSequenceNumber = 7;</code>
   * @return The flowControlSequenceNumber.
   */
  long getFlowControlSequenceNumber();
}
