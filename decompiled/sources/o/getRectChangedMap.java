package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getRectChangedMap {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer = 1;
    private static int write;

    static {
        int[] iArr = new int[setPaddingTop.values().length];
        try {
            iArr[setPaddingTop.HUAWEI.ordinal()] = 1;
            int i = 2 % 2;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setPaddingTop.GOOGLE.ordinal()] = 2;
            int i2 = write + 49;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        RemoteActionCompatParcelizer = iArr;
        int i4 = serializer + 11;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
    }
}
