package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class rf {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int read = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[checkForPreinstallI.values().length];
        try {
            iArr[checkForPreinstallI.MIN.ordinal()] = 1;
            int i = read + 93;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 3 % 4;
            } else {
                int i3 = 2 % 2;
            }
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[checkForPreinstallI.LOW.ordinal()] = 2;
            int i4 = read + 53;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[checkForPreinstallI.NORMAL.ordinal()] = 3;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[checkForPreinstallI.HIGH.ordinal()] = 4;
            int i8 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        IconCompatParcelizer = iArr;
    }
}
