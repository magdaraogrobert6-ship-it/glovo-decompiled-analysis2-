package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class setHorizontalAlign {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    static {
        int[] iArr = new int[setFirstVerticalStyle.values().length];
        try {
            iArr[setFirstVerticalStyle.DARK.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 65;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setFirstVerticalStyle.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[setFirstVerticalStyle.SYSTEM.ordinal()] = 3;
            int i3 = read + 101;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
        int i6 = read + 83;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
