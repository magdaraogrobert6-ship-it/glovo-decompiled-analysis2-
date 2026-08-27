package o;

/* JADX INFO: loaded from: classes3.dex */
public final class DeviceInfoUtilDeviceIds implements getColorIntegerOrNulllambda0 {
    public static final DeviceInfoUtilDeviceIds IconCompatParcelizer = new DeviceInfoUtilDeviceIds();
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = RemoteActionCompatParcelizer + 77;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        reloadNonPlayIds reloadnonplayids = new reloadNonPlayIds();
        int i2 = write + 113;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return reloadnonplayids;
        }
        throw null;
    }
}
