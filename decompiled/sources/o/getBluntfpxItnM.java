package o;

/* JADX INFO: loaded from: classes.dex */
public final class getBluntfpxItnM {
    public final float IconCompatParcelizer;
    public final float RemoteActionCompatParcelizer;
    public final float read;
    public final float serializer;

    public final int hashCode() {
        return androidx.compose.ui.unit.Dp.m3679hashCodeimpl(this.read) + getBitmapFromCache.serializer(this.RemoteActionCompatParcelizer, getBitmapFromCache.serializer(this.serializer, androidx.compose.ui.unit.Dp.m3679hashCodeimpl(this.IconCompatParcelizer) * 31, 31), 31);
    }

    public getBluntfpxItnM(float f, float f2, float f3, float f4) {
        this.IconCompatParcelizer = f;
        this.serializer = f2;
        this.RemoteActionCompatParcelizer = f3;
        this.read = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof getBluntfpxItnM)) {
            return false;
        }
        getBluntfpxItnM getbluntfpxitnm = (getBluntfpxItnM) obj;
        if (androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.IconCompatParcelizer, getbluntfpxitnm.IconCompatParcelizer) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.serializer, getbluntfpxitnm.serializer) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.RemoteActionCompatParcelizer, getbluntfpxitnm.RemoteActionCompatParcelizer)) {
            return androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.read, getbluntfpxitnm.read);
        }
        return false;
    }
}
