package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AdjustInstance6 {
    private static int IconCompatParcelizer = 0;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer = 1;

    static {
        int[] iArr = new int[sc.values().length];
        try {
            iArr[sc.SCHEDULE.ordinal()] = 1;
            int i = IconCompatParcelizer + 103;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sc.START_NOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        RemoteActionCompatParcelizer = iArr;
        int i3 = IconCompatParcelizer + 63;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
