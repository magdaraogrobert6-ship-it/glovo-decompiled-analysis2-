package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class PathIteratorConicEvaluation {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[getBlurRadius.values().length];
        try {
            iArr[getBlurRadius.FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getBlurRadius.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
    }
}
