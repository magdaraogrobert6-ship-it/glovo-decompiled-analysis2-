package o;

/* JADX INFO: loaded from: classes.dex */
final class onPreScrollOzD1aCk extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.HoverableNode> {
    public final androidx.compose.foundation.interaction.MutableInteractionSourceImpl RemoteActionCompatParcelizer;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        androidx.compose.foundation.HoverableNode hoverableNode = new androidx.compose.foundation.HoverableNode();
        hoverableNode.write = this.RemoteActionCompatParcelizer;
        return hoverableNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() * 31;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("hoverable");
        inspectorInfo.getProperties().set("interactionSource", this.RemoteActionCompatParcelizer);
        inspectorInfo.getProperties().set(com.braze.models.FeatureFlag.ENABLED, Boolean.TRUE);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        androidx.compose.foundation.HoverableNode hoverableNode = (androidx.compose.foundation.HoverableNode) node;
        androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl = hoverableNode.write;
        androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl2 = this.RemoteActionCompatParcelizer;
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{mutableInteractionSourceImpl, mutableInteractionSourceImpl2}, iWrite3)).booleanValue()) {
            return;
        }
        hoverableNode.serializer();
        hoverableNode.write = mutableInteractionSourceImpl2;
    }

    public onPreScrollOzD1aCk(androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        this.RemoteActionCompatParcelizer = mutableInteractionSourceImpl;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onPreScrollOzD1aCk)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((onPreScrollOzD1aCk) obj).RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }
}
