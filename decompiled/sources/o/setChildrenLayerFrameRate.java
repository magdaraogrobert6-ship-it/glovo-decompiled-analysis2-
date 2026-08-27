package o;

/* JADX INFO: loaded from: classes.dex */
final class setChildrenLayerFrameRate extends androidx.compose.ui.node.ModifierNodeElement<setFrameRate> {
    public final androidx.compose.foundation.text.selection.TextFieldSelectionManager RemoteActionCompatParcelizer;
    public final getNormalNSsRyOo serializer;
    public final androidx.compose.foundation.text.LegacyTextFieldState write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new setFrameRate(this.serializer, this.write, this.RemoteActionCompatParcelizer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        return this.RemoteActionCompatParcelizer.hashCode() + ((this.write.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        setFrameRate setframerate = (setFrameRate) node;
        if (setframerate.isAttached()) {
            setframerate.write.stopInput();
            setframerate.write.IconCompatParcelizer(setframerate);
        }
        setframerate.write = this.serializer;
        if (setframerate.isAttached()) {
            getNormalNSsRyOo getnormalnssryoo = setframerate.write;
            if (getnormalnssryoo.serializer != null) {
                TriStateCheckbox.RemoteActionCompatParcelizer("Expected textInputModifierNode to be null");
            }
            getnormalnssryoo.serializer = setframerate;
        }
        setframerate.read = this.write;
        setframerate.IconCompatParcelizer = this.RemoteActionCompatParcelizer;
    }

    public setChildrenLayerFrameRate(getNormalNSsRyOo getnormalnssryoo, androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        this.serializer = getnormalnssryoo;
        this.write = legacyTextFieldState;
        this.RemoteActionCompatParcelizer = textFieldSelectionManager;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setChildrenLayerFrameRate)) {
            return false;
        }
        setChildrenLayerFrameRate setchildrenlayerframerate = (setChildrenLayerFrameRate) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, setchildrenlayerframerate.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, setchildrenlayerframerate.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, setchildrenlayerframerate.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.serializer + ", legacyTextFieldState=" + this.write + ", textFieldSelectionManager=" + this.RemoteActionCompatParcelizer + ')';
    }
}
