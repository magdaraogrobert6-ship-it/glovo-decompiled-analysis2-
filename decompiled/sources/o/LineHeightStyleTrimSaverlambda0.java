package o;

/* JADX INFO: loaded from: classes3.dex */
public final class LineHeightStyleTrimSaverlambda0 extends LineHeightStyleSaverlambda0 {
    public static final LineHeightStyleTrimSaverlambda0 IconCompatParcelizer = new LineHeightStyleTrimSaverlambda0();
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        int i = read + 31;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 57;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 78 / 0;
        }
        int i5 = i2 + 41;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return "ShowLoading";
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            int i4 = 20 / 0;
        }
        int i5 = i3 + 33;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return 1870526880;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof LineHeightStyleTrimSaverlambda0)) {
                return false;
            }
            int i2 = serializer + 51;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = serializer + 75;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 105;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
