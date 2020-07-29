// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.FileDescriptorProto in google/protobuf/descriptor.proto
package com.google.protobuf

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.internal.redactElements
import com.squareup.wire.internal.sanitize
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Nothing
import kotlin.String
import kotlin.collections.List
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

/**
 * Describes a complete .proto file.
 */
class FileDescriptorProto(
  /**
   * file name, relative to root of source tree
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val name: String? = null,
  /**
   * e.g. "foo", "foo.bar", etc.
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    declaredName = "package"
  )
  val package_: String? = null,
  /**
   * Names of files imported by this file.
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.REPEATED
  )
  val dependency: List<String> = emptyList(),
  /**
   * Indexes of the public imported files in the dependency list above.
   */
  @field:WireField(
    tag = 10,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.REPEATED
  )
  val public_dependency: List<Int> = emptyList(),
  /**
   * Indexes of the weak imported files in the dependency list.
   * For Google-internal migration only. Do not use.
   */
  @field:WireField(
    tag = 11,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.REPEATED
  )
  val weak_dependency: List<Int> = emptyList(),
  /**
   * All top-level definitions in this file.
   */
  @field:WireField(
    tag = 4,
    adapter = "com.google.protobuf.DescriptorProto#ADAPTER",
    label = WireField.Label.REPEATED
  )
  val message_type: List<DescriptorProto> = emptyList(),
  @field:WireField(
    tag = 5,
    adapter = "com.google.protobuf.EnumDescriptorProto#ADAPTER",
    label = WireField.Label.REPEATED
  )
  val enum_type: List<EnumDescriptorProto> = emptyList(),
  @field:WireField(
    tag = 6,
    adapter = "com.google.protobuf.ServiceDescriptorProto#ADAPTER",
    label = WireField.Label.REPEATED
  )
  val service: List<ServiceDescriptorProto> = emptyList(),
  @field:WireField(
    tag = 7,
    adapter = "com.google.protobuf.FieldDescriptorProto#ADAPTER",
    label = WireField.Label.REPEATED
  )
  val extension: List<FieldDescriptorProto> = emptyList(),
  @field:WireField(
    tag = 8,
    adapter = "com.google.protobuf.FileOptions#ADAPTER"
  )
  val options: FileOptions? = null,
  /**
   * This field contains optional information about the original source code.
   * You may safely remove this entire field without harming runtime
   * functionality of the descriptors -- the information is needed only by
   * development tools.
   */
  @field:WireField(
    tag = 9,
    adapter = "com.google.protobuf.SourceCodeInfo#ADAPTER"
  )
  val source_code_info: SourceCodeInfo? = null,
  /**
   * The syntax of the proto file.
   * The supported values are "proto2" and "proto3".
   */
  @field:WireField(
    tag = 12,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  val syntax: String? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<FileDescriptorProto, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing = throw AssertionError()

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is FileDescriptorProto) return false
    if (unknownFields != other.unknownFields) return false
    if (name != other.name) return false
    if (package_ != other.package_) return false
    if (dependency != other.dependency) return false
    if (public_dependency != other.public_dependency) return false
    if (weak_dependency != other.weak_dependency) return false
    if (message_type != other.message_type) return false
    if (enum_type != other.enum_type) return false
    if (service != other.service) return false
    if (extension != other.extension) return false
    if (options != other.options) return false
    if (source_code_info != other.source_code_info) return false
    if (syntax != other.syntax) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + name.hashCode()
      result = result * 37 + package_.hashCode()
      result = result * 37 + dependency.hashCode()
      result = result * 37 + public_dependency.hashCode()
      result = result * 37 + weak_dependency.hashCode()
      result = result * 37 + message_type.hashCode()
      result = result * 37 + enum_type.hashCode()
      result = result * 37 + service.hashCode()
      result = result * 37 + extension.hashCode()
      result = result * 37 + options.hashCode()
      result = result * 37 + source_code_info.hashCode()
      result = result * 37 + syntax.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (name != null) result += """name=${sanitize(name)}"""
    if (package_ != null) result += """package_=${sanitize(package_)}"""
    if (dependency.isNotEmpty()) result += """dependency=${sanitize(dependency)}"""
    if (public_dependency.isNotEmpty()) result += """public_dependency=$public_dependency"""
    if (weak_dependency.isNotEmpty()) result += """weak_dependency=$weak_dependency"""
    if (message_type.isNotEmpty()) result += """message_type=$message_type"""
    if (enum_type.isNotEmpty()) result += """enum_type=$enum_type"""
    if (service.isNotEmpty()) result += """service=$service"""
    if (extension.isNotEmpty()) result += """extension=$extension"""
    if (options != null) result += """options=$options"""
    if (source_code_info != null) result += """source_code_info=$source_code_info"""
    if (syntax != null) result += """syntax=${sanitize(syntax)}"""
    return result.joinToString(prefix = "FileDescriptorProto{", separator = ", ", postfix = "}")
  }

  fun copy(
    name: String? = this.name,
    package_: String? = this.package_,
    dependency: List<String> = this.dependency,
    public_dependency: List<Int> = this.public_dependency,
    weak_dependency: List<Int> = this.weak_dependency,
    message_type: List<DescriptorProto> = this.message_type,
    enum_type: List<EnumDescriptorProto> = this.enum_type,
    service: List<ServiceDescriptorProto> = this.service,
    extension: List<FieldDescriptorProto> = this.extension,
    options: FileOptions? = this.options,
    source_code_info: SourceCodeInfo? = this.source_code_info,
    syntax: String? = this.syntax,
    unknownFields: ByteString = this.unknownFields
  ): FileDescriptorProto = FileDescriptorProto(name, package_, dependency, public_dependency,
      weak_dependency, message_type, enum_type, service, extension, options, source_code_info,
      syntax, unknownFields)

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<FileDescriptorProto> = object : ProtoAdapter<FileDescriptorProto>(
      FieldEncoding.LENGTH_DELIMITED, 
      FileDescriptorProto::class, 
      "type.googleapis.com/google.protobuf.FileDescriptorProto", 
      PROTO_2, 
      null
    ) {
      override fun encodedSize(value: FileDescriptorProto): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.name)
        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.package_)
        size += ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, value.dependency)
        size += ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(10, value.public_dependency)
        size += ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(11, value.weak_dependency)
        size += DescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(4, value.message_type)
        size += EnumDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(5, value.enum_type)
        size += ServiceDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(6, value.service)
        size += FieldDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(7, value.extension)
        size += FileOptions.ADAPTER.encodedSizeWithTag(8, value.options)
        size += SourceCodeInfo.ADAPTER.encodedSizeWithTag(9, value.source_code_info)
        size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.syntax)
        return size
      }

      override fun encode(writer: ProtoWriter, value: FileDescriptorProto) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.package_)
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 3, value.dependency)
        ProtoAdapter.INT32.asRepeated().encodeWithTag(writer, 10, value.public_dependency)
        ProtoAdapter.INT32.asRepeated().encodeWithTag(writer, 11, value.weak_dependency)
        DescriptorProto.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.message_type)
        EnumDescriptorProto.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.enum_type)
        ServiceDescriptorProto.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.service)
        FieldDescriptorProto.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.extension)
        FileOptions.ADAPTER.encodeWithTag(writer, 8, value.options)
        SourceCodeInfo.ADAPTER.encodeWithTag(writer, 9, value.source_code_info)
        ProtoAdapter.STRING.encodeWithTag(writer, 12, value.syntax)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): FileDescriptorProto {
        var name: String? = null
        var package_: String? = null
        val dependency = mutableListOf<String>()
        val public_dependency = mutableListOf<Int>()
        val weak_dependency = mutableListOf<Int>()
        val message_type = mutableListOf<DescriptorProto>()
        val enum_type = mutableListOf<EnumDescriptorProto>()
        val service = mutableListOf<ServiceDescriptorProto>()
        val extension = mutableListOf<FieldDescriptorProto>()
        var options: FileOptions? = null
        var source_code_info: SourceCodeInfo? = null
        var syntax: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> name = ProtoAdapter.STRING.decode(reader)
            2 -> package_ = ProtoAdapter.STRING.decode(reader)
            3 -> dependency.add(ProtoAdapter.STRING.decode(reader))
            10 -> public_dependency.add(ProtoAdapter.INT32.decode(reader))
            11 -> weak_dependency.add(ProtoAdapter.INT32.decode(reader))
            4 -> message_type.add(DescriptorProto.ADAPTER.decode(reader))
            5 -> enum_type.add(EnumDescriptorProto.ADAPTER.decode(reader))
            6 -> service.add(ServiceDescriptorProto.ADAPTER.decode(reader))
            7 -> extension.add(FieldDescriptorProto.ADAPTER.decode(reader))
            8 -> options = FileOptions.ADAPTER.decode(reader)
            9 -> source_code_info = SourceCodeInfo.ADAPTER.decode(reader)
            12 -> syntax = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return FileDescriptorProto(
          name = name,
          package_ = package_,
          dependency = dependency,
          public_dependency = public_dependency,
          weak_dependency = weak_dependency,
          message_type = message_type,
          enum_type = enum_type,
          service = service,
          extension = extension,
          options = options,
          source_code_info = source_code_info,
          syntax = syntax,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: FileDescriptorProto): FileDescriptorProto = value.copy(
        message_type = value.message_type.redactElements(DescriptorProto.ADAPTER),
        enum_type = value.enum_type.redactElements(EnumDescriptorProto.ADAPTER),
        service = value.service.redactElements(ServiceDescriptorProto.ADAPTER),
        extension = value.extension.redactElements(FieldDescriptorProto.ADAPTER),
        options = value.options?.let(FileOptions.ADAPTER::redact),
        source_code_info = value.source_code_info?.let(SourceCodeInfo.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
