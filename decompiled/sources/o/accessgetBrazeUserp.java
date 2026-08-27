package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class accessgetBrazeUserp {
    public static final /* synthetic */ int[] read;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[accessgetDeviceDataProvidercp.values().length];
        try {
            iArr[accessgetDeviceDataProvidercp.HIDE_SIDE_MENU.ordinal()] = 1;
            int i = write + 1;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        read = iArr;
        int i4 = write + 123;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
