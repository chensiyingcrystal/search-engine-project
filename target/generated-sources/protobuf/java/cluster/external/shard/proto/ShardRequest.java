// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShardRequest.proto

package cluster.external.shard.proto;

public final class ShardRequest {
  private ShardRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_Val_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_Val_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_PutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_PutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_PutResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_PutResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GetResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_RemoveRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_RemoveRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_RemoveResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_RemoveResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ShardResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ShardResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022ShardRequest.proto\022\005proto\"?\n\003Val\022\r\n\003st" +
      "r\030\001 \001(\tH\000\022\r\n\003num\030\002 \001(\003H\000\022\023\n\tbyteArray\030\003 " +
      "\001(\014H\000B\005\n\003val\"G\n\nPutRequest\022\013\n\003key\030\001 \001(\t\022" +
      "\027\n\003val\030\002 \001(\0132\n.proto.Val\022\023\n\013putIfAbsent\030" +
      "\003 \001(\010\"\'\n\tPutResult\022\032\n\006oldVal\030\001 \001(\0132\n.pro" +
      "to.Val\"1\n\nGetRequest\022\013\n\003key\030\001 \001(\t\022\026\n\016min" +
      "CommitIndex\030\002 \001(\003\"$\n\tGetResult\022\027\n\003val\030\001 " +
      "\001(\0132\n.proto.Val\"5\n\rRemoveRequest\022\013\n\003key\030" +
      "\001 \001(\t\022\027\n\003val\030\002 \001(\0132\n.proto.Val\";\n\014Remove" +
      "Result\022\017\n\007success\030\001 \001(\010\022\032\n\006oldVal\030\002 \001(\0132" +
      "\n.proto.Val\"\251\001\n\rShardResponse\022\023\n\013commitI" +
      "ndex\030\001 \001(\003\022%\n\tputResult\030\002 \001(\0132\020.proto.Pu" +
      "tResultH\000\022%\n\tgetResult\030\003 \001(\0132\020.proto.Get" +
      "ResultH\000\022+\n\014removeResult\030\005 \001(\0132\023.proto.R" +
      "emoveResultH\000B\010\n\006result2\253\001\n\023ShardRequest" +
      "Handler\022.\n\003put\022\021.proto.PutRequest\032\024.prot" +
      "o.ShardResponse\022.\n\003get\022\021.proto.GetReques" +
      "t\032\024.proto.ShardResponse\0224\n\006remove\022\024.prot" +
      "o.RemoveRequest\032\024.proto.ShardResponseB \n" +
      "\034cluster.external.shard.protoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto_Val_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_Val_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_Val_descriptor,
        new java.lang.String[] { "Str", "Num", "ByteArray", "Val", });
    internal_static_proto_PutRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_PutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_PutRequest_descriptor,
        new java.lang.String[] { "Key", "Val", "PutIfAbsent", });
    internal_static_proto_PutResult_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_proto_PutResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_PutResult_descriptor,
        new java.lang.String[] { "OldVal", });
    internal_static_proto_GetRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_proto_GetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GetRequest_descriptor,
        new java.lang.String[] { "Key", "MinCommitIndex", });
    internal_static_proto_GetResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_proto_GetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GetResult_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_proto_RemoveRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_proto_RemoveRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_RemoveRequest_descriptor,
        new java.lang.String[] { "Key", "Val", });
    internal_static_proto_RemoveResult_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_proto_RemoveResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_RemoveResult_descriptor,
        new java.lang.String[] { "Success", "OldVal", });
    internal_static_proto_ShardResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_proto_ShardResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ShardResponse_descriptor,
        new java.lang.String[] { "CommitIndex", "PutResult", "GetResult", "RemoveResult", "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
