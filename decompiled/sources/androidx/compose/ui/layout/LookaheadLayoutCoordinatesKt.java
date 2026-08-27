package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class LookaheadLayoutCoordinatesKt {
    public static final LookaheadDelegate getRootLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        LayoutNode layoutNode = lookaheadDelegate.getLayoutNode();
        while (true) {
            LayoutNode parent$ui = layoutNode.getParent$ui();
            if ((parent$ui != null ? parent$ui.getLookaheadRoot$ui() : null) == null) {
                LookaheadDelegate lookaheadDelegate2 = layoutNode.getOuterCoordinator$ui().getLookaheadDelegate();
                lookaheadDelegate2.getClass();
                return lookaheadDelegate2;
            }
            LayoutNode parent$ui2 = layoutNode.getParent$ui();
            LayoutNode lookaheadRoot$ui = parent$ui2 != null ? parent$ui2.getLookaheadRoot$ui() : null;
            lookaheadRoot$ui.getClass();
            if (lookaheadRoot$ui.isVirtualLookaheadRoot$ui()) {
                layoutNode = layoutNode.getParent$ui();
                layoutNode.getClass();
            } else {
                LayoutNode parent$ui3 = layoutNode.getParent$ui();
                parent$ui3.getClass();
                layoutNode = parent$ui3.getLookaheadRoot$ui();
                layoutNode.getClass();
            }
        }
    }
}
