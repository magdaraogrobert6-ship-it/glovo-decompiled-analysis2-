package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class readPackageQueueI {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer = 1;
    private static int write;

    static {
        int[] iArr = new int[setOnSessionTrackingSucceededListener.values().length];
        try {
            iArr[setOnSessionTrackingSucceededListener.VISIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setOnSessionTrackingSucceededListener.PLACEBO.ordinal()] = 2;
            int i = write + 57;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[setOnSessionTrackingSucceededListener.HIDDEN.ordinal()] = 3;
            int i4 = write + 9;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}
