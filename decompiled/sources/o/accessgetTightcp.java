package o;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetTightcp {
    private static int IconCompatParcelizer = 0;
    public static final accessgetTightcp RemoteActionCompatParcelizer = new accessgetTightcp();
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    static {
        int i = read + 45;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 105;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 11;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return "Recenter";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 37;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 69;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return 906423863;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 65;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj || (obj instanceof accessgetTightcp)) {
            return true;
        }
        int i4 = i3 + 75;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
