package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class CameraManagerCompat {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[TorchControl.values().length];
        try {
            iArr[TorchControl.PREVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TorchControl.IMAGE_CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TorchControl.VIDEO_CAPTURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TorchControl.STREAM_SHARING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TorchControl.UNDEFINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        read = iArr;
    }
}
