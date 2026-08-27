package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class accesstouchSelectionSubsequentPress extends ContinuationImpl {
    public int IconCompatParcelizer;
    public cancelPendingWebViewPauselambda0 RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public androidx.compose.foundation.gestures.ScrollingLogic write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.ScrollableKt.m53access$semanticsScrollByd4ec7I(null, 0L, this);
    }

    public accesstouchSelectionSubsequentPress(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
