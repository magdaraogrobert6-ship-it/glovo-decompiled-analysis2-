package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class takeOrElseBvjSTJw {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    static {
        int[] iArr = new int[serialize.values().length];
        try {
            iArr[serialize.NAVIGATION.ordinal()] = 1;
            int i = serializer + 5;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[serialize.OVERVIEW.ordinal()] = 2;
            int i3 = serializer + 53;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 2 / 5;
            } else {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        IconCompatParcelizer = iArr;
        int i6 = RemoteActionCompatParcelizer + 51;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 55 / 0;
        }
    }
}
