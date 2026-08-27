package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class measureAndLayoutdefault extends accesssetPerformMeasureConstraintsp {
    public final String IconCompatParcelizer;
    public final String serializer;

    public final int hashCode() {
        return ((this.IconCompatParcelizer.hashCode() ^ 1000003) * 1000003) ^ this.serializer.hashCode();
    }

    public measureAndLayoutdefault(String str, String str2) {
        this.IconCompatParcelizer = str;
        this.serializer = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accesssetPerformMeasureConstraintsp)) {
            return false;
        }
        measureAndLayoutdefault measureandlayoutdefault = (measureAndLayoutdefault) ((accesssetPerformMeasureConstraintsp) obj);
        return this.IconCompatParcelizer.equals(measureandlayoutdefault.IconCompatParcelizer) && this.serializer.equals(measureandlayoutdefault.serializer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", value=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.serializer, "}");
    }
}
