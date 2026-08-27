package o;

/* JADX INFO: loaded from: classes3.dex */
public final class restoreViewState implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    public static final restoreViewState read = new restoreViewState();
    private static int serializer;
    private static int write;

    static {
        int i = IconCompatParcelizer + 47;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        restoreChildFragmentState restorechildfragmentstate = new restoreChildFragmentState();
        int i2 = RemoteActionCompatParcelizer + 121;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return restorechildfragmentstate;
        }
        throw null;
    }
}
