package o;

/* JADX INFO: loaded from: classes.dex */
public final class FrameRateCategoryCompanion extends androidx.compose.ui.node.ModifierNodeElement<frameRate> {
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new frameRate(this.serializer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        ((frameRate) node).RemoteActionCompatParcelizer = this.serializer;
    }

    public FrameRateCategoryCompanion(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("stylusHandwriting");
        inspectorInfo.getProperties().set("onHandwritingSlopExceeded", this.serializer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FrameRateCategoryCompanion) {
            return this.serializer == ((FrameRateCategoryCompanion) obj).serializer;
        }
        return false;
    }
}
