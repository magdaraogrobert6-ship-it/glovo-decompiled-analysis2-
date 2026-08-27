package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class fractionVisibleInWindow {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer = 1;
    private static int write;

    static {
        int[] iArr = new int[copyOhffZ5M.values().length];
        try {
            iArr[copyOhffZ5M.Dropoff.ordinal()] = 1;
            int i = write + 87;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 5 % 2;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        RemoteActionCompatParcelizer = iArr;
        int i4 = serializer + 27;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
    }
}
