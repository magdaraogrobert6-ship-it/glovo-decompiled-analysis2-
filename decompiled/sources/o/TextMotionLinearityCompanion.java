package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class TextMotionLinearityCompanion {
    private static int read = 1;
    private static int serializer;
    public final int RemoteActionCompatParcelizer;

    public TextMotionLinearityCompanion(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 73;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return Integer.hashCode(this.RemoteActionCompatParcelizer);
        }
        int i3 = 35 / 0;
        return Integer.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 73;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return d$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, "BleScanResult(rssi=", ")");
        }
        int i3 = 9 / 0;
        return d$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, "BleScanResult(rssi=", ")");
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 11;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (obj instanceof TextMotionLinearityCompanion) {
                return this.RemoteActionCompatParcelizer == ((TextMotionLinearityCompanion) obj).RemoteActionCompatParcelizer;
            }
            int i5 = i3 + 29;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        int i6 = i3 + 85;
        int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 3;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return true;
    }
}
