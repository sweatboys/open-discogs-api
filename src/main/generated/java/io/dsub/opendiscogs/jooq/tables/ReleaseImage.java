/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables;


import io.dsub.opendiscogs.jooq.Keys;
import io.dsub.opendiscogs.jooq.Public;
import io.dsub.opendiscogs.jooq.tables.records.ReleaseImageRecord;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ReleaseImage extends TableImpl<ReleaseImageRecord> {

  /**
   * The reference instance of <code>public.release_image</code>
   */
  public static final ReleaseImage RELEASE_IMAGE = new ReleaseImage();
  private static final long serialVersionUID = 1L;
  /**
   * The column <code>public.release_image.release_id</code>.
   */
  public final TableField<ReleaseImageRecord, Integer> RELEASE_ID = createField(
      DSL.name("release_id"), SQLDataType.INTEGER.nullable(false), this, "");
  /**
   * The column <code>public.release_image.url_hash</code>. fnv32 encoded hash from url
   */
  public final TableField<ReleaseImageRecord, Long> URL_HASH = createField(DSL.name("url_hash"),
      SQLDataType.BIGINT.nullable(false), this, "fnv32 encoded hash from url");
  /**
   * The column <code>public.release_image.url</code>.
   */
  public final TableField<ReleaseImageRecord, String> URL = createField(DSL.name("url"),
      SQLDataType.VARCHAR(2048).nullable(false), this, "");
  /**
   * The column <code>public.release_image.updated_at</code>. created time
   */
  public final TableField<ReleaseImageRecord, LocalDateTime> UPDATED_AT = createField(
      DSL.name("updated_at"), SQLDataType.LOCALDATETIME(6).nullable(false)
          .defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "created time");
  private transient Release _release;

  private ReleaseImage(Name alias, Table<ReleaseImageRecord> aliased) {
    this(alias, aliased, null);
  }

  private ReleaseImage(Name alias, Table<ReleaseImageRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
  }

  /**
   * Create an aliased <code>public.release_image</code> table reference
   */
  public ReleaseImage(String alias) {
    this(DSL.name(alias), RELEASE_IMAGE);
  }

  /**
   * Create an aliased <code>public.release_image</code> table reference
   */
  public ReleaseImage(Name alias) {
    this(alias, RELEASE_IMAGE);
  }

  /**
   * Create a <code>public.release_image</code> table reference
   */
  public ReleaseImage() {
    this(DSL.name("release_image"), null);
  }

  public <O extends Record> ReleaseImage(Table<O> child, ForeignKey<O, ReleaseImageRecord> key) {
    super(child, key, RELEASE_IMAGE);
  }

  /**
   * The class holding records for this type
   */
  @Override
  public Class<ReleaseImageRecord> getRecordType() {
    return ReleaseImageRecord.class;
  }

  @Override
  public Schema getSchema() {
    return aliased() ? null : Public.PUBLIC;
  }

  @Override
  public UniqueKey<ReleaseImageRecord> getPrimaryKey() {
    return Keys.RELEASE_IMAGE_PKEY;
  }

  @Override
  public List<ForeignKey<ReleaseImageRecord, ?>> getReferences() {
    return Arrays.asList(Keys.RELEASE_IMAGE__FK_RELEASE_IMAGE_RELEASE_ID_RELEASE);
  }

  /**
   * Get the implicit join path to the <code>public.release</code> table.
   */
  public Release release() {
      if (_release == null) {
          _release = new Release(this, Keys.RELEASE_IMAGE__FK_RELEASE_IMAGE_RELEASE_ID_RELEASE);
      }

    return _release;
  }

  @Override
  public ReleaseImage as(String alias) {
    return new ReleaseImage(DSL.name(alias), this);
  }

  @Override
  public ReleaseImage as(Name alias) {
    return new ReleaseImage(alias, this);
  }

  @Override
  public ReleaseImage as(Table<?> alias) {
    return new ReleaseImage(alias.getQualifiedName(), this);
  }

  /**
   * Rename this table
   */
  @Override
  public ReleaseImage rename(String name) {
    return new ReleaseImage(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public ReleaseImage rename(Name name) {
    return new ReleaseImage(name, null);
  }

  /**
   * Rename this table
   */
  @Override
  public ReleaseImage rename(Table<?> name) {
    return new ReleaseImage(name.getQualifiedName(), null);
  }

  // -------------------------------------------------------------------------
  // Row4 type methods
  // -------------------------------------------------------------------------

  @Override
  public Row4<Integer, Long, String, LocalDateTime> fieldsRow() {
    return (Row4) super.fieldsRow();
  }

  /**
   * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
   */
  public <U> SelectField<U> mapping(
      Function4<? super Integer, ? super Long, ? super String, ? super LocalDateTime, ? extends U> from) {
    return convertFrom(Records.mapping(from));
  }

  /**
   * Convenience mapping calling {@link SelectField#convertFrom(Class, Function)}.
   */
  public <U> SelectField<U> mapping(Class<U> toType,
      Function4<? super Integer, ? super Long, ? super String, ? super LocalDateTime, ? extends U> from) {
    return convertFrom(toType, Records.mapping(from));
  }
}
