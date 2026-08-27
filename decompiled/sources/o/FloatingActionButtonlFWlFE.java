package o;

/* JADX INFO: loaded from: classes.dex */
public final class FloatingActionButtonlFWlFE extends androidx.compose.ui.node.ModifierNodeElement<FloatingActionButtonKt> {
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final androidx.compose.ui.Alignment RemoteActionCompatParcelizer;
    public final boolean serializer;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        FloatingActionButtonKt floatingActionButtonKt = new FloatingActionButtonKt();
        floatingActionButtonKt.read = this.RemoteActionCompatParcelizer;
        floatingActionButtonKt.IconCompatParcelizer = this.serializer;
        return floatingActionButtonKt;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Boolean.hashCode(this.serializer) + (this.RemoteActionCompatParcelizer.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.IconCompatParcelizer.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        FloatingActionButtonKt floatingActionButtonKt = (FloatingActionButtonKt) node;
        floatingActionButtonKt.read = this.RemoteActionCompatParcelizer;
        floatingActionButtonKt.IconCompatParcelizer = this.serializer;
    }

    public FloatingActionButtonlFWlFE(androidx.compose.ui.Alignment alignment, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.RemoteActionCompatParcelizer = alignment;
        this.serializer = z;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        FloatingActionButtonlFWlFE floatingActionButtonlFWlFE = obj instanceof FloatingActionButtonlFWlFE ? (FloatingActionButtonlFWlFE) obj : null;
        if (floatingActionButtonlFWlFE == null) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, floatingActionButtonlFWlFE.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() && this.serializer == floatingActionButtonlFWlFE.serializer;
    }
}
