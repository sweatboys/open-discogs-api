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
public class ArtistGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer artistId;
    private final Integer groupId;
    private final LocalDateTime updatedAt;

    public ArtistGroup(ArtistGroup value) {
        this.artistId = value.artistId;
        this.groupId = value.groupId;
        this.updatedAt = value.updatedAt;
    }

    public ArtistGroup(
        Integer artistId,
        Integer groupId,
        LocalDateTime updatedAt
    ) {
        this.artistId = artistId;
        this.groupId = groupId;
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for <code>public.artist_group.artist_id</code>.
     */
    public Integer getArtistId() {
        return this.artistId;
    }

    /**
     * Getter for <code>public.artist_group.group_id</code>.
     */
    public Integer getGroupId() {
        return this.groupId;
    }

    /**
     * Getter for <code>public.artist_group.updated_at</code>. created time
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
        final ArtistGroup other = (ArtistGroup) obj;
        if (this.artistId == null) {
            if (other.artistId != null)
                return false;
        }
        else if (!this.artistId.equals(other.artistId))
            return false;
        if (this.groupId == null) {
            if (other.groupId != null)
                return false;
        }
        else if (!this.groupId.equals(other.groupId))
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
        result = prime * result + ((this.groupId == null) ? 0 : this.groupId.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ArtistGroup (");

        sb.append(artistId);
        sb.append(", ").append(groupId);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }
}
