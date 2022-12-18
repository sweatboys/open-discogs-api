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


/**
 * Convenience access to all tables in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.artist</code>.
     */
    public static final Artist ARTIST = Artist.ARTIST;

    /**
     * The table <code>public.artist_alias</code>.
     */
    public static final ArtistAlias ARTIST_ALIAS = ArtistAlias.ARTIST_ALIAS;

    /**
     * The table <code>public.artist_group</code>.
     */
    public static final ArtistGroup ARTIST_GROUP = ArtistGroup.ARTIST_GROUP;

    /**
     * The table <code>public.artist_name_variation</code>.
     */
    public static final ArtistNameVariation ARTIST_NAME_VARIATION = ArtistNameVariation.ARTIST_NAME_VARIATION;

    /**
     * The table <code>public.artist_url</code>.
     */
    public static final ArtistUrl ARTIST_URL = ArtistUrl.ARTIST_URL;

    /**
     * Cached resource for keep tracking data dump updates (either being monthly
     * or random occasions)
     */
    public static final Data DATA = Data.DATA;

    /**
     * The table <code>public.genre</code>.
     */
    public static final Genre GENRE = Genre.GENRE;

    /**
     * The table <code>public.label</code>.
     */
    public static final Label LABEL = Label.LABEL;

    /**
     * The table <code>public.label_release</code>.
     */
    public static final LabelRelease LABEL_RELEASE = LabelRelease.LABEL_RELEASE;

    /**
     * The table <code>public.label_url</code>.
     */
    public static final LabelUrl LABEL_URL = LabelUrl.LABEL_URL;

    /**
     * The table <code>public.master</code>.
     */
    public static final Master MASTER = Master.MASTER;

    /**
     * The table <code>public.master_artist</code>.
     */
    public static final MasterArtist MASTER_ARTIST = MasterArtist.MASTER_ARTIST;

    /**
     * The table <code>public.master_genre</code>.
     */
    public static final MasterGenre MASTER_GENRE = MasterGenre.MASTER_GENRE;

    /**
     * The table <code>public.master_style</code>.
     */
    public static final MasterStyle MASTER_STYLE = MasterStyle.MASTER_STYLE;

    /**
     * The table <code>public.master_video</code>.
     */
    public static final MasterVideo MASTER_VIDEO = MasterVideo.MASTER_VIDEO;

    /**
     * The table <code>public.release</code>.
     */
    public static final Release RELEASE = Release.RELEASE;

    /**
     * The table <code>public.release_artist</code>.
     */
    public static final ReleaseArtist RELEASE_ARTIST = ReleaseArtist.RELEASE_ARTIST;

    /**
     * The table <code>public.release_contract</code>.
     */
    public static final ReleaseContract RELEASE_CONTRACT = ReleaseContract.RELEASE_CONTRACT;

    /**
     * The table <code>public.release_credited_artist</code>.
     */
    public static final ReleaseCreditedArtist RELEASE_CREDITED_ARTIST = ReleaseCreditedArtist.RELEASE_CREDITED_ARTIST;

    /**
     * The table <code>public.release_format</code>.
     */
    public static final ReleaseFormat RELEASE_FORMAT = ReleaseFormat.RELEASE_FORMAT;

    /**
     * The table <code>public.release_genre</code>.
     */
    public static final ReleaseGenre RELEASE_GENRE = ReleaseGenre.RELEASE_GENRE;

    /**
     * The table <code>public.release_identifier</code>.
     */
    public static final ReleaseIdentifier RELEASE_IDENTIFIER = ReleaseIdentifier.RELEASE_IDENTIFIER;

    /**
     * The table <code>public.release_image</code>.
     */
    public static final ReleaseImage RELEASE_IMAGE = ReleaseImage.RELEASE_IMAGE;

    /**
     * The table <code>public.release_style</code>.
     */
    public static final ReleaseStyle RELEASE_STYLE = ReleaseStyle.RELEASE_STYLE;

    /**
     * The table <code>public.release_track</code>.
     */
    public static final ReleaseTrack RELEASE_TRACK = ReleaseTrack.RELEASE_TRACK;

    /**
     * The table <code>public.release_video</code>.
     */
    public static final ReleaseVideo RELEASE_VIDEO = ReleaseVideo.RELEASE_VIDEO;

    /**
     * The table <code>public.style</code>.
     */
    public static final Style STYLE = Style.STYLE;
}