package o;

/* JADX INFO: loaded from: classes3.dex */
public final class drawPoint extends drawPosText {
    public static final drawPoint read = new drawPoint();
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = serializer + 19;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
