package o;

/* JADX INFO: loaded from: classes3.dex */
public final class HorizontalPositionCache implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public static final HorizontalPositionCache write = new HorizontalPositionCache();

    static {
        int i = RemoteActionCompatParcelizer + 119;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        last lastVar = new last();
        int i2 = serializer + 93;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return lastVar;
    }
}
