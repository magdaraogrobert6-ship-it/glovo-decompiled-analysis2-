package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class seekToStartTag {
    public static final /* synthetic */ int[] read;
    private static int serializer = 1;
    private static int write;

    static {
        int[] iArr = new int[WebViewRenderProcessClientFrameworkAdapter.values().length];
        try {
            iArr[WebViewRenderProcessClientFrameworkAdapter.RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebViewRenderProcessClientFrameworkAdapter.STOP.ordinal()] = 2;
            int i = serializer + 93;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
        int i3 = serializer + 31;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}
