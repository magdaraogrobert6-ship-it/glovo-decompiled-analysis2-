package o;

/* JADX INFO: loaded from: classes.dex */
public final class getBottomRightannotations implements SourceInformationKt, androidx.compose.ui.platform.InspectableValue {
    public final float RemoteActionCompatParcelizer;

    @Override // o.SourceInformationKt
    public final float IconCompatParcelizer(long j, androidx.compose.ui.unit.Density density) {
        return density.mo48toPx0680j_4(this.RemoteActionCompatParcelizer);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final Object getValueOverride() {
        return androidx.compose.ui.unit.Dp.m3671boximpl(this.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return androidx.compose.ui.unit.Dp.m3679hashCodeimpl(this.RemoteActionCompatParcelizer);
    }

    public getBottomRightannotations(float f) {
        this.RemoteActionCompatParcelizer = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getBottomRightannotations) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.RemoteActionCompatParcelizer, ((getBottomRightannotations) obj).RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return "CornerSize(size = " + this.RemoteActionCompatParcelizer + ".dp)";
    }
}
