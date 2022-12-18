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
public class LabelRelease implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer labelId;
    private final Integer releaseId;
    private final String categoryNotation;
    private final LocalDateTime updatedAt;

    public LabelRelease(LabelRelease value) {
        this.labelId = value.labelId;
        this.releaseId = value.releaseId;
        this.categoryNotation = value.categoryNotation;
        this.updatedAt = value.updatedAt;
    }

    public LabelRelease(
        Integer labelId,
        Integer releaseId,
        String categoryNotation,
        LocalDateTime updatedAt
    ) {
        this.labelId = labelId;
        this.releaseId = releaseId;
        this.categoryNotation = categoryNotation;
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for <code>public.label_release.label_id</code>.
     */
    public Integer getLabelId() {
        return this.labelId;
    }

    /**
     * Getter for <code>public.label_release.release_id</code>.
     */
    public Integer getReleaseId() {
        return this.releaseId;
    }

    /**
     * Getter for <code>public.label_release.category_notation</code>.
     */
    public String getCategoryNotation() {
        return this.categoryNotation;
    }

    /**
     * Getter for <code>public.label_release.updated_at</code>. created time
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
        final LabelRelease other = (LabelRelease) obj;
        if (this.labelId == null) {
            if (other.labelId != null)
                return false;
        }
        else if (!this.labelId.equals(other.labelId))
            return false;
        if (this.releaseId == null) {
            if (other.releaseId != null)
                return false;
        }
        else if (!this.releaseId.equals(other.releaseId))
            return false;
        if (this.categoryNotation == null) {
            if (other.categoryNotation != null)
                return false;
        }
        else if (!this.categoryNotation.equals(other.categoryNotation))
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
        result = prime * result + ((this.labelId == null) ? 0 : this.labelId.hashCode());
        result = prime * result + ((this.releaseId == null) ? 0 : this.releaseId.hashCode());
        result = prime * result + ((this.categoryNotation == null) ? 0 : this.categoryNotation.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LabelRelease (");

        sb.append(labelId);
        sb.append(", ").append(releaseId);
        sb.append(", ").append(categoryNotation);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }
}