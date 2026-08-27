package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class Camera2CameraControlImpl {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[AutoFlashUnderExposedQuirk.values().length];
        RemoteActionCompatParcelizer = iArr;
        try {
            iArr[AutoFlashUnderExposedQuirk.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            RemoteActionCompatParcelizer[AutoFlashUnderExposedQuirk.ON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            RemoteActionCompatParcelizer[AutoFlashUnderExposedQuirk.PREVIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
