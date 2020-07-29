// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.OneofDescriptorProto in google/protobuf/descriptor.proto
package com.google.protobuf

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.internal.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

/**
 * Describes a oneof.
 */
class OneofDescriptorProto(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val name: String? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.google.protobuf.OneofOptions#ADAPTER"
  )
  @JvmField
  val options: OneofOptions? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<OneofDescriptorProto, OneofDescriptorProto.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.name = name
    builder.options = options
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is OneofDescriptorProto) return false
    if (unknownFields != other.unknownFields) return false
    if (name != other.name) return false
    if (options != other.options) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + name.hashCode()
      result = result * 37 + options.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (name != null) result += """name=${sanitize(name)}"""
    if (options != null) result += """options=$options"""
    return result.joinToString(prefix = "OneofDescriptorProto{", separator = ", ", postfix = "}")
  }

  fun copy(
    name: String? = this.name,
    options: OneofOptions? = this.options,
    unknownFields: ByteString = this.unknownFields
  ): OneofDescriptorProto = OneofDescriptorProto(name, options, unknownFields)

  class Builder : Message.Builder<OneofDescriptorProto, Builder>() {
    @JvmField
    var name: String? = null

    @JvmField
    var options: OneofOptions? = null

    fun name(name: String?): Builder {
      this.name = name
      return this
    }

    fun options(options: OneofOptions?): Builder {
      this.options = options
      return this
    }

    override fun build(): OneofDescriptorProto = OneofDescriptorProto(
      name = name,
      options = options,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<OneofDescriptorProto> = object : ProtoAdapter<OneofDescriptorProto>(
      FieldEncoding.LENGTH_DELIMITED, 
      OneofDescriptorProto::class, 
      "type.googleapis.com/google.protobuf.OneofDescriptorProto", 
      PROTO_2, 
      null
    ) {
      override fun encodedSize(value: OneofDescriptorProto): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.name)
        size += OneofOptions.ADAPTER.encodedSizeWithTag(2, value.options)
        return size
      }

      override fun encode(writer: ProtoWriter, value: OneofDescriptorProto) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
        OneofOptions.ADAPTER.encodeWithTag(writer, 2, value.options)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): OneofDescriptorProto {
        var name: String? = null
        var options: OneofOptions? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> name = ProtoAdapter.STRING.decode(reader)
            2 -> options = OneofOptions.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return OneofDescriptorProto(
          name = name,
          options = options,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: OneofDescriptorProto): OneofDescriptorProto = value.copy(
        options = value.options?.let(OneofOptions.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
