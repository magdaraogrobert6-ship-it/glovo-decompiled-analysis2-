package o;

/* JADX INFO: loaded from: classes3.dex */
public final class n4ExternalSyntheticLambda0 implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final n4ExternalSyntheticLambda0 read = new n4ExternalSyntheticLambda0();
    private static int serializer = 1;
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 27;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        n6 n6Var = new n6();
        int i2 = IconCompatParcelizer + 1;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return n6Var;
        }
        throw null;
    }
}
