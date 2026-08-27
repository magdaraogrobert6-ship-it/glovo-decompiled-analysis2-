package o;

/* JADX INFO: loaded from: classes3.dex */
public final class toRangedefault implements toRange {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final toRangedefault read = new toRangedefault();
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 15;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 69;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 5;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "ServedFromDisk";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 41;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 55;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return -174893696;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 125;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            return obj instanceof toRangedefault;
        }
        int i4 = i3 + 113;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
