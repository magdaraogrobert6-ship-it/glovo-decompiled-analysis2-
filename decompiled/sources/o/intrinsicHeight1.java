package o;

/* JADX INFO: loaded from: classes.dex */
public final class intrinsicHeight1 extends calculateHeightmKXJcVc1 {
    public androidx.compose.ui.layout.AlignmentLine RemoteActionCompatParcelizer;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object modifyParentData(androidx.compose.ui.unit.Density density, Object obj) {
        TextFieldLayout textFieldLayout = obj instanceof TextFieldLayout ? (TextFieldLayout) obj : null;
        if (textFieldLayout == null) {
            textFieldLayout = new TextFieldLayout();
        }
        textFieldLayout.RemoteActionCompatParcelizer = new ModalBottomSheetKtModalBottomSheetsettleToDismiss111(new FloatingActionButtonElevationAnimatable(this.RemoteActionCompatParcelizer));
        return textFieldLayout;
    }
}
