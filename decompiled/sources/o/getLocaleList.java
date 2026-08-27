package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class getLocaleList {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[getFontFamilyResolver.values().length];
        serializer = iArr;
        try {
            iArr[getFontFamilyResolver.NoChange.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            serializer[getFontFamilyResolver.Added.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            serializer[getFontFamilyResolver.Removed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            serializer[getFontFamilyResolver.Current.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            serializer[getFontFamilyResolver.Reset.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
