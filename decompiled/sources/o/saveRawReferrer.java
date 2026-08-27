package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class saveRawReferrer {
    private static int RemoteActionCompatParcelizer = 0;
    public static final /* synthetic */ int[] read;
    private static int write = 1;

    static {
        int[] iArr = new int[r8lambdahCMuiUVsRubxJCkqZuukT4uD724.values().length];
        try {
            iArr[r8lambdahCMuiUVsRubxJCkqZuukT4uD724.NEUTRAL.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 89;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r8lambdahCMuiUVsRubxJCkqZuukT4uD724.SUCCESS.ordinal()] = 2;
            int i4 = RemoteActionCompatParcelizer + 47;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r8lambdahCMuiUVsRubxJCkqZuukT4uD724.CRITICAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r8lambdahCMuiUVsRubxJCkqZuukT4uD724.ALERT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        read = iArr;
    }
}
