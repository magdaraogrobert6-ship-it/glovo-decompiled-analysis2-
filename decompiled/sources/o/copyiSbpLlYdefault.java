package o;

/* JADX INFO: loaded from: classes3.dex */
public final class copyiSbpLlYdefault implements accessgetMaxcp {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public static final copyiSbpLlYdefault write = new copyiSbpLlYdefault();

    static {
        int i = serializer + 105;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 33 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 25;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 55;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return "Success";
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 119;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 113;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return -1304148329;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 81;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 3 / 0;
            }
            return true;
        }
        if (!(!(obj instanceof copyiSbpLlYdefault))) {
            int i4 = RemoteActionCompatParcelizer + 35;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = RemoteActionCompatParcelizer + 53;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 != 0;
    }
}
