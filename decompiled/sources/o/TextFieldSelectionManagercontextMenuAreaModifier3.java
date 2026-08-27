package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldSelectionManagercontextMenuAreaModifier3 extends ContinuationImpl {
    public androidx.compose.ui.input.pointer.AwaitPointerEventScope IconCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public androidx.compose.ui.input.pointer.PointerEventPass write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(null, null, this);
    }

    public TextFieldSelectionManagercontextMenuAreaModifier3(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
