// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/contact/telephone.proto

package br.com.soulcodesoft.protoentity;

public interface TelephoneMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:contact.TelephoneMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string number = 1;</code>
   * @return The number.
   */
  java.lang.String getNumber();
  /**
   * <code>string number = 1;</code>
   * @return The bytes for number.
   */
  com.google.protobuf.ByteString
      getNumberBytes();

  /**
   * <code>.contact.TelephoneMessage.TypeNumber type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.contact.TelephoneMessage.TypeNumber type = 2;</code>
   * @return The type.
   */
  br.com.soulcodesoft.protoentity.TelephoneMessage.TypeNumber getType();
}