package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class accessgetAltLeftcp {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

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
        RemoteActionCompatParcelizer = iArr;
    }
}
