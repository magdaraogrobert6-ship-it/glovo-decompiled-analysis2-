package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class o7ExternalSyntheticLambda3 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final double read;
    public final double write;

    public o7ExternalSyntheticLambda3(double d, double d2) {
        this.read = d;
        this.write = d2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 39;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Double.hashCode(this.write) + (Double.hashCode(this.read) * 31);
        int i4 = IconCompatParcelizer + 39;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 23;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(this.write, ")", af$$ExternalSyntheticOutline0.m(this.read, "AreaPoint(lat=", ", lng="));
        int i4 = serializer + 43;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 7;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 51;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return !(i5 % 2 == 0);
        }
        if (!(obj instanceof o7ExternalSyntheticLambda3)) {
            return false;
        }
        o7ExternalSyntheticLambda3 o7externalsyntheticlambda3 = (o7ExternalSyntheticLambda3) obj;
        return Double.compare(this.read, o7externalsyntheticlambda3.read) == 0 && Double.compare(this.write, o7externalsyntheticlambda3.write) == 0;
    }
}
