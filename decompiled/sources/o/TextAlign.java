package o;

/* JADX INFO: loaded from: classes3.dex */
public final class TextAlign implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    public static final TextAlign RemoteActionCompatParcelizer = new TextAlign();
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = serializer + 91;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        ResolvedTextDirection resolvedTextDirection = new ResolvedTextDirection();
        int i2 = IconCompatParcelizer + 105;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return resolvedTextDirection;
        }
        throw null;
    }
}
