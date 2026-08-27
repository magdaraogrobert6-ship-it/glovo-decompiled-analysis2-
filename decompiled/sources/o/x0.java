package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class x0 {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer = 1;
    private static int write;

    static {
        int[] iArr = new int[getDeduplicationId.values().length];
        try {
            iArr[getDeduplicationId.UPCOMING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getDeduplicationId.LATE.ordinal()] = 2;
            int i = write + 75;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 5 / 2;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[getDeduplicationId.CURRENT.ordinal()] = 3;
            int i4 = write + 39;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[getDeduplicationId.NEXT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        RemoteActionCompatParcelizer = iArr;
        int i7 = serializer + 77;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }
}
