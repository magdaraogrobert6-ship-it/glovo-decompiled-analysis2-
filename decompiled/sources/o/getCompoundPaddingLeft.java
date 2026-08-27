package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class getCompoundPaddingLeft {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[VideoCapture.values().length];
        read = iArr;
        try {
            iArr[VideoCapture.IMAGE_CAPTURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            read[VideoCapture.VIDEO_CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            read[VideoCapture.STREAM_SHARING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            read[VideoCapture.PREVIEW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            read[VideoCapture.IMAGE_ANALYSIS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
