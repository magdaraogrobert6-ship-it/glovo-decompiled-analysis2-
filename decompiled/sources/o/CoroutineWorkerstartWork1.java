package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class CoroutineWorkerstartWork1 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[endRearDisplaySession.values().length];
        try {
            iArr[endRearDisplaySession.PRIORITY_HIGH_ACCURACY.ordinal()] = 1;
            int i = read + 11;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[endRearDisplaySession.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[endRearDisplaySession.PRIORITY_LOW_POWER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[endRearDisplaySession.PRIORITY_NO_POWER.ordinal()] = 4;
            int i3 = RemoteActionCompatParcelizer + 113;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        serializer = iArr;
    }
}
