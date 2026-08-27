package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getDriver extends getInvalidationTracker {
    private static int read = 0;
    private static int write = 1;
    public static final getDriver RemoteActionCompatParcelizer = new getDriver();
    public static final getDriver IconCompatParcelizer = new getDriver();

    static {
        int i = write + 65;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
