// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.custom_options.FooBar in custom_options.proto
package com.squareup.wire.protos.custom_options;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import okio.ByteString;

public final class FooBar extends Message<FooBar, FooBar.Builder> {
  public static final ProtoAdapter<FooBar> ADAPTER = new ProtoAdapter_FooBar();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_FOO = 0;

  public static final String DEFAULT_BAR = "";

  public static final Long DEFAULT_QUX = 0L;

  public static final Double DEFAULT_DAISY = 0.0d;

  public static final FooBarBazEnum DEFAULT_EXT = FooBarBazEnum.FOO;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer foo;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String bar;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.protos.custom_options.FooBar$Nested#ADAPTER"
  )
  public final Nested baz;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long qux;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT",
      label = WireField.Label.REPEATED
  )
  public final List<Float> fred;

  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
  )
  public final Double daisy;

  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.protos.custom_options.FooBar#ADAPTER",
      label = WireField.Label.REPEATED,
      redacted = true
  )
  public final List<FooBar> nested;

  /**
   * Extension source: custom_options.proto
   */
  @WireField(
      tag = 101,
      adapter = "com.squareup.wire.protos.custom_options.FooBar$FooBarBazEnum#ADAPTER"
  )
  public final FooBarBazEnum ext;

  /**
   * Extension source: custom_options.proto
   */
  @WireField(
      tag = 102,
      adapter = "com.squareup.wire.protos.custom_options.FooBar$FooBarBazEnum#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<FooBarBazEnum> rep;

  public FooBar(Integer foo, String bar, Nested baz, Long qux, List<Float> fred, Double daisy,
      List<FooBar> nested, FooBarBazEnum ext, List<FooBarBazEnum> rep) {
    this(foo, bar, baz, qux, fred, daisy, nested, ext, rep, ByteString.EMPTY);
  }

  public FooBar(Integer foo, String bar, Nested baz, Long qux, List<Float> fred, Double daisy,
      List<FooBar> nested, FooBarBazEnum ext, List<FooBarBazEnum> rep, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.foo = foo;
    this.bar = bar;
    this.baz = baz;
    this.qux = qux;
    this.fred = Internal.immutableCopyOf("fred", fred);
    this.daisy = daisy;
    this.nested = Internal.immutableCopyOf("nested", nested);
    this.ext = ext;
    this.rep = Internal.immutableCopyOf("rep", rep);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.foo = foo;
    builder.bar = bar;
    builder.baz = baz;
    builder.qux = qux;
    builder.fred = Internal.copyOf(fred);
    builder.daisy = daisy;
    builder.nested = Internal.copyOf(nested);
    builder.ext = ext;
    builder.rep = Internal.copyOf(rep);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof FooBar)) return false;
    FooBar o = (FooBar) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(foo, o.foo)
        && Internal.equals(bar, o.bar)
        && Internal.equals(baz, o.baz)
        && Internal.equals(qux, o.qux)
        && fred.equals(o.fred)
        && Internal.equals(daisy, o.daisy)
        && nested.equals(o.nested)
        && Internal.equals(ext, o.ext)
        && rep.equals(o.rep);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (foo != null ? foo.hashCode() : 0);
      result = result * 37 + (bar != null ? bar.hashCode() : 0);
      result = result * 37 + (baz != null ? baz.hashCode() : 0);
      result = result * 37 + (qux != null ? qux.hashCode() : 0);
      result = result * 37 + fred.hashCode();
      result = result * 37 + (daisy != null ? daisy.hashCode() : 0);
      result = result * 37 + nested.hashCode();
      result = result * 37 + (ext != null ? ext.hashCode() : 0);
      result = result * 37 + rep.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (foo != null) builder.append(", foo=").append(foo);
    if (bar != null) builder.append(", bar=").append(Internal.sanitize(bar));
    if (baz != null) builder.append(", baz=").append(baz);
    if (qux != null) builder.append(", qux=").append(qux);
    if (!fred.isEmpty()) builder.append(", fred=").append(fred);
    if (daisy != null) builder.append(", daisy=").append(daisy);
    if (!nested.isEmpty()) builder.append(", nested=██");
    if (ext != null) builder.append(", ext=").append(ext);
    if (!rep.isEmpty()) builder.append(", rep=").append(rep);
    return builder.replace(0, 2, "FooBar{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<FooBar, Builder> {
    public Integer foo;

    public String bar;

    public Nested baz;

    public Long qux;

    public List<Float> fred;

    public Double daisy;

    public List<FooBar> nested;

    public FooBarBazEnum ext;

    public List<FooBarBazEnum> rep;

    public Builder() {
      fred = Internal.newMutableList();
      nested = Internal.newMutableList();
      rep = Internal.newMutableList();
    }

    public Builder foo(Integer foo) {
      this.foo = foo;
      return this;
    }

    public Builder bar(String bar) {
      this.bar = bar;
      return this;
    }

    public Builder baz(Nested baz) {
      this.baz = baz;
      return this;
    }

    public Builder qux(Long qux) {
      this.qux = qux;
      return this;
    }

    public Builder fred(List<Float> fred) {
      Internal.checkElementsNotNull(fred);
      this.fred = fred;
      return this;
    }

    public Builder daisy(Double daisy) {
      this.daisy = daisy;
      return this;
    }

    public Builder nested(List<FooBar> nested) {
      Internal.checkElementsNotNull(nested);
      this.nested = nested;
      return this;
    }

    public Builder ext(FooBarBazEnum ext) {
      this.ext = ext;
      return this;
    }

    public Builder rep(List<FooBarBazEnum> rep) {
      Internal.checkElementsNotNull(rep);
      this.rep = rep;
      return this;
    }

    @Override
    public FooBar build() {
      return new FooBar(foo, bar, baz, qux, fred, daisy, nested, ext, rep, super.buildUnknownFields());
    }
  }

  public static final class Nested extends Message<Nested, Nested.Builder> {
    public static final ProtoAdapter<Nested> ADAPTER = new ProtoAdapter_Nested();

    private static final long serialVersionUID = 0L;

    public static final FooBarBazEnum DEFAULT_VALUE = FooBarBazEnum.FOO;

    @WireField(
        tag = 1,
        adapter = "com.squareup.wire.protos.custom_options.FooBar$FooBarBazEnum#ADAPTER"
    )
    public final FooBarBazEnum value;

    public Nested(FooBarBazEnum value) {
      this(value, ByteString.EMPTY);
    }

    public Nested(FooBarBazEnum value, ByteString unknownFields) {
      super(ADAPTER, unknownFields);
      this.value = value;
    }

    @Override
    public Builder newBuilder() {
      Builder builder = new Builder();
      builder.value = value;
      builder.addUnknownFields(unknownFields());
      return builder;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof Nested)) return false;
      Nested o = (Nested) other;
      return unknownFields().equals(o.unknownFields())
          && Internal.equals(value, o.value);
    }

    @Override
    public int hashCode() {
      int result = super.hashCode;
      if (result == 0) {
        result = unknownFields().hashCode();
        result = result * 37 + (value != null ? value.hashCode() : 0);
        super.hashCode = result;
      }
      return result;
    }

    @Override
    public String toString() {
      StringBuilder builder = new StringBuilder();
      if (value != null) builder.append(", value=").append(value);
      return builder.replace(0, 2, "Nested{").append('}').toString();
    }

    public static final class Builder extends Message.Builder<Nested, Builder> {
      public FooBarBazEnum value;

      public Builder() {
      }

      public Builder value(FooBarBazEnum value) {
        this.value = value;
        return this;
      }

      @Override
      public Nested build() {
        return new Nested(value, super.buildUnknownFields());
      }
    }

    private static final class ProtoAdapter_Nested extends ProtoAdapter<Nested> {
      public ProtoAdapter_Nested() {
        super(FieldEncoding.LENGTH_DELIMITED, Nested.class, "type.googleapis.com/squareup.protos.custom_options.FooBar.Nested", Syntax.PROTO_2, null);
      }

      @Override
      public int encodedSize(Nested value) {
        int result = 0;
        result += FooBarBazEnum.ADAPTER.encodedSizeWithTag(1, value.value);
        result += value.unknownFields().size();
        return result;
      }

      @Override
      public void encode(ProtoWriter writer, Nested value) throws IOException {
        FooBarBazEnum.ADAPTER.encodeWithTag(writer, 1, value.value);
        writer.writeBytes(value.unknownFields());
      }

      @Override
      public Nested decode(ProtoReader reader) throws IOException {
        Builder builder = new Builder();
        long token = reader.beginMessage();
        for (int tag; (tag = reader.nextTag()) != -1;) {
          switch (tag) {
            case 1: {
              try {
                builder.value(FooBarBazEnum.ADAPTER.decode(reader));
              } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
              }
              break;
            }
            default: {
              reader.readUnknownField(tag);
            }
          }
        }
        builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
        return builder.build();
      }

      @Override
      public Nested redact(Nested value) {
        Builder builder = value.newBuilder();
        builder.clearUnknownFields();
        return builder.build();
      }
    }
  }

  public static final class More extends Message<More, More.Builder> {
    public static final ProtoAdapter<More> ADAPTER = new ProtoAdapter_More();

    private static final long serialVersionUID = 0L;

    @WireField(
        tag = 1,
        adapter = "com.squareup.wire.ProtoAdapter#INT32",
        label = WireField.Label.REPEATED
    )
    public final List<Integer> serial;

    public More(List<Integer> serial) {
      this(serial, ByteString.EMPTY);
    }

    public More(List<Integer> serial, ByteString unknownFields) {
      super(ADAPTER, unknownFields);
      this.serial = Internal.immutableCopyOf("serial", serial);
    }

    @Override
    public Builder newBuilder() {
      Builder builder = new Builder();
      builder.serial = Internal.copyOf(serial);
      builder.addUnknownFields(unknownFields());
      return builder;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof More)) return false;
      More o = (More) other;
      return unknownFields().equals(o.unknownFields())
          && serial.equals(o.serial);
    }

    @Override
    public int hashCode() {
      int result = super.hashCode;
      if (result == 0) {
        result = unknownFields().hashCode();
        result = result * 37 + serial.hashCode();
        super.hashCode = result;
      }
      return result;
    }

    @Override
    public String toString() {
      StringBuilder builder = new StringBuilder();
      if (!serial.isEmpty()) builder.append(", serial=").append(serial);
      return builder.replace(0, 2, "More{").append('}').toString();
    }

    public static final class Builder extends Message.Builder<More, Builder> {
      public List<Integer> serial;

      public Builder() {
        serial = Internal.newMutableList();
      }

      public Builder serial(List<Integer> serial) {
        Internal.checkElementsNotNull(serial);
        this.serial = serial;
        return this;
      }

      @Override
      public More build() {
        return new More(serial, super.buildUnknownFields());
      }
    }

    private static final class ProtoAdapter_More extends ProtoAdapter<More> {
      public ProtoAdapter_More() {
        super(FieldEncoding.LENGTH_DELIMITED, More.class, "type.googleapis.com/squareup.protos.custom_options.FooBar.More", Syntax.PROTO_2, null);
      }

      @Override
      public int encodedSize(More value) {
        int result = 0;
        result += ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(1, value.serial);
        result += value.unknownFields().size();
        return result;
      }

      @Override
      public void encode(ProtoWriter writer, More value) throws IOException {
        ProtoAdapter.INT32.asRepeated().encodeWithTag(writer, 1, value.serial);
        writer.writeBytes(value.unknownFields());
      }

      @Override
      public More decode(ProtoReader reader) throws IOException {
        Builder builder = new Builder();
        long token = reader.beginMessage();
        for (int tag; (tag = reader.nextTag()) != -1;) {
          switch (tag) {
            case 1: builder.serial.add(ProtoAdapter.INT32.decode(reader)); break;
            default: {
              reader.readUnknownField(tag);
            }
          }
        }
        builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
        return builder.build();
      }

      @Override
      public More redact(More value) {
        Builder builder = value.newBuilder();
        builder.clearUnknownFields();
        return builder.build();
      }
    }
  }

  public enum FooBarBazEnum implements WireEnum {
    FOO(1, 17, new More.Builder()
        .serial(Arrays.asList(
            99,
            199))
        .build(), null),

    BAR(2, null, null, true),

    BAZ(3, 18, null, false);

    public static final ProtoAdapter<FooBarBazEnum> ADAPTER = new ProtoAdapter_FooBarBazEnum();

    private final int value;

    public final Integer enum_value_option;

    public final More complex_enum_value_option;

    public final Boolean foreign_enum_value_option;

    FooBarBazEnum(int value, Integer enum_value_option, More complex_enum_value_option,
        Boolean foreign_enum_value_option) {
      this.value = value;
      this.enum_value_option = enum_value_option;
      this.complex_enum_value_option = complex_enum_value_option;
      this.foreign_enum_value_option = foreign_enum_value_option;
    }

    /**
     * Return the constant for {@code value} or null.
     */
    public static FooBarBazEnum fromValue(int value) {
      switch (value) {
        case 1: return FOO;
        case 2: return BAR;
        case 3: return BAZ;
        default: return null;
      }
    }

    @Override
    public int getValue() {
      return value;
    }

    private static final class ProtoAdapter_FooBarBazEnum extends EnumAdapter<FooBarBazEnum> {
      ProtoAdapter_FooBarBazEnum() {
        super(FooBarBazEnum.class, Syntax.PROTO_2, null);
      }

      @Override
      protected FooBarBazEnum fromValue(int value) {
        return FooBarBazEnum.fromValue(value);
      }
    }
  }

  private static final class ProtoAdapter_FooBar extends ProtoAdapter<FooBar> {
    public ProtoAdapter_FooBar() {
      super(FieldEncoding.LENGTH_DELIMITED, FooBar.class, "type.googleapis.com/squareup.protos.custom_options.FooBar", Syntax.PROTO_2, null);
    }

    @Override
    public int encodedSize(FooBar value) {
      int result = 0;
      result += ProtoAdapter.INT32.encodedSizeWithTag(1, value.foo);
      result += ProtoAdapter.STRING.encodedSizeWithTag(2, value.bar);
      result += Nested.ADAPTER.encodedSizeWithTag(3, value.baz);
      result += ProtoAdapter.UINT64.encodedSizeWithTag(4, value.qux);
      result += ProtoAdapter.FLOAT.asRepeated().encodedSizeWithTag(5, value.fred);
      result += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, value.daisy);
      result += FooBar.ADAPTER.asRepeated().encodedSizeWithTag(7, value.nested);
      result += FooBarBazEnum.ADAPTER.encodedSizeWithTag(101, value.ext);
      result += FooBarBazEnum.ADAPTER.asRepeated().encodedSizeWithTag(102, value.rep);
      result += value.unknownFields().size();
      return result;
    }

    @Override
    public void encode(ProtoWriter writer, FooBar value) throws IOException {
      ProtoAdapter.INT32.encodeWithTag(writer, 1, value.foo);
      ProtoAdapter.STRING.encodeWithTag(writer, 2, value.bar);
      Nested.ADAPTER.encodeWithTag(writer, 3, value.baz);
      ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.qux);
      ProtoAdapter.FLOAT.asRepeated().encodeWithTag(writer, 5, value.fred);
      ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, value.daisy);
      FooBar.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.nested);
      FooBarBazEnum.ADAPTER.encodeWithTag(writer, 101, value.ext);
      FooBarBazEnum.ADAPTER.asRepeated().encodeWithTag(writer, 102, value.rep);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public FooBar decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.foo(ProtoAdapter.INT32.decode(reader)); break;
          case 2: builder.bar(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.baz(Nested.ADAPTER.decode(reader)); break;
          case 4: builder.qux(ProtoAdapter.UINT64.decode(reader)); break;
          case 5: builder.fred.add(ProtoAdapter.FLOAT.decode(reader)); break;
          case 6: builder.daisy(ProtoAdapter.DOUBLE.decode(reader)); break;
          case 7: builder.nested.add(FooBar.ADAPTER.decode(reader)); break;
          case 101: {
            try {
              builder.ext(FooBarBazEnum.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 102: {
            try {
              builder.rep.add(FooBarBazEnum.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public FooBar redact(FooBar value) {
      Builder builder = value.newBuilder();
      if (builder.baz != null) builder.baz = Nested.ADAPTER.redact(builder.baz);
      builder.nested = Collections.emptyList();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
