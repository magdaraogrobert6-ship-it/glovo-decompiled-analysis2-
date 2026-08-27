package o;

/* JADX INFO: loaded from: classes.dex */
public final class SnackbarsDKtq54 extends androidx.compose.ui.node.ModifierNodeElement<SnackbarKt> {
    public final OneRowSnackbarkKq0p4A IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer = true;
    public final float read;
    public final float write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        SnackbarKt snackbarKt = new SnackbarKt();
        snackbarKt.RemoteActionCompatParcelizer = this.read;
        snackbarKt.read = this.write;
        snackbarKt.write = this.RemoteActionCompatParcelizer;
        return snackbarKt;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return Boolean.hashCode(this.RemoteActionCompatParcelizer) + getBitmapFromCache.serializer(this.write, androidx.compose.ui.unit.Dp.m3679hashCodeimpl(this.read) * 31, 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.IconCompatParcelizer.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        SnackbarKt snackbarKt = (SnackbarKt) node;
        float f = snackbarKt.RemoteActionCompatParcelizer;
        float f2 = this.read;
        boolean zM3678equalsimpl0 = androidx.compose.ui.unit.Dp.m3678equalsimpl0(f, f2);
        float f3 = this.write;
        boolean z = this.RemoteActionCompatParcelizer;
        if (!zM3678equalsimpl0 || !androidx.compose.ui.unit.Dp.m3678equalsimpl0(snackbarKt.read, f3) || snackbarKt.write != z) {
            androidx.compose.ui.node.LayoutModifierNodeKt.invalidatePlacement(snackbarKt);
        }
        snackbarKt.RemoteActionCompatParcelizer = f2;
        snackbarKt.read = f3;
        snackbarKt.write = z;
    }

    public SnackbarsDKtq54(float f, float f2, OneRowSnackbarkKq0p4A oneRowSnackbarkKq0p4A) {
        this.read = f;
        this.write = f2;
        this.IconCompatParcelizer = oneRowSnackbarkKq0p4A;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        SnackbarsDKtq54 snackbarsDKtq54 = obj instanceof SnackbarsDKtq54 ? (SnackbarsDKtq54) obj : null;
        return snackbarsDKtq54 != null && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.read, snackbarsDKtq54.read) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.write, snackbarsDKtq54.write) && this.RemoteActionCompatParcelizer == snackbarsDKtq54.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetModifierElement(x=");
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.read, ", y=", sb);
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.write, ", rtlAware=", sb);
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.RemoteActionCompatParcelizer, ')');
    }
}
