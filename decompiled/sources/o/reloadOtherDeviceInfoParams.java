package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class reloadOtherDeviceInfoParams {
    private static int RemoteActionCompatParcelizer = 0;
    public static final /* synthetic */ int[] serializer;
    private static int write = 1;

    static {
        int[] iArr = new int[GooglePlayInstallReferrerDetails.values().length];
        try {
            iArr[GooglePlayInstallReferrerDetails.END_BREAK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GooglePlayInstallReferrerDetails.REQUEST_BREAK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GooglePlayInstallReferrerDetails.CANCEL_BREAK.ordinal()] = 3;
            int i = write + 27;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GooglePlayInstallReferrerDetails.URL_ACTION.ordinal()] = 4;
            int i3 = RemoteActionCompatParcelizer + 31;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[GooglePlayInstallReferrerDetails.STOP_WORKING.ordinal()] = 5;
            int i5 = write + 15;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[GooglePlayInstallReferrerDetails.UNKNOWN_ACTION.ordinal()] = 6;
            int i8 = 2 % 2;
        } catch (NoSuchFieldError unused6) {
        }
        serializer = iArr;
    }
}
