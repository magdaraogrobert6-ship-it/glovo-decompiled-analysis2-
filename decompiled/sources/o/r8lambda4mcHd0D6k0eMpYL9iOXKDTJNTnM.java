package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r8lambda4mcHd0D6k0eMpYL9iOXKDTJNTnM {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    static {
        int[] iArr = new int[setFirstVerticalStyle.values().length];
        try {
            iArr[setFirstVerticalStyle.LIGHT.ordinal()] = 1;
            int i = read + 63;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setFirstVerticalStyle.DARK.ordinal()] = 2;
            int i3 = RemoteActionCompatParcelizer + 51;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[setFirstVerticalStyle.SYSTEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
    }
}
