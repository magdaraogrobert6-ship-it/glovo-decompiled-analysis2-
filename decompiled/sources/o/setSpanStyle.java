package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setSpanStyle extends toAccessibilitySpannableString {
    private static int IconCompatParcelizer = 0;
    public static final setSpanStyle RemoteActionCompatParcelizer = new setSpanStyle();
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 123;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return "NotDisplayable";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 111;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            int i4 = 4 / 0;
        }
        int i5 = i3 + 33;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 514977198;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 103;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(!(obj instanceof setSpanStyle))) {
            return true;
        }
        int i4 = read + 39;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
