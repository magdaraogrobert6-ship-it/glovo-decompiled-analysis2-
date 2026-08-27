package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class hasValidPointerSource {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[getAutofillTree.values().length];
        try {
            iArr[getAutofillTree.Expanded.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getAutofillTree.PartiallyExpanded.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        serializer = iArr;
    }
}
