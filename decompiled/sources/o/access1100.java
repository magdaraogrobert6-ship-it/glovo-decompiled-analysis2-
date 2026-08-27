package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class access1100 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[access1800.values().length];
        try {
            iArr[access1800.HMS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[access1800.GMS.ordinal()] = 2;
            int i = serializer + 45;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[access1800.None.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        write = iArr;
        int i4 = IconCompatParcelizer + 63;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
