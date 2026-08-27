package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getDefaultjp8hJ3c {
    private static int RemoteActionCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    private static int write;

    static {
        int[] iArr = new int[accessgetStrictcp.values().length];
        try {
            iArr[accessgetStrictcp.IN_APP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[accessgetStrictcp.EXTERNAL.ordinal()] = 2;
            int i = RemoteActionCompatParcelizer + 71;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
        int i4 = write + 45;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
