package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class accessgetDeviceDataProvidercp {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ accessgetDeviceDataProvidercp[] $VALUES;
    public static final accessgetDeviceDataProvidercp HIDE_SIDE_MENU = new accessgetDeviceDataProvidercp("HIDE_SIDE_MENU", 0);
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;

    private accessgetDeviceDataProvidercp(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 53;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 111;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        accessgetDeviceDataProvidercp[] accessgetdevicedataprovidercpArr$values = $values();
        $VALUES = accessgetdevicedataprovidercpArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) accessgetdevicedataprovidercpArr$values);
        int i = read + 109;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 37 / 0;
        }
    }

    private static final /* synthetic */ accessgetDeviceDataProvidercp[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 31;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        accessgetDeviceDataProvidercp[] accessgetdevicedataprovidercpArr = {HIDE_SIDE_MENU};
        int i5 = i2 + 55;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return accessgetdevicedataprovidercpArr;
        }
        throw null;
    }

    public static accessgetDeviceDataProvidercp valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 117;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (accessgetDeviceDataProvidercp) Enum.valueOf(accessgetDeviceDataProvidercp.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static accessgetDeviceDataProvidercp[] values() {
        int i = 2 % 2;
        int i2 = serializer + 103;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        accessgetDeviceDataProvidercp[] accessgetdevicedataprovidercpArr = (accessgetDeviceDataProvidercp[]) $VALUES.clone();
        int i3 = IconCompatParcelizer + 25;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 93 / 0;
        }
        return accessgetdevicedataprovidercpArr;
    }
}
