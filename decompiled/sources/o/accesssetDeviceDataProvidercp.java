package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class accesssetDeviceDataProvidercp {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ accesssetDeviceDataProvidercp[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    public static final accesssetDeviceDataProvidercp STARTING_AREA = new accesssetDeviceDataProvidercp("STARTING_AREA", 0);
    public static final accesssetDeviceDataProvidercp ZONE_BOUNDARY = new accesssetDeviceDataProvidercp("ZONE_BOUNDARY", 1);
    private static int serializer = 1;
    private static int write;

    private accesssetDeviceDataProvidercp(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 51;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i2 + 65;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        accesssetDeviceDataProvidercp[] accesssetdevicedataprovidercpArr$values = $values();
        $VALUES = accesssetdevicedataprovidercpArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) accesssetdevicedataprovidercpArr$values);
        int i = IconCompatParcelizer + 117;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ accesssetDeviceDataProvidercp[] $values() {
        accesssetDeviceDataProvidercp[] accesssetdevicedataprovidercpArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 51;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            accesssetDeviceDataProvidercp accesssetdevicedataprovidercp = STARTING_AREA;
            accesssetDeviceDataProvidercp accesssetdevicedataprovidercp2 = ZONE_BOUNDARY;
            accesssetdevicedataprovidercpArr = new accesssetDeviceDataProvidercp[4];
            accesssetdevicedataprovidercpArr[1] = accesssetdevicedataprovidercp;
            accesssetdevicedataprovidercpArr[0] = accesssetdevicedataprovidercp2;
        } else {
            accesssetdevicedataprovidercpArr = new accesssetDeviceDataProvidercp[]{STARTING_AREA, ZONE_BOUNDARY};
        }
        int i4 = i3 + 107;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return accesssetdevicedataprovidercpArr;
    }

    public static accesssetDeviceDataProvidercp valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 27;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accesssetDeviceDataProvidercp accesssetdevicedataprovidercp = (accesssetDeviceDataProvidercp) Enum.valueOf(accesssetDeviceDataProvidercp.class, str);
        int i4 = RemoteActionCompatParcelizer + 41;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return accesssetdevicedataprovidercp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static accesssetDeviceDataProvidercp[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accesssetDeviceDataProvidercp[] accesssetdevicedataprovidercpArr = (accesssetDeviceDataProvidercp[]) $VALUES.clone();
        int i4 = serializer + 103;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return accesssetdevicedataprovidercpArr;
    }
}
