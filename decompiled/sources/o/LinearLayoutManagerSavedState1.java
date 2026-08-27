package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class LinearLayoutManagerSavedState1 {
    private static int RemoteActionCompatParcelizer = 0;
    public static final /* synthetic */ int[] read;
    private static int write = 1;

    static {
        int[] iArr = new int[PreferenceGroup.values().length];
        try {
            iArr[PreferenceGroup.WEB_INTEGRATION.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 83;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PreferenceGroup.DEEP_LINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
        int i4 = RemoteActionCompatParcelizer + 55;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
