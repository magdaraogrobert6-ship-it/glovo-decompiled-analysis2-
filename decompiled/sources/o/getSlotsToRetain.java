package o;

/* JADX INFO: loaded from: classes.dex */
final class getSlotsToRetain extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.FocusableNode> {
    public final androidx.compose.foundation.interaction.MutableInteractionSourceImpl read;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new androidx.compose.foundation.FocusableNode(this.read, androidx.compose.ui.focus.Focusability.Companion.m411getAlwaysLCbbffg(), null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusable");
        inspectorInfo.getProperties().set(com.braze.models.FeatureFlag.ENABLED, Boolean.TRUE);
        inspectorInfo.getProperties().set("interactionSource", this.read);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        ((androidx.compose.foundation.FocusableNode) node).RemoteActionCompatParcelizer(this.read);
    }

    public getSlotsToRetain(androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        this.read = mutableInteractionSourceImpl;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSlotsToRetain)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, ((getSlotsToRetain) obj).read}, getCieXyz.write())).booleanValue();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl = this.read;
        if (mutableInteractionSourceImpl != null) {
            return mutableInteractionSourceImpl.hashCode();
        }
        return 0;
    }
}
