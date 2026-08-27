package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class needsUpdate {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final setPresentationView serializer = new setPresentationView(2);

    static {
        int i = IconCompatParcelizer + 27;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 92 / 0;
        }
    }
}
