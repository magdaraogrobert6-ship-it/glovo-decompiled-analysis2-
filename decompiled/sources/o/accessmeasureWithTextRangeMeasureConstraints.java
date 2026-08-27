package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class accessmeasureWithTextRangeMeasureConstraints extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public cancelPendingWebViewPauselambda0 RemoteActionCompatParcelizer;
    public int serializer;
    public final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableNode write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessmeasureWithTextRangeMeasureConstraints(androidx.compose.foundation.gestures.AnchoredDraggableNode anchoredDraggableNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = anchoredDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.AnchoredDraggableNode.access$fling(this.write, 0.0f, this);
    }
}
