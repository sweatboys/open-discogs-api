/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables;


import io.dsub.opendiscogs.jooq.Indexes;
import io.dsub.opendiscogs.jooq.Keys;
import io.dsub.opendiscogs.jooq.Public;
import io.dsub.opendiscogs.jooq.tables.records.ReleaseRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function12;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row12;
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
public class Release extends TableImpl<ReleaseRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.release</code>
     */
    public static final Release RELEASE = new Release();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReleaseRecord> getRecordType() {
        return ReleaseRecord.class;
    }

    /**
     * The column <code>public.release.id</code>.
     */
    public final TableField<ReleaseRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.release.title</code>.
     */
    public final TableField<ReleaseRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(10000), this, "");

    /**
     * The column <code>public.release.country</code>.
     */
    public final TableField<ReleaseRecord, String> COUNTRY = createField(DSL.name("country"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.release.data_quality</code>.
     */
    public final TableField<ReleaseRecord, String> DATA_QUALITY = createField(DSL.name("data_quality"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.release.released_year</code>.
     */
    public final TableField<ReleaseRecord, Short> RELEASED_YEAR = createField(DSL.name("released_year"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>public.release.released_month</code>.
     */
    public final TableField<ReleaseRecord, Short> RELEASED_MONTH = createField(DSL.name("released_month"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>public.release.released_day</code>.
     */
    public final TableField<ReleaseRecord, Short> RELEASED_DAY = createField(DSL.name("released_day"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>public.release.listed_release_date</code>.
     */
    public final TableField<ReleaseRecord, String> LISTED_RELEASE_DATE = createField(DSL.name("listed_release_date"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.release.is_master</code>.
     */
    public final TableField<ReleaseRecord, Boolean> IS_MASTER = createField(DSL.name("is_master"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.release.notes</code>.
     */
    public final TableField<ReleaseRecord, String> NOTES = createField(DSL.name("notes"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.release.status</code>.
     */
    public final TableField<ReleaseRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.release.master_id</code>.
     */
    public final TableField<ReleaseRecord, Integer> MASTER_ID = createField(DSL.name("master_id"), SQLDataType.INTEGER, this, "");

    private Release(Name alias, Table<ReleaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private Release(Name alias, Table<ReleaseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.release</code> table reference
     */
    public Release(String alias) {
        this(DSL.name(alias), RELEASE);
    }

    /**
     * Create an aliased <code>public.release</code> table reference
     */
    public Release(Name alias) {
        this(alias, RELEASE);
    }

    /**
     * Create a <code>public.release</code> table reference
     */
    public Release() {
        this(DSL.name("release"), null);
    }

    public <O extends Record> Release(Table<O> child, ForeignKey<O, ReleaseRecord> key) {
        super(child, key, RELEASE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_RELEASE_MASTER_ID, Indexes.IDX_RELEASE_RELEASED_YEAR_RELEASED_MONTH);
    }

    @Override
    public UniqueKey<ReleaseRecord> getPrimaryKey() {
        return Keys.RELEASE_PKEY;
    }

    @Override
    public List<ForeignKey<ReleaseRecord, ?>> getReferences() {
        return Arrays.asList(Keys.RELEASE__FK_RELEASE_MASTER_ID_MASTER);
    }

    private transient Master _master;

    /**
     * Get the implicit join path to the <code>public.master</code> table.
     */
    public Master master() {
        if (_master == null)
            _master = new Master(this, Keys.RELEASE__FK_RELEASE_MASTER_ID_MASTER);

        return _master;
    }

    @Override
    public Release as(String alias) {
        return new Release(DSL.name(alias), this);
    }

    @Override
    public Release as(Name alias) {
        return new Release(alias, this);
    }

    @Override
    public Release as(Table<?> alias) {
        return new Release(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Release rename(String name) {
        return new Release(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Release rename(Name name) {
        return new Release(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Release rename(Table<?> name) {
        return new Release(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, String, String, Short, Short, Short, String, Boolean, String, String, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function12<? super Integer, ? super String, ? super String, ? super String, ? super Short, ? super Short, ? super Short, ? super String, ? super Boolean, ? super String, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function12<? super Integer, ? super String, ? super String, ? super String, ? super Short, ? super Short, ? super Short, ? super String, ? super Boolean, ? super String, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
