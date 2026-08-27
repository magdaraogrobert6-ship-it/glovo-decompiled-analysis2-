package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class lambda35 {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    static {
        int[] iArr = new int[lambda322.values().length];
        try {
            iArr[lambda322.TITLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lambda322.SUBTITLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lambda322.NORMAL.ordinal()] = 3;
            int i = read + 47;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
        int i4 = RemoteActionCompatParcelizer + 15;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
