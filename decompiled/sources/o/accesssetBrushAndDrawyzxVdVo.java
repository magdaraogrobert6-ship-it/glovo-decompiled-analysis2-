package o;

/* JADX INFO: loaded from: classes3.dex */
public final class accesssetBrushAndDrawyzxVdVo implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final accesssetBrushAndDrawyzxVdVo serializer = new accesssetBrushAndDrawyzxVdVo();
    private static int write;

    static {
        int i = read + 43;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        BulletSpan_androidKt bulletSpan_androidKt = new BulletSpan_androidKt();
        int i2 = RemoteActionCompatParcelizer + 103;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return bulletSpan_androidKt;
    }
}
