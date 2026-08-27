package o;

/* JADX INFO: loaded from: classes3.dex */
public final class nExternalSyntheticLambda3 implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static final nExternalSyntheticLambda3 serializer = new nExternalSyntheticLambda3();
    private static int write = 1;

    static {
        int i = write + 97;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        nExternalSyntheticLambda2 nexternalsyntheticlambda2 = new nExternalSyntheticLambda2();
        int i2 = RemoteActionCompatParcelizer + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return nexternalsyntheticlambda2;
    }
}
