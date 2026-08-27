package o;

/* JADX INFO: loaded from: classes3.dex */
public final class consumeDisplayCutout implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final consumeDisplayCutout serializer = new consumeDisplayCutout();
    private static int write;

    static {
        int i = read + 59;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        getWindowInsetsAnimationCompat getwindowinsetsanimationcompat = new getWindowInsetsAnimationCompat();
        int i2 = write + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return getwindowinsetsanimationcompat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
