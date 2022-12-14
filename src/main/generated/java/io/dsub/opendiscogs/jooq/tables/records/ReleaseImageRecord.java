/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables.records;


import io.dsub.opendiscogs.jooq.tables.ReleaseImage;
import java.time.LocalDateTime;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ReleaseImageRecord extends UpdatableRecordImpl<ReleaseImageRecord> implements
    Record4<Integer, Long, String, LocalDateTime> {

  private static final long serialVersionUID = 1L;

  /**
   * Create a detached ReleaseImageRecord
   */
  public ReleaseImageRecord() {
    super(ReleaseImage.RELEASE_IMAGE);
  }

  /**
   * Create a detached, initialised ReleaseImageRecord
   */
  public ReleaseImageRecord(Integer releaseId, Long urlHash, String url, LocalDateTime updatedAt) {
    super(ReleaseImage.RELEASE_IMAGE);

    setReleaseId(releaseId);
    setUrlHash(urlHash);
    setUrl(url);
    setUpdatedAt(updatedAt);
  }

  /**
   * Create a detached, initialised ReleaseImageRecord
   */
  public ReleaseImageRecord(io.dsub.opendiscogs.jooq.tables.pojos.ReleaseImage value) {
    super(ReleaseImage.RELEASE_IMAGE);

    if (value != null) {
      setReleaseId(value.getReleaseId());
      setUrlHash(value.getUrlHash());
      setUrl(value.getUrl());
      setUpdatedAt(value.getUpdatedAt());
    }
  }

  /**
   * Getter for <code>public.release_image.release_id</code>.
   */
  public Integer getReleaseId() {
    return (Integer) get(0);
  }

  /**
   * Setter for <code>public.release_image.release_id</code>.
   */
  public ReleaseImageRecord setReleaseId(Integer value) {
    set(0, value);
    return this;
  }

  /**
   * Getter for <code>public.release_image.url_hash</code>. fnv32 encoded hash from url
   */
  public Long getUrlHash() {
    return (Long) get(1);
  }

  /**
   * Setter for <code>public.release_image.url_hash</code>. fnv32 encoded hash from url
   */
  public ReleaseImageRecord setUrlHash(Long value) {
    set(1, value);
    return this;
  }

  /**
   * Getter for <code>public.release_image.url</code>.
   */
  public String getUrl() {
    return (String) get(2);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  /**
   * Setter for <code>public.release_image.url</code>.
   */
  public ReleaseImageRecord setUrl(String value) {
    set(2, value);
    return this;
  }

  // -------------------------------------------------------------------------
  // Record4 type implementation
  // -------------------------------------------------------------------------

  /**
   * Getter for <code>public.release_image.updated_at</code>. created time
   */
  public LocalDateTime getUpdatedAt() {
    return (LocalDateTime) get(3);
  }

  /**
   * Setter for <code>public.release_image.updated_at</code>. created time
   */
  public ReleaseImageRecord setUpdatedAt(LocalDateTime value) {
    set(3, value);
    return this;
  }

  @Override
  public Record2<Integer, Long> key() {
    return (Record2) super.key();
  }

  @Override
  public Row4<Integer, Long, String, LocalDateTime> fieldsRow() {
    return (Row4) super.fieldsRow();
  }

  @Override
  public Row4<Integer, Long, String, LocalDateTime> valuesRow() {
    return (Row4) super.valuesRow();
  }

  @Override
  public Field<Integer> field1() {
    return ReleaseImage.RELEASE_IMAGE.RELEASE_ID;
  }

  @Override
  public Field<Long> field2() {
    return ReleaseImage.RELEASE_IMAGE.URL_HASH;
  }

  @Override
  public Field<String> field3() {
    return ReleaseImage.RELEASE_IMAGE.URL;
  }

  @Override
  public Field<LocalDateTime> field4() {
    return ReleaseImage.RELEASE_IMAGE.UPDATED_AT;
  }

  @Override
  public Integer component1() {
    return getReleaseId();
  }

  @Override
  public Long component2() {
    return getUrlHash();
  }

  @Override
  public String component3() {
    return getUrl();
  }

  @Override
  public LocalDateTime component4() {
    return getUpdatedAt();
  }

  @Override
  public Integer value1() {
    return getReleaseId();
  }

  @Override
  public Long value2() {
    return getUrlHash();
  }

  @Override
  public String value3() {
    return getUrl();
  }

  @Override
  public LocalDateTime value4() {
    return getUpdatedAt();
  }

  @Override
  public ReleaseImageRecord value1(Integer value) {
    setReleaseId(value);
    return this;
  }

  @Override
  public ReleaseImageRecord value2(Long value) {
    setUrlHash(value);
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  @Override
  public ReleaseImageRecord value3(String value) {
    setUrl(value);
    return this;
  }

  @Override
  public ReleaseImageRecord value4(LocalDateTime value) {
    setUpdatedAt(value);
    return this;
  }

  @Override
  public ReleaseImageRecord values(Integer value1, Long value2, String value3,
      LocalDateTime value4) {
    value1(value1);
    value2(value2);
    value3(value3);
    value4(value4);
    return this;
  }
}
