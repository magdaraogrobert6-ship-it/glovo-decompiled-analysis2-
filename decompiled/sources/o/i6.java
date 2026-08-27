package o;

/* JADX INFO: loaded from: classes3.dex */
public final class i6 implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    public static final i6 RemoteActionCompatParcelizer = new i6();
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        int i = write + 3;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        i3 i3Var = new i3();
        int i2 = IconCompatParcelizer + 9;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return i3Var;
        }
        throw null;
    }
}
