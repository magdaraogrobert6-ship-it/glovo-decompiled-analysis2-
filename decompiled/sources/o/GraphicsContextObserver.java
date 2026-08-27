package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class GraphicsContextObserver {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[getGraphicsLayer.values().length];
        try {
            iArr[getGraphicsLayer.STRICT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getGraphicsLayer.LOG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[getGraphicsLayer.QUIET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
    }
}
