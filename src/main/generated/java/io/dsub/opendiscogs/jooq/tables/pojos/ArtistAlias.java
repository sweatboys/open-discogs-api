/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ArtistAlias implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer artistId;
    private final Integer aliasId;
    private final LocalDateTime updatedAt;

    public ArtistAlias(ArtistAlias value) {
        this.artistId = value.artistId;
        this.aliasId = value.aliasId;
        this.updatedAt = value.updatedAt;
    }

    public ArtistAlias(
        Integer artistId,
        Integer aliasId,
        LocalDateTime updatedAt
    ) {
        this.artistId = artistId;
        this.aliasId = aliasId;
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for <code>public.artist_alias.artist_id</code>.
     */
    public Integer getArtistId() {
        return this.artistId;
    }

    /**
     * Getter for <code>public.artist_alias.alias_id</code>.
     */
    public Integer getAliasId() {
        return this.aliasId;
    }

    /**
     * Getter for <code>public.artist_alias.updated_at</code>. created time
     */
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ArtistAlias other = (ArtistAlias) obj;
        if (this.artistId == null) {
            if (other.artistId != null)
                return false;
        }
        else if (!this.artistId.equals(other.artistId))
            return false;
        if (this.aliasId == null) {
            if (other.aliasId != null)
                return false;
        }
        else if (!this.aliasId.equals(other.aliasId))
            return false;
        if (this.updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        }
        else if (!this.updatedAt.equals(other.updatedAt))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.artistId == null) ? 0 : this.artistId.hashCode());
        result = prime * result + ((this.aliasId == null) ? 0 : this.aliasId.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ArtistAlias (");

        sb.append(artistId);
        sb.append(", ").append(aliasId);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }
}