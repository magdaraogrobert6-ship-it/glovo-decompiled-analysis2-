package o;

/* JADX INFO: loaded from: classes3.dex */
public final class PlatformLocaleKt extends PlatformLocaleDelegate {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final PlatformLocaleKt read = new PlatformLocaleKt();
    private static int serializer = 1;
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 47;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 7;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return "NotDisplayable";
        }
        int i3 = 29 / 0;
        return "NotDisplayable";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 113;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 89;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return 1173886612;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof PlatformLocaleKt) {
                return true;
            }
            int i2 = write + 3;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        int i3 = write + 105;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i3 % 2 != 0;
    }
}
