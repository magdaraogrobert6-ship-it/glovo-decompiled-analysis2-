package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r8lambdaSr0pDLWOngOPA4Ci9bmOn_XoXs {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int read = 1;
    private static int write;

    static {
        int[] iArr = new int[setFirstVerticalStyle.values().length];
        try {
            iArr[setFirstVerticalStyle.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setFirstVerticalStyle.LIGHT.ordinal()] = 2;
            int i = read + 125;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[setFirstVerticalStyle.SYSTEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
        int i3 = read + 77;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
