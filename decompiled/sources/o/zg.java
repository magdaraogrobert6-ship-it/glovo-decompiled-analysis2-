package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class zg extends zgExternalSyntheticLambda3 {
    private static int read = 1;
    private static int write;
    public final int RemoteActionCompatParcelizer;

    public zg(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 85;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.RemoteActionCompatParcelizer);
        int i4 = write + 33;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = d$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, "Deliveries(value=", ")");
        int i4 = read + 93;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof zg) {
                if (this.RemoteActionCompatParcelizer == ((zg) obj).RemoteActionCompatParcelizer) {
                    return true;
                }
                int i2 = read + 61;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = write + 89;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        int i5 = write + 71;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
