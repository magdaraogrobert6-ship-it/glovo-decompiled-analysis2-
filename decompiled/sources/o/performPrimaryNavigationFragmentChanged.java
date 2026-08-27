package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class performPrimaryNavigationFragmentChanged {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[requireParentFragment.values().length];
        try {
            iArr[requireParentFragment.PREPARING_TO_WORK.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 37;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[requireParentFragment.PICK_UP_DROP_OFF.ordinal()] = 2;
            int i4 = read + 27;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
        int i7 = RemoteActionCompatParcelizer + 43;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
