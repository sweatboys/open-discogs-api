/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables;


import io.dsub.opendiscogs.jooq.Keys;
import io.dsub.opendiscogs.jooq.Public;
import io.dsub.opendiscogs.jooq.tables.records.LabelReleaseRecord;
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
public class LabelRelease extends TableImpl<LabelReleaseRecord> {

  /**
   * The reference instance of <code>public.label_release</code>
   */
  public static final LabelRelease LABEL_RELEASE = new LabelRelease();
  private static final long serialVersionUID = 1L;
  /**
   * The column <code>public.label_release.label_id</code>.
   */
  public final TableField<LabelReleaseRecord, Integer> LABEL_ID = createField(DSL.name("label_id"),
      SQLDataType.INTEGER.nullable(false), this, "");
  /**
   * The column <code>public.label_release.release_id</code>.
   */
  public final TableField<LabelReleaseRecord, Integer> RELEASE_ID = createField(
      DSL.name("release_id"), SQLDataType.INTEGER.nullable(false), this, "");
  /**
   * The column <code>public.label_release.category_notation</code>.
   */
  public final TableField<LabelReleaseRecord, String> CATEGORY_NOTATION = createField(
      DSL.name("category_notation"), SQLDataType.VARCHAR(1000), this, "");
  /**
   * The column <code>public.label_release.updated_at</code>. created time
   */
  public final TableField<LabelReleaseRecord, LocalDateTime> UPDATED_AT = createField(
      DSL.name("updated_at"), SQLDataType.LOCALDATETIME(6).nullable(false)
          .defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "created time");
  private transient Label _label;
  private transient Release _release;

  private LabelRelease(Name alias, Table<LabelReleaseRecord> aliased) {
    this(alias, aliased, null);
  }

  private LabelRelease(Name alias, Table<LabelReleaseRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
  }

  /**
   * Create an aliased <code>public.label_release</code> table reference
   */
  public LabelRelease(String alias) {
    this(DSL.name(alias), LABEL_RELEASE);
  }

  /**
   * Create an aliased <code>public.label_release</code> table reference
   */
  public LabelRelease(Name alias) {
    this(alias, LABEL_RELEASE);
  }

  /**
   * Create a <code>public.label_release</code> table reference
   */
  public LabelRelease() {
    this(DSL.name("label_release"), null);
  }

  public <O extends Record> LabelRelease(Table<O> child, ForeignKey<O, LabelReleaseRecord> key) {
    super(child, key, LABEL_RELEASE);
  }

  /**
   * The class holding records for this type
   */
  @Override
  public Class<LabelReleaseRecord> getRecordType() {
    return LabelReleaseRecord.class;
  }

  @Override
  public Schema getSchema() {
    return aliased() ? null : Public.PUBLIC;
  }

  @Override
  public UniqueKey<LabelReleaseRecord> getPrimaryKey() {
    return Keys.LABEL_RELEASE_PKEY;
  }

  @Override
  public List<ForeignKey<LabelReleaseRecord, ?>> getReferences() {
    return Arrays.asList(Keys.LABEL_RELEASE__FK_LABEL_RELEASE_LABEL_ID_LABEL,
        Keys.LABEL_RELEASE__FK_LABEL_RELEASE_RELEASE_ID_RELEASE);
  }

  /**
   * Get the implicit join path to the <code>public.label</code> table.
   */
  public Label label() {
      if (_label == null) {
          _label = new Label(this, Keys.LABEL_RELEASE__FK_LABEL_RELEASE_LABEL_ID_LABEL);
      }

    return _label;
  }

  /**
   * Get the implicit join path to the <code>public.release</code> table.
   */
  public Release release() {
      if (_release == null) {
          _release = new Release(this, Keys.LABEL_RELEASE__FK_LABEL_RELEASE_RELEASE_ID_RELEASE);
      }

    return _release;
  }

  @Override
  public LabelRelease as(String alias) {
    return new LabelRelease(DSL.name(alias), this);
  }

  @Override
  public LabelRelease as(Name alias) {
    return new LabelRelease(alias, this);
  }

  @Override
  public LabelRelease as(Table<?> alias) {
    return new LabelRelease(alias.getQualifiedName(), this);
  }

  /**
   * Rename this table
   */
  @Override
  public LabelRelease rename(String name) {
    return new LabelRelease(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public LabelRelease rename(Name name) {
    return new LabelRelease(name, null);
  }

  /**
   * Rename this table
   */
  @Override
  public LabelRelease rename(Table<?> name) {
    return new LabelRelease(name.getQualifiedName(), null);
  }

  // -------------------------------------------------------------------------
  // Row4 type methods
  // -------------------------------------------------------------------------

  @Override
  public Row4<Integer, Integer, String, LocalDateTime> fieldsRow() {
    return (Row4) super.fieldsRow();
  }

  /**
   * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
   */
  public <U> SelectField<U> mapping(
      Function4<? super Integer, ? super Integer, ? super String, ? super LocalDateTime, ? extends U> from) {
    return convertFrom(Records.mapping(from));
  }

  /**
   * Convenience mapping calling {@link SelectField#convertFrom(Class, Function)}.
   */
  public <U> SelectField<U> mapping(Class<U> toType,
      Function4<? super Integer, ? super Integer, ? super String, ? super LocalDateTime, ? extends U> from) {
    return convertFrom(toType, Records.mapping(from));
  }
}
