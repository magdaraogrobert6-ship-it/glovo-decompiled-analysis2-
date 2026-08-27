package o;

/* JADX INFO: loaded from: classes.dex */
public final class ZIndexNode extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.material3.MinimumInteractiveModifierNode> {
    public static final ZIndexNode serializer = new ZIndexNode();

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return setDimens.IconCompatParcelizer(this);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(androidx.compose.ui.Modifier.Node node) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new androidx.compose.material3.MinimumInteractiveModifierNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("minimumInteractiveComponentSize");
        inspectorInfo.getProperties().set("README", "Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller");
    }
}
