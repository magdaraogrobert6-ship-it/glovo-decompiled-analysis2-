package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class SelectionGesturesKt extends ContinuationImpl {
    public cancelPendingWebViewPauselambda0 read;
    public /* synthetic */ Object serializer;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy(null, 0.0f, null, this);
    }

    public SelectionGesturesKt(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
