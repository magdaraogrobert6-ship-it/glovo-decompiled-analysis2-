package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class sendSdkClickI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ sendSdkClickI[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public static final sendSdkClickI SUCCESS = new sendSdkClickI("SUCCESS", 0);
    public static final sendSdkClickI NEUTRAL = new sendSdkClickI("NEUTRAL", 1);
    public static final sendSdkClickI ALERT = new sendSdkClickI("ALERT", 2);
    public static final sendSdkClickI CRITICAL = new sendSdkClickI("CRITICAL", 3);

    private sendSdkClickI(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 101;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    static {
        sendSdkClickI[] sendsdkclickiArr$values = $values();
        $VALUES = sendsdkclickiArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) sendsdkclickiArr$values);
        int i = serializer + 19;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static sendSdkClickI valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        sendSdkClickI sendsdkclicki = (sendSdkClickI) Enum.valueOf(sendSdkClickI.class, str);
        int i3 = write + 51;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return sendsdkclicki;
        }
        throw null;
    }

    public static sendSdkClickI[] values() {
        int i = 2 % 2;
        int i2 = write + 71;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        sendSdkClickI[] sendsdkclickiArr = (sendSdkClickI[]) $VALUES.clone();
        int i4 = write + 77;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return sendsdkclickiArr;
        }
        throw null;
    }

    private static final /* synthetic */ sendSdkClickI[] $values() {
        int i = 2 % 2;
        int i2 = write + 111;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new sendSdkClickI[]{SUCCESS, NEUTRAL, ALERT, CRITICAL};
        }
        sendSdkClickI sendsdkclicki = SUCCESS;
        sendSdkClickI sendsdkclicki2 = NEUTRAL;
        sendSdkClickI sendsdkclicki3 = ALERT;
        sendSdkClickI sendsdkclicki4 = CRITICAL;
        sendSdkClickI[] sendsdkclickiArr = new sendSdkClickI[4];
        sendsdkclickiArr[0] = sendsdkclicki;
        sendsdkclickiArr[1] = sendsdkclicki2;
        sendsdkclickiArr[5] = sendsdkclicki3;
        sendsdkclickiArr[4] = sendsdkclicki4;
        return sendsdkclickiArr;
    }
}
