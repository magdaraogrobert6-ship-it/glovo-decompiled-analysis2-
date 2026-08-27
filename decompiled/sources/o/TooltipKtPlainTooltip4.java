package o;

/* JADX INFO: loaded from: classes.dex */
public final class TooltipKtPlainTooltip4 extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.ParentDataModifierNode {
    public androidx.compose.ui.Alignment.Vertical read;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object modifyParentData(androidx.compose.ui.unit.Density density, Object obj) {
        TextFieldLayout textFieldLayout = obj instanceof TextFieldLayout ? (TextFieldLayout) obj : null;
        if (textFieldLayout == null) {
            textFieldLayout = new TextFieldLayout();
        }
        textFieldLayout.RemoteActionCompatParcelizer = new ModalBottomSheetKtModalBottomSheetContent7(this.read);
        return textFieldLayout;
    }
}
