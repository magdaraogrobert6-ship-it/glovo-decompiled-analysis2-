package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class generateDefaultLayoutParams {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int read = 1;
    private static int write;

    static {
        int[] iArr = new int[addID.values().length];
        try {
            iArr[addID.VALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[addID.INVALID.ordinal()] = 2;
            int i = write + 29;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[addID.CORRUPT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
        int i3 = write + 113;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}
