package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class tailToHeadui implements Comparable {
    public final double IconCompatParcelizer;
    public final double serializer;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        tailToHeadui tailtoheadui = (tailToHeadui) obj;
        int iRemoteActionCompatParcelizer = ApproachLayoutModifierNodeImpl.RemoteActionCompatParcelizer(this.IconCompatParcelizer, tailtoheadui.IconCompatParcelizer);
        return iRemoteActionCompatParcelizer == 0 ? ApproachLayoutModifierNodeImpl.RemoteActionCompatParcelizer(this.serializer, tailtoheadui.serializer) : iRemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.IconCompatParcelizer);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.serializer);
        return (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public tailToHeadui(double d, double d2) {
        if (Double.isNaN(d) || d < -90.0d || d > 90.0d) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Latitude must be in the range of [-90, 90]");
            throw null;
        }
        if (Double.isNaN(d2) || d2 < -180.0d || d2 > 180.0d) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Longitude must be in the range of [-180, 180]");
            throw null;
        }
        this.IconCompatParcelizer = d;
        this.serializer = d2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeoPoint { latitude=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", longitude=");
        return ff$$ExternalSyntheticOutline0.m(this.serializer, " }", sb);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tailToHeadui)) {
            return false;
        }
        tailToHeadui tailtoheadui = (tailToHeadui) obj;
        return this.IconCompatParcelizer == tailtoheadui.IconCompatParcelizer && this.serializer == tailtoheadui.serializer;
    }
}
