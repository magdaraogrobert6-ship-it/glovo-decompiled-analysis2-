package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class setInputModeiuPiT84 {
    private static int read = 1;
    private static int serializer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[AndroidIndirectPointerEvent.values().length];
        try {
            iArr[AndroidIndirectPointerEvent.Start.ordinal()] = 1;
            int i = serializer + 67;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 / 3;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AndroidIndirectPointerEvent.Stop.ordinal()] = 2;
            int i4 = serializer + 11;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
    }
}
