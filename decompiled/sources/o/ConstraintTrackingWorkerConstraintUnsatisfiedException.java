package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ConstraintTrackingWorkerConstraintUnsatisfiedException {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    static {
        int[] iArr = new int[ActivityHandler.valuesCustom().length];
        try {
            iArr[ActivityHandler.ALREADY_AVAILABLE_NOT_REQUESTED.ordinal()] = 1;
            int i = read + 35;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActivityHandler.REQUESTED.ordinal()] = 2;
            int i3 = read + 119;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        IconCompatParcelizer = iArr;
    }
}
