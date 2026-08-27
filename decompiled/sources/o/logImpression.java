package o;

import com.sentiance.sdk.configuration.ConfigurationManager;

/* JADX INFO: loaded from: classes3.dex */
public final class logImpression {
    private final getAnimateInannotations IconCompatParcelizer;
    private final getRemoteAssetPathsForPrefetch MediaBrowserCompatMediaItem;
    private final getUri MediaDescriptionCompat;
    private final getAnimateOut MediaMetadataCompat;
    private final getDismissType MediaSessionCompatQueueItem;
    private final setPinned MediaSessionCompatToken;
    private final setIndicatorHighlighted PlaybackStateCompat;
    private final getMessageType RatingCompat;
    private final ConfigurationManager RemoteActionCompatParcelizer;
    private final getCropType read;
    private final setViewed serializer;
    private final ShortNewsCard write;

    public final getMessageType MediaMetadataCompat() {
        return this.RatingCompat;
    }

    public final setViewed RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    public final IInAppMessage IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.PlaybackStateCompatCustomAction() == 2 ? this.IconCompatParcelizer : this.write;
    }

    public final getMessageExtras MediaBrowserCompatMediaItem() {
        return this.RemoteActionCompatParcelizer.PlaybackStateCompatCustomAction() == 2 ? this.MediaDescriptionCompat : this.MediaBrowserCompatMediaItem;
    }

    public final isTest read() {
        return this.RemoteActionCompatParcelizer.PlaybackStateCompatCustomAction() == 2 ? this.MediaSessionCompatToken : this.PlaybackStateCompat;
    }

    public final getAnimateOutannotations serializer() {
        return this.RemoteActionCompatParcelizer.PlaybackStateCompatCustomAction() == 2 ? this.MediaSessionCompatQueueItem : this.read;
    }

    public final getAnimateOut write() {
        this.RemoteActionCompatParcelizer.PlaybackStateCompatCustomAction();
        return this.MediaMetadataCompat;
    }

    public logImpression(ConfigurationManager configurationManager, setViewed setviewed, ShortNewsCard shortNewsCard, getAnimateInannotations getanimateinannotations, getCropType getcroptype, getDismissType getdismisstype, getRemoteAssetPathsForPrefetch getremoteassetpathsforprefetch, getUri geturi, getAnimateOut getanimateout, getMessageType getmessagetype, setIndicatorHighlighted setindicatorhighlighted, setPinned setpinned) {
        configurationManager.getClass();
        setviewed.getClass();
        shortNewsCard.getClass();
        getanimateinannotations.getClass();
        getcroptype.getClass();
        getdismisstype.getClass();
        getremoteassetpathsforprefetch.getClass();
        geturi.getClass();
        getanimateout.getClass();
        getmessagetype.getClass();
        setindicatorhighlighted.getClass();
        setpinned.getClass();
        this.RemoteActionCompatParcelizer = configurationManager;
        this.serializer = setviewed;
        this.write = shortNewsCard;
        this.IconCompatParcelizer = getanimateinannotations;
        this.read = getcroptype;
        this.MediaSessionCompatQueueItem = getdismisstype;
        this.MediaBrowserCompatMediaItem = getremoteassetpathsforprefetch;
        this.MediaDescriptionCompat = geturi;
        this.MediaMetadataCompat = getanimateout;
        this.RatingCompat = getmessagetype;
        this.PlaybackStateCompat = setindicatorhighlighted;
        this.MediaSessionCompatToken = setpinned;
    }
}
