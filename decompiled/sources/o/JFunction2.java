package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class JFunction2 {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer;

    static {
        int[] iArr = new int[endRearDisplaySession.values().length];
        try {
            iArr[endRearDisplaySession.PRIORITY_HIGH_ACCURACY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[endRearDisplaySession.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[endRearDisplaySession.PRIORITY_LOW_POWER.ordinal()] = 3;
            int i = IconCompatParcelizer + 51;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[endRearDisplaySession.PRIORITY_NO_POWER.ordinal()] = 4;
            int i4 = IconCompatParcelizer + 65;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}
