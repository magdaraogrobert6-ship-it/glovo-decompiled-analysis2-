package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class LowMemoryQuirk {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[ImageCaptureFailedForSpecificCombinationQuirk.values().length];
        try {
            iArr[ImageCaptureFailedForSpecificCombinationQuirk.PREVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ImageCaptureFailedForSpecificCombinationQuirk.RECORD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ImageCaptureFailedForSpecificCombinationQuirk.MAXIMUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ImageCaptureFailedForSpecificCombinationQuirk.MAXIMUM_4_3.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ImageCaptureFailedForSpecificCombinationQuirk.MAXIMUM_16_9.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ImageCaptureFailedForSpecificCombinationQuirk.ULTRA_MAXIMUM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ImageCaptureFailedForSpecificCombinationQuirk.NOT_SUPPORT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        read = iArr;
    }
}
