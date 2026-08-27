package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNodeKt;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTargetNodeKt {
    public static final void invalidateFocusTarget(FocusTargetNode focusTargetNode) {
        DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().scheduleInvalidation(focusTargetNode);
    }
}
