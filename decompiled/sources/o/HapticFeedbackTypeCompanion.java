package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class HapticFeedbackTypeCompanion {
    private static int read = 1;
    public static final /* synthetic */ int[] serializer;
    private static int write;

    static {
        int[] iArr = new int[WebViewRenderProcessClientFrameworkAdapter.values().length];
        try {
            iArr[WebViewRenderProcessClientFrameworkAdapter.STOP.ordinal()] = 1;
            int i = write + 75;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebViewRenderProcessClientFrameworkAdapter.RESUME.ordinal()] = 2;
            int i4 = read + 115;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        serializer = iArr;
    }
}
