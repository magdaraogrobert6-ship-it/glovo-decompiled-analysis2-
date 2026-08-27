package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class Predicate2 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[endRearDisplaySession.values().length];
        try {
            iArr[endRearDisplaySession.PRIORITY_HIGH_ACCURACY.ordinal()] = 1;
            int i = serializer + 117;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[endRearDisplaySession.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[endRearDisplaySession.PRIORITY_LOW_POWER.ordinal()] = 3;
            int i4 = RemoteActionCompatParcelizer + 55;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[endRearDisplaySession.PRIORITY_NO_POWER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        write = iArr;
        int i7 = RemoteActionCompatParcelizer + 59;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }
}
