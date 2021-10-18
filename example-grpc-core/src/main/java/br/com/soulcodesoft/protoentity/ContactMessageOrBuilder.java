// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/contact/contact.proto

package br.com.soulcodesoft.protoentity;

public interface ContactMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:contact.ContactMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.contact.ContactMessage.TypeContact type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.contact.ContactMessage.TypeContact type = 2;</code>
   * @return The type.
   */
  br.com.soulcodesoft.protoentity.ContactMessage.TypeContact getType();

  /**
   * <code>repeated .contact.TelephoneMessage telephones = 3;</code>
   */
  java.util.List<br.com.soulcodesoft.protoentity.TelephoneMessage> 
      getTelephonesList();
  /**
   * <code>repeated .contact.TelephoneMessage telephones = 3;</code>
   */
  br.com.soulcodesoft.protoentity.TelephoneMessage getTelephones(int index);
  /**
   * <code>repeated .contact.TelephoneMessage telephones = 3;</code>
   */
  int getTelephonesCount();
  /**
   * <code>repeated .contact.TelephoneMessage telephones = 3;</code>
   */
  java.util.List<? extends br.com.soulcodesoft.protoentity.TelephoneMessageOrBuilder> 
      getTelephonesOrBuilderList();
  /**
   * <code>repeated .contact.TelephoneMessage telephones = 3;</code>
   */
  br.com.soulcodesoft.protoentity.TelephoneMessageOrBuilder getTelephonesOrBuilder(
      int index);
}