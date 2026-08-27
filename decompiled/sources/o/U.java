package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class U {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public static final f8 read = new f8(0.0d, 0.0d);
    public static final g6 IconCompatParcelizer = new g6(0, 0, 0, 0);

    static {
        int i = RemoteActionCompatParcelizer + 27;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
