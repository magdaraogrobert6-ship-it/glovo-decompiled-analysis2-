package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h4 {
    private static int RemoteActionCompatParcelizer = 0;
    public static final int serializer = android.graphics.Color.parseColor("#00E00000");
    private static int write = 1;

    static {
        int i = RemoteActionCompatParcelizer + 33;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
