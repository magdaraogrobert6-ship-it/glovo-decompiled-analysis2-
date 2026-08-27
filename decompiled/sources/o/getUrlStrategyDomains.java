package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getUrlStrategyDomains {
    private static int read = 0;
    private static int serializer = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[enableDeviceIdsReadingOnce.values().length];
        try {
            iArr[enableDeviceIdsReadingOnce.EXCELLENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[enableDeviceIdsReadingOnce.GOOD.ordinal()] = 2;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[enableDeviceIdsReadingOnce.OKAY.ordinal()] = 3;
            int i2 = serializer + 113;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[enableDeviceIdsReadingOnce.POOR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        write = iArr;
        int i5 = read + 115;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
