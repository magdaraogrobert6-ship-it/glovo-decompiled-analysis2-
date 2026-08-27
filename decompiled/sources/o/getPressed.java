package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getPressed extends io.sentry.android.replay.util.read {
    public static final getPressed IconCompatParcelizer = new getPressed();
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = RemoteActionCompatParcelizer + 65;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 51;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 109;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "Braze";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 69;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return -283610861;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read;
            int i3 = i2 + 109;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 113;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 44 / 0;
            }
            return true;
        }
        if (obj instanceof getPressed) {
            return true;
        }
        int i7 = read + 67;
        int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 61;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
