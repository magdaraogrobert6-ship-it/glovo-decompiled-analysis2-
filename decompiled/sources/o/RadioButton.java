package o;

/* JADX INFO: loaded from: classes.dex */
public final class RadioButton extends androidx.compose.ui.node.ModifierNodeElement<RadioButtonKt> {
    public final androidx.compose.ui.Alignment.Horizontal read;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        RadioButtonKt radioButtonKt = new RadioButtonKt();
        radioButtonKt.serializer = this.read;
        return radioButtonKt;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.read.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("align");
        inspectorInfo.setValue(this.read);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        ((RadioButtonKt) node).serializer = this.read;
    }

    public RadioButton(androidx.compose.ui.Alignment.Horizontal horizontal) {
        this.read = horizontal;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        RadioButton radioButton = obj instanceof RadioButton ? (RadioButton) obj : null;
        if (radioButton == null) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, radioButton.read}, getCieXyz.write())).booleanValue();
    }
}
