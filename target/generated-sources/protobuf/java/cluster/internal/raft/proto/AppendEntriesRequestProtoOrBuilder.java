// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RaftRpc.proto

package cluster.internal.raft.proto;

public interface AppendEntriesRequestProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.AppendEntriesRequestProto)
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
   * <code>int32 prevLogTerm = 4;</code>
   * @return The prevLogTerm.
   */
  int getPrevLogTerm();

  /**
   * <code>int64 prevLogIndex = 5;</code>
   * @return The prevLogIndex.
   */
  long getPrevLogIndex();

  /**
   * <code>int64 commitIndex = 6;</code>
   * @return The commitIndex.
   */
  long getCommitIndex();

  /**
   * <code>repeated .proto.LogEntryProto entry = 7;</code>
   */
  java.util.List<cluster.internal.raft.proto.LogEntryProto> 
      getEntryList();
  /**
   * <code>repeated .proto.LogEntryProto entry = 7;</code>
   */
  cluster.internal.raft.proto.LogEntryProto getEntry(int index);
  /**
   * <code>repeated .proto.LogEntryProto entry = 7;</code>
   */
  int getEntryCount();
  /**
   * <code>repeated .proto.LogEntryProto entry = 7;</code>
   */
  java.util.List<? extends cluster.internal.raft.proto.LogEntryProtoOrBuilder> 
      getEntryOrBuilderList();
  /**
   * <code>repeated .proto.LogEntryProto entry = 7;</code>
   */
  cluster.internal.raft.proto.LogEntryProtoOrBuilder getEntryOrBuilder(
      int index);

  /**
   * <code>int64 querySequenceNumber = 8;</code>
   * @return The querySequenceNumber.
   */
  long getQuerySequenceNumber();

  /**
   * <code>int64 flowControlSequenceNumber = 9;</code>
   * @return The flowControlSequenceNumber.
   */
  long getFlowControlSequenceNumber();
}
