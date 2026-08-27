package o;

/* JADX INFO: loaded from: classes.dex */
public final class toOffset extends androidx.compose.ui.node.ModifierNodeElement<partialExpand> {
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final expand RemoteActionCompatParcelizer;
    public final boolean write = true;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        partialExpand partialexpand = new partialExpand();
        partialexpand.write = this.RemoteActionCompatParcelizer;
        partialexpand.RemoteActionCompatParcelizer = this.write;
        return partialexpand;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Boolean.hashCode(this.write) + (this.RemoteActionCompatParcelizer.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.IconCompatParcelizer.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        partialExpand partialexpand = (partialExpand) node;
        partialexpand.write = this.RemoteActionCompatParcelizer;
        partialexpand.RemoteActionCompatParcelizer = this.write;
    }

    public toOffset(expand expandVar, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.RemoteActionCompatParcelizer = expandVar;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        toOffset tooffset = obj instanceof toOffset ? (toOffset) obj : null;
        return tooffset != null && this.RemoteActionCompatParcelizer == tooffset.RemoteActionCompatParcelizer && this.write == tooffset.write;
    }
}
