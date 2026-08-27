package o;

/* JADX INFO: loaded from: classes3.dex */
public final class buildIntoRemoteViews extends clearCompatExtraKeys {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final buildIntoRemoteViews serializer = new buildIntoRemoteViews();
    private static int write;

    static {
        int i = write + 123;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return "HideLoading";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 13;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 77;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return -1028427333;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof buildIntoRemoteViews) {
            int i2 = IconCompatParcelizer + 35;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = IconCompatParcelizer + 93;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 != 0;
    }
}
