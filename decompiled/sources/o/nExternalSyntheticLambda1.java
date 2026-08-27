package o;

/* JADX INFO: loaded from: classes3.dex */
public final class nExternalSyntheticLambda1 implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    public static final nExternalSyntheticLambda1 RemoteActionCompatParcelizer = new nExternalSyntheticLambda1();
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        int i = IconCompatParcelizer + 23;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        nExternalSyntheticLambda4 nexternalsyntheticlambda4 = new nExternalSyntheticLambda4();
        int i2 = serializer + 9;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return nexternalsyntheticlambda4;
        }
        throw null;
    }
}
