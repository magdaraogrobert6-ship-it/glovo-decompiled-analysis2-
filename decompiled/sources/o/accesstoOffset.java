package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class accesstoOffset extends ContinuationImpl {
    public FloatingTextActionModeCallback IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ androidx.compose.foundation.gestures.DragGestureNode write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accesstoOffset(androidx.compose.foundation.gestures.DragGestureNode dragGestureNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.DragGestureNode.access$processDragStop(this.write, null, this);
    }
}
