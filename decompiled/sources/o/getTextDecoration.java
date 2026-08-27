package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class getTextDecoration {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[getFontSynthesisZQGJjVo.values().length];
        read = iArr;
        try {
            iArr[getFontSynthesisZQGJjVo.NUMERIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            read[getFontSynthesisZQGJjVo.ALPHANUMERIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            read[getFontSynthesisZQGJjVo.BYTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            read[getFontSynthesisZQGJjVo.KANJI.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
