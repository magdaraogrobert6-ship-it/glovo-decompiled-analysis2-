package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getSharedElementEnterTransition extends getSharedElementReturnTransition {
    private static int IconCompatParcelizer = 0;
    public static final getSharedElementEnterTransition RemoteActionCompatParcelizer = new getSharedElementEnterTransition();
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    static {
        int i = write + 109;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return "HideLoading";
        }
        int i3 = 22 / 0;
        return "HideLoading";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 27;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 1828280330;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 85;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this != obj) {
            return obj instanceof getSharedElementEnterTransition;
        }
        int i4 = i2 + 97;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
