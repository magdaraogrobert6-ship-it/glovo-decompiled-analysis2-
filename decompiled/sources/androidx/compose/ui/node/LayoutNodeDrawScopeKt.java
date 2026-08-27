package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutNodeDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node nextDrawNode(DelegatableNode delegatableNode) {
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(4);
        int iM2551constructorimpl2 = NodeKind.m2551constructorimpl(2);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null || (child$ui.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
            return null;
        }
        while (child$ui != null && (child$ui.getKindSet$ui() & iM2551constructorimpl2) == 0) {
            if ((child$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                return child$ui;
            }
            child$ui = child$ui.getChild$ui();
        }
        return null;
    }
}
