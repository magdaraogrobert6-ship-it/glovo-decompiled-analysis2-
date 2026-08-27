package o;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class BasicTextRWo7tUw<T> extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.gestures.AnchoredDraggableNode> {
    public final SelectionHandleIcon IconCompatParcelizer;
    public final boolean read = true;
    public final androidx.compose.foundation.gestures.AnchoredDraggableState write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new androidx.compose.foundation.gestures.AnchoredDraggableNode(this.write, this.IconCompatParcelizer, this.read);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        return d$$ExternalSyntheticOutline0.m((this.IconCompatParcelizer.hashCode() + (iHashCode * 31)) * 31, 28629151, this.read);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("anchoredDraggable");
        inspectorInfo.getProperties().set("state", this.write);
        inspectorInfo.getProperties().set(com.braze.models.inappmessage.InAppMessageBase.ORIENTATION, this.IconCompatParcelizer);
        af$$ExternalSyntheticOutline1.m(this.read, inspectorInfo.getProperties(), com.braze.models.FeatureFlag.ENABLED, inspectorInfo).set("reverseDirection", null);
        inspectorInfo.getProperties().set("interactionSource", null);
        inspectorInfo.getProperties().set("startDragImmediately", null);
        inspectorInfo.getProperties().set("overscrollEffect", null);
        inspectorInfo.getProperties().set("flingBehavior", null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        ((androidx.compose.foundation.gestures.AnchoredDraggableNode) node).write(this.write, this.IconCompatParcelizer, this.read);
    }

    public BasicTextRWo7tUw(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState, SelectionHandleIcon selectionHandleIcon) {
        this.write = anchoredDraggableState;
        this.IconCompatParcelizer = selectionHandleIcon;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicTextRWo7tUw)) {
            return false;
        }
        BasicTextRWo7tUw basicTextRWo7tUw = (BasicTextRWo7tUw) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, basicTextRWo7tUw.write}, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer == basicTextRWo7tUw.IconCompatParcelizer && this.read == basicTextRWo7tUw.read;
    }
}
