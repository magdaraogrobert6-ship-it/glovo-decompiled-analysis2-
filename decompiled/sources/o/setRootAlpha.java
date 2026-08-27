package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class setRootAlpha {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[RoomOpenHelperDelegate.values().length];
        try {
            iArr[RoomOpenHelperDelegate.HeadLeft.ordinal()] = 1;
            int i = IconCompatParcelizer + 95;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RoomOpenHelperDelegate.HeadRight.ordinal()] = 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RoomOpenHelperDelegate.Smile.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        write = iArr;
        int i5 = read + 79;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
    }
}
