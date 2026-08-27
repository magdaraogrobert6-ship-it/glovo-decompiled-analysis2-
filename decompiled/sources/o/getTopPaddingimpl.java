package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getTopPaddingimpl implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    public static final getTopPaddingimpl RemoteActionCompatParcelizer = new getTopPaddingimpl();
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;

    static {
        int i = write + 65;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        getVerticalPaddings getverticalpaddings = new getVerticalPaddings();
        int i2 = serializer + 19;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return getverticalpaddings;
    }
}
