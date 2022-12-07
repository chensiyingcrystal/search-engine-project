// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RaftRpc.proto

package cluster.internal.raft.proto;

public interface InstallSnapshotRequestProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.InstallSnapshotRequestProto)
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
   * <code>bool senderLeader = 4;</code>
   * @return The senderLeader.
   */
  boolean getSenderLeader();

  /**
   * <code>int32 snapshotTerm = 5;</code>
   * @return The snapshotTerm.
   */
  int getSnapshotTerm();

  /**
   * <code>int64 snapshotIndex = 6;</code>
   * @return The snapshotIndex.
   */
  long getSnapshotIndex();

  /**
   * <code>int32 totalSnapshotChunkCount = 7;</code>
   * @return The totalSnapshotChunkCount.
   */
  int getTotalSnapshotChunkCount();

  /**
   * <code>.proto.ClusterSnapshotChunk snapshotChunk = 8;</code>
   * @return Whether the snapshotChunk field is set.
   */
  boolean hasSnapshotChunk();
  /**
   * <code>.proto.ClusterSnapshotChunk snapshotChunk = 8;</code>
   * @return The snapshotChunk.
   */
  cluster.internal.raft.proto.ClusterSnapshotChunk getSnapshotChunk();
  /**
   * <code>.proto.ClusterSnapshotChunk snapshotChunk = 8;</code>
   */
  cluster.internal.raft.proto.ClusterSnapshotChunkOrBuilder getSnapshotChunkOrBuilder();

  /**
   * <code>repeated .proto.RaftEndpointProto snapshottedMember = 9;</code>
   */
  java.util.List<cluster.internal.raft.proto.RaftEndpointProto> 
      getSnapshottedMemberList();
  /**
   * <code>repeated .proto.RaftEndpointProto snapshottedMember = 9;</code>
   */
  cluster.internal.raft.proto.RaftEndpointProto getSnapshottedMember(int index);
  /**
   * <code>repeated .proto.RaftEndpointProto snapshottedMember = 9;</code>
   */
  int getSnapshottedMemberCount();
  /**
   * <code>repeated .proto.RaftEndpointProto snapshottedMember = 9;</code>
   */
  java.util.List<? extends cluster.internal.raft.proto.RaftEndpointProtoOrBuilder> 
      getSnapshottedMemberOrBuilderList();
  /**
   * <code>repeated .proto.RaftEndpointProto snapshottedMember = 9;</code>
   */
  cluster.internal.raft.proto.RaftEndpointProtoOrBuilder getSnapshottedMemberOrBuilder(
      int index);

  /**
   * <code>.proto.RaftGroupMembersViewProto groupMembersView = 10;</code>
   * @return Whether the groupMembersView field is set.
   */
  boolean hasGroupMembersView();
  /**
   * <code>.proto.RaftGroupMembersViewProto groupMembersView = 10;</code>
   * @return The groupMembersView.
   */
  cluster.internal.raft.proto.RaftGroupMembersViewProto getGroupMembersView();
  /**
   * <code>.proto.RaftGroupMembersViewProto groupMembersView = 10;</code>
   */
  cluster.internal.raft.proto.RaftGroupMembersViewProtoOrBuilder getGroupMembersViewOrBuilder();

  /**
   * <code>int64 querySequenceNumber = 12;</code>
   * @return The querySequenceNumber.
   */
  long getQuerySequenceNumber();

  /**
   * <code>int64 flowControlSequenceNumber = 13;</code>
   * @return The flowControlSequenceNumber.
   */
  long getFlowControlSequenceNumber();
}