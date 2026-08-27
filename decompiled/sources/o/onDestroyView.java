package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class onDestroyView {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[onPrimaryNavigationFragmentChanged.values().length];
        try {
            iArr[onPrimaryNavigationFragmentChanged.COLLAPSED.ordinal()] = 1;
            int i = IconCompatParcelizer + 107;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[onPrimaryNavigationFragmentChanged.HALF_EXPANDED.ordinal()] = 2;
            int i3 = RemoteActionCompatParcelizer + 19;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[onPrimaryNavigationFragmentChanged.EXPANDED.ordinal()] = 3;
            int i5 = IconCompatParcelizer + 33;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        read = iArr;
    }
}
