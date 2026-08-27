package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getItemOffsets {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    static {
        int[] iArr = new int[notifyDataSetChanged.values().length];
        try {
            iArr[notifyDataSetChanged.PRIMARY_BIG.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[notifyDataSetChanged.PRIMARY_SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[notifyDataSetChanged.SECONDARY_BIG.ordinal()] = 3;
            int i2 = RemoteActionCompatParcelizer + 119;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[notifyDataSetChanged.SECONDARY_SMALL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        IconCompatParcelizer = iArr;
        int i5 = read + 119;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
