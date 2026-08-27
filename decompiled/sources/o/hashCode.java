package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class hashCode implements androidx.compose.ui.layout.LayoutModifier {
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final androidx.compose.ui.text.input.TransformedText RemoteActionCompatParcelizer;
    public final equals read;
    public final int write;

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.write, this.read.hashCode() * 31, 31);
        return this.IconCompatParcelizer.hashCode() + ((this.RemoteActionCompatParcelizer.hashCode() + iM) * 31);
    }

    public hashCode(equals equalsVar, int i, androidx.compose.ui.text.input.TransformedText transformedText, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.read = equalsVar;
        this.write = i;
        this.RemoteActionCompatParcelizer = transformedText;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hashCode) {
            hashCode hashcode = (hashCode) obj;
            if (this.read == hashcode.read && this.write == hashcode.write && this.RemoteActionCompatParcelizer.equals(hashcode.RemoteActionCompatParcelizer)) {
                Object[] objArr = {this.IconCompatParcelizer, hashcode.IconCompatParcelizer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.read + ", cursorOffset=" + this.write + ", transformedText=" + this.RemoteActionCompatParcelizer + ", textLayoutResultProvider=" + this.IconCompatParcelizer + ')';
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo2235measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(androidx.compose.ui.unit.Constraints.m3616copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int iMin = Math.min(placeableMo2209measureBRTryo0.getHeight(), androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), iMin, null, new RoundedCornerShapeKt(this, placeableMo2209measureBRTryo0, iMin), 4, null);
    }
}
