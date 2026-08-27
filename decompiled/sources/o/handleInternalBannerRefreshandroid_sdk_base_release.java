package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class handleInternalBannerRefreshandroid_sdk_base_release {
    public static final /* synthetic */ int[] read;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[subscribeToNoMatchingTriggerForEventlambda0.values().length];
        try {
            iArr[subscribeToNoMatchingTriggerForEventlambda0.NEGATIVE.ordinal()] = 1;
            int i = write + 11;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[subscribeToNoMatchingTriggerForEventlambda0.POSITIVE.ordinal()] = 2;
            int i3 = serializer + 63;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
    }
}
