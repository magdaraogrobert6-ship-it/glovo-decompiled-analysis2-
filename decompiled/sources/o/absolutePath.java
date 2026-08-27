package o;

/* JADX INFO: loaded from: classes3.dex */
public final class absolutePath implements NavHostKtNavHost291ExternalSyntheticLambda0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final absolutePath read = new absolutePath();
    private static int serializer = 1;
    private static int write;

    static {
        int i = serializer + 109;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 37;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return "NotDisplayable";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 71;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 65;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return -1656186372;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 9;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof absolutePath)) {
            int i6 = i2 + 17;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = i4 + 85;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            int i9 = 40 / 0;
        }
        return true;
    }
}
