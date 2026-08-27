package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldPreparedSelection extends ContinuationImpl {
    public boolean IconCompatParcelizer;
    public androidx.compose.ui.input.pointer.PointerEventPass RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public androidx.compose.ui.input.pointer.AwaitPointerEventScope write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(null, false, null, this);
    }

    public TextFieldPreparedSelection(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
