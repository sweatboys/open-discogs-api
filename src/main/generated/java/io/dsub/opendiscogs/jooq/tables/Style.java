/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables;


import io.dsub.opendiscogs.jooq.Indexes;
import io.dsub.opendiscogs.jooq.Keys;
import io.dsub.opendiscogs.jooq.Public;
import io.dsub.opendiscogs.jooq.tables.records.StyleRecord;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
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
public class Style extends TableImpl<StyleRecord> {

  /**
   * The reference instance of <code>public.style</code>
   */
  public static final Style STYLE = new Style();
  private static final long serialVersionUID = 1L;
  /**
   * The column <code>public.style.id</code>.
   */
  public final TableField<StyleRecord, Integer> ID = createField(DSL.name("id"),
      SQLDataType.INTEGER.nullable(false).identity(true), this, "");
  /**
   * The column <code>public.style.name</code>.
   */
  public final TableField<StyleRecord, String> NAME = createField(DSL.name("name"),
      SQLDataType.VARCHAR(50).nullable(false), this, "");

  private Style(Name alias, Table<StyleRecord> aliased) {
    this(alias, aliased, null);
  }

  private Style(Name alias, Table<StyleRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
  }

  /**
   * Create an aliased <code>public.style</code> table reference
   */
  public Style(String alias) {
    this(DSL.name(alias), STYLE);
  }

  /**
   * Create an aliased <code>public.style</code> table reference
   */
  public Style(Name alias) {
    this(alias, STYLE);
  }

  /**
   * Create a <code>public.style</code> table reference
   */
  public Style() {
    this(DSL.name("style"), null);
  }

  public <O extends Record> Style(Table<O> child, ForeignKey<O, StyleRecord> key) {
    super(child, key, STYLE);
  }

  /**
   * The class holding records for this type
   */
  @Override
  public Class<StyleRecord> getRecordType() {
    return StyleRecord.class;
  }

  @Override
  public Schema getSchema() {
    return aliased() ? null : Public.PUBLIC;
  }

  @Override
  public List<Index> getIndexes() {
    return Arrays.asList(Indexes.PK_STYLE);
  }

  @Override
  public Identity<StyleRecord, Integer> getIdentity() {
    return (Identity<StyleRecord, Integer>) super.getIdentity();
  }

  @Override
  public UniqueKey<StyleRecord> getPrimaryKey() {
    return Keys.STYLE_PKEY;
  }

  @Override
  public List<UniqueKey<StyleRecord>> getUniqueKeys() {
    return Arrays.asList(Keys.STYLE_NAME_KEY);
  }

  @Override
  public Style as(String alias) {
    return new Style(DSL.name(alias), this);
  }

  @Override
  public Style as(Name alias) {
    return new Style(alias, this);
  }

  @Override
  public Style as(Table<?> alias) {
    return new Style(alias.getQualifiedName(), this);
  }

  /**
   * Rename this table
   */
  @Override
  public Style rename(String name) {
    return new Style(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public Style rename(Name name) {
    return new Style(name, null);
  }

  /**
   * Rename this table
   */
  @Override
  public Style rename(Table<?> name) {
    return new Style(name.getQualifiedName(), null);
  }

  // -------------------------------------------------------------------------
  // Row2 type methods
  // -------------------------------------------------------------------------

  @Override
  public Row2<Integer, String> fieldsRow() {
    return (Row2) super.fieldsRow();
  }

  /**
   * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
   */
  public <U> SelectField<U> mapping(Function2<? super Integer, ? super String, ? extends U> from) {
    return convertFrom(Records.mapping(from));
  }

  /**
   * Convenience mapping calling {@link SelectField#convertFrom(Class, Function)}.
   */
  public <U> SelectField<U> mapping(Class<U> toType,
      Function2<? super Integer, ? super String, ? extends U> from) {
    return convertFrom(toType, Records.mapping(from));
  }
}
