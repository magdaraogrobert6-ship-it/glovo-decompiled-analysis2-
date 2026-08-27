package o;

/* JADX INFO: loaded from: classes3.dex */
public final class FontScaling implements timesGh9hcWk {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public static final FontScaling write = new FontScaling();

    static {
        int i = RemoteActionCompatParcelizer + 81;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 13;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 45;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "RequestCameraPermission";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return -1641263496;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 65;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj || !(!(obj instanceof FontScaling))) {
            return true;
        }
        int i4 = i3 + 115;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return !(i4 % 2 != 0);
    }
}
