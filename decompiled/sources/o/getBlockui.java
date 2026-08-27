package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class getBlockui {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[hasSpecifiedAndFiniteHeightuvyYCjk.values().length];
        try {
            iArr[hasSpecifiedAndFiniteHeightuvyYCjk.FIXED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_PARENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        serializer = iArr;
    }
}
