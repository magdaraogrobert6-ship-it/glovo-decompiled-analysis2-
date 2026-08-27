package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class applyToInternal {
    public static final android.util.Size IconCompatParcelizer = new android.util.Size(1920, 1080);
    private static int read = 0;
    private static int write = 1;

    static {
        int i = write + 115;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
