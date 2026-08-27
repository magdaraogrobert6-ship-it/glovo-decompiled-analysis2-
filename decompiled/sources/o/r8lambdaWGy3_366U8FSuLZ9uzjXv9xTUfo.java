package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r8lambdaWGy3_366U8FSuLZ9uzjXv9xTUfo {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] read;
    private static int serializer = 1;
    private static int write;

    static {
        int[] iArr = new int[accessgetStrictcp.values().length];
        try {
            iArr[accessgetStrictcp.IN_APP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[accessgetStrictcp.EXTERNAL.ordinal()] = 2;
            int i = serializer + 69;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 4 % 5;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        IconCompatParcelizer = iArr;
        int[] iArr2 = new int[r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.values().length];
        try {
            iArr2[r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.NAVIGATION_AVOID_HIGHWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.NAVIGATION_AVOID_TOLLS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        read = iArr2;
        int i4 = serializer + 7;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
