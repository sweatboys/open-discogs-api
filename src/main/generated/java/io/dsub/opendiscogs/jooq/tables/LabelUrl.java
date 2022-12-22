/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables;


import io.dsub.opendiscogs.jooq.Keys;
import io.dsub.opendiscogs.jooq.Public;
import io.dsub.opendiscogs.jooq.tables.records.LabelUrlRecord;
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
public class LabelUrl extends TableImpl<LabelUrlRecord> {

  /**
   * The reference instance of <code>public.label_url</code>
   */
  public static final LabelUrl LABEL_URL = new LabelUrl();
  private static final long serialVersionUID = 1L;
  /**
   * The column <code>public.label_url.label_id</code>.
   */
  public final TableField<LabelUrlRecord, Integer> LABEL_ID = createField(DSL.name("label_id"),
      SQLDataType.INTEGER.nullable(false), this, "");
  /**
   * The column <code>public.label_url.url_hash</code>. fnv32 encoded hash from url
   */
  public final TableField<LabelUrlRecord, Long> URL_HASH = createField(DSL.name("url_hash"),
      SQLDataType.BIGINT.nullable(false), this, "fnv32 encoded hash from url");
  /**
   * The column <code>public.label_url.url</code>.
   */
  public final TableField<LabelUrlRecord, String> URL = createField(DSL.name("url"),
      SQLDataType.VARCHAR(2048).nullable(false), this, "");
  /**
   * The column <code>public.label_url.updated_at</code>. created time
   */
  public final TableField<LabelUrlRecord, LocalDateTime> UPDATED_AT = createField(
      DSL.name("updated_at"), SQLDataType.LOCALDATETIME(6).nullable(false)
          .defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "created time");
  private transient Label _label;

  private LabelUrl(Name alias, Table<LabelUrlRecord> aliased) {
    this(alias, aliased, null);
  }

  private LabelUrl(Name alias, Table<LabelUrlRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
  }

  /**
   * Create an aliased <code>public.label_url</code> table reference
   */
  public LabelUrl(String alias) {
    this(DSL.name(alias), LABEL_URL);
  }

  /**
   * Create an aliased <code>public.label_url</code> table reference
   */
  public LabelUrl(Name alias) {
    this(alias, LABEL_URL);
  }

  /**
   * Create a <code>public.label_url</code> table reference
   */
  public LabelUrl() {
    this(DSL.name("label_url"), null);
  }

  public <O extends Record> LabelUrl(Table<O> child, ForeignKey<O, LabelUrlRecord> key) {
    super(child, key, LABEL_URL);
  }

  /**
   * The class holding records for this type
   */
  @Override
  public Class<LabelUrlRecord> getRecordType() {
    return LabelUrlRecord.class;
  }

  @Override
  public Schema getSchema() {
    return aliased() ? null : Public.PUBLIC;
  }

  @Override
  public UniqueKey<LabelUrlRecord> getPrimaryKey() {
    return Keys.LABEL_URL_PKEY;
  }

  @Override
  public List<ForeignKey<LabelUrlRecord, ?>> getReferences() {
    return Arrays.asList(Keys.LABEL_URL__FK_LABEL_URL_LABEL_ID_LABEL);
  }

  /**
   * Get the implicit join path to the <code>public.label</code> table.
   */
  public Label label() {
      if (_label == null) {
          _label = new Label(this, Keys.LABEL_URL__FK_LABEL_URL_LABEL_ID_LABEL);
      }

    return _label;
  }

  @Override
  public LabelUrl as(String alias) {
    return new LabelUrl(DSL.name(alias), this);
  }

  @Override
  public LabelUrl as(Name alias) {
    return new LabelUrl(alias, this);
  }

  @Override
  public LabelUrl as(Table<?> alias) {
    return new LabelUrl(alias.getQualifiedName(), this);
  }

  /**
   * Rename this table
   */
  @Override
  public LabelUrl rename(String name) {
    return new LabelUrl(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public LabelUrl rename(Name name) {
    return new LabelUrl(name, null);
  }

  /**
   * Rename this table
   */
  @Override
  public LabelUrl rename(Table<?> name) {
    return new LabelUrl(name.getQualifiedName(), null);
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
