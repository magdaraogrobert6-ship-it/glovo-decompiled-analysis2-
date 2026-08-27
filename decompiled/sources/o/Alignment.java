package o;

/* JADX INFO: loaded from: classes.dex */
final class Alignment extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.text.HeightInLinesNode> {
    public final int read;
    public final androidx.compose.ui.text.TextStyle serializer;
    public final int write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        androidx.compose.foundation.text.HeightInLinesNode heightInLinesNode = new androidx.compose.foundation.text.HeightInLinesNode();
        heightInLinesNode.MediaMetadataCompat = this.serializer;
        heightInLinesNode.read = this.read;
        heightInLinesNode.serializer = this.write;
        heightInLinesNode.MediaDescriptionCompat = -1;
        heightInLinesNode.write = -1;
        return heightInLinesNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        return (((iHashCode * 31) + this.read) * 31) + this.write;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("heightInLines");
        inspectorInfo.getProperties().set("minLines", Integer.valueOf(this.read));
        inspectorInfo.getProperties().set("maxLines", Integer.valueOf(this.write));
        inspectorInfo.getProperties().set("textStyle", this.serializer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        androidx.compose.foundation.text.HeightInLinesNode heightInLinesNode = (androidx.compose.foundation.text.HeightInLinesNode) node;
        androidx.compose.ui.text.TextStyle textStyle = heightInLinesNode.MediaMetadataCompat;
        androidx.compose.ui.text.TextStyle textStyle2 = this.serializer;
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{textStyle, textStyle2}, iWrite3)).booleanValue();
        int i = this.read;
        int i2 = this.write;
        if (zBooleanValue && heightInLinesNode.read == i && heightInLinesNode.serializer == i2) {
            return;
        }
        heightInLinesNode.MediaMetadataCompat = textStyle2;
        heightInLinesNode.read = i;
        heightInLinesNode.serializer = i2;
        heightInLinesNode.MediaSessionCompatQueueItem = androidx.compose.ui.text.TextStyleKt.resolveDefaults(textStyle2, androidx.compose.ui.node.DelegatableNodeKt.requireLayoutDirection(heightInLinesNode));
        heightInLinesNode.IconCompatParcelizer = true;
        androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(heightInLinesNode);
    }

    public Alignment(androidx.compose.ui.text.TextStyle textStyle, int i, int i2) {
        this.serializer = textStyle;
        this.read = i;
        this.write = i2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Alignment)) {
            return false;
        }
        Alignment alignment = (Alignment) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, alignment.serializer}, getCieXyz.write())).booleanValue() && this.read == alignment.read && this.write == alignment.write;
    }
}
