package o;

/* JADX INFO: loaded from: classes3.dex */
public final class TextDecorationSpan {
    private static int read = 1;
    private static int serializer;
    public final boolean RemoteActionCompatParcelizer;
    public final getSkewX write;

    public TextDecorationSpan(getSkewX getskewx, boolean z) {
        getskewx.getClass();
        this.write = getskewx;
        this.RemoteActionCompatParcelizer = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 45;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer) + (this.write.hashCode() * 31);
        int i4 = serializer + 19;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 103;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof TextDecorationSpan)) {
            return false;
        }
        TextDecorationSpan textDecorationSpan = (TextDecorationSpan) obj;
        if (this.write != textDecorationSpan.write) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer == textDecorationSpan.RemoteActionCompatParcelizer) {
            return true;
        }
        int i4 = serializer + 25;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NotificationRingerModeInfo(ringerMode=" + this.write + ", isVibrationEnabled=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = read + 37;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
