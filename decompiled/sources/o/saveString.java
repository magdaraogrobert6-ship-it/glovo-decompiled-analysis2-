package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class saveString {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[saveLong.values().length];
        try {
            iArr[saveLong.DESTRUCTIVE.ordinal()] = 1;
            int i = read + 105;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 4 / 2;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[saveLong.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[saveLong.PRIMARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        write = iArr;
        int i4 = read + 81;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
