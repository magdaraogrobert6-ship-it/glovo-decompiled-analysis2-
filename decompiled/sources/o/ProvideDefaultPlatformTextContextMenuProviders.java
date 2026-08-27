package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ProvideDefaultPlatformTextContextMenuProviders extends ContinuationImpl {
    public createBrazeUserChangeEventSubscriberlambda0 IconCompatParcelizer;
    public androidx.compose.ui.input.pointer.PointerInputChange MediaMetadataCompat;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public int RatingCompat;
    public androidx.compose.ui.input.pointer.AwaitPointerEventScope RemoteActionCompatParcelizer;
    public float read;
    public r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 serializer;
    public androidx.compose.foundation.gestures.TouchSlopDetector write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaSessionCompatQueueItem = obj;
        this.RatingCompat |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.DragGestureDetectorKt.m33awaitTouchSlopOrCancellationjO51t88(null, 0L, null, this);
    }

    public ProvideDefaultPlatformTextContextMenuProviders(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
