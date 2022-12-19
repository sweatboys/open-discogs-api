/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables.records;


import io.dsub.opendiscogs.jooq.tables.ArtistAlias;
import java.time.LocalDateTime;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ArtistAliasRecord extends UpdatableRecordImpl<ArtistAliasRecord> implements
    Record3<Integer, Integer, LocalDateTime> {

  private static final long serialVersionUID = 1L;

  /**
   * Create a detached ArtistAliasRecord
   */
  public ArtistAliasRecord() {
    super(ArtistAlias.ARTIST_ALIAS);
  }

  /**
   * Create a detached, initialised ArtistAliasRecord
   */
  public ArtistAliasRecord(Integer artistId, Integer aliasId, LocalDateTime updatedAt) {
    super(ArtistAlias.ARTIST_ALIAS);

    setArtistId(artistId);
    setAliasId(aliasId);
    setUpdatedAt(updatedAt);
  }

  /**
   * Create a detached, initialised ArtistAliasRecord
   */
  public ArtistAliasRecord(io.dsub.opendiscogs.jooq.tables.pojos.ArtistAlias value) {
    super(ArtistAlias.ARTIST_ALIAS);

    if (value != null) {
      setArtistId(value.getArtistId());
      setAliasId(value.getAliasId());
      setUpdatedAt(value.getUpdatedAt());
    }
  }

  /**
   * Getter for <code>public.artist_alias.artist_id</code>.
   */
  public Integer getArtistId() {
    return (Integer) get(0);
  }

  /**
   * Setter for <code>public.artist_alias.artist_id</code>.
   */
  public ArtistAliasRecord setArtistId(Integer value) {
    set(0, value);
    return this;
  }

  /**
   * Getter for <code>public.artist_alias.alias_id</code>.
   */
  public Integer getAliasId() {
    return (Integer) get(1);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  /**
   * Setter for <code>public.artist_alias.alias_id</code>.
   */
  public ArtistAliasRecord setAliasId(Integer value) {
    set(1, value);
    return this;
  }

  // -------------------------------------------------------------------------
  // Record3 type implementation
  // -------------------------------------------------------------------------

  /**
   * Getter for <code>public.artist_alias.updated_at</code>. created time
   */
  public LocalDateTime getUpdatedAt() {
    return (LocalDateTime) get(2);
  }

  /**
   * Setter for <code>public.artist_alias.updated_at</code>. created time
   */
  public ArtistAliasRecord setUpdatedAt(LocalDateTime value) {
    set(2, value);
    return this;
  }

  @Override
  public Record2<Integer, Integer> key() {
    return (Record2) super.key();
  }

  @Override
  public Row3<Integer, Integer, LocalDateTime> fieldsRow() {
    return (Row3) super.fieldsRow();
  }

  @Override
  public Row3<Integer, Integer, LocalDateTime> valuesRow() {
    return (Row3) super.valuesRow();
  }

  @Override
  public Field<Integer> field1() {
    return ArtistAlias.ARTIST_ALIAS.ARTIST_ID;
  }

  @Override
  public Field<Integer> field2() {
    return ArtistAlias.ARTIST_ALIAS.ALIAS_ID;
  }

  @Override
  public Field<LocalDateTime> field3() {
    return ArtistAlias.ARTIST_ALIAS.UPDATED_AT;
  }

  @Override
  public Integer component1() {
    return getArtistId();
  }

  @Override
  public Integer component2() {
    return getAliasId();
  }

  @Override
  public LocalDateTime component3() {
    return getUpdatedAt();
  }

  @Override
  public Integer value1() {
    return getArtistId();
  }

  @Override
  public Integer value2() {
    return getAliasId();
  }

  @Override
  public LocalDateTime value3() {
    return getUpdatedAt();
  }

  @Override
  public ArtistAliasRecord value1(Integer value) {
    setArtistId(value);
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  @Override
  public ArtistAliasRecord value2(Integer value) {
    setAliasId(value);
    return this;
  }

  @Override
  public ArtistAliasRecord value3(LocalDateTime value) {
    setUpdatedAt(value);
    return this;
  }

  @Override
  public ArtistAliasRecord values(Integer value1, Integer value2, LocalDateTime value3) {
    value1(value1);
    value2(value2);
    value3(value3);
    return this;
  }
}
