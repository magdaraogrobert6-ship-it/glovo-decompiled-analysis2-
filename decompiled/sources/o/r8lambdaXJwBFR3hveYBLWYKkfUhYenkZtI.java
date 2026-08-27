package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r8lambdaXJwBFR3hveYBLWYKkfUhYenkZtI {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.values().length];
        try {
            iArr[r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.NAVIGATION_AVOID_HIGHWAYS.ordinal()] = 1;
            int i = IconCompatParcelizer + 93;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.NAVIGATION_AVOID_TOLLS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
        int i4 = IconCompatParcelizer + 35;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
