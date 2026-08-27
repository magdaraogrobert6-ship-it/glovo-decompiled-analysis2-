package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l0 {
    public static final long IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    public static final /* synthetic */ long write() {
        int i = 2 % 2;
        int i2 = write + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        long j = IconCompatParcelizer;
        int i5 = i3 + 75;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    static {
        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        IconCompatParcelizer = coil3.UriKt.RemoteActionCompatParcelizer(33, setUnregisteredInAppMessage.MILLISECONDS);
        int i = RemoteActionCompatParcelizer + 125;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
