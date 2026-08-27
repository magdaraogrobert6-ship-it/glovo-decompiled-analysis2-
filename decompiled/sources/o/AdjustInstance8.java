package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AdjustInstance8 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[getDeduplicationId.values().length];
        try {
            iArr[getDeduplicationId.LATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getDeduplicationId.UPCOMING.ordinal()] = 2;
            int i = read + 65;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 5 / 5;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        serializer = iArr;
        int i4 = read + 33;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
    }
}
