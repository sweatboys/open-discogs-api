/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables.records;


import io.dsub.opendiscogs.jooq.tables.ReleaseVideo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReleaseVideoRecord extends UpdatableRecordImpl<ReleaseVideoRecord> implements Record6<Integer, String, String, String, Long, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.release_video.release_id</code>.
     */
    public ReleaseVideoRecord setReleaseId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.release_video.release_id</code>.
     */
    public Integer getReleaseId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.release_video.description</code>.
     */
    public ReleaseVideoRecord setDescription(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.release_video.description</code>.
     */
    public String getDescription() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.release_video.title</code>.
     */
    public ReleaseVideoRecord setTitle(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.release_video.title</code>.
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.release_video.url</code>.
     */
    public ReleaseVideoRecord setUrl(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.release_video.url</code>.
     */
    public String getUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.release_video.url_hash</code>. fnv32 encoded hash
     * from url
     */
    public ReleaseVideoRecord setUrlHash(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.release_video.url_hash</code>. fnv32 encoded hash
     * from url
     */
    public Long getUrlHash() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.release_video.updated_at</code>. created time
     */
    public ReleaseVideoRecord setUpdatedAt(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.release_video.updated_at</code>. created time
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, String, Long, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, String, Long, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ReleaseVideo.RELEASE_VIDEO.RELEASE_ID;
    }

    @Override
    public Field<String> field2() {
        return ReleaseVideo.RELEASE_VIDEO.DESCRIPTION;
    }

    @Override
    public Field<String> field3() {
        return ReleaseVideo.RELEASE_VIDEO.TITLE;
    }

    @Override
    public Field<String> field4() {
        return ReleaseVideo.RELEASE_VIDEO.URL;
    }

    @Override
    public Field<Long> field5() {
        return ReleaseVideo.RELEASE_VIDEO.URL_HASH;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return ReleaseVideo.RELEASE_VIDEO.UPDATED_AT;
    }

    @Override
    public Integer component1() {
        return getReleaseId();
    }

    @Override
    public String component2() {
        return getDescription();
    }

    @Override
    public String component3() {
        return getTitle();
    }

    @Override
    public String component4() {
        return getUrl();
    }

    @Override
    public Long component5() {
        return getUrlHash();
    }

    @Override
    public LocalDateTime component6() {
        return getUpdatedAt();
    }

    @Override
    public Integer value1() {
        return getReleaseId();
    }

    @Override
    public String value2() {
        return getDescription();
    }

    @Override
    public String value3() {
        return getTitle();
    }

    @Override
    public String value4() {
        return getUrl();
    }

    @Override
    public Long value5() {
        return getUrlHash();
    }

    @Override
    public LocalDateTime value6() {
        return getUpdatedAt();
    }

    @Override
    public ReleaseVideoRecord value1(Integer value) {
        setReleaseId(value);
        return this;
    }

    @Override
    public ReleaseVideoRecord value2(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public ReleaseVideoRecord value3(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public ReleaseVideoRecord value4(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public ReleaseVideoRecord value5(Long value) {
        setUrlHash(value);
        return this;
    }

    @Override
    public ReleaseVideoRecord value6(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public ReleaseVideoRecord values(Integer value1, String value2, String value3, String value4, Long value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReleaseVideoRecord
     */
    public ReleaseVideoRecord() {
        super(ReleaseVideo.RELEASE_VIDEO);
    }

    /**
     * Create a detached, initialised ReleaseVideoRecord
     */
    public ReleaseVideoRecord(Integer releaseId, String description, String title, String url, Long urlHash, LocalDateTime updatedAt) {
        super(ReleaseVideo.RELEASE_VIDEO);

        setReleaseId(releaseId);
        setDescription(description);
        setTitle(title);
        setUrl(url);
        setUrlHash(urlHash);
        setUpdatedAt(updatedAt);
    }

    /**
     * Create a detached, initialised ReleaseVideoRecord
     */
    public ReleaseVideoRecord(io.dsub.opendiscogs.jooq.tables.pojos.ReleaseVideo value) {
        super(ReleaseVideo.RELEASE_VIDEO);

        if (value != null) {
            setReleaseId(value.getReleaseId());
            setDescription(value.getDescription());
            setTitle(value.getTitle());
            setUrl(value.getUrl());
            setUrlHash(value.getUrlHash());
            setUpdatedAt(value.getUpdatedAt());
        }
    }
}
