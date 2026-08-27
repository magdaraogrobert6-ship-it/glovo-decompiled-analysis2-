package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getLeadingMargin implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public static final getLeadingMargin write = new getLeadingMargin();

    static {
        int i = RemoteActionCompatParcelizer + 55;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        com.huawei.wisesecurity.ucs_credential.n0 n0Var = new com.huawei.wisesecurity.ucs_credential.n0();
        int i2 = serializer + 61;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return n0Var;
    }
}
