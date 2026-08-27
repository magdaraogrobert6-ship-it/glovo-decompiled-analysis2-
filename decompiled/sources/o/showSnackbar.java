package o;

/* JADX INFO: loaded from: classes.dex */
public final class showSnackbar extends androidx.compose.ui.node.ModifierNodeElement<SurfaceKt> {
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public final boolean serializer;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new SurfaceKt(this.IconCompatParcelizer, this.serializer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Boolean.hashCode(this.serializer) + (this.IconCompatParcelizer.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.RemoteActionCompatParcelizer.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        ((SurfaceKt) node).RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.serializer);
    }

    public showSnackbar(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, boolean z) {
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = z;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        showSnackbar showsnackbar = obj instanceof showSnackbar ? (showSnackbar) obj : null;
        return showsnackbar != null && this.IconCompatParcelizer == showsnackbar.IconCompatParcelizer && this.serializer == showsnackbar.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetPxModifier(offset=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", rtlAware=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.serializer, ')');
    }
}
