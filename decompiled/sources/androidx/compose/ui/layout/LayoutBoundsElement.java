package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutBoundsElement extends ModifierNodeElement<LayoutBoundsNode> {
    public static final int $stable = 0;
    private final LayoutBoundsHolder holder;

    public final LayoutBoundsHolder component1() {
        return this.holder;
    }

    public final LayoutBoundsHolder getHolder() {
        return this.holder;
    }

    public final LayoutBoundsElement copy(LayoutBoundsHolder layoutBoundsHolder) {
        return new LayoutBoundsElement(layoutBoundsHolder);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LayoutBoundsNode create() {
        return new LayoutBoundsNode(this.holder);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.holder.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("layoutBounds");
        inspectorInfo.getProperties().set("holder", this.holder);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LayoutBoundsNode layoutBoundsNode) {
        layoutBoundsNode.setHolder(this.holder);
        layoutBoundsNode.forceUpdate();
    }

    public LayoutBoundsElement(LayoutBoundsHolder layoutBoundsHolder) {
        this.holder = layoutBoundsHolder;
    }

    public static /* synthetic */ LayoutBoundsElement copy$default(LayoutBoundsElement layoutBoundsElement, LayoutBoundsHolder layoutBoundsHolder, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutBoundsHolder = layoutBoundsElement.holder;
        }
        return layoutBoundsElement.copy(layoutBoundsHolder);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LayoutBoundsElement)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.holder, ((LayoutBoundsElement) obj).holder}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "LayoutBoundsElement(holder=" + this.holder + ')';
    }
}
