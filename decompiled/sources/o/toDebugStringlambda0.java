package o;

/* JADX INFO: loaded from: classes3.dex */
public final class toDebugStringlambda0 extends r8lambdahKqWkK2sqJkz9lmLXp4YuqHwTU {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read = 0;
    private static int serializer = 1;
    public static final toDebugStringlambda0 write = new toDebugStringlambda0(3);

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 57;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return "TransactionDone";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = IconCompatParcelizer + 71;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 101;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return -140627412;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof toDebugStringlambda0) {
            int i2 = read + 19;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = MediaBrowserCompatMediaItem + 13;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }

    public toDebugStringlambda0(int i) {
        super(i);
    }
}
