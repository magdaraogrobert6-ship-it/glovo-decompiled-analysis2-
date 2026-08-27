package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setViewInfosui_tooling {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static final setViewInfosui_tooling serializer = new setViewInfosui_tooling();
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 113;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return "Close";
        }
        int i3 = 86 / 0;
        return "Close";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 83;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 107;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return 131996941;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 99;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj || (obj instanceof setViewInfosui_tooling)) {
            return true;
        }
        int i4 = i2 + 39;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return false;
    }
}
