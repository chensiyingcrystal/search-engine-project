// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RaftRpc.proto

package cluster.proto;

public interface ShardEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.ShardEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string key = 1;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>.proto.Val val = 2;</code>
   * @return Whether the val field is set.
   */
  boolean hasVal();
  /**
   * <code>.proto.Val val = 2;</code>
   * @return The val.
   */
  cluster.proto.Val getVal();
  /**
   * <code>.proto.Val val = 2;</code>
   */
  cluster.proto.ValOrBuilder getValOrBuilder();
}
