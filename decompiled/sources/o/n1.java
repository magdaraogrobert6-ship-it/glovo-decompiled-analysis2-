package o;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    public static final n1 read = new n1();
    private static int serializer = 1;
    private static int write;

    static {
        int i = write + 11;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        n0 n0Var = new n0();
        int i2 = RemoteActionCompatParcelizer + 123;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return n0Var;
    }
}
