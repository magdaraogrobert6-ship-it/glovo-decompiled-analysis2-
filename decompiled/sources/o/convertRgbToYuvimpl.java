package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class convertRgbToYuvimpl {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[ColorMatrix.values().length];
        try {
            iArr[ColorMatrix.ON_CONFIGURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ColorMatrix.ON_CREATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ColorMatrix.ON_UPGRADE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ColorMatrix.ON_DOWNGRADE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ColorMatrix.ON_OPEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        read = iArr;
    }
}
