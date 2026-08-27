package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class BaseTextPreparedSelection extends ContinuationImpl {
    public androidx.compose.foundation.gestures.ScrollingLogic IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.gestures.MouseWheelScrollingLogic MediaBrowserCompatMediaItem;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public float read;
    public cancelPendingWebViewPauselambda0 serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTextPreparedSelection(androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = mouseWheelScrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$dispatchMouseWheelScroll(this.MediaBrowserCompatMediaItem, null, null, 0.0f, 0.0f, this);
    }
}
