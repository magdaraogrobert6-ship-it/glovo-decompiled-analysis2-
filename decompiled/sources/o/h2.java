package o;

/* JADX INFO: loaded from: classes3.dex */
public final class h2 implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public static final h2 write = new h2();

    static {
        int i = IconCompatParcelizer + 7;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        DraggableNode draggableNode = new DraggableNode(1);
        int i2 = RemoteActionCompatParcelizer + 19;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return draggableNode;
        }
        throw null;
    }
}
