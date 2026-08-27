package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class BaseTransacterImplnotifyQueries1 {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int read;

    static {
        int[] iArr = new int[isTrackingEnabled.values().length];
        try {
            iArr[isTrackingEnabled.ON_BREAK.ordinal()] = 1;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[isTrackingEnabled.ON_PAID_BREAK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[isTrackingEnabled.LATE.ordinal()] = 3;
            int i = IconCompatParcelizer + 71;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[isTrackingEnabled.NOT_WORKING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[isTrackingEnabled.STARTING.ordinal()] = 5;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[isTrackingEnabled.SUSPENDED.ordinal()] = 6;
            int i4 = read + 37;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[isTrackingEnabled.AVAILABLE.ordinal()] = 7;
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
        RemoteActionCompatParcelizer = iArr;
    }
}
