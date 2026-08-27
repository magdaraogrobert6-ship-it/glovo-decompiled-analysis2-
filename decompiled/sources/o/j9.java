package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class j9 {
    private static int read = 0;
    private static int serializer = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[j7.values().length];
        try {
            iArr[j7.TURN_BY_TURN.ordinal()] = 1;
            int i = serializer + 95;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 3 / 5;
            } else {
                int i3 = 2 % 2;
            }
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j7.DEFAULT.ordinal()] = 2;
            int i4 = serializer + 23;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
    }
}
