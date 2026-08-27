package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class WindowInsetsAnimationCompatCallback {
    private static int RemoteActionCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    private static int serializer;

    static {
        int[] iArr = new int[instantiateActivity.values().length];
        try {
            iArr[instantiateActivity.GO_AND_START.ordinal()] = 1;
            int i = serializer + 27;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[instantiateActivity.NOT_AVAILABLE_YET.ordinal()] = 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[instantiateActivity.NOT_AVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[instantiateActivity.START_NOW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        read = iArr;
        int i5 = serializer + 93;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
