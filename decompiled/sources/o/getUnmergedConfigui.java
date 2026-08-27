package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getUnmergedConfigui {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    private static int write;

    static {
        int[] iArr = new int[semanticsdefault.values().length];
        try {
            iArr[semanticsdefault.NEUTRAL.ordinal()] = 1;
            int i = write + 109;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[semanticsdefault.WARNING.ordinal()] = 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[semanticsdefault.URGENT.ordinal()] = 3;
            int i4 = IconCompatParcelizer + 117;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        read = iArr;
    }
}
