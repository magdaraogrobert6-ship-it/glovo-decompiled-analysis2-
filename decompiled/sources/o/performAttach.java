package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class performAttach {
    private static int read = 1;
    public static final /* synthetic */ int[] serializer;
    private static int write;

    static {
        int[] iArr = new int[onOptionsMenuClosed.values().length];
        try {
            iArr[onOptionsMenuClosed.HIDDEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[onOptionsMenuClosed.HEADER_ONLY.ordinal()] = 2;
            int i = read + 99;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[onOptionsMenuClosed.HEADER_AND_BODY.ordinal()] = 3;
            int i4 = write + 65;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 / 2;
            } else {
                int i6 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        serializer = iArr;
    }
}
