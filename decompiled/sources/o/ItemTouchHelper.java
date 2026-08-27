package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ItemTouchHelper {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[format.values().length];
        try {
            iArr[format.WEB_INTEGRATION.ordinal()] = 1;
            int i = read + 53;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 4 % 2;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[format.DEEP_LINK.ordinal()] = 2;
            int i4 = read + 47;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[format.EXTERNAL_URL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        serializer = iArr;
    }
}
