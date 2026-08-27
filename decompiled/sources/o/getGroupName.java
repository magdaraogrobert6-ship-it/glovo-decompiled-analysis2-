package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getGroupName extends setStrokeColor {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final getGroupName read = new getGroupName();
    private static int serializer = 1;
    private static int write;

    static {
        int i = write + 99;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 49 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 121;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 27;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "TakePicture";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 119;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return 593385833;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 3;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        if (this != obj) {
            if (obj instanceof getGroupName) {
                return true;
            }
            int i6 = i4 + 121;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = i2 + 107;
        int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i9;
        int i10 = i8 % 2;
        int i11 = i9 + 95;
        IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return true;
    }
}
