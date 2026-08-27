package o;

/* JADX INFO: loaded from: classes3.dex */
public final class n5 implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    public static final n5 read = new n5();
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = write + 29;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        n4 n4Var = new n4();
        int i2 = serializer + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return n4Var;
    }
}
