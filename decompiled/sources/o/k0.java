package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public static final f8 RemoteActionCompatParcelizer = new f8(0.0d, 0.0d);
    public static final g6 serializer = new g6(0, 0, 0, 0);

    static {
        int i = read + 99;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
