package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetGocp {
    private static int read = 0;
    private static int write = 1;
    public final double IconCompatParcelizer;
    public final double serializer;

    public accessgetGocp(double d, double d2) {
        this.serializer = d;
        this.IconCompatParcelizer = d2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 71;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = Double.hashCode(this.IconCompatParcelizer) << (Double.hashCode(this.serializer) % 74);
        } else {
            iHashCode = (Double.hashCode(this.serializer) * 31) + Double.hashCode(this.IconCompatParcelizer);
        }
        int i3 = read + 15;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
            return ff$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, ")", af$$ExternalSyntheticOutline0.m(this.serializer, "DestinationLatLong(latitude=", ", longitude="));
        }
        return ff$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, ")", af$$ExternalSyntheticOutline0.m(this.serializer, "DestinationLatLong(latitude=", ", longitude="));
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 11;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 3;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = i4 + 17;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return true;
        }
        if (!(obj instanceof accessgetGocp)) {
            int i9 = i2 + 97;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        accessgetGocp accessgetgocp = (accessgetGocp) obj;
        if (Double.compare(this.serializer, accessgetgocp.serializer) != 0 || Double.compare(this.IconCompatParcelizer, accessgetgocp.IconCompatParcelizer) != 0) {
            return false;
        }
        int i11 = write + 19;
        read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i11 % 2 != 0) {
            int i12 = 79 / 0;
        }
        return true;
    }
}
