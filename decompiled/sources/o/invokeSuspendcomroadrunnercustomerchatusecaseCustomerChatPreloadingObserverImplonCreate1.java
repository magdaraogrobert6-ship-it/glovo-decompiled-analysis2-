package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class invokeSuspendcomroadrunnercustomerchatusecaseCustomerChatPreloadingObserverImplonCreate1 {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int read;

    static {
        int[] iArr = new int[isTrackingEnabled.values().length];
        try {
            iArr[isTrackingEnabled.ON_PAID_BREAK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[isTrackingEnabled.ON_BREAK.ordinal()] = 2;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[isTrackingEnabled.WORKING.ordinal()] = 3;
            int i2 = read + 53;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[isTrackingEnabled.READY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[isTrackingEnabled.NOT_WORKING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[isTrackingEnabled.STARTING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[isTrackingEnabled.LATE.ordinal()] = 7;
            int i5 = IconCompatParcelizer + 13;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[isTrackingEnabled.AVAILABLE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[isTrackingEnabled.ENDING.ordinal()] = 9;
            int i8 = 2 % 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[isTrackingEnabled.SUSPENDED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}
