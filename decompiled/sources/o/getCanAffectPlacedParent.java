package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class getCanAffectPlacedParent extends accessgetPlaceOuterCoordinatorZIndexp {
    public String IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public accessgetPlaceOuterCoordinatorLayerBlockp MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public byte MediaSessionCompatResultReceiverWrapper;
    public trackMeasurementByParent ParcelableVolumeInfo;
    public String PlaybackStateCompatCustomAction;
    public String RatingCompat;
    public String RemoteActionCompatParcelizer;
    public MeasurePassDelegate read;
    public String serializer;
    public String write;

    public final ensureSubtreeLookaheadReplaced read() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (this.MediaSessionCompatResultReceiverWrapper == 1 && (str = this.PlaybackStateCompatCustomAction) != null && (str2 = this.MediaMetadataCompat) != null && (str3 = this.MediaSessionCompatQueueItem) != null && (str4 = this.serializer) != null && (str5 = this.IconCompatParcelizer) != null) {
            return new ensureSubtreeLookaheadReplaced(str, str2, this.MediaBrowserCompatMediaItem, str3, this.RatingCompat, this.write, this.RemoteActionCompatParcelizer, str4, str5, this.ParcelableVolumeInfo, this.MediaDescriptionCompat, this.read);
        }
        StringBuilder sb = new StringBuilder();
        if (this.PlaybackStateCompatCustomAction == null) {
            sb.append(" sdkVersion");
        }
        if (this.MediaMetadataCompat == null) {
            sb.append(" gmpAppId");
        }
        if ((1 & this.MediaSessionCompatResultReceiverWrapper) == 0) {
            sb.append(" platform");
        }
        if (this.MediaSessionCompatQueueItem == null) {
            sb.append(" installationUuid");
        }
        if (this.serializer == null) {
            sb.append(" buildVersion");
        }
        if (this.IconCompatParcelizer == null) {
            sb.append(" displayVersion");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
        return null;
    }
}
