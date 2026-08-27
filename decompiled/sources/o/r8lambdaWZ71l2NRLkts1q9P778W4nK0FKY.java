package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r8lambdaWZ71l2NRLkts1q9P778W4nK0FKY {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    private static int serializer;

    static {
        int[] iArr = new int[r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.values().length];
        try {
            iArr[r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.NAVIGATION_AVOID_HIGHWAYS.ordinal()] = 1;
            int i = IconCompatParcelizer + 93;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.NAVIGATION_AVOID_TOLLS.ordinal()] = 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
        int i5 = serializer + 115;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
