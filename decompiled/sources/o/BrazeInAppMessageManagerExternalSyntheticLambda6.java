package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class BrazeInAppMessageManagerExternalSyntheticLambda6 {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[setUnregisteredInAppMessage.values().length];
        try {
            iArr[setUnregisteredInAppMessage.DAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setUnregisteredInAppMessage.HOURS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[setUnregisteredInAppMessage.MINUTES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[setUnregisteredInAppMessage.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[setUnregisteredInAppMessage.MILLISECONDS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[setUnregisteredInAppMessage.NANOSECONDS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[setUnregisteredInAppMessage.MICROSECONDS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}
