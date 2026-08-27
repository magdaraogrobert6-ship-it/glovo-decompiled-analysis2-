package o;

import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import com.google.firebase.inappmessaging.internal.ImpressionStorageClient;
import com.google.firebase.inappmessaging.internal.RateLimiterClient;
import io.reactivex.flowables.ConnectableFlowable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class reuse {
    public final packui IconCompatParcelizer;
    public final zzbv MediaBrowserCompatMediaItem;
    public final TouchBoundsExpansionKt MediaDescriptionCompat;
    public final Executor MediaMetadataCompat;
    public final disposeComposition MediaSessionCompatQueueItem;
    public final RateLimiterClient MediaSessionCompatResultReceiverWrapper;
    public final zzgs MediaSessionCompatToken;
    public final getShowLayoutBoundsannotations ParcelableVolumeInfo;
    public final ConnectableFlowable PlaybackStateCompat;
    public final ImpressionStorageClient PlaybackStateCompatCustomAction;
    public final accesssetInstancecp RatingCompat;
    public final AnalyticsEventsManager RemoteActionCompatParcelizer;
    public final ConnectableFlowable read;
    public final DpTouchBoundsExpansiona9UjIt4default serializer;
    public final getHasComposition write;

    public reuse(ConnectableFlowable connectableFlowable, ConnectableFlowable connectableFlowable2, TouchBoundsExpansionKt touchBoundsExpansionKt, disposeComposition disposecomposition, DpTouchBoundsExpansiona9UjIt4default dpTouchBoundsExpansiona9UjIt4default, AnalyticsEventsManager analyticsEventsManager, getShowLayoutBoundsannotations getshowlayoutboundsannotations, ImpressionStorageClient impressionStorageClient, RateLimiterClient rateLimiterClient, getHasComposition gethascomposition, zzgs zzgsVar, accesssetInstancecp accesssetinstancecp, zzbv zzbvVar, packui packuiVar, Executor executor) {
        this.read = connectableFlowable;
        this.PlaybackStateCompat = connectableFlowable2;
        this.MediaDescriptionCompat = touchBoundsExpansionKt;
        this.MediaSessionCompatQueueItem = disposecomposition;
        this.serializer = dpTouchBoundsExpansiona9UjIt4default;
        this.RemoteActionCompatParcelizer = analyticsEventsManager;
        this.ParcelableVolumeInfo = getshowlayoutboundsannotations;
        this.PlaybackStateCompatCustomAction = impressionStorageClient;
        this.MediaSessionCompatResultReceiverWrapper = rateLimiterClient;
        this.write = gethascomposition;
        this.MediaSessionCompatToken = zzgsVar;
        this.MediaBrowserCompatMediaItem = zzbvVar;
        this.RatingCompat = accesssetinstancecp;
        this.IconCompatParcelizer = packuiVar;
        this.MediaMetadataCompat = executor;
    }
}
