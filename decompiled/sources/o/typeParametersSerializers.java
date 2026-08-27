package o;

/* JADX INFO: loaded from: classes3.dex */
public final class typeParametersSerializers extends gb {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    public static final typeParametersSerializers read = new typeParametersSerializers();
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = serializer + 63;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 101;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 77;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "Unavailable";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 99;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 19681408;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof typeParametersSerializers) {
                return true;
            }
            int i2 = RemoteActionCompatParcelizer + 27;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        int i3 = write + 33;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return true;
    }
}
