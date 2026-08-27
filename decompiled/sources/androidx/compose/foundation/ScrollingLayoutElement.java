package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import bo.app.d$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLayoutElement extends ModifierNodeElement<ScrollNode> {
    public final ScrollState IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        ScrollNode scrollNode = new ScrollNode();
        scrollNode.write = this.IconCompatParcelizer;
        scrollNode.IconCompatParcelizer = this.RemoteActionCompatParcelizer;
        return scrollNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Boolean.hashCode(this.RemoteActionCompatParcelizer) + d$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, false);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ScrollNode scrollNode = (ScrollNode) node;
        scrollNode.write = this.IconCompatParcelizer;
        scrollNode.IconCompatParcelizer = this.RemoteActionCompatParcelizer;
    }

    public ScrollingLayoutElement(ScrollState scrollState, boolean z) {
        this.IconCompatParcelizer = scrollState;
        this.RemoteActionCompatParcelizer = z;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("scroll");
        inspectorInfo.getProperties().set("state", this.IconCompatParcelizer);
        inspectorInfo.getProperties().set("reverseScrolling", Boolean.FALSE);
        inspectorInfo.getProperties().set("isVertical", Boolean.valueOf(this.RemoteActionCompatParcelizer));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, scrollingLayoutElement.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer == scrollingLayoutElement.RemoteActionCompatParcelizer;
    }
}
