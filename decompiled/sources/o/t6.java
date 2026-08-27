package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t6 {
    public static final getPhoneNumber IconCompatParcelizer = new getPhoneNumber(new wa(8));
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    public static final getPhoneNumber read() {
        int i = 2 % 2;
        int i2 = serializer + 83;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        getPhoneNumber getphonenumber = IconCompatParcelizer;
        int i5 = i3 + 85;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return getphonenumber;
        }
        throw null;
    }

    static {
        int i = read + 37;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 52 / 0;
        }
    }
}
