package o;

/* JADX INFO: loaded from: classes3.dex */
public final class d7 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public static final d7 read = new d7();
    public static final d7 write = new d7();

    static {
        int i = IconCompatParcelizer + 1;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
