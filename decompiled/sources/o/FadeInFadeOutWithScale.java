package o;

/* JADX INFO: loaded from: classes.dex */
public final class FadeInFadeOutWithScale extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.ParentDataModifierNode {
    public boolean RemoteActionCompatParcelizer;
    public float serializer;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object modifyParentData(androidx.compose.ui.unit.Density density, Object obj) {
        TextFieldLayout textFieldLayout = obj instanceof TextFieldLayout ? (TextFieldLayout) obj : null;
        if (textFieldLayout == null) {
            textFieldLayout = new TextFieldLayout();
        }
        textFieldLayout.serializer = this.serializer;
        textFieldLayout.write = this.RemoteActionCompatParcelizer;
        return textFieldLayout;
    }
}
