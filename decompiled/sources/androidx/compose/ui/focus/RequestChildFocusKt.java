package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestChildFocusKt {
    public static final boolean requestFocusForChildInRootBounds(DelegatableNode delegatableNode, int i, int i2, int i3, int i4) {
        FocusTargetModifierNode focusTargetModifierNodeFindFocusableNodeFromRect$ui = DelegatableNodeKt.requireOwner(delegatableNode).getRectManager().findFocusableNodeFromRect$ui(i, i2, i3, i4, DelegatableNodeKt.requireLayoutNode(delegatableNode).getSemanticsId());
        if (focusTargetModifierNodeFindFocusableNodeFromRect$ui != null) {
            return FocusTargetModifierNode.m382requestFocus3ESFkO8$default(focusTargetModifierNodeFindFocusableNodeFromRect$ui, 0, 1, null);
        }
        return false;
    }
}
