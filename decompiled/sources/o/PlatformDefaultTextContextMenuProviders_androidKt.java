package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformDefaultTextContextMenuProviders_androidKt extends ContinuationImpl {
    public cancelPendingWebViewPause IconCompatParcelizer;
    public createInAppMessageEventSubscriber RemoteActionCompatParcelizer;
    public androidx.compose.ui.input.pointer.PointerInputChange read;
    public /* synthetic */ Object serializer;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.DragGestureDetectorKt.m32awaitLongPressOrCancellationrnUCldI(null, 0L, this);
    }

    public PlatformDefaultTextContextMenuProviders_androidKt(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
