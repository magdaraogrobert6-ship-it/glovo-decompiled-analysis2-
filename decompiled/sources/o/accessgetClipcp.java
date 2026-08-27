package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class accessgetClipcp {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ accessgetClipcp[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    private final String value;
    public static final accessgetClipcp ORDER_STATE_CHANGED = new accessgetClipcp("ORDER_STATE_CHANGED", 0, "order_state_changed");
    public static final accessgetClipcp BLUETOOTH_DISABLED = new accessgetClipcp("BLUETOOTH_DISABLED", 1, "bluetooth_disabled");
    public static final accessgetClipcp RIDER_OUTSIDE_GEOFENCE = new accessgetClipcp("RIDER_OUTSIDE_GEOFENCE", 2, "rider_outside_geofence");
    public static final accessgetClipcp BACKGROUND = new accessgetClipcp("BACKGROUND", 3, "background");
    public static final accessgetClipcp VENDOR_SWITCH = new accessgetClipcp("VENDOR_SWITCH", 4, "vendor_switch");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 69;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 37;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.value;
        int i4 = i3 + 77;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return str;
    }

    private accessgetClipcp(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        accessgetClipcp[] accessgetclipcpArr$values = $values();
        $VALUES = accessgetclipcpArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) accessgetclipcpArr$values);
        int i = IconCompatParcelizer + 115;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static accessgetClipcp valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        accessgetClipcp accessgetclipcp = (accessgetClipcp) Enum.valueOf(accessgetClipcp.class, str);
        int i3 = RemoteActionCompatParcelizer + 35;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return accessgetclipcp;
        }
        obj.hashCode();
        throw null;
    }

    public static accessgetClipcp[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (accessgetClipcp[]) $VALUES.clone();
        }
        throw null;
    }

    private static final /* synthetic */ accessgetClipcp[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 67;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        accessgetClipcp[] accessgetclipcpArr = {ORDER_STATE_CHANGED, BLUETOOTH_DISABLED, RIDER_OUTSIDE_GEOFENCE, BACKGROUND, VENDOR_SWITCH};
        int i5 = i2 + 61;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return accessgetclipcpArr;
    }
}
