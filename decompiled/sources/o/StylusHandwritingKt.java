package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class StylusHandwritingKt extends ContinuationImpl {
    public final /* synthetic */ androidx.compose.foundation.gestures.DragGestureNode RemoteActionCompatParcelizer;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StylusHandwritingKt(androidx.compose.foundation.gestures.DragGestureNode dragGestureNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.DragGestureNode.access$processDragCancel(this.RemoteActionCompatParcelizer, this);
    }
}
