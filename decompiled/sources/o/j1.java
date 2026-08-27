package o;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 implements getColorIntegerOrNulllambda0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public static final j1 write = new j1(1);
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ j1(int i) {
        this.IconCompatParcelizer = i;
    }

    static {
        int i = RemoteActionCompatParcelizer + 19;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = serializer + 43;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        if (i3 == 0) {
            write.write();
            return new ihExternalSyntheticLambda2();
        }
        if (i3 == 1) {
            return new setLayoutState(1);
        }
        if (i3 == 2) {
            j2 j2Var = new j2();
            int i4 = MediaBrowserCompatMediaItem + 77;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return j2Var;
        }
        if (i3 == 3) {
            return new j5();
        }
        int i6 = 17;
        if (i3 != 4) {
            return new jf(new AndroidUiDispatcherCompanioncurrentThread1(i6), new AndroidUiFrameClock(), (DraggableNode) h2.write.write());
        }
        new AndroidUiDispatcherCompanioncurrentThread1(i6);
        return new jb();
    }
}
