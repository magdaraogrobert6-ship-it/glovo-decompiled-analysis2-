package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r8lambdak0nm6YERYwcpP8UAjWvT2M86A4Y {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer;

    static {
        int[] iArr = new int[r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.values().length];
        try {
            iArr[r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.LOCATION.ordinal()] = 1;
            int i = serializer + 119;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.BLUETOOTH_SCAN.ordinal()] = 2;
            int i4 = IconCompatParcelizer + 15;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 3 % 2;
            } else {
                int i6 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}
