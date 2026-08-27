package o;

/* JADX INFO: loaded from: classes.dex */
public final class show extends androidx.compose.ui.node.ModifierNodeElement<FadeInFadeOutWithScale> {
    public final float IconCompatParcelizer;
    public final boolean write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        FadeInFadeOutWithScale fadeInFadeOutWithScale = new FadeInFadeOutWithScale();
        fadeInFadeOutWithScale.serializer = this.IconCompatParcelizer;
        fadeInFadeOutWithScale.RemoteActionCompatParcelizer = this.write;
        return fadeInFadeOutWithScale;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Boolean.hashCode(this.write) + (Float.hashCode(this.IconCompatParcelizer) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        FadeInFadeOutWithScale fadeInFadeOutWithScale = (FadeInFadeOutWithScale) node;
        fadeInFadeOutWithScale.serializer = this.IconCompatParcelizer;
        fadeInFadeOutWithScale.RemoteActionCompatParcelizer = this.write;
    }

    public show(float f, boolean z) {
        this.IconCompatParcelizer = f;
        this.write = z;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("weight");
        float f = this.IconCompatParcelizer;
        inspectorInfo.setValue(Float.valueOf(f));
        inspectorInfo.getProperties().set("weight", Float.valueOf(f));
        inspectorInfo.getProperties().set("fill", Boolean.valueOf(this.write));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        show showVar = obj instanceof show ? (show) obj : null;
        return showVar != null && this.IconCompatParcelizer == showVar.IconCompatParcelizer && this.write == showVar.write;
    }
}
