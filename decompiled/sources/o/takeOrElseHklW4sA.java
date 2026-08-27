package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class takeOrElseHklW4sA {
    private static int read = 0;
    public static final /* synthetic */ int[] serializer;
    private static int write = 1;

    static {
        int[] iArr = new int[childSerializers.values().length];
        try {
            iArr[childSerializers.UNAVAILABLE.ordinal()] = 1;
            int i = read + 95;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[childSerializers.ENABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[childSerializers.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        serializer = iArr;
        int i4 = write + 29;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
