/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables;


import io.dsub.opendiscogs.jooq.Keys;
import io.dsub.opendiscogs.jooq.Public;
import io.dsub.opendiscogs.jooq.tables.records.ReleaseFormatRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReleaseFormat extends TableImpl<ReleaseFormatRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.release_format</code>
     */
    public static final ReleaseFormat RELEASE_FORMAT = new ReleaseFormat();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReleaseFormatRecord> getRecordType() {
        return ReleaseFormatRecord.class;
    }

    /**
     * The column <code>public.release_format.release_id</code>.
     */
    public final TableField<ReleaseFormatRecord, Integer> RELEASE_ID = createField(DSL.name("release_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.release_format.description</code>.
     */
    public final TableField<ReleaseFormatRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(10000), this, "");

    /**
     * The column <code>public.release_format.name</code>.
     */
    public final TableField<ReleaseFormatRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.release_format.quantity</code>.
     */
    public final TableField<ReleaseFormatRecord, Integer> QUANTITY = createField(DSL.name("quantity"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.release_format.text</code>.
     */
    public final TableField<ReleaseFormatRecord, String> TEXT = createField(DSL.name("text"), SQLDataType.VARCHAR(5000), this, "");

    /**
     * The column <code>public.release_format.format_hash</code>. fnv32 encoded
     * hash from string which is description, name, quantity, text appended in
     * order
     */
    public final TableField<ReleaseFormatRecord, Long> FORMAT_HASH = createField(DSL.name("format_hash"), SQLDataType.BIGINT.nullable(false), this, "fnv32 encoded hash from string which is description, name, quantity, text appended in order");

    /**
     * The column <code>public.release_format.updated_at</code>. created time
     */
    public final TableField<ReleaseFormatRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "created time");

    private ReleaseFormat(Name alias, Table<ReleaseFormatRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReleaseFormat(Name alias, Table<ReleaseFormatRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.release_format</code> table reference
     */
    public ReleaseFormat(String alias) {
        this(DSL.name(alias), RELEASE_FORMAT);
    }

    /**
     * Create an aliased <code>public.release_format</code> table reference
     */
    public ReleaseFormat(Name alias) {
        this(alias, RELEASE_FORMAT);
    }

    /**
     * Create a <code>public.release_format</code> table reference
     */
    public ReleaseFormat() {
        this(DSL.name("release_format"), null);
    }

    public <O extends Record> ReleaseFormat(Table<O> child, ForeignKey<O, ReleaseFormatRecord> key) {
        super(child, key, RELEASE_FORMAT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<ReleaseFormatRecord> getPrimaryKey() {
        return Keys.RELEASE_FORMAT_PKEY;
    }

    @Override
    public List<ForeignKey<ReleaseFormatRecord, ?>> getReferences() {
        return Arrays.asList(Keys.RELEASE_FORMAT__FK_RELEASE_FORMAT_RELEASE_ID_RELEASE);
    }

    private transient Release _release;

    /**
     * Get the implicit join path to the <code>public.release</code> table.
     */
    public Release release() {
        if (_release == null)
            _release = new Release(this, Keys.RELEASE_FORMAT__FK_RELEASE_FORMAT_RELEASE_ID_RELEASE);

        return _release;
    }

    @Override
    public ReleaseFormat as(String alias) {
        return new ReleaseFormat(DSL.name(alias), this);
    }

    @Override
    public ReleaseFormat as(Name alias) {
        return new ReleaseFormat(alias, this);
    }

    @Override
    public ReleaseFormat as(Table<?> alias) {
        return new ReleaseFormat(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReleaseFormat rename(String name) {
        return new ReleaseFormat(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReleaseFormat rename(Name name) {
        return new ReleaseFormat(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReleaseFormat rename(Table<?> name) {
        return new ReleaseFormat(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, String, Integer, String, Long, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super Integer, ? super String, ? super String, ? super Integer, ? super String, ? super Long, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super Integer, ? super String, ? super String, ? super Integer, ? super String, ? super Long, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
