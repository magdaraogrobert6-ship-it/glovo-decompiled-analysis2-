package o;

/* JADX INFO: loaded from: classes3.dex */
public final class copygijOMQM extends coil3.util.ContextsKt {
    private static int IconCompatParcelizer = 0;
    public static final copygijOMQM RemoteActionCompatParcelizer = new copygijOMQM();
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 75;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 105;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return "Toggle";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 31;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 79;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return -2026412612;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof copygijOMQM) {
                return true;
            }
            int i2 = serializer + 117;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return !(i2 % 2 != 0);
        }
        int i3 = write + 59;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return true;
    }
}
