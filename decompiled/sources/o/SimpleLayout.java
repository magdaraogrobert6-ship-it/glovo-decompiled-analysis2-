package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleLayout extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public androidx.compose.ui.input.pointer.AwaitPointerEventScope serializer;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp(null, this);
    }

    public SimpleLayout(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
