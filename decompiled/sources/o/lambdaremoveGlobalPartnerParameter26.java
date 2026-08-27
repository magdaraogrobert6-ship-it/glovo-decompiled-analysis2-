package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class lambdaremoveGlobalPartnerParameter26 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ lambdaremoveGlobalPartnerParameter26[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public static final lambdaremoveGlobalPartnerParameter26 IDLE = new lambdaremoveGlobalPartnerParameter26("IDLE", 0);
    public static final lambdaremoveGlobalPartnerParameter26 CONNECTING = new lambdaremoveGlobalPartnerParameter26("CONNECTING", 1);
    public static final lambdaremoveGlobalPartnerParameter26 CONNECTED = new lambdaremoveGlobalPartnerParameter26("CONNECTED", 2);
    public static final lambdaremoveGlobalPartnerParameter26 DISCONNECTED = new lambdaremoveGlobalPartnerParameter26("DISCONNECTED", 3);

    private lambdaremoveGlobalPartnerParameter26(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 17;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i2 + 69;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        obj.hashCode();
        throw null;
    }

    static {
        lambdaremoveGlobalPartnerParameter26[] lambdaremoveglobalpartnerparameter26Arr$values = $values();
        $VALUES = lambdaremoveglobalpartnerparameter26Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) lambdaremoveglobalpartnerparameter26Arr$values);
        int i = write + 117;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static lambdaremoveGlobalPartnerParameter26 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        lambdaremoveGlobalPartnerParameter26 lambdaremoveglobalpartnerparameter26 = (lambdaremoveGlobalPartnerParameter26) Enum.valueOf(lambdaremoveGlobalPartnerParameter26.class, str);
        int i3 = IconCompatParcelizer + 49;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return lambdaremoveglobalpartnerparameter26;
    }

    public static lambdaremoveGlobalPartnerParameter26[] values() {
        int i = 2 % 2;
        int i2 = serializer + 117;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        lambdaremoveGlobalPartnerParameter26[] lambdaremoveglobalpartnerparameter26Arr = (lambdaremoveGlobalPartnerParameter26[]) $VALUES.clone();
        int i4 = serializer + 125;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return lambdaremoveglobalpartnerparameter26Arr;
    }

    private static final /* synthetic */ lambdaremoveGlobalPartnerParameter26[] $values() {
        lambdaremoveGlobalPartnerParameter26[] lambdaremoveglobalpartnerparameter26Arr;
        int i = 2 % 2;
        int i2 = serializer + 37;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            lambdaremoveGlobalPartnerParameter26 lambdaremoveglobalpartnerparameter26 = IDLE;
            lambdaremoveGlobalPartnerParameter26 lambdaremoveglobalpartnerparameter27 = CONNECTING;
            lambdaremoveGlobalPartnerParameter26 lambdaremoveglobalpartnerparameter28 = CONNECTED;
            lambdaremoveGlobalPartnerParameter26 lambdaremoveglobalpartnerparameter29 = DISCONNECTED;
            lambdaremoveglobalpartnerparameter26Arr = new lambdaremoveGlobalPartnerParameter26[4];
            lambdaremoveglobalpartnerparameter26Arr[0] = lambdaremoveglobalpartnerparameter26;
            lambdaremoveglobalpartnerparameter26Arr[0] = lambdaremoveglobalpartnerparameter27;
            lambdaremoveglobalpartnerparameter26Arr[4] = lambdaremoveglobalpartnerparameter28;
            lambdaremoveglobalpartnerparameter26Arr[4] = lambdaremoveglobalpartnerparameter29;
        } else {
            lambdaremoveglobalpartnerparameter26Arr = new lambdaremoveGlobalPartnerParameter26[]{IDLE, CONNECTING, CONNECTED, DISCONNECTED};
        }
        int i4 = i3 + 63;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return lambdaremoveglobalpartnerparameter26Arr;
    }
}
