package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class toStringimpl extends ContinuationImpl {
    public androidx.compose.ui.input.pointer.AwaitPointerEventScope IconCompatParcelizer;
    public androidx.compose.ui.input.pointer.PointerEventPass RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(null, null, this);
    }

    public toStringimpl(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
