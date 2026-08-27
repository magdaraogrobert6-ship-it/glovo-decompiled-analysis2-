package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AndroidFontKt {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[doLoadui_text.values().length];
        try {
            iArr[doLoadui_text.NEUTRAL_PALE.ordinal()] = 1;
            int i = serializer + 17;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[doLoadui_text.WHITE_PALE.ordinal()] = 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[doLoadui_text.GREEN.ordinal()] = 3;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
        int i5 = write + 25;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
