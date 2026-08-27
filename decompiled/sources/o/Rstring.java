package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class Rstring {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[getAutofillTree.values().length];
        try {
            iArr[getAutofillTree.PartiallyExpanded.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getAutofillTree.Expanded.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[getAutofillTree.Hidden.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}
