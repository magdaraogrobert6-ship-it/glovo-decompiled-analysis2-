package o;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdasetSendingReferrersAsNotSent2 implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final lambdasetSendingReferrersAsNotSent2 serializer = new lambdasetSendingReferrersAsNotSent2();
    private static int write;

    static {
        int i = read + 21;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21 = new BrazeCompanionExternalSyntheticLambda21(8);
        int i2 = RemoteActionCompatParcelizer + 87;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return brazeCompanionExternalSyntheticLambda21;
        }
        throw null;
    }
}
