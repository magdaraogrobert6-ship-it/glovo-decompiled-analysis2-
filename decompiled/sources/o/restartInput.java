package o;

/* JADX INFO: loaded from: classes3.dex */
public final class restartInput implements onRequestCursorAnchorInfo {
    private static int IconCompatParcelizer = 0;
    public static final restartInput RemoteActionCompatParcelizer = new restartInput();
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 91;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 23;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 69;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return "NotDisplayable";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 23;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return -1261856245;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 53;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof restartInput)) {
            return false;
        }
        int i3 = read + 99;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return true;
    }
}
