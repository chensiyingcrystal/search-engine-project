// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShardRequest.proto

package cluster.external.shard.proto;

public interface DataNodeInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.DataNodeInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 dataNodeId = 1;</code>
   * @return The dataNodeId.
   */
  int getDataNodeId();

  /**
   * <pre>
   *localhost:6701
   * </pre>
   *
   * <code>string address = 2;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   *localhost:6701
   * </pre>
   *
   * <code>string address = 2;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();
}
