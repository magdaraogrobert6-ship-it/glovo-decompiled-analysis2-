package o;

/* JADX INFO: loaded from: classes3.dex */
public final class widthMask extends getDensityannotations {
    public static final widthMask IconCompatParcelizer = new widthMask();
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 121;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            int i4 = 27 / 0;
        }
        int i5 = i3 + 71;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return "NotDisplayable";
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 95;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return 1193683130;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            return obj instanceof widthMask;
        }
        int i2 = write;
        int i3 = i2 + 95;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        boolean z = i3 % 2 != 0;
        int i4 = i2 + 91;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return z;
    }
}
