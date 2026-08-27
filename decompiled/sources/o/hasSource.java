package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class hasSource {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[getAutofillTree.values().length];
        try {
            iArr[getAutofillTree.Hidden.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getAutofillTree.PartiallyExpanded.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[getAutofillTree.Expanded.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        read = iArr;
    }
}
