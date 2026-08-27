package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setEnabledI extends sendLicenseVerificationDataI {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    public static final setEnabledI serializer = new setEnabledI();
    private static int write = 1;

    static {
        int i = RemoteActionCompatParcelizer + 97;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 9;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 29;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "Loading";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 69;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 51;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return 2129660506;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 55;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i5 = i2 + 31;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof setEnabledI)) {
            int i6 = i2 + 87;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = i4 + 105;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
