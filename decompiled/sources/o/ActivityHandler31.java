package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler31 implements ActivityHandler30 {
    private static int IconCompatParcelizer = 1;
    public static final ActivityHandler31 RemoteActionCompatParcelizer = new ActivityHandler31();
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        int i = IconCompatParcelizer + 49;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 21;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 99;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return "HideKeyboard";
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 81;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return -1567462441;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        Object obj2 = null;
        if (this != obj) {
            if (obj instanceof ActivityHandler31) {
                int i2 = serializer + 67;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return true;
                }
                obj2.hashCode();
                throw null;
            }
            int i3 = write + 89;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i3 % 2 == 0;
        }
        int i4 = serializer + 85;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
