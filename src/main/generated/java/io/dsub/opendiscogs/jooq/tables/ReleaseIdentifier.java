/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables;


import io.dsub.opendiscogs.jooq.Keys;
import io.dsub.opendiscogs.jooq.Public;
import io.dsub.opendiscogs.jooq.tables.records.ReleaseIdentifierRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
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
public class ReleaseIdentifier extends TableImpl<ReleaseIdentifierRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.release_identifier</code>
     */
    public static final ReleaseIdentifier RELEASE_IDENTIFIER = new ReleaseIdentifier();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReleaseIdentifierRecord> getRecordType() {
        return ReleaseIdentifierRecord.class;
    }

    /**
     * The column <code>public.release_identifier.release_id</code>.
     */
    public final TableField<ReleaseIdentifierRecord, Integer> RELEASE_ID = createField(DSL.name("release_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.release_identifier.description</code>.
     */
    public final TableField<ReleaseIdentifierRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.release_identifier.type</code>.
     */
    public final TableField<ReleaseIdentifierRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(2500), this, "");

    /**
     * The column <code>public.release_identifier.value</code>.
     */
    public final TableField<ReleaseIdentifierRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.release_identifier.identifier_hash</code>. fnv32
     * encoded hash from string which is description, type, value appended in
     * order
     */
    public final TableField<ReleaseIdentifierRecord, Long> IDENTIFIER_HASH = createField(DSL.name("identifier_hash"), SQLDataType.BIGINT.nullable(false), this, "fnv32 encoded hash from string which is description, type, value appended in order");

    /**
     * The column <code>public.release_identifier.updated_at</code>. created
     * time
     */
    public final TableField<ReleaseIdentifierRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "created time");

    private ReleaseIdentifier(Name alias, Table<ReleaseIdentifierRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReleaseIdentifier(Name alias, Table<ReleaseIdentifierRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.release_identifier</code> table reference
     */
    public ReleaseIdentifier(String alias) {
        this(DSL.name(alias), RELEASE_IDENTIFIER);
    }

    /**
     * Create an aliased <code>public.release_identifier</code> table reference
     */
    public ReleaseIdentifier(Name alias) {
        this(alias, RELEASE_IDENTIFIER);
    }

    /**
     * Create a <code>public.release_identifier</code> table reference
     */
    public ReleaseIdentifier() {
        this(DSL.name("release_identifier"), null);
    }

    public <O extends Record> ReleaseIdentifier(Table<O> child, ForeignKey<O, ReleaseIdentifierRecord> key) {
        super(child, key, RELEASE_IDENTIFIER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<ReleaseIdentifierRecord> getPrimaryKey() {
        return Keys.RELEASE_IDENTIFIER_PKEY;
    }

    @Override
    public List<ForeignKey<ReleaseIdentifierRecord, ?>> getReferences() {
        return Arrays.asList(Keys.RELEASE_IDENTIFIER__FK_RELEASE_IDENTIFIER_RELEASE_ID_RELEASE);
    }

    private transient Release _release;

    /**
     * Get the implicit join path to the <code>public.release</code> table.
     */
    public Release release() {
        if (_release == null)
            _release = new Release(this, Keys.RELEASE_IDENTIFIER__FK_RELEASE_IDENTIFIER_RELEASE_ID_RELEASE);

        return _release;
    }

    @Override
    public ReleaseIdentifier as(String alias) {
        return new ReleaseIdentifier(DSL.name(alias), this);
    }

    @Override
    public ReleaseIdentifier as(Name alias) {
        return new ReleaseIdentifier(alias, this);
    }

    @Override
    public ReleaseIdentifier as(Table<?> alias) {
        return new ReleaseIdentifier(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReleaseIdentifier rename(String name) {
        return new ReleaseIdentifier(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReleaseIdentifier rename(Name name) {
        return new ReleaseIdentifier(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReleaseIdentifier rename(Table<?> name) {
        return new ReleaseIdentifier(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, String, Long, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Integer, ? super String, ? super String, ? super String, ? super Long, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Integer, ? super String, ? super String, ? super String, ? super Long, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}