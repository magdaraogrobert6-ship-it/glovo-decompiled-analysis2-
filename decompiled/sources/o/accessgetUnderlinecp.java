package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class accessgetUnderlinecp {
    private static int IconCompatParcelizer = 0;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int read = 1;

    static {
        int[] iArr = new int[valueOfIgVj0fw.values().length];
        try {
            iArr[valueOfIgVj0fw.NAVIGATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[valueOfIgVj0fw.OVERVIEW.ordinal()] = 2;
            int i = IconCompatParcelizer + 55;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        RemoteActionCompatParcelizer = iArr;
        int i3 = IconCompatParcelizer + 101;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 47 / 0;
        }
    }
}
