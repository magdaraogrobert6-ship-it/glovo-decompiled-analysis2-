package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getStringBounds implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public static final getStringBounds read = new getStringBounds(0);
    private static int write;
    public final /* synthetic */ int serializer;

    public /* synthetic */ getStringBounds(int i) {
        this.serializer = i;
    }

    static {
        int i = write + 103;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 28 / 0;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.serializer != 0) {
            return new com.huawei.wisesecurity.ucs_credential.p0(new com.huawei.wisesecurity.ucs_credential.n0());
        }
        StaticLayoutFactory staticLayoutFactory = new StaticLayoutFactory();
        int i4 = RatingCompat + 51;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return staticLayoutFactory;
    }
}
