package o;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class isAutofillable extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.material3.ThumbNode> {
    public final width read;
    public final androidx.compose.foundation.interaction.MutableInteractionSourceImpl serializer;
    public final boolean write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        androidx.compose.material3.ThumbNode thumbNode = new androidx.compose.material3.ThumbNode();
        thumbNode.write = this.serializer;
        thumbNode.serializer = this.write;
        thumbNode.read = this.read;
        thumbNode.IconCompatParcelizer = Float.NaN;
        thumbNode.RemoteActionCompatParcelizer = Float.NaN;
        return thumbNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.read.hashCode() + d$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.write);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        androidx.compose.material3.ThumbNode thumbNode = (androidx.compose.material3.ThumbNode) node;
        thumbNode.write = this.serializer;
        boolean z = thumbNode.serializer;
        boolean z2 = this.write;
        if (z != z2) {
            androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(thumbNode);
        }
        thumbNode.serializer = z2;
        thumbNode.read = this.read;
        if (thumbNode.MediaMetadataCompat == null && !Float.isNaN(thumbNode.RemoteActionCompatParcelizer)) {
            thumbNode.MediaMetadataCompat = mainAxisk4lQ0M.write(thumbNode.RemoteActionCompatParcelizer);
        }
        if (thumbNode.RatingCompat != null || Float.isNaN(thumbNode.IconCompatParcelizer)) {
            return;
        }
        thumbNode.RatingCompat = mainAxisk4lQ0M.write(thumbNode.IconCompatParcelizer);
    }

    public isAutofillable(androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z, width widthVar) {
        this.serializer = mutableInteractionSourceImpl;
        this.write = z;
        this.read = widthVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isAutofillable)) {
            return false;
        }
        isAutofillable isautofillable = (isAutofillable) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, isautofillable.serializer}, getCieXyz.write())).booleanValue() || this.write != isautofillable.write) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, isautofillable.read}, getCieXyz.write())).booleanValue();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("switchThumb");
        inspectorInfo.getProperties().set("interactionSource", this.serializer);
        af$$ExternalSyntheticOutline1.m(this.write, inspectorInfo.getProperties(), "checked", inspectorInfo).set("animationSpec", this.read);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.serializer + ", checked=" + this.write + ", animationSpec=" + this.read + ')';
    }
}
