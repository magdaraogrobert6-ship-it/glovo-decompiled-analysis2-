package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class setBaselineShift_isdbwI {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[getFontSynthesisZQGJjVo.values().length];
        serializer = iArr;
        try {
            iArr[getFontSynthesisZQGJjVo.KANJI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            serializer[getFontSynthesisZQGJjVo.ALPHANUMERIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            serializer[getFontSynthesisZQGJjVo.NUMERIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            serializer[getFontSynthesisZQGJjVo.BYTE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            serializer[getFontSynthesisZQGJjVo.ECI.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
