package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class validateRequestPermissionsRequestCode {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[SetRetainInstanceUsageViolation.values().length];
        try {
            iArr[SetRetainInstanceUsageViolation.TOP.ordinal()] = 1;
            int i = write + 55;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SetRetainInstanceUsageViolation.BOTTOM.ordinal()] = 2;
            int i3 = write + 39;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        IconCompatParcelizer = iArr;
    }
}
