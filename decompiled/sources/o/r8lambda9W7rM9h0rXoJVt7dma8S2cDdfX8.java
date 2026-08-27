package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda9W7rM9h0rXoJVt7dma8S2cDdfX8 implements r8lambda6sk4DzA3gskBkuQlANQmRL8Dlpk {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    public static final r8lambda9W7rM9h0rXoJVt7dma8S2cDdfX8 serializer = new r8lambda9W7rM9h0rXoJVt7dma8S2cDdfX8();
    private static int write = 1;

    static {
        int i = read + 21;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 63;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 33;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return "CheckNotifications";
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 113;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 77;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 1694550843;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            return obj instanceof r8lambda9W7rM9h0rXoJVt7dma8S2cDdfX8;
        }
        int i5 = i3 + 125;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
        return true;
    }
}
