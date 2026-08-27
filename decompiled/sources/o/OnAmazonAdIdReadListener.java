package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class OnAmazonAdIdReadListener {
    private static int RemoteActionCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    public static final /* synthetic */ int[] serializer;
    private static int write;

    static {
        int[] iArr = new int[isTrackingEnabled.values().length];
        try {
            iArr[isTrackingEnabled.AVAILABLE.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[isTrackingEnabled.ENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[isTrackingEnabled.LATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[isTrackingEnabled.NOT_WORKING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[isTrackingEnabled.ON_PAID_BREAK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[isTrackingEnabled.ON_BREAK.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[isTrackingEnabled.READY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[isTrackingEnabled.STARTING.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[isTrackingEnabled.SUSPENDED.ordinal()] = 9;
            int i2 = RemoteActionCompatParcelizer + 87;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[isTrackingEnabled.WORKING.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        serializer = iArr;
        int[] iArr2 = new int[GooglePlayInstallReferrerDetails.values().length];
        try {
            iArr2[GooglePlayInstallReferrerDetails.REQUEST_BREAK.ordinal()] = 1;
            int i5 = RemoteActionCompatParcelizer + 79;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[GooglePlayInstallReferrerDetails.END_BREAK.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[GooglePlayInstallReferrerDetails.CANCEL_BREAK.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[GooglePlayInstallReferrerDetails.URL_ACTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[GooglePlayInstallReferrerDetails.STOP_WORKING.ordinal()] = 5;
            int i8 = write + 87;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 5 % 5;
            } else {
                int i10 = 2 % 2;
            }
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[GooglePlayInstallReferrerDetails.UNKNOWN_ACTION.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        read = iArr2;
    }
}
