package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wg {
    public static final setPresentationView IconCompatParcelizer = new setPresentationView(25);
    private static int read = 0;
    private static int write = 1;

    static {
        int i = write + 7;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
