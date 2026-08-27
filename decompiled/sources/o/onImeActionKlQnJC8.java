package o;

/* JADX INFO: loaded from: classes3.dex */
public final class onImeActionKlQnJC8 implements getPlatformImeOptions {
    private static int IconCompatParcelizer = 1;
    public static final onImeActionKlQnJC8 RemoteActionCompatParcelizer = new onImeActionKlQnJC8();
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        int i = write + 49;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return "Close";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 125;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 7;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return 208172881;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 11;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this == obj || (obj instanceof onImeActionKlQnJC8)) {
            return true;
        }
        int i5 = i3 + 67;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
