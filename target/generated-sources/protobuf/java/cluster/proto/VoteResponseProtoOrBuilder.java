// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RaftRpc.proto

package cluster.proto;

public interface VoteResponseProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.VoteResponseProto)
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
  cluster.proto.RaftEndpointProto getSender();
  /**
   * <code>.proto.RaftEndpointProto sender = 2;</code>
   */
  cluster.proto.RaftEndpointProtoOrBuilder getSenderOrBuilder();

  /**
   * <code>int32 term = 3;</code>
   * @return The term.
   */
  int getTerm();

  /**
   * <code>bool granted = 4;</code>
   * @return The granted.
   */
  boolean getGranted();
}
