package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class toParagraphStyle {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    static {
        int[] iArr = new int[fromHtml.values().length];
        try {
            iArr[fromHtml.ERROR.ordinal()] = 1;
            int i = write + 17;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fromHtml.INFO.ordinal()] = 2;
            int i3 = write + 117;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        IconCompatParcelizer = iArr;
    }
}
