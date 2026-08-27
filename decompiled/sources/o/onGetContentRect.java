package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class onGetContentRect extends ContinuationImpl {
    public r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 IconCompatParcelizer;
    public androidx.compose.ui.input.pointer.PointerInputChange MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaDescriptionCompat;
    public int MediaSessionCompatQueueItem;
    public androidx.compose.foundation.gestures.TouchSlopDetector RemoteActionCompatParcelizer;
    public float read;
    public createBrazeUserChangeEventSubscriberlambda0 serializer;
    public androidx.compose.ui.input.pointer.AwaitPointerEventScope write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaDescriptionCompat = obj;
        this.MediaSessionCompatQueueItem |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.DragGestureDetectorKt.m31awaitHorizontalPointerSlopOrCancellationgDDlDlE(null, 0L, 0, null, this);
    }

    public onGetContentRect(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
