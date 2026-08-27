package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getImportance {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[instantiateActivity.values().length];
        try {
            iArr[instantiateActivity.START_NOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[instantiateActivity.GO_AND_START.ordinal()] = 2;
            int i = IconCompatParcelizer + 69;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[instantiateActivity.NOT_AVAILABLE_YET.ordinal()] = 3;
            int i4 = RemoteActionCompatParcelizer + 89;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[instantiateActivity.NOT_AVAILABLE.ordinal()] = 4;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        serializer = iArr;
    }
}
