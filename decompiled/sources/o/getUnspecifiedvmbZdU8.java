package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getUnspecifiedvmbZdU8 extends getAutovmbZdU8 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    public static final getUnspecifiedvmbZdU8 serializer = new getUnspecifiedvmbZdU8();
    private static int write = 1;

    static {
        int i = RemoteActionCompatParcelizer + 101;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 107;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 3;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return "Toggle";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 27;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 17;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 1102165644;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 77;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 11;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof getUnspecifiedvmbZdU8)) {
            return false;
        }
        int i7 = i3 + 111;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}
