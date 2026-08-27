package androidx.compose.ui.node;

import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutModifierNodeKt {
    public static final void invalidateLayer(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.m2391requireCoordinator64DMado(layoutModifierNode, NodeKind.m2551constructorimpl(2)).invalidateLayer();
    }

    public static final void invalidateMeasurement(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).invalidateMeasurements$ui();
    }

    public static final void remeasureSync(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).forceRemeasure();
    }

    public static final void updateLayerBlock(LayoutModifierNode layoutModifierNode, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        NodeCoordinator wrapped$ui;
        if (layoutModifierNode.getNode().isAttached() && (wrapped$ui = DelegatableNodeKt.m2391requireCoordinator64DMado(layoutModifierNode, NodeKind.m2551constructorimpl(2)).getWrapped$ui()) != null) {
            wrapped$ui.updateLayerBlock(r8lambdaunavo3sxub_pc9xroryotnrlvsm, true);
        }
    }

    public static final void invalidatePlacement(LayoutModifierNode layoutModifierNode) {
        LayoutNode.requestRelayout$ui$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, 1, null);
    }

    public static final void requestRemeasure(LayoutModifierNode layoutModifierNode) {
        LayoutNode.requestRemeasure$ui$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, false, false, 7, null);
    }
}
