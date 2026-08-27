package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class CameraAccessExceptionCompat {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[VideoCapture.values().length];
        try {
            iArr[VideoCapture.IMAGE_CAPTURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VideoCapture.PREVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VideoCapture.VIDEO_CAPTURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VideoCapture.STREAM_SHARING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        RemoteActionCompatParcelizer = iArr;
        int[] iArr2 = new int[ZoomControl.values().length];
        try {
            iArr2[ZoomControl.DYNAMIC_RANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ZoomControl.FPS_RANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ZoomControl.VIDEO_STABILIZATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ZoomControl.IMAGE_FORMAT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        read = iArr2;
    }
}
