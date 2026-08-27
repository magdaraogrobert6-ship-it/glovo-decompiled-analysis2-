package o;

/* JADX INFO: loaded from: classes.dex */
public final class RadioButtonKt extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.ParentDataModifierNode {
    public androidx.compose.ui.Alignment.Horizontal serializer;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object modifyParentData(androidx.compose.ui.unit.Density density, Object obj) {
        TextFieldLayout textFieldLayout = obj instanceof TextFieldLayout ? (TextFieldLayout) obj : null;
        if (textFieldLayout == null) {
            textFieldLayout = new TextFieldLayout();
        }
        textFieldLayout.RemoteActionCompatParcelizer = new ModalBottomSheetKtModalBottomSheetContent41(this.serializer);
        return textFieldLayout;
    }
}
