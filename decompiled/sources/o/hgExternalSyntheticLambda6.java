package o;

/* JADX INFO: loaded from: classes3.dex */
public final class hgExternalSyntheticLambda6 implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int RatingCompat = 1;
    private static int read = 0;
    public static final hgExternalSyntheticLambda6 serializer = new hgExternalSyntheticLambda6(0);
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ hgExternalSyntheticLambda6(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    static {
        int i = IconCompatParcelizer + 15;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = read + 93;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.RemoteActionCompatParcelizer != 0) {
            new AndroidUiDispatcherCompanioncurrentThread1(17);
            return new h7();
        }
        hf hfVar = new hf();
        int i4 = read + 45;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return hfVar;
    }
}
