package o;

/* JADX INFO: loaded from: classes3.dex */
public final class mc implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer;
    private static int read;
    public static final mc write = new mc(1);
    public final /* synthetic */ int serializer;

    public /* synthetic */ mc(int i) {
        this.serializer = i;
    }

    static {
        int i = IconCompatParcelizer + 71;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.serializer;
        if (i3 != 0) {
            return i3 != 1 ? new mb(new m3()) : new m3();
        }
        ma maVar = new ma();
        int i4 = RemoteActionCompatParcelizer + 95;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return maVar;
    }
}
