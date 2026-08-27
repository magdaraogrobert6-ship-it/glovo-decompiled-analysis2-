package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class lerpColorList {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[getAndroidCanvas.values().length];
        try {
            iArr[getAndroidCanvas.TRUNCATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getAndroidCanvas.WRITE_AHEAD_LOGGING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
    }
}
