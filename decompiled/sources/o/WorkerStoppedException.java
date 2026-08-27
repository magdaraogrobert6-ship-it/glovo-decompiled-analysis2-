package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class WorkerStoppedException {
    private static int RemoteActionCompatParcelizer = 0;
    public static final /* synthetic */ int[] serializer;
    private static int write = 1;

    static {
        int[] iArr = new int[isTrackingEnabled.values().length];
        try {
            iArr[isTrackingEnabled.NOT_WORKING.ordinal()] = 1;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[isTrackingEnabled.STARTING.ordinal()] = 2;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[isTrackingEnabled.ON_PAID_BREAK.ordinal()] = 3;
            int i2 = write + 83;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[isTrackingEnabled.ON_BREAK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[isTrackingEnabled.LATE.ordinal()] = 5;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[isTrackingEnabled.SUSPENDED.ordinal()] = 6;
            int i6 = RemoteActionCompatParcelizer + 43;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[isTrackingEnabled.AVAILABLE.ordinal()] = 7;
            int i9 = 2 % 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[isTrackingEnabled.READY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[isTrackingEnabled.WORKING.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[isTrackingEnabled.ENDING.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        serializer = iArr;
    }
}
