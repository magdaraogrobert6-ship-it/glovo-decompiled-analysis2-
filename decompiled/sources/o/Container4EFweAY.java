package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class Container4EFweAY {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[OutlinedTextField.values().length];
        try {
            iArr[OutlinedTextField.ExpandIndicator.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OutlinedTextField.ExpandOrCollapseIndicator.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        IconCompatParcelizer = iArr;
    }
}
