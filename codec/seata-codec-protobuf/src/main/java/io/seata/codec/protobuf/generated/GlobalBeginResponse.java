// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: globalBeginResponse.proto

package io.seata.codec.protobuf.generated;

public final class GlobalBeginResponse {
  private GlobalBeginResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_seata_protocol_protobuf_GlobalBeginResponseProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_seata_protocol_protobuf_GlobalBeginResponseProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031globalBeginResponse.proto\022\032io.seata.pr" +
      "otocol.protobuf\032!abstractTransactionResp" +
      "onse.proto\"\235\001\n\030GlobalBeginResponseProto\022" +
      "a\n\033abstractTransactionResponse\030\001 \001(\0132<.i" +
      "o.seata.protocol.protobuf.AbstractTransa" +
      "ctionResponseProto\022\013\n\003xid\030\002 \001(\t\022\021\n\textra" +
      "Data\030\003 \001(\tB:\n!io.seata.codec.protobuf.ge" +
      "neratedB\023GlobalBeginResponseP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.seata.codec.protobuf.generated.AbstractTransactionResponse.getDescriptor(),
        }, assigner);
    internal_static_io_seata_protocol_protobuf_GlobalBeginResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_seata_protocol_protobuf_GlobalBeginResponseProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_seata_protocol_protobuf_GlobalBeginResponseProto_descriptor,
        new java.lang.String[] { "AbstractTransactionResponse", "Xid", "ExtraData", });
    io.seata.codec.protobuf.generated.AbstractTransactionResponse.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
