package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getStoreInfo {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    private static int write;

    static {
        int[] iArr = new int[enableDeviceIdsReadingOnce.values().length];
        try {
            iArr[enableDeviceIdsReadingOnce.EXCELLENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[enableDeviceIdsReadingOnce.GOOD.ordinal()] = 2;
            int i = IconCompatParcelizer + 49;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[enableDeviceIdsReadingOnce.OKAY.ordinal()] = 3;
            int i4 = write + 87;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[enableDeviceIdsReadingOnce.POOR.ordinal()] = 4;
            int i6 = IconCompatParcelizer + 47;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        read = iArr;
    }
}
