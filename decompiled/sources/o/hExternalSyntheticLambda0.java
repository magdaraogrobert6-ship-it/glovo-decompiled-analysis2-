package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class hExternalSyntheticLambda0 {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[g1.values().length];
        try {
            iArr[g1.CIRCLE.ordinal()] = 1;
            int i = write + 13;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g1.ROUNDED_SQUARE.ordinal()] = 2;
            int i4 = serializer + 123;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}
