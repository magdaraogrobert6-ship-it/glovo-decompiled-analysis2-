package o;

/* JADX INFO: loaded from: classes3.dex */
public final class logPushNotificationOpenedlambda0 extends logPushNotificationActionClickedlambda11 {
    private static int IconCompatParcelizer = 1;
    public static final logPushNotificationOpenedlambda0 RemoteActionCompatParcelizer = new logPushNotificationOpenedlambda0();
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = read + 93;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 75 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 89;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 121;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return "DividerViewEntity";
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 91;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 29;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return -1631032438;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 117;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        if (this != obj) {
            if (!(obj instanceof logPushNotificationOpenedlambda0)) {
                return false;
            }
            int i6 = i2 + 15;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 2 / 0;
            }
            return true;
        }
        int i8 = i4 + 119;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i8 % 2 != 0;
    }
}
