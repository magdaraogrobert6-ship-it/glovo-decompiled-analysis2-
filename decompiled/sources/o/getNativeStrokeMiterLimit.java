package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class getNativeStrokeMiterLimit {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[getNativeStrokeWidth.values().length];
        serializer = iArr;
        try {
            iArr[getNativeStrokeWidth.RUNNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            serializer[getNativeStrokeWidth.FINISHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
