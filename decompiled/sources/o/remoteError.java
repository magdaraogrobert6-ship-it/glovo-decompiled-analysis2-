package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class remoteError {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    private static int serializer;

    static {
        int[] iArr = new int[shouldRetryToSendWithUrlStrategy.values().length];
        try {
            iArr[shouldRetryToSendWithUrlStrategy.Neutral.ordinal()] = 1;
            int i = IconCompatParcelizer + 125;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[shouldRetryToSendWithUrlStrategy.Alert.ordinal()] = 2;
            int i4 = serializer + 117;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[shouldRetryToSendWithUrlStrategy.Error.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        read = iArr;
    }
}
