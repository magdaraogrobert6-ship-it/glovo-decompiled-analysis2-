package o;

/* JADX INFO: loaded from: classes3.dex */
public final class removePushToken {
    private static int IconCompatParcelizer = 1;
    public static final removePushToken RemoteActionCompatParcelizer = new removePushToken();
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        int i = serializer + 53;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 87;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 7;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "Close";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 27;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 111;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return 293288703;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 85;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 93;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 != 0;
        }
        if (!(obj instanceof removePushToken)) {
            int i7 = i2 + 55;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = i2 + 29;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
