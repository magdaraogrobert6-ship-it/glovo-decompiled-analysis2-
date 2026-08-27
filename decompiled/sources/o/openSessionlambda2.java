package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class openSessionlambda2 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[onServiceConnected.values().length];
        try {
            iArr[onServiceConnected.WORK_NOW.ordinal()] = 1;
            int i = IconCompatParcelizer + 13;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[onServiceConnected.WORK_NOW_LOW_FILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[onServiceConnected.GO_AND_START_NOW.ordinal()] = 3;
            int i3 = serializer + 3;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        write = iArr;
    }
}
