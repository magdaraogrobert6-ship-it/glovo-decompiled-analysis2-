package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class setTryInstallReferrer {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int write;

    static {
        int[] iArr = new int[setUrlStrategy.values().length];
        try {
            iArr[setUrlStrategy.STARTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setUrlStrategy.LATE.ordinal()] = 2;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[setUrlStrategy.NOT_WORKING.ordinal()] = 3;
            int i2 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[setUrlStrategy.AVAILABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[setUrlStrategy.WORKING.ordinal()] = 5;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[setUrlStrategy.READY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[setUrlStrategy.ENDING.ordinal()] = 7;
            int i4 = write + 35;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[setUrlStrategy.BREAK.ordinal()] = 8;
            int i7 = write + 95;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[setUrlStrategy.TEMP_OFFLINE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}
