package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class WebViewRenderProcessClientFrameworkAdapter {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ WebViewRenderProcessClientFrameworkAdapter[] $VALUES;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public static final WebViewRenderProcessClientFrameworkAdapter STOP = new WebViewRenderProcessClientFrameworkAdapter("STOP", 0);
    public static final WebViewRenderProcessClientFrameworkAdapter RESUME = new WebViewRenderProcessClientFrameworkAdapter("RESUME", 1);

    private WebViewRenderProcessClientFrameworkAdapter(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 115;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    static {
        WebViewRenderProcessClientFrameworkAdapter[] webViewRenderProcessClientFrameworkAdapterArr$values = $values();
        $VALUES = webViewRenderProcessClientFrameworkAdapterArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) webViewRenderProcessClientFrameworkAdapterArr$values);
        int i = read + 7;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final /* synthetic */ WebViewRenderProcessClientFrameworkAdapter[] $values() {
        int i = 2 % 2;
        int i2 = write + 35;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        WebViewRenderProcessClientFrameworkAdapter[] webViewRenderProcessClientFrameworkAdapterArr = {STOP, RESUME};
        int i5 = i3 + 19;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return webViewRenderProcessClientFrameworkAdapterArr;
    }

    public static WebViewRenderProcessClientFrameworkAdapter valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 63;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        WebViewRenderProcessClientFrameworkAdapter webViewRenderProcessClientFrameworkAdapter = (WebViewRenderProcessClientFrameworkAdapter) Enum.valueOf(WebViewRenderProcessClientFrameworkAdapter.class, str);
        int i4 = write + 25;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return webViewRenderProcessClientFrameworkAdapter;
    }

    public static WebViewRenderProcessClientFrameworkAdapter[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 77;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        WebViewRenderProcessClientFrameworkAdapter[] webViewRenderProcessClientFrameworkAdapterArr = (WebViewRenderProcessClientFrameworkAdapter[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 33;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return webViewRenderProcessClientFrameworkAdapterArr;
    }
}
