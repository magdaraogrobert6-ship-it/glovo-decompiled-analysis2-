package o;

/* JADX INFO: loaded from: classes3.dex */
public final class LinkSaverlambda0 extends LineHeightStyleSaverlambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final LinkSaverlambda0 serializer = new LinkSaverlambda0();
    private static int write;

    static {
        int i = write + 37;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 97;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 63;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return "HideLoading";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 19;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 1361956795;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        Object obj2 = null;
        if (this == obj) {
            int i2 = read + 1;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (obj instanceof LinkSaverlambda0) {
            return true;
        }
        int i3 = read + 17;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
