// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/service/phone-book-service.proto

package br.com.soulcodesoft.protoservice;

public final class PhoneBook {
  private PhoneBook() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&proto/service/phone-book-service.proto" +
      "\022\007service\032\033proto/contact/contact.proto2\341" +
      "\002\n\020PhoneBookService\022L\n\026recordContactSimp" +
      "leRpc\022\027.contact.ContactMessage\032\027.contact" +
      ".ContactMessage\"\000\022Q\n\031recordContactServer" +
      "Stream\022\027.contact.ContactMessage\032\027.contac" +
      "t.ContactMessage\"\0000\001\022Q\n\031recordContactCli" +
      "entStream\022\027.contact.ContactMessage\032\027.con" +
      "tact.ContactMessage\"\000(\001\022Y\n\037recordContact" +
      "BidirecionalStream\022\027.contact.ContactMess" +
      "age\032\027.contact.ContactMessage\"\000(\0010\001B/\n br" +
      ".com.soulcodesoft.protoserviceB\tPhoneBoo" +
      "kP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          br.com.soulcodesoft.protoentity.Contact.getDescriptor(),
        });
    br.com.soulcodesoft.protoentity.Contact.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}