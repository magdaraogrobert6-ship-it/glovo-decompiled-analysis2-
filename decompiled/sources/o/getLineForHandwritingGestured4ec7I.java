package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getLineForHandwritingGestured4ec7I extends ContinuationImpl {
    public androidx.compose.ui.input.pointer.PointerInputChange IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public isInvalidIndex MediaMetadataCompat;
    public Object MediaSessionCompatQueueItem;
    public Object MediaSessionCompatResultReceiverWrapper;
    public Object MediaSessionCompatToken;
    public createBrazeUserChangeEventSubscriberlambda0 ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public Object RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public /* synthetic */ Object ResultReceiver;
    public float read;
    public androidx.compose.foundation.gestures.TouchSlopDetector serializer;
    public Object write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.ResultReceiver = obj;
        this.PlaybackStateCompat |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.DragGestureDetectorKt.processDragGesture(null, null, null, null, null, null, null, this);
    }

    public getLineForHandwritingGestured4ec7I(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
