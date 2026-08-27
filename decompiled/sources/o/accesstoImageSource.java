package o;

/* JADX INFO: loaded from: classes3.dex */
public final class accesstoImageSource implements RealInterceptorChain {
    private static int IconCompatParcelizer = 1;
    public static final accesstoImageSource RemoteActionCompatParcelizer = new accesstoImageSource();
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 49;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 35;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            int i4 = 22 / 0;
        }
        int i5 = i3 + 121;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "PermissionGranted";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 31;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 7;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return -1658002332;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 5;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (obj instanceof accesstoImageSource) {
                return true;
            }
            int i5 = i3 + 45;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i3 + 35;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
