package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getGooglePlayInstant {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[setReferrer.values().length];
        try {
            iArr[setReferrer.BACKGROUND_LOCATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setReferrer.ACTIVITY_RECOGNITION.ordinal()] = 2;
            int i = serializer + 39;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 4 / 2;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[setReferrer.DISABLE_BATTERY_OPTIMIZATION.ordinal()] = 3;
            int i4 = serializer + 99;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        write = iArr;
        int i7 = RemoteActionCompatParcelizer + 101;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }
}
