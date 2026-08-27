package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class StylusHandwritingNodesuspendingPointerInputModifierNode11 extends ContinuationImpl {
    public BottomSheetScaffoldsdMYb0k IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.gestures.DragGestureNode RemoteActionCompatParcelizer;
    public int read;
    public updateMenuItems serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StylusHandwritingNodesuspendingPointerInputModifierNode11(androidx.compose.foundation.gestures.DragGestureNode dragGestureNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.DragGestureNode.access$processDragStart(this.RemoteActionCompatParcelizer, null, this);
    }
}
