package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class onDrawOver {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[PreferenceCategory.values().length];
        try {
            iArr[PreferenceCategory.WEB_INTEGRATION.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PreferenceCategory.DEEP_LINK.ordinal()] = 2;
            int i2 = RemoteActionCompatParcelizer + 25;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PreferenceCategory.EXTERNAL_URL.ordinal()] = 3;
            int i4 = IconCompatParcelizer + 35;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 3 / 2;
            } else {
                int i6 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        read = iArr;
    }
}
