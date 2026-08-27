package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class BlockDropShadowElement extends ModifierNodeElement<BlockDropShadowNode> {
    public static final int $stable = 0;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM block;
    private final Shape shape;

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getBlock() {
        return this.block;
    }

    public final Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BlockDropShadowNode create() {
        return new BlockDropShadowNode(this.shape, this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.block.hashCode() + (this.shape.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dropShadow");
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("block", this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BlockDropShadowNode blockDropShadowNode) {
        blockDropShadowNode.update(this.shape, this.block);
    }

    public BlockDropShadowElement(Shape shape, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.shape = shape;
        this.block = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockDropShadowElement)) {
            return false;
        }
        BlockDropShadowElement blockDropShadowElement = (BlockDropShadowElement) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shape, blockDropShadowElement.shape}, getCieXyz.write())).booleanValue() && this.block == blockDropShadowElement.block;
    }
}
