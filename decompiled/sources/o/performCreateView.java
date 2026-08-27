package o;

/* JADX INFO: loaded from: classes3.dex */
public final class performCreateView implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    public static final performCreateView RemoteActionCompatParcelizer = new performCreateView();
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;

    static {
        int i = serializer + 41;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        performActivityCreated performactivitycreated = new performActivityCreated();
        int i2 = write + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return performactivitycreated;
        }
        throw null;
    }
}
