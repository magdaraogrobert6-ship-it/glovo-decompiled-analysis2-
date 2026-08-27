package o;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetLtrcp extends accessgetContentOrRtlcp {
    private static int IconCompatParcelizer = 0;
    public static final accessgetLtrcp RemoteActionCompatParcelizer = new accessgetLtrcp();
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;

    static {
        int i = serializer + 59;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 93 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 113;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return "NotDisplayable";
        }
        int i3 = 38 / 0;
        return "NotDisplayable";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 115;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
        return -208167243;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 61;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof accessgetLtrcp)) {
            return false;
        }
        int i4 = IconCompatParcelizer + 51;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
