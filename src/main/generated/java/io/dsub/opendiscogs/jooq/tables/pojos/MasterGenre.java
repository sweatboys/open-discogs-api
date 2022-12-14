/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MasterGenre implements Serializable {

  private static final long serialVersionUID = 1L;

  private final Integer masterId;
  private final Integer genreId;
  private final LocalDateTime updatedAt;

  public MasterGenre(MasterGenre value) {
    this.masterId = value.masterId;
    this.genreId = value.genreId;
    this.updatedAt = value.updatedAt;
  }

  public MasterGenre(
      Integer masterId,
      Integer genreId,
      LocalDateTime updatedAt
  ) {
    this.masterId = masterId;
    this.genreId = genreId;
    this.updatedAt = updatedAt;
  }

  /**
   * Getter for <code>public.master_genre.master_id</code>.
   */
  public Integer getMasterId() {
    return this.masterId;
  }

  /**
   * Getter for <code>public.master_genre.genre_id</code>.
   */
  public Integer getGenreId() {
    return this.genreId;
  }

  /**
   * Getter for <code>public.master_genre.updated_at</code>. created time
   */
  public LocalDateTime getUpdatedAt() {
    return this.updatedAt;
  }

  @Override
  public boolean equals(Object obj) {
      if (this == obj) {
          return true;
      }
      if (obj == null) {
          return false;
      }
      if (getClass() != obj.getClass()) {
          return false;
      }
    final MasterGenre other = (MasterGenre) obj;
    if (this.masterId == null) {
        if (other.masterId != null) {
            return false;
        }
    } else if (!this.masterId.equals(other.masterId)) {
        return false;
    }
    if (this.genreId == null) {
        if (other.genreId != null) {
            return false;
        }
    } else if (!this.genreId.equals(other.genreId)) {
        return false;
    }
    if (this.updatedAt == null) {
        if (other.updatedAt != null) {
            return false;
        }
    } else if (!this.updatedAt.equals(other.updatedAt)) {
        return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.masterId == null) ? 0 : this.masterId.hashCode());
    result = prime * result + ((this.genreId == null) ? 0 : this.genreId.hashCode());
    result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MasterGenre (");

    sb.append(masterId);
    sb.append(", ").append(genreId);
    sb.append(", ").append(updatedAt);

    sb.append(")");
    return sb.toString();
  }
}
