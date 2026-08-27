package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r8lambdaNLh2unasuTAJyl7UfQl7Zvjqkp0 {
    private static int read = 0;
    public static final /* synthetic */ int[] serializer;
    private static int write = 1;

    static {
        int[] iArr = new int[r8lambdaSNLjO_HuHH0BcjkmeJ_eXZT7iMA.values().length];
        try {
            iArr[r8lambdaSNLjO_HuHH0BcjkmeJ_eXZT7iMA.OPEN_SETTINGS.ordinal()] = 1;
            int i = read + 53;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r8lambdaSNLjO_HuHH0BcjkmeJ_eXZT7iMA.CLOSE_SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        serializer = iArr;
        int i3 = write + 29;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 61 / 0;
        }
    }
}
