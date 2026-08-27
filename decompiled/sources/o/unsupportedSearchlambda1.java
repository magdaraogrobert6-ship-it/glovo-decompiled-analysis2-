package o;

/* JADX INFO: loaded from: classes3.dex */
public final class unsupportedSearchlambda1 extends attachAllAnimationslambda00 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    public static final unsupportedSearchlambda1 read = new unsupportedSearchlambda1();
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 61;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 79;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "ShowLoading";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 103;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 63;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return -1924722833;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 111;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj || (obj instanceof unsupportedSearchlambda1)) {
            return true;
        }
        int i4 = i3 + 47;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }
}
