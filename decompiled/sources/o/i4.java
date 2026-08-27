package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class i4 {
    private static int IconCompatParcelizer = 0;
    public static final /* synthetic */ int[] serializer;
    private static int write = 1;

    static {
        int[] iArr = new int[onPrimaryNavigationFragmentChanged.values().length];
        try {
            iArr[onPrimaryNavigationFragmentChanged.COLLAPSED.ordinal()] = 1;
            int i = IconCompatParcelizer + 27;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[onPrimaryNavigationFragmentChanged.HALF_EXPANDED.ordinal()] = 2;
            int i3 = write + 75;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[onPrimaryNavigationFragmentChanged.EXPANDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        serializer = iArr;
    }
}
