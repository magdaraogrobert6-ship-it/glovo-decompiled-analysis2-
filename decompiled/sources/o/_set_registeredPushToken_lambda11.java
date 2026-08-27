package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class _set_registeredPushToken_lambda11 {
    private static int RemoteActionCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    private static int serializer;

    static {
        int[] iArr = new int[accessisInstanceStoppedp.values().length];
        try {
            iArr[accessisInstanceStoppedp.Available.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 47;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[accessisInstanceStoppedp.Unavailable.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[accessisInstanceStoppedp.Loading.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        read = iArr;
        int i3 = serializer + 33;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}
