package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.DelegatableNode;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
@onItemDismisslambda0
public interface DragAndDropModifierNode extends DelegatableNode, DragAndDropTarget {
    boolean acceptDragAndDropTransfer(DragAndDropEvent dragAndDropEvent);

    @onItemDismisslambda0
    /* JADX INFO: renamed from: drag-12SF9DM, reason: not valid java name */
    void mo222drag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);
}
