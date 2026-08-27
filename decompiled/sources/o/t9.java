package o;

/* JADX INFO: loaded from: classes3.dex */
public final class t9 extends t5 {
    private static int IconCompatParcelizer = 1;
    public static final t9 RemoteActionCompatParcelizer = new t9();
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        int i = IconCompatParcelizer + 51;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 53;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return "NavigateToInfoScreen";
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 123;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 53;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return 81632131;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 17;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9)) {
            int i5 = i3 + 3;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        int i6 = i3 + 17;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
