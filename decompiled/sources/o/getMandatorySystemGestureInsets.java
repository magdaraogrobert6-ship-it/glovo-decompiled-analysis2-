package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getMandatorySystemGestureInsets implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public static final getMandatorySystemGestureInsets write = new getMandatorySystemGestureInsets();

    static {
        int i = RemoteActionCompatParcelizer + 81;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        getStableInsets getstableinsets = new getStableInsets();
        int i2 = read + 75;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
        return getstableinsets;
    }
}
