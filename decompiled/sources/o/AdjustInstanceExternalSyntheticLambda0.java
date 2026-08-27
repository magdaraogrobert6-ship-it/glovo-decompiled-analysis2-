package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AdjustInstanceExternalSyntheticLambda0 {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    private static int serializer;

    static {
        int[] iArr = new int[AdjustInstance11.values().length];
        try {
            iArr[AdjustInstance11.EXISTING_SHIFT.ordinal()] = 1;
            int i = IconCompatParcelizer + 51;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdjustInstance11.GO_AND_START.ordinal()] = 2;
            int i4 = serializer + 93;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
    }
}
