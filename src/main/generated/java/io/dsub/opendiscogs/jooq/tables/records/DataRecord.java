/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables.records;


import io.dsub.opendiscogs.jooq.tables.Data;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Cached resource for keep tracking data dump updates (either being monthly or
 * random occasions)
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DataRecord extends UpdatableRecordImpl<DataRecord> implements Record5<String, LocalDateTime, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.data.etag</code>. ETag representing this data
     * being unique. Used for updating cache.
     */
    public DataRecord setEtag(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.data.etag</code>. ETag representing this data
     * being unique. Used for updating cache.
     */
    public String getEtag() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.data.generated_at</code>. Date this data is
     * generated at.
     */
    public DataRecord setGeneratedAt(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.data.generated_at</code>. Date this data is
     * generated at.
     */
    public LocalDateTime getGeneratedAt() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.data.checksum</code>. Checksum to validate when
     * fetching dump source.
     */
    public DataRecord setChecksum(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.data.checksum</code>. Checksum to validate when
     * fetching dump source.
     */
    public String getChecksum() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.data.target_type</code>. Type of data. Referred
     * as artists, labels, masters, release.
     * Always uppercase.
     */
    public DataRecord setTargetType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.data.target_type</code>. Type of data. Referred
     * as artists, labels, masters, release.
     * Always uppercase.
     */
    public String getTargetType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.data.uri</code>. URI to download dump data file.
     */
    public DataRecord setUri(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.data.uri</code>. URI to download dump data file.
     */
    public String getUri() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, LocalDateTime, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, LocalDateTime, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Data.DATA.ETAG;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return Data.DATA.GENERATED_AT;
    }

    @Override
    public Field<String> field3() {
        return Data.DATA.CHECKSUM;
    }

    @Override
    public Field<String> field4() {
        return Data.DATA.TARGET_TYPE;
    }

    @Override
    public Field<String> field5() {
        return Data.DATA.URI;
    }

    @Override
    public String component1() {
        return getEtag();
    }

    @Override
    public LocalDateTime component2() {
        return getGeneratedAt();
    }

    @Override
    public String component3() {
        return getChecksum();
    }

    @Override
    public String component4() {
        return getTargetType();
    }

    @Override
    public String component5() {
        return getUri();
    }

    @Override
    public String value1() {
        return getEtag();
    }

    @Override
    public LocalDateTime value2() {
        return getGeneratedAt();
    }

    @Override
    public String value3() {
        return getChecksum();
    }

    @Override
    public String value4() {
        return getTargetType();
    }

    @Override
    public String value5() {
        return getUri();
    }

    @Override
    public DataRecord value1(String value) {
        setEtag(value);
        return this;
    }

    @Override
    public DataRecord value2(LocalDateTime value) {
        setGeneratedAt(value);
        return this;
    }

    @Override
    public DataRecord value3(String value) {
        setChecksum(value);
        return this;
    }

    @Override
    public DataRecord value4(String value) {
        setTargetType(value);
        return this;
    }

    @Override
    public DataRecord value5(String value) {
        setUri(value);
        return this;
    }

    @Override
    public DataRecord values(String value1, LocalDateTime value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DataRecord
     */
    public DataRecord() {
        super(Data.DATA);
    }

    /**
     * Create a detached, initialised DataRecord
     */
    public DataRecord(String etag, LocalDateTime generatedAt, String checksum, String targetType, String uri) {
        super(Data.DATA);

        setEtag(etag);
        setGeneratedAt(generatedAt);
        setChecksum(checksum);
        setTargetType(targetType);
        setUri(uri);
    }

    /**
     * Create a detached, initialised DataRecord
     */
    public DataRecord(io.dsub.opendiscogs.jooq.tables.pojos.Data value) {
        super(Data.DATA);

        if (value != null) {
            setEtag(value.getEtag());
            setGeneratedAt(value.getGeneratedAt());
            setChecksum(value.getChecksum());
            setTargetType(value.getTargetType());
            setUri(value.getUri());
        }
    }
}
