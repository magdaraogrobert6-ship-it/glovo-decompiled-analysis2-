package o;

/* JADX INFO: loaded from: classes.dex */
public final class hide extends androidx.compose.ui.node.ModifierNodeElement<SnackbarHostKtFadeInFadeOutWithScale11> {
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer = true;
    public final expand write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        SnackbarHostKtFadeInFadeOutWithScale11 snackbarHostKtFadeInFadeOutWithScale11 = new SnackbarHostKtFadeInFadeOutWithScale11();
        snackbarHostKtFadeInFadeOutWithScale11.IconCompatParcelizer = this.write;
        snackbarHostKtFadeInFadeOutWithScale11.write = this.RemoteActionCompatParcelizer;
        return snackbarHostKtFadeInFadeOutWithScale11;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Boolean.hashCode(this.RemoteActionCompatParcelizer) + (this.write.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.IconCompatParcelizer.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        SnackbarHostKtFadeInFadeOutWithScale11 snackbarHostKtFadeInFadeOutWithScale11 = (SnackbarHostKtFadeInFadeOutWithScale11) node;
        snackbarHostKtFadeInFadeOutWithScale11.IconCompatParcelizer = this.write;
        snackbarHostKtFadeInFadeOutWithScale11.write = this.RemoteActionCompatParcelizer;
    }

    public hide(expand expandVar, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.write = expandVar;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        hide hideVar = obj instanceof hide ? (hide) obj : null;
        return hideVar != null && this.write == hideVar.write && this.RemoteActionCompatParcelizer == hideVar.RemoteActionCompatParcelizer;
    }
}
