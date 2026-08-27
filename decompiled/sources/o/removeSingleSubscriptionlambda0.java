package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class removeSingleSubscriptionlambda0 {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    static {
        int[] iArr = new int[r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU.values().length];
        try {
            iArr[r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU.SUCCESS.ordinal()] = 1;
            int i = read + 39;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU.FAILED.ordinal()] = 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU.CLOSED_BY_USER.ordinal()] = 3;
            int i5 = read + 13;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
    }
}
