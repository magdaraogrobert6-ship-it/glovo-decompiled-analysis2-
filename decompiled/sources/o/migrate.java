package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class migrate {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[bindLong.values().length];
        try {
            iArr[bindLong.HUAWEI.ordinal()] = 1;
            int i = write + 85;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bindLong.GOOGLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        IconCompatParcelizer = iArr;
        int i4 = RemoteActionCompatParcelizer + 117;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
