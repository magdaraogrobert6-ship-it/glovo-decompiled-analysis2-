package o;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentKt implements NavHostKtNavHost29111 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static final FragmentKt serializer = new FragmentKt();
    private static int write = 1;

    static {
        int i = RemoteActionCompatParcelizer + 69;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return "Close";
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 61;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return 506952443;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 5;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj || (obj instanceof FragmentKt)) {
            return true;
        }
        int i4 = i3 + 115;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }
}
