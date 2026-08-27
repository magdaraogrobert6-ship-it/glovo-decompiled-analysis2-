package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class InlineClassUtils_androidKt {
    private static int IconCompatParcelizer = 0;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer = 1;

    static {
        int[] iArr = new int[doLoadui_text.values().length];
        try {
            iArr[doLoadui_text.NEUTRAL_PALE.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[doLoadui_text.WHITE_PALE.ordinal()] = 2;
            int i2 = IconCompatParcelizer + 7;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[doLoadui_text.GREEN.ordinal()] = 3;
            int i4 = IconCompatParcelizer + 41;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}
