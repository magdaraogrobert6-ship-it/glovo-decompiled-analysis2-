package o;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class SelectionGestures_androidKt extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.gestures.ScrollableNode> {
    public final boolean IconCompatParcelizer;
    public final SelectionHandleIcon RemoteActionCompatParcelizer;
    public final getAdjustedCoordinatesk4lQ0M read;
    public final boolean serializer;
    public final androidx.compose.foundation.interaction.MutableInteractionSourceImpl write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        ((androidx.compose.foundation.gestures.ScrollableNode) node).read(null, null, null, this.RemoteActionCompatParcelizer, this.read, this.write, this.serializer, this.IconCompatParcelizer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new androidx.compose.foundation.gestures.ScrollableNode(null, null, null, this.RemoteActionCompatParcelizer, this.read, this.write, this.serializer, this.IconCompatParcelizer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((this.RemoteActionCompatParcelizer.hashCode() + (this.read.hashCode() * 31)) * 961, 31, this.serializer), 961, this.IconCompatParcelizer);
        androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl = this.write;
        return (iM + (mutableInteractionSourceImpl != null ? mutableInteractionSourceImpl.hashCode() : 0)) * 31;
    }

    public SelectionGestures_androidKt(getAdjustedCoordinatesk4lQ0M getadjustedcoordinatesk4lq0m, SelectionHandleIcon selectionHandleIcon, boolean z, boolean z2, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        this.read = getadjustedcoordinatesk4lq0m;
        this.RemoteActionCompatParcelizer = selectionHandleIcon;
        this.serializer = z;
        this.IconCompatParcelizer = z2;
        this.write = mutableInteractionSourceImpl;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionGestures_androidKt)) {
            return false;
        }
        SelectionGestures_androidKt selectionGestures_androidKt = (SelectionGestures_androidKt) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, selectionGestures_androidKt.read}, getCieXyz.write())).booleanValue() || this.RemoteActionCompatParcelizer != selectionGestures_androidKt.RemoteActionCompatParcelizer || this.serializer != selectionGestures_androidKt.serializer || this.IconCompatParcelizer != selectionGestures_androidKt.IconCompatParcelizer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, selectionGestures_androidKt.write}, getCieXyz.write())).booleanValue();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("scrollable");
        inspectorInfo.getProperties().set(com.braze.models.inappmessage.InAppMessageBase.ORIENTATION, this.RemoteActionCompatParcelizer);
        inspectorInfo.getProperties().set("state", this.read);
        inspectorInfo.getProperties().set("overscrollEffect", null);
        af$$ExternalSyntheticOutline1.m(this.IconCompatParcelizer, af$$ExternalSyntheticOutline1.m(this.serializer, inspectorInfo.getProperties(), com.braze.models.FeatureFlag.ENABLED, inspectorInfo), "reverseDirection", inspectorInfo).set("flingBehavior", null);
        inspectorInfo.getProperties().set("interactionSource", this.write);
        inspectorInfo.getProperties().set("bringIntoViewSpec", null);
    }
}
