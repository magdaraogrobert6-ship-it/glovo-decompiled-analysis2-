package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r8lambdaIUgIF60yxchsI7nQxjvU_harh7Y {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer = 1;
    private static int write;

    static {
        int[] iArr = new int[r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.values().length];
        try {
            iArr[r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.CAMERA.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.LOCATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.NOTIFICATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.ACTIVITY_RECOGNITION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.BLUETOOTH_SCAN.ordinal()] = 5;
            int i2 = write + 61;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused5) {
        }
        RemoteActionCompatParcelizer = iArr;
        int i4 = write + 121;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
