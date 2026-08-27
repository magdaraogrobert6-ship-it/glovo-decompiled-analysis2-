package o;

/* JADX INFO: loaded from: classes3.dex */
public final class extractStyleFromNotification extends constructStyleForExtras {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public static final extractStyleFromNotification read = new extractStyleFromNotification();

    static {
        int i = RemoteActionCompatParcelizer + 63;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
