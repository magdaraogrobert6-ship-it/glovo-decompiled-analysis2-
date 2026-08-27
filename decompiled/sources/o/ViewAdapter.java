package o;

import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.firebase.inappmessaging.dagger.internal.InstanceFactory;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import com.google.firebase.inappmessaging.internal.ImpressionStorageClient;
import com.google.firebase.inappmessaging.internal.RateLimiterClient;
import io.reactivex.flowables.ConnectableFlowable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewAdapter implements forceAccessibilityForTesting {
    public final InstanceFactory IconCompatParcelizer;
    public final resolveComposeViewContext MediaBrowserCompatMediaItem;
    public final updateAutoCreatedComposeViewContext MediaDescriptionCompat;
    public final isAlive MediaMetadataCompat;
    public final resolveComposeViewContext MediaSessionCompatQueueItem;
    public final resolveComposeViewContext MediaSessionCompatResultReceiverWrapper;
    public final InstanceFactory MediaSessionCompatToken;
    public final resolveComposeViewContext ParcelableVolumeInfo;
    public final resolveComposeViewContext PlaybackStateCompat;
    public final resolveComposeViewContext PlaybackStateCompatCustomAction;
    public final resolveParentCompositionContext RatingCompat;
    public final resolveParentCompositionContext RemoteActionCompatParcelizer;
    public final resolveComposeViewContext read;
    public final getTextInputServiceannotations serializer;
    public final resolveComposeViewContext write;

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        return new reuse((ConnectableFlowable) this.read.write(), (ConnectableFlowable) this.ParcelableVolumeInfo.write(), (TouchBoundsExpansionKt) this.MediaBrowserCompatMediaItem.write(), (disposeComposition) this.RatingCompat.write(), (DpTouchBoundsExpansiona9UjIt4default) this.serializer.write(), (AnalyticsEventsManager) this.write.write(), (getShowLayoutBoundsannotations) this.MediaSessionCompatResultReceiverWrapper.write(), (ImpressionStorageClient) this.PlaybackStateCompatCustomAction.write(), (RateLimiterClient) this.PlaybackStateCompat.write(), (getHasComposition) this.RemoteActionCompatParcelizer.write(), (zzgs) this.MediaSessionCompatToken.write(), (accesssetInstancecp) this.MediaDescriptionCompat.write(), (zzbv) this.MediaMetadataCompat.write(), (packui) this.IconCompatParcelizer.serializer, (Executor) this.MediaSessionCompatQueueItem.write());
    }

    public ViewAdapter(resolveComposeViewContext resolvecomposeviewcontext, resolveComposeViewContext resolvecomposeviewcontext2, resolveComposeViewContext resolvecomposeviewcontext3, resolveParentCompositionContext resolveparentcompositioncontext, getTextInputServiceannotations gettextinputserviceannotations, resolveComposeViewContext resolvecomposeviewcontext4, resolveComposeViewContext resolvecomposeviewcontext5, resolveComposeViewContext resolvecomposeviewcontext6, resolveComposeViewContext resolvecomposeviewcontext7, resolveParentCompositionContext resolveparentcompositioncontext2, InstanceFactory instanceFactory, updateAutoCreatedComposeViewContext updateautocreatedcomposeviewcontext, isAlive isalive, InstanceFactory instanceFactory2, resolveComposeViewContext resolvecomposeviewcontext8) {
        this.read = resolvecomposeviewcontext;
        this.ParcelableVolumeInfo = resolvecomposeviewcontext2;
        this.MediaBrowserCompatMediaItem = resolvecomposeviewcontext3;
        this.RatingCompat = resolveparentcompositioncontext;
        this.serializer = gettextinputserviceannotations;
        this.write = resolvecomposeviewcontext4;
        this.MediaSessionCompatResultReceiverWrapper = resolvecomposeviewcontext5;
        this.PlaybackStateCompatCustomAction = resolvecomposeviewcontext6;
        this.PlaybackStateCompat = resolvecomposeviewcontext7;
        this.RemoteActionCompatParcelizer = resolveparentcompositioncontext2;
        this.MediaSessionCompatToken = instanceFactory;
        this.MediaDescriptionCompat = updateautocreatedcomposeviewcontext;
        this.MediaMetadataCompat = isalive;
        this.IconCompatParcelizer = instanceFactory2;
        this.MediaSessionCompatQueueItem = resolvecomposeviewcontext8;
    }
}
