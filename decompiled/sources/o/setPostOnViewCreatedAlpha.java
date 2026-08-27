package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setPostOnViewCreatedAlpha implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public static final setPostOnViewCreatedAlpha write = new setPostOnViewCreatedAlpha();

    static {
        int i = RemoteActionCompatParcelizer + 55;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        setInitialSavedState setinitialsavedstate = new setInitialSavedState();
        int i2 = read + 101;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return setinitialsavedstate;
    }
}
