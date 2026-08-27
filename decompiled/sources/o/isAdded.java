package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class isAdded {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[access400.values().length];
        try {
            iArr[access400.Available.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[access400.Unavailable.ordinal()] = 2;
            int i = RemoteActionCompatParcelizer + 77;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[access400.Loading.ordinal()] = 3;
            int i3 = RemoteActionCompatParcelizer + 83;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        serializer = iArr;
    }
}
