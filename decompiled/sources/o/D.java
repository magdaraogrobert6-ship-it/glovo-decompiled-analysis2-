package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class D {
    private static int read = 1;
    private static int write;
    public static final f8 RemoteActionCompatParcelizer = new f8(0.0d, 0.0d);
    public static final g6 IconCompatParcelizer = new g6(0, 0, 0, 0);

    static {
        int i = write + 75;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
