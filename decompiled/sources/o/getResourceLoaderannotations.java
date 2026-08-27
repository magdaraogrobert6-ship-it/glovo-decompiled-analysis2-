package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getResourceLoaderannotations implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public static final getResourceLoaderannotations write = new getResourceLoaderannotations();

    static {
        int i = read + 13;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        copyhu1Yfodefault copyhu1yfodefault = new copyhu1Yfodefault();
        int i2 = serializer + 123;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return copyhu1yfodefault;
    }
}
