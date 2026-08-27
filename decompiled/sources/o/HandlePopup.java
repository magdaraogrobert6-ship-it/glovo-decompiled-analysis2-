package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class HandlePopup extends ContinuationImpl {
    public cancelPendingWebViewPauselambda0 IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public androidx.compose.foundation.gestures.ScrollingLogic RemoteActionCompatParcelizer;
    public androidx.compose.foundation.gestures.MouseWheelScrollingLogic read;
    public createInAppMessageEventSubscriber serializer;
    public createInAppMessageEventSubscriber write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaSessionCompatQueueItem = obj;
        this.MediaBrowserCompatMediaItem |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$dispatchMouseWheelScroll$waitNextScrollDelta(null, null, null, null, null, 0L, this);
    }

    public HandlePopup(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
