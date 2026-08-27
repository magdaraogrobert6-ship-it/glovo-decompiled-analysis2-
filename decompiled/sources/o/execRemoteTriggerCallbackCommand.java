package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class execRemoteTriggerCallbackCommand {
    private static int IconCompatParcelizer = 0;
    public static final /* synthetic */ int[] serializer;
    private static int write = 1;

    static {
        int[] iArr = new int[AdjustBridgeInstance9.values().length];
        try {
            iArr[AdjustBridgeInstance9.NUMERIC.ordinal()] = 1;
            int i = IconCompatParcelizer + 35;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 / 4;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdjustBridgeInstance9.ALPHA_NUMERIC.ordinal()] = 2;
            int i4 = write + 3;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        serializer = iArr;
    }
}
