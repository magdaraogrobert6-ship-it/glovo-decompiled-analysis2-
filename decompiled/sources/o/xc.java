package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class xc {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[s8.values().length];
        try {
            iArr[s8.RUSH_BONUS.ordinal()] = 1;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s8.BAD_WEATHER.ordinal()] = 2;
            int i = IconCompatParcelizer + 49;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 4 % 5;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s8.NIGHT_BONUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s8.HOLIDAY_BONUS.ordinal()] = 4;
            int i4 = IconCompatParcelizer + 23;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[s8.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        write = iArr;
    }
}
