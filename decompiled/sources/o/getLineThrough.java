package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getLineThrough extends getUnderline {
    public static final getLineThrough IconCompatParcelizer = new getLineThrough();
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = serializer + 67;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 10 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 3;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return "ShowLoading";
        }
        int i3 = 90 / 0;
        return "ShowLoading";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 73;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 73;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return 788075458;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(!(obj instanceof getLineThrough))) {
                return true;
            }
            int i2 = read + 11;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = read + 23;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }
}
