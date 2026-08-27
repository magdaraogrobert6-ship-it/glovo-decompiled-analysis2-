package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getColorValue {
    public static long IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public static resetCachelambda0 write;

    public static void IconCompatParcelizer(resetCachelambda0 resetcachelambda0) {
        if (resetcachelambda0.RatingCompat != null || resetcachelambda0.MediaMetadataCompat != null) {
            DrawableTransformation.write();
            return;
        }
        if (resetcachelambda0.RemoteActionCompatParcelizer) {
            return;
        }
        synchronized (getColorValue.class) {
            long j = IconCompatParcelizer + 8192;
            if (j > 65536) {
                return;
            }
            IconCompatParcelizer = j;
            resetcachelambda0.RatingCompat = write;
            resetcachelambda0.read = 0;
            resetcachelambda0.IconCompatParcelizer = 0;
            write = resetcachelambda0;
        }
    }

    public static resetCachelambda0 read() {
        synchronized (getColorValue.class) {
            resetCachelambda0 resetcachelambda0 = write;
            if (resetcachelambda0 != null) {
                write = resetcachelambda0.RatingCompat;
                resetcachelambda0.RatingCompat = null;
                IconCompatParcelizer -= 8192;
                return resetcachelambda0;
            }
            return new resetCachelambda0();
        }
    }

    public static final r8lambdakdT06ZZBT3HezLLCifuU7PvlmY serializer(AndroidShadowContext_androidKt androidShadowContext_androidKt) {
        int i = 2 % 2;
        int i2 = serializer + 79;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        androidShadowContext_androidKt.getClass();
        switch (getScrollableParent.read[androidShadowContext_androidKt.ordinal()]) {
            case 1:
                return SetPushNotificationSubscriptionStep.NANOSECOND;
            case 2:
                return SetPushNotificationSubscriptionStep.MILLISECOND;
            case 3:
                return SetPushNotificationSubscriptionStep.SECOND;
            case 4:
                r8lambda5ZUtRHumsZpmWybz0j8RK0Q r8lambda5zutrhumszpmwybz0j8rk0q = r8lambda5ZUtRHumsZpmWybz0j8RK0Q.BYTE;
                int i4 = serializer + 11;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return r8lambda5zutrhumszpmwybz0j8rk0q;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 5:
                return r8lambda5ZUtRHumsZpmWybz0j8RK0Q.KILOBYTE;
            case 6:
                return r8lambda5ZUtRHumsZpmWybz0j8RK0Q.MEGABYTE;
            case 7:
                return r8lambdaKY_FHoaOjAsGMBTbZjQD_XhYrbY.RATIO;
            case 8:
                return r8lambdaKY_FHoaOjAsGMBTbZjQD_XhYrbY.PERCENT;
            case 9:
                return new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("PERCENTILE", 0);
            case 10:
                return new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("QUANTITY", 0);
            default:
                return new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("none", 0);
        }
    }
}
