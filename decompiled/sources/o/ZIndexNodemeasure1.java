package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ZIndexNodemeasure1 {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[androidx.compose.ui.unit.LayoutDirection.values().length];
        try {
            iArr[androidx.compose.ui.unit.LayoutDirection.Ltr.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[androidx.compose.ui.unit.LayoutDirection.Rtl.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
    }
}
