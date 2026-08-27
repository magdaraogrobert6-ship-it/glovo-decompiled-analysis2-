package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getReenterTransition extends getSharedElementReturnTransition {
    private static int read = 1;
    public static final getReenterTransition serializer = new getReenterTransition();
    private static int write;

    static {
        int i = read + 59;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
