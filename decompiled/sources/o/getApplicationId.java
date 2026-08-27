package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getApplicationId {
    private static int RemoteActionCompatParcelizer = 0;
    public static final /* synthetic */ int[] read;
    private static int serializer = 1;

    static {
        int[] iArr = new int[AdjustBridgeUtil1.values().length];
        try {
            iArr[AdjustBridgeUtil1.TOP.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 53;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdjustBridgeUtil1.BOTTOM.ordinal()] = 2;
            int i4 = RemoteActionCompatParcelizer + 79;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
    }
}
