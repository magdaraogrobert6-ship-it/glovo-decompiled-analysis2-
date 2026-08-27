package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class access2000 {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[access1800.values().length];
        try {
            iArr[access1800.GMS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[access1800.HMS.ordinal()] = 2;
            int i = RemoteActionCompatParcelizer + 89;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[access1800.None.ordinal()] = 3;
            int i4 = RemoteActionCompatParcelizer + 45;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
    }
}
