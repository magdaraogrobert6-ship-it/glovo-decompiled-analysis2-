package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AdjustBridgeInstance7 {
    private static int read = 1;
    public static final /* synthetic */ int[] serializer;
    private static int write;

    static {
        int[] iArr = new int[AdjustBridgeInstance2.values().length];
        try {
            iArr[AdjustBridgeInstance2.SELECTED.ordinal()] = 1;
            int i = write + 9;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdjustBridgeInstance2.DESELECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        serializer = iArr;
        int i4 = write + 15;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
