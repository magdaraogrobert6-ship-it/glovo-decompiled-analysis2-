package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getOnAttributionChangedListener {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[enableCoppaCompliance.values().length];
        try {
            iArr[enableCoppaCompliance.HAPPY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[enableCoppaCompliance.SAD.ordinal()] = 2;
            int i = IconCompatParcelizer + 35;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[enableCoppaCompliance.UNKNOWN.ordinal()] = 3;
            int i3 = RemoteActionCompatParcelizer + 1;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        write = iArr;
    }
}
