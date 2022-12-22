/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables.records;


import io.dsub.opendiscogs.jooq.tables.LabelRelease;
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
public class LabelReleaseRecord extends UpdatableRecordImpl<LabelReleaseRecord> implements
    Record4<Integer, Integer, String, LocalDateTime> {

  private static final long serialVersionUID = 1L;

  /**
   * Create a detached LabelReleaseRecord
   */
  public LabelReleaseRecord() {
    super(LabelRelease.LABEL_RELEASE);
  }

  /**
   * Create a detached, initialised LabelReleaseRecord
   */
  public LabelReleaseRecord(Integer labelId, Integer releaseId, String categoryNotation,
      LocalDateTime updatedAt) {
    super(LabelRelease.LABEL_RELEASE);

    setLabelId(labelId);
    setReleaseId(releaseId);
    setCategoryNotation(categoryNotation);
    setUpdatedAt(updatedAt);
  }

  /**
   * Create a detached, initialised LabelReleaseRecord
   */
  public LabelReleaseRecord(io.dsub.opendiscogs.jooq.tables.pojos.LabelRelease value) {
    super(LabelRelease.LABEL_RELEASE);

    if (value != null) {
      setLabelId(value.getLabelId());
      setReleaseId(value.getReleaseId());
      setCategoryNotation(value.getCategoryNotation());
      setUpdatedAt(value.getUpdatedAt());
    }
  }

  /**
   * Getter for <code>public.label_release.label_id</code>.
   */
  public Integer getLabelId() {
    return (Integer) get(0);
  }

  /**
   * Setter for <code>public.label_release.label_id</code>.
   */
  public LabelReleaseRecord setLabelId(Integer value) {
    set(0, value);
    return this;
  }

  /**
   * Getter for <code>public.label_release.release_id</code>.
   */
  public Integer getReleaseId() {
    return (Integer) get(1);
  }

  /**
   * Setter for <code>public.label_release.release_id</code>.
   */
  public LabelReleaseRecord setReleaseId(Integer value) {
    set(1, value);
    return this;
  }

  /**
   * Getter for <code>public.label_release.category_notation</code>.
   */
  public String getCategoryNotation() {
    return (String) get(2);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  /**
   * Setter for <code>public.label_release.category_notation</code>.
   */
  public LabelReleaseRecord setCategoryNotation(String value) {
    set(2, value);
    return this;
  }

  // -------------------------------------------------------------------------
  // Record4 type implementation
  // -------------------------------------------------------------------------

  /**
   * Getter for <code>public.label_release.updated_at</code>. created time
   */
  public LocalDateTime getUpdatedAt() {
    return (LocalDateTime) get(3);
  }

  /**
   * Setter for <code>public.label_release.updated_at</code>. created time
   */
  public LabelReleaseRecord setUpdatedAt(LocalDateTime value) {
    set(3, value);
    return this;
  }

  @Override
  public Record2<Integer, Integer> key() {
    return (Record2) super.key();
  }

  @Override
  public Row4<Integer, Integer, String, LocalDateTime> fieldsRow() {
    return (Row4) super.fieldsRow();
  }

  @Override
  public Row4<Integer, Integer, String, LocalDateTime> valuesRow() {
    return (Row4) super.valuesRow();
  }

  @Override
  public Field<Integer> field1() {
    return LabelRelease.LABEL_RELEASE.LABEL_ID;
  }

  @Override
  public Field<Integer> field2() {
    return LabelRelease.LABEL_RELEASE.RELEASE_ID;
  }

  @Override
  public Field<String> field3() {
    return LabelRelease.LABEL_RELEASE.CATEGORY_NOTATION;
  }

  @Override
  public Field<LocalDateTime> field4() {
    return LabelRelease.LABEL_RELEASE.UPDATED_AT;
  }

  @Override
  public Integer component1() {
    return getLabelId();
  }

  @Override
  public Integer component2() {
    return getReleaseId();
  }

  @Override
  public String component3() {
    return getCategoryNotation();
  }

  @Override
  public LocalDateTime component4() {
    return getUpdatedAt();
  }

  @Override
  public Integer value1() {
    return getLabelId();
  }

  @Override
  public Integer value2() {
    return getReleaseId();
  }

  @Override
  public String value3() {
    return getCategoryNotation();
  }

  @Override
  public LocalDateTime value4() {
    return getUpdatedAt();
  }

  @Override
  public LabelReleaseRecord value1(Integer value) {
    setLabelId(value);
    return this;
  }

  @Override
  public LabelReleaseRecord value2(Integer value) {
    setReleaseId(value);
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  @Override
  public LabelReleaseRecord value3(String value) {
    setCategoryNotation(value);
    return this;
  }

  @Override
  public LabelReleaseRecord value4(LocalDateTime value) {
    setUpdatedAt(value);
    return this;
  }

  @Override
  public LabelReleaseRecord values(Integer value1, Integer value2, String value3,
      LocalDateTime value4) {
    value1(value1);
    value2(value2);
    value3(value3);
    value4(value4);
    return this;
  }
}
