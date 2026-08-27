package o;

/* JADX INFO: loaded from: classes3.dex */
public final class TextMeasurerCompanion implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static final TextMeasurerCompanion serializer = new TextMeasurerCompanion();
    private static int write;

    static {
        int i = read + 87;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        getPressedStyle getpressedstyle = new getPressedStyle();
        int i2 = write + 101;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return getpressedstyle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
