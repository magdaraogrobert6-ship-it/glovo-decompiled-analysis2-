package o;

/* JADX INFO: loaded from: classes3.dex */
public final class get_nativeCanvasui_text extends getClipBounds {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    public static final get_nativeCanvasui_text serializer = new get_nativeCanvasui_text();
    private static int write;

    static {
        int i = IconCompatParcelizer + 103;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 77;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 87;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return "NonAvailable";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return 1361459832;
        }
        int i3 = 48 / 0;
        return 1361459832;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof get_nativeCanvasui_text) {
                return true;
            }
            int i2 = RemoteActionCompatParcelizer + 19;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = RemoteActionCompatParcelizer + 31;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
