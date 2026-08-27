package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class J {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int read = 1;
    private static int serializer;

    static {
        int[] iArr = new int[drawRGB.values().length];
        try {
            iArr[drawRGB.ACTIVE.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[drawRGB.INACTIVE.ordinal()] = 2;
            int i2 = serializer + 41;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        IconCompatParcelizer = iArr;
        int i5 = read + 97;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
