package o;

import androidx.compose.ui.platform.PlatformTextInputModifierNode;

/* JADX INFO: loaded from: classes.dex */
public final class setFrameRate extends androidx.compose.ui.Modifier.Node implements PlatformTextInputModifierNode, androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.GlobalPositionAwareModifierNode, KeepScreenOnNode {
    public androidx.compose.foundation.text.selection.TextFieldSelectionManager IconCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(null);
    public androidx.compose.foundation.text.LegacyTextFieldState read;
    public getNormalNSsRyOo write;

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        getNormalNSsRyOo getnormalnssryoo = this.write;
        if (getnormalnssryoo.serializer != null) {
            TriStateCheckbox.RemoteActionCompatParcelizer("Expected textInputModifierNode to be null");
        }
        getnormalnssryoo.serializer = this;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.write.IconCompatParcelizer(this);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        ((onShowTranslationui) this.RemoteActionCompatParcelizer).setValue(layoutCoordinates);
    }

    public setFrameRate(getNormalNSsRyOo getnormalnssryoo, androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        this.write = getnormalnssryoo;
        this.read = legacyTextFieldState;
        this.IconCompatParcelizer = textFieldSelectionManager;
    }
}
