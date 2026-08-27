package o;

/* JADX INFO: loaded from: classes3.dex */
public final class _set_registeredPushToken_lambda0 implements _set_registeredPushToken_lambda10 {
    private static int IconCompatParcelizer = 0;
    public static final _set_registeredPushToken_lambda0 RemoteActionCompatParcelizer = new _set_registeredPushToken_lambda0();
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = serializer + 29;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return "NotAvailable";
        }
        int i3 = 53 / 0;
        return "NotAvailable";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 69;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return -666039572;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 23;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof _set_registeredPushToken_lambda0) {
            return true;
        }
        int i4 = IconCompatParcelizer + 89;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
