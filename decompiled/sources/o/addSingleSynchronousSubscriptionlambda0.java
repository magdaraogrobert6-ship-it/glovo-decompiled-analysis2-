package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class addSingleSynchronousSubscriptionlambda0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[getDeduplicationId.values().length];
        try {
            iArr[getDeduplicationId.UPCOMING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getDeduplicationId.LATE.ordinal()] = 2;
            int i = read + 67;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        serializer = iArr;
        int i4 = IconCompatParcelizer + 55;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
    }
}
