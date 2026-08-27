package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class h1 {
    public static final /* synthetic */ int[] read;
    private static int serializer = 1;
    private static int write;

    static {
        int[] iArr = new int[g1.values().length];
        try {
            iArr[g1.CIRCLE.ordinal()] = 1;
            int i = serializer + 31;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 3 / 3;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g1.ROUNDED_SQUARE.ordinal()] = 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
        int i5 = serializer + 109;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
