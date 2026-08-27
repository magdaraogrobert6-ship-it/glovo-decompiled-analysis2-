package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ig implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final ig read = new ig();
    private static int serializer = 1;
    private static int write;

    static {
        int i = serializer + 11;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        igExternalSyntheticLambda2 igexternalsyntheticlambda2 = new igExternalSyntheticLambda2();
        int i2 = write + 9;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return igexternalsyntheticlambda2;
    }
}
