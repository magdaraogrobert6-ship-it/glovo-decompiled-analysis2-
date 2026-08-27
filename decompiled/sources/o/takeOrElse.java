package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class takeOrElse {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int read;

    static {
        int[] iArr = new int[getRtls_7Xco.values().length];
        try {
            iArr[getRtls_7Xco.ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getRtls_7Xco.OFF.ordinal()] = 2;
            int i = IconCompatParcelizer + 29;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[getRtls_7Xco.DISABLED.ordinal()] = 3;
            int i3 = read + 117;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}
