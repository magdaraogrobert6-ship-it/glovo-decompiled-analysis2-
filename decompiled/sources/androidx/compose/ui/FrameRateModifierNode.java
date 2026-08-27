package androidx.compose.ui;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class FrameRateModifierNode extends Modifier.Node implements TraversableNode, DrawModifierNode {
    public static final int $stable = 8;
    private float frameRate;
    private boolean shouldUpdateFrameRates = true;
    private final String traverseKey = "TRAVERSAL_NODE_KEY_FRAME_RATE_MODIFIER_NODE";

    public final float getFrameRate() {
        return this.frameRate;
    }

    public final boolean getShouldUpdateFrameRates() {
        return this.shouldUpdateFrameRates;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.shouldUpdateFrameRates = true;
    }

    public final void setFrameRate(float f) {
        this.frameRate = f;
    }

    public final void setShouldUpdateFrameRates(boolean z) {
        this.shouldUpdateFrameRates = z;
    }

    public FrameRateModifierNode(float f) {
        this.frameRate = f;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        OwnedLayer layer;
        if (this.shouldUpdateFrameRates) {
            NodeCoordinator coordinator$ui = getCoordinator$ui();
            if (coordinator$ui != null && (layer = coordinator$ui.getLayer()) != null) {
                layer.setFrameRate(this.frameRate);
            }
            NodeCoordinator coordinator$ui2 = getCoordinator$ui();
            setChildrenLayerFrameRate(coordinator$ui2 != null ? coordinator$ui2.getWrapped$ui() : null, this.frameRate);
            this.shouldUpdateFrameRates = false;
        }
        contentDrawScope.drawContent();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        FrameRateModifierNode frameRateModifierNode = (FrameRateModifierNode) TraversableNodeKt.findNearestAncestor(this);
        if (frameRateModifierNode != null) {
            NodeCoordinator coordinator$ui = getCoordinator$ui();
            setChildrenLayerFrameRate(coordinator$ui != null ? coordinator$ui.getWrapped$ui() : null, frameRateModifierNode.frameRate);
        } else {
            NodeCoordinator coordinator$ui2 = getCoordinator$ui();
            setChildrenLayerFrameRate(coordinator$ui2 != null ? coordinator$ui2.getWrapped$ui() : null, 0.0f);
        }
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public String getTraverseKey() {
        return this.traverseKey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setChildrenLayerFrameRate(NodeCoordinator nodeCoordinator, float f) {
        LayoutNode layoutNode;
        List<LayoutNode> children$ui;
        OwnedLayer layer;
        NodeCoordinator wrapped$ui = nodeCoordinator;
        while (true) {
            if (wrapped$ui == null) {
                if (nodeCoordinator == null) {
                    nodeCoordinator = getCoordinator$ui();
                }
                if (nodeCoordinator == null || (layoutNode = nodeCoordinator.getLayoutNode()) == null || (children$ui = layoutNode.getChildren$ui()) == null) {
                    return;
                }
                int size = children$ui.size();
                for (int i = 0; i < size; i++) {
                    setChildrenLayerFrameRate(children$ui.get(i).getOuterCoordinator$ui(), f);
                }
                return;
            }
            if (nodeCoordinator != null && (layer = nodeCoordinator.getLayer()) != null) {
                if (layer.getFrameRate() != 0.0f && !layer.isFrameRateFromParent()) {
                    return;
                }
                layer.setFrameRate(f);
                layer.setFrameRateFromParent((f == 0.0f ? 1 : 0) ^ 1);
            }
            wrapped$ui = wrapped$ui.getWrapped$ui();
        }
    }
}
