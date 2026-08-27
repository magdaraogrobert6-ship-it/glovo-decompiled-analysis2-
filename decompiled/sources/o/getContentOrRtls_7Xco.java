package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getContentOrRtls_7Xco {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final getContentOrRtls_7Xco read = new getContentOrRtls_7Xco();
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 47;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 121;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 41;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return "SwitchVoiceInstructions";
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return -1465773596;
        }
        int i3 = 92 / 0;
        return -1465773596;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            return obj instanceof getContentOrRtls_7Xco;
        }
        int i5 = i3 + 21;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i5 % 2 == 0;
    }
}
