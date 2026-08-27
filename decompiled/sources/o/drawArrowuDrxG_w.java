package o;

/* JADX INFO: loaded from: classes.dex */
public final class drawArrowuDrxG_w extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.DisplayingDisappearingItemsNode> {
    public final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator IconCompatParcelizer;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.DisplayingDisappearingItemsNode displayingDisappearingItemsNode = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.DisplayingDisappearingItemsNode();
        displayingDisappearingItemsNode.RemoteActionCompatParcelizer = this.IconCompatParcelizer;
        return displayingDisappearingItemsNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("DisplayingDisappearingItemsElement");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.DisplayingDisappearingItemsNode displayingDisappearingItemsNode = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.DisplayingDisappearingItemsNode) node;
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator = displayingDisappearingItemsNode.RemoteActionCompatParcelizer;
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator2 = this.IconCompatParcelizer;
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{lazyLayoutItemAnimator, lazyLayoutItemAnimator2}, iWrite3)).booleanValue() || !displayingDisappearingItemsNode.getNode().isAttached()) {
            return;
        }
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator3 = displayingDisappearingItemsNode.RemoteActionCompatParcelizer;
        lazyLayoutItemAnimator3.RemoteActionCompatParcelizer();
        lazyLayoutItemAnimator3.read = null;
        lazyLayoutItemAnimator2.getClass();
        displayingDisappearingItemsNode.RemoteActionCompatParcelizer = lazyLayoutItemAnimator2;
    }

    public drawArrowuDrxG_w(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator) {
        this.IconCompatParcelizer = lazyLayoutItemAnimator;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drawArrowuDrxG_w)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, ((drawArrowuDrxG_w) obj).IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.IconCompatParcelizer + ')';
    }
}
