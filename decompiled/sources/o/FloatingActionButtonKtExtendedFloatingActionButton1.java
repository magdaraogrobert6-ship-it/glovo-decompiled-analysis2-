package o;

/* JADX INFO: loaded from: classes.dex */
public final class FloatingActionButtonKtExtendedFloatingActionButton1 extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.layout.AspectRatioNode> {
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public final float read = 0.75f;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        androidx.compose.foundation.layout.AspectRatioNode aspectRatioNode = new androidx.compose.foundation.layout.AspectRatioNode();
        aspectRatioNode.write = this.read;
        return aspectRatioNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.read) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.RemoteActionCompatParcelizer.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        ((androidx.compose.foundation.layout.AspectRatioNode) node).write = this.read;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        FloatingActionButtonKtExtendedFloatingActionButton1 floatingActionButtonKtExtendedFloatingActionButton1 = obj instanceof FloatingActionButtonKtExtendedFloatingActionButton1 ? (FloatingActionButtonKtExtendedFloatingActionButton1) obj : null;
        if (floatingActionButtonKtExtendedFloatingActionButton1 == null || this.read != floatingActionButtonKtExtendedFloatingActionButton1.read) {
            return false;
        }
        ((FloatingActionButtonKtExtendedFloatingActionButton1) obj).getClass();
        return true;
    }

    public FloatingActionButtonKtExtendedFloatingActionButton1(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }
}
