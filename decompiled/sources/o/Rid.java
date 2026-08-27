package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class Rid {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

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
        RemoteActionCompatParcelizer = iArr;
    }
}
