package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class setTranslateY {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[RoomOpenHelperDelegate.values().length];
        try {
            iArr[RoomOpenHelperDelegate.HeadLeft.ordinal()] = 1;
            int i = read + 99;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RoomOpenHelperDelegate.HeadRight.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RoomOpenHelperDelegate.Smile.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        write = iArr;
        int i4 = IconCompatParcelizer + 17;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
