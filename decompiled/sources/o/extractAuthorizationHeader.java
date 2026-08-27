package o;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final class extractAuthorizationHeader {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public static int read;
    public static int write;

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 105;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 55;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
        return "Throttle(isEnabled=true, duration=500)";
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 119;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj || (obj instanceof extractAuthorizationHeader)) {
            return true;
        }
        int i5 = i3 + 47;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 87;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = Long.hashCode(500L) << (Boolean.hashCode(true) + 95);
        } else {
            iHashCode = (Boolean.hashCode(true) * 31) + Long.hashCode(500L);
        }
        int i3 = RemoteActionCompatParcelizer + 111;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public static int write() {
        int i = read;
        int i2 = i % 9977648;
        read = i + 1;
        if (i2 != 0) {
            return write;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        write = startUptimeMillis;
        return startUptimeMillis;
    }
}
