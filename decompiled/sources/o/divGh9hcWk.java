package o;

/* JADX INFO: loaded from: classes3.dex */
public final class divGh9hcWk {
    public static final divGh9hcWk IconCompatParcelizer = new divGh9hcWk();
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        int i = serializer + 17;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 53;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return "Close";
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 5;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 57;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return -1165598076;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            return obj instanceof divGh9hcWk;
        }
        int i2 = read + 59;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 97;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
