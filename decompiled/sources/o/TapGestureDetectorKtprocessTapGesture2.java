package o;

/* JADX INFO: loaded from: classes.dex */
public final class TapGestureDetectorKtprocessTapGesture2 extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.animation.SizeAnimationModifierNode> {
    public final Arrangement IconCompatParcelizer;
    public final androidx.compose.ui.Alignment write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new androidx.compose.animation.SizeAnimationModifierNode(this.IconCompatParcelizer, this.write);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (this.write.hashCode() + (this.IconCompatParcelizer.hashCode() * 31)) * 31;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateContentSize");
        inspectorInfo.getProperties().set("animationSpec", this.IconCompatParcelizer);
        inspectorInfo.getProperties().set("alignment", this.write);
        inspectorInfo.getProperties().set("finishedListener", null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        androidx.compose.animation.SizeAnimationModifierNode sizeAnimationModifierNode = (androidx.compose.animation.SizeAnimationModifierNode) node;
        sizeAnimationModifierNode.write = this.IconCompatParcelizer;
        sizeAnimationModifierNode.serializer = this.write;
    }

    public TapGestureDetectorKtprocessTapGesture2(Arrangement arrangement, androidx.compose.ui.Alignment alignment) {
        this.IconCompatParcelizer = arrangement;
        this.write = alignment;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (!(obj instanceof TapGestureDetectorKtprocessTapGesture2)) {
            return false;
        }
        TapGestureDetectorKtprocessTapGesture2 tapGestureDetectorKtprocessTapGesture2 = (TapGestureDetectorKtprocessTapGesture2) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{tapGestureDetectorKtprocessTapGesture2.IconCompatParcelizer, this.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{tapGestureDetectorKtprocessTapGesture2.write, this.write}, getCieXyz.write())).booleanValue();
    }
}
