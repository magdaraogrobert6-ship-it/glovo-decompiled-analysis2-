package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ImagePainter {
    private static int RemoteActionCompatParcelizer = 0;
    public static final r8lambdazvX83UIDsL68vmN7rPQXcY0mE read = new r8lambdazvX83UIDsL68vmN7rPQXcY0mE(1);
    private static int write = 1;

    static {
        int i = RemoteActionCompatParcelizer + 63;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
