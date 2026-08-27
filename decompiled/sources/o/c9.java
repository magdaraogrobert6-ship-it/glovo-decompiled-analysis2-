package o;

/* JADX INFO: loaded from: classes3.dex */
public final class c9 extends cb {
    public static final c9 IconCompatParcelizer = new c9();
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 125;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 71;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 57;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return "GoToMain";
        }
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return 629929808;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof c9)) {
                int i2 = write;
                int i3 = i2 + 19;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                z = i3 % 2 == 0;
                int i4 = i2 + 33;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
            return z;
        }
        int i6 = serializer + 121;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
