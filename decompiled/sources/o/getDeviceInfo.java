package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getDeviceInfo {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final r8lambdazvX83UIDsL68vmN7rPQXcY0mE serializer = new r8lambdazvX83UIDsL68vmN7rPQXcY0mE(12);

    static {
        int i = RemoteActionCompatParcelizer + 33;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
