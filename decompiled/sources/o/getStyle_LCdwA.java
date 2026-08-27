package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getStyle_LCdwA implements getColorIntegerOrNulllambda0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public static final getStyle_LCdwA read = new getStyle_LCdwA(1);
    public static final getStyle_LCdwA IconCompatParcelizer = new getStyle_LCdwA(0);

    public /* synthetic */ getStyle_LCdwA(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    static {
        int i = write + 73;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 69;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.RemoteActionCompatParcelizer == 0) {
            return new loadCachedui_text();
        }
        AndroidFontResolveInterceptor_androidKt androidFontResolveInterceptor_androidKt = new AndroidFontResolveInterceptor_androidKt();
        int i4 = MediaMetadataCompat + 69;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return androidFontResolveInterceptor_androidKt;
    }
}
