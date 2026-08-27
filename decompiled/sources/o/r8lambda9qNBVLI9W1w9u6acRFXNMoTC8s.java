package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda9qNBVLI9W1w9u6acRFXNMoTC8s implements r8lambda6sk4DzA3gskBkuQlANQmRL8Dlpk {
    public static final r8lambda9qNBVLI9W1w9u6acRFXNMoTC8s IconCompatParcelizer = new r8lambda9qNBVLI9W1w9u6acRFXNMoTC8s();
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 3;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 0 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 79;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 1;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return "OpenDeveloperMenu";
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 45;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 11;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return -702426044;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 97;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof r8lambda9qNBVLI9W1w9u6acRFXNMoTC8s) {
            return true;
        }
        int i4 = write + 73;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
