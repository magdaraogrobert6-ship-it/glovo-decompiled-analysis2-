package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class getUnspecifiedui_graphics {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[DoubleFunction.values().length];
        serializer = iArr;
        try {
            iArr[DoubleFunction.NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            serializer[DoubleFunction.BEGIN_ARRAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            serializer[DoubleFunction.BEGIN_OBJECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
