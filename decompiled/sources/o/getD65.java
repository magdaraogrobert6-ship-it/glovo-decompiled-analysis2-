package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class getD65 {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[getD75.values().length];
        serializer = iArr;
        try {
            iArr[getD75.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            serializer[getD75.SAVE_LAYER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            serializer[getD75.BITMAP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            serializer[getD75.RENDER_NODE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
