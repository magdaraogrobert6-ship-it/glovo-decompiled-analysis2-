package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class OutlinedTextFieldMeasurePolicy {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[OutlinedTextField.values().length];
        try {
            iArr[OutlinedTextField.Visible.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OutlinedTextField.Clip.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OutlinedTextField.ExpandIndicator.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OutlinedTextField.ExpandOrCollapseIndicator.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        read = iArr;
    }
}
