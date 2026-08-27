package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class setUserVisibleHint {
    private static int RemoteActionCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    private static int write;

    static {
        int[] iArr = new int[setEnterTransition.values().length];
        try {
            iArr[setEnterTransition.LARGE.ordinal()] = 1;
            int i = write + 63;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setEnterTransition.EXTRA_LARGE.ordinal()] = 2;
            int i4 = write + 7;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
    }
}
