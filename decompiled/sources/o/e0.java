package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class e0 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[L.values().length];
        try {
            iArr[L.DEFAULT.ordinal()] = 1;
            int i = IconCompatParcelizer + 97;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[L.LAST_STOP.ordinal()] = 2;
            int i4 = read + 7;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        serializer = iArr;
    }
}
