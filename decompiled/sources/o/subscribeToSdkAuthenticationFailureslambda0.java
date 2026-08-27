package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class subscribeToSdkAuthenticationFailureslambda0 {
    private static int read = 0;
    private static int serializer = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[subscribeToNoMatchingTriggerForEventlambda0.values().length];
        try {
            iArr[subscribeToNoMatchingTriggerForEventlambda0.POSITIVE.ordinal()] = 1;
            int i = serializer + 107;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[subscribeToNoMatchingTriggerForEventlambda0.NEGATIVE.ordinal()] = 2;
            int i4 = read + 115;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
        int i6 = read + 47;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
