package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class access1400 {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    static {
        int[] iArr = new int[access1800.values().length];
        try {
            iArr[access1800.GMS.ordinal()] = 1;
            int i = serializer + 85;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[access1800.HMS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[access1800.None.ordinal()] = 3;
            int i4 = serializer + 15;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
    }
}
