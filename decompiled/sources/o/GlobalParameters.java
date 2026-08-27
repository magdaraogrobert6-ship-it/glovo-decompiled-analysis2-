package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class GlobalParameters {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final double read;
    public final double serializer;

    public final double IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        double d = this.read;
        int i5 = i3 + 63;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return d;
    }

    public final double read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer;
        }
        throw null;
    }

    public GlobalParameters(double d, double d2) {
        this.read = d;
        this.serializer = d2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Double.hashCode(this.serializer) + (Double.hashCode(this.read) * 31);
        int i4 = IconCompatParcelizer + 119;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(this.serializer, ")", af$$ExternalSyntheticOutline0.m(this.read, "Coordinate(lat=", ", lng="));
        int i4 = RemoteActionCompatParcelizer + 119;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 3;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof GlobalParameters) {
            GlobalParameters globalParameters = (GlobalParameters) obj;
            if (Double.compare(this.read, globalParameters.read) != 0) {
                return false;
            }
            if (Double.compare(this.serializer, globalParameters.serializer) == 0) {
                return true;
            }
            int i4 = RemoteActionCompatParcelizer + 77;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = RemoteActionCompatParcelizer + 123;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 99 / 0;
        }
        return false;
    }
}
