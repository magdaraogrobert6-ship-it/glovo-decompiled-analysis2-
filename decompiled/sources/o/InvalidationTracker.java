package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InvalidationTracker {
    private static int RemoteActionCompatParcelizer = 0;
    public static final setPresentationView serializer = new setPresentationView(3);
    private static int write = 1;

    static {
        int i = write + 59;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
