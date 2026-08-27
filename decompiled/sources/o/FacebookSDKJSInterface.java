package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class FacebookSDKJSInterface {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    static {
        int[] iArr = new int[AdjustBridgeUtil1.values().length];
        try {
            iArr[AdjustBridgeUtil1.BOTTOM.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 111;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdjustBridgeUtil1.TOP.ordinal()] = 2;
            int i4 = serializer + 7;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        IconCompatParcelizer = iArr;
    }
}
