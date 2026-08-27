package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class nd {
    private static int serializer = 0;
    private static int write = 1;
    public final double IconCompatParcelizer;
    public final double read;

    public nd(double d, double d2) {
        this.read = d;
        this.IconCompatParcelizer = d2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 121;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = Double.hashCode(this.IconCompatParcelizer) / (Double.hashCode(this.read) * 71);
        } else {
            iHashCode = Double.hashCode(this.IconCompatParcelizer) + (Double.hashCode(this.read) * 31);
        }
        int i3 = serializer + 63;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 33;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, ")", af$$ExternalSyntheticOutline0.m(this.read, "Coordinates(latitude=", ", longitude="));
        }
        ff$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, ")", af$$ExternalSyntheticOutline0.m(this.read, "Coordinates(latitude=", ", longitude="));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 7;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof nd) {
            nd ndVar = (nd) obj;
            if (Double.compare(this.read, ndVar.read) == 0) {
                return Double.compare(this.IconCompatParcelizer, ndVar.IconCompatParcelizer) == 0;
            }
            int i4 = write + 49;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = write + 23;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
