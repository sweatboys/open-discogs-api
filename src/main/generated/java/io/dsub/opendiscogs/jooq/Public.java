/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq;


import io.dsub.opendiscogs.jooq.tables.Artist;
import io.dsub.opendiscogs.jooq.tables.ArtistAlias;
import io.dsub.opendiscogs.jooq.tables.ArtistGroup;
import io.dsub.opendiscogs.jooq.tables.ArtistNameVariation;
import io.dsub.opendiscogs.jooq.tables.ArtistUrl;
import io.dsub.opendiscogs.jooq.tables.Data;
import io.dsub.opendiscogs.jooq.tables.Genre;
import io.dsub.opendiscogs.jooq.tables.Label;
import io.dsub.opendiscogs.jooq.tables.LabelRelease;
import io.dsub.opendiscogs.jooq.tables.LabelUrl;
import io.dsub.opendiscogs.jooq.tables.Master;
import io.dsub.opendiscogs.jooq.tables.MasterArtist;
import io.dsub.opendiscogs.jooq.tables.MasterGenre;
import io.dsub.opendiscogs.jooq.tables.MasterStyle;
import io.dsub.opendiscogs.jooq.tables.MasterVideo;
import io.dsub.opendiscogs.jooq.tables.Release;
import io.dsub.opendiscogs.jooq.tables.ReleaseArtist;
import io.dsub.opendiscogs.jooq.tables.ReleaseContract;
import io.dsub.opendiscogs.jooq.tables.ReleaseCreditedArtist;
import io.dsub.opendiscogs.jooq.tables.ReleaseFormat;
import io.dsub.opendiscogs.jooq.tables.ReleaseGenre;
import io.dsub.opendiscogs.jooq.tables.ReleaseIdentifier;
import io.dsub.opendiscogs.jooq.tables.ReleaseImage;
import io.dsub.opendiscogs.jooq.tables.ReleaseStyle;
import io.dsub.opendiscogs.jooq.tables.ReleaseTrack;
import io.dsub.opendiscogs.jooq.tables.ReleaseVideo;
import io.dsub.opendiscogs.jooq.tables.Style;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.artist</code>.
     */
    public final Artist ARTIST = Artist.ARTIST;

    /**
     * The table <code>public.artist_alias</code>.
     */
    public final ArtistAlias ARTIST_ALIAS = ArtistAlias.ARTIST_ALIAS;

    /**
     * The table <code>public.artist_group</code>.
     */
    public final ArtistGroup ARTIST_GROUP = ArtistGroup.ARTIST_GROUP;

    /**
     * The table <code>public.artist_name_variation</code>.
     */
    public final ArtistNameVariation ARTIST_NAME_VARIATION = ArtistNameVariation.ARTIST_NAME_VARIATION;

    /**
     * The table <code>public.artist_url</code>.
     */
    public final ArtistUrl ARTIST_URL = ArtistUrl.ARTIST_URL;

    /**
     * Cached resource for keep tracking data dump updates (either being monthly
     * or random occasions)
     */
    public final Data DATA = Data.DATA;

    /**
     * The table <code>public.genre</code>.
     */
    public final Genre GENRE = Genre.GENRE;

    /**
     * The table <code>public.label</code>.
     */
    public final Label LABEL = Label.LABEL;

    /**
     * The table <code>public.label_release</code>.
     */
    public final LabelRelease LABEL_RELEASE = LabelRelease.LABEL_RELEASE;

    /**
     * The table <code>public.label_url</code>.
     */
    public final LabelUrl LABEL_URL = LabelUrl.LABEL_URL;

    /**
     * The table <code>public.master</code>.
     */
    public final Master MASTER = Master.MASTER;

    /**
     * The table <code>public.master_artist</code>.
     */
    public final MasterArtist MASTER_ARTIST = MasterArtist.MASTER_ARTIST;

    /**
     * The table <code>public.master_genre</code>.
     */
    public final MasterGenre MASTER_GENRE = MasterGenre.MASTER_GENRE;

    /**
     * The table <code>public.master_style</code>.
     */
    public final MasterStyle MASTER_STYLE = MasterStyle.MASTER_STYLE;

    /**
     * The table <code>public.master_video</code>.
     */
    public final MasterVideo MASTER_VIDEO = MasterVideo.MASTER_VIDEO;

    /**
     * The table <code>public.release</code>.
     */
    public final Release RELEASE = Release.RELEASE;

    /**
     * The table <code>public.release_artist</code>.
     */
    public final ReleaseArtist RELEASE_ARTIST = ReleaseArtist.RELEASE_ARTIST;

    /**
     * The table <code>public.release_contract</code>.
     */
    public final ReleaseContract RELEASE_CONTRACT = ReleaseContract.RELEASE_CONTRACT;

    /**
     * The table <code>public.release_credited_artist</code>.
     */
    public final ReleaseCreditedArtist RELEASE_CREDITED_ARTIST = ReleaseCreditedArtist.RELEASE_CREDITED_ARTIST;

    /**
     * The table <code>public.release_format</code>.
     */
    public final ReleaseFormat RELEASE_FORMAT = ReleaseFormat.RELEASE_FORMAT;

    /**
     * The table <code>public.release_genre</code>.
     */
    public final ReleaseGenre RELEASE_GENRE = ReleaseGenre.RELEASE_GENRE;

    /**
     * The table <code>public.release_identifier</code>.
     */
    public final ReleaseIdentifier RELEASE_IDENTIFIER = ReleaseIdentifier.RELEASE_IDENTIFIER;

    /**
     * The table <code>public.release_image</code>.
     */
    public final ReleaseImage RELEASE_IMAGE = ReleaseImage.RELEASE_IMAGE;

    /**
     * The table <code>public.release_style</code>.
     */
    public final ReleaseStyle RELEASE_STYLE = ReleaseStyle.RELEASE_STYLE;

    /**
     * The table <code>public.release_track</code>.
     */
    public final ReleaseTrack RELEASE_TRACK = ReleaseTrack.RELEASE_TRACK;

    /**
     * The table <code>public.release_video</code>.
     */
    public final ReleaseVideo RELEASE_VIDEO = ReleaseVideo.RELEASE_VIDEO;

    /**
     * The table <code>public.style</code>.
     */
    public final Style STYLE = Style.STYLE;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Artist.ARTIST,
            ArtistAlias.ARTIST_ALIAS,
            ArtistGroup.ARTIST_GROUP,
            ArtistNameVariation.ARTIST_NAME_VARIATION,
            ArtistUrl.ARTIST_URL,
            Data.DATA,
            Genre.GENRE,
            Label.LABEL,
            LabelRelease.LABEL_RELEASE,
            LabelUrl.LABEL_URL,
            Master.MASTER,
            MasterArtist.MASTER_ARTIST,
            MasterGenre.MASTER_GENRE,
            MasterStyle.MASTER_STYLE,
            MasterVideo.MASTER_VIDEO,
            Release.RELEASE,
            ReleaseArtist.RELEASE_ARTIST,
            ReleaseContract.RELEASE_CONTRACT,
            ReleaseCreditedArtist.RELEASE_CREDITED_ARTIST,
            ReleaseFormat.RELEASE_FORMAT,
            ReleaseGenre.RELEASE_GENRE,
            ReleaseIdentifier.RELEASE_IDENTIFIER,
            ReleaseImage.RELEASE_IMAGE,
            ReleaseStyle.RELEASE_STYLE,
            ReleaseTrack.RELEASE_TRACK,
            ReleaseVideo.RELEASE_VIDEO,
            Style.STYLE
        );
    }
}
