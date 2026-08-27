package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class verifyOrientationStatus {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[setUnregisteredInAppMessage.values().length];
        try {
            iArr[setUnregisteredInAppMessage.MICROSECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setUnregisteredInAppMessage.NANOSECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[setUnregisteredInAppMessage.MILLISECONDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[setUnregisteredInAppMessage.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[setUnregisteredInAppMessage.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[setUnregisteredInAppMessage.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[setUnregisteredInAppMessage.DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        IconCompatParcelizer = iArr;
    }
}
