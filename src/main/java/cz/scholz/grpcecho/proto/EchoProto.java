// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: echo.proto

package cz.scholz.grpcecho.proto;

public final class EchoProto {
  private EchoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_echo_EchoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_echo_EchoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_echo_EchoReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_echo_EchoReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\necho.proto\022\004echo\"\036\n\013EchoRequest\022\017\n\007mes" +
      "sage\030\001 \001(\t\"\034\n\tEchoReply\022\017\n\007message\030\001 \001(\t" +
      "24\n\004Echo\022,\n\004Echo\022\021.echo.EchoRequest\032\017.ec" +
      "ho.EchoReply\"\000B\'\n\030cz.scholz.grpcecho.pro" +
      "toB\tEchoProtoP\001b\006proto3"
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
        }, assigner);
    internal_static_echo_EchoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_echo_EchoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_echo_EchoRequest_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_echo_EchoReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_echo_EchoReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_echo_EchoReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}