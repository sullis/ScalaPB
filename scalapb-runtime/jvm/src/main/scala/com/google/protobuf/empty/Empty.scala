// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.empty

import scala.collection.JavaConversions._

@SerialVersionUID(0L)
final case class Empty(
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Empty] with com.trueaccord.lenses.Updatable[Empty] {
    final override def serializedSize: Int = 0
    def writeTo(`_output__`: com.google.protobuf.CodedOutputStream): Unit = {
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.empty.Empty = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.empty.Empty(
      )
    }
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = throw new MatchError(__field)
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.empty.Empty
}

object Empty extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.empty.Empty] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.empty.Empty, com.google.protobuf.Empty] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.empty.Empty] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.empty.Empty, com.google.protobuf.Empty] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.empty.Empty): com.google.protobuf.Empty = {
    val javaPbOut = com.google.protobuf.Empty.newBuilder
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.Empty): com.google.protobuf.empty.Empty = com.google.protobuf.empty.Empty(
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.empty.Empty = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.empty.Empty(
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = EmptyProto.descriptor.getMessageTypes.get(0)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.empty.Empty(
  )
  implicit class EmptyLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.empty.Empty]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.empty.Empty](_l) {
  }
}
