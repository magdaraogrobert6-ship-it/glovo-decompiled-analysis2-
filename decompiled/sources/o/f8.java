package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class f8 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final double read;
    public final double serializer;

    public f8(double d, double d2) {
        this.serializer = d;
        this.read = d2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Double.hashCode(this.read) + (Double.hashCode(this.serializer) * 31);
        int i4 = write + 39;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 5;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m(this.read, ")", af$$ExternalSyntheticOutline0.m(this.serializer, "Coordinate(latitude=", ", longitude="));
        }
        ff$$ExternalSyntheticOutline0.m(this.read, ")", af$$ExternalSyntheticOutline0.m(this.serializer, "Coordinate(latitude=", ", longitude="));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            int i2 = write + 117;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        f8 f8Var = (f8) obj;
        if (Double.compare(this.serializer, f8Var.serializer) != 0) {
            int i4 = IconCompatParcelizer + 55;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (Double.compare(this.read, f8Var.read) == 0) {
            return true;
        }
        int i6 = write + 3;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
