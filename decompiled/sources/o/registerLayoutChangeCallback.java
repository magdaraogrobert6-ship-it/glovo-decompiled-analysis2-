package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class registerLayoutChangeCallback {
    private static int IconCompatParcelizer = 0;
    public static final /* synthetic */ int[] read;
    private static int write = 1;

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
            int i = write + 63;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[endRearDisplaySession.PRIORITY_NO_POWER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        read = iArr;
        int i4 = IconCompatParcelizer + 105;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
