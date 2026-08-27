package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class CoreTextFieldKtTextFieldCursorHandle2111 extends ContinuationImpl {
    public final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKtTextFieldCursorHandle2111(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = anchoredDraggableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.read.anchoredDrag(null, null, null, this);
    }
}
