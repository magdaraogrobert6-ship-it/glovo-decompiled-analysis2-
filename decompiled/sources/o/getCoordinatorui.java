package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getCoordinatorui extends ContinuationImpl {
    public int IconCompatParcelizer;
    public AlignmentHorizontal RemoteActionCompatParcelizer;
    public androidx.compose.ui.input.pointer.AwaitPointerEventScope read;
    public androidx.compose.ui.input.pointer.PointerInputChange serializer;
    public /* synthetic */ Object write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionFirstPress(null, null, null, this);
    }

    public getCoordinatorui(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
