package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.getNewPassword;
import o.getPersonFullName;

/* JADX INFO: loaded from: classes.dex */
public final class CompositionLocalConsumerModifierNodeKt {
    public static final <T> T currentValueOf(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode, getNewPassword getnewpassword) {
        if (!compositionLocalConsumerModifierNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1 = (DragAndDropNodestartDragAndDropTransfer1) DelegatableNodeKt.requireLayoutNode(compositionLocalConsumerModifierNode).getCompositionLocalMap();
        dragAndDropNodestartDragAndDropTransfer1.getClass();
        return (T) getPersonFullName.write(dragAndDropNodestartDragAndDropTransfer1, getnewpassword);
    }
}
