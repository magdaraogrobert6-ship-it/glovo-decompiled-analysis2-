package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getUseTempTrackingTableroom_runtime {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getUseTempTrackingTableroom_runtime[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public static final getUseTempTrackingTableroom_runtime REQUEST_PERMISSION = new getUseTempTrackingTableroom_runtime("REQUEST_PERMISSION", 0);
    public static final getUseTempTrackingTableroom_runtime IDLE = new getUseTempTrackingTableroom_runtime("IDLE", 1);

    private getUseTempTrackingTableroom_runtime(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        int i3 = 78 / 0;
        return $ENTRIES;
    }

    static {
        getUseTempTrackingTableroom_runtime[] getusetemptrackingtableroom_runtimeArr$values = $values();
        $VALUES = getusetemptrackingtableroom_runtimeArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getusetemptrackingtableroom_runtimeArr$values);
        int i = read + 19;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ getUseTempTrackingTableroom_runtime[] $values() {
        getUseTempTrackingTableroom_runtime[] getusetemptrackingtableroom_runtimeArr;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 15;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            getUseTempTrackingTableroom_runtime getusetemptrackingtableroom_runtime = REQUEST_PERMISSION;
            getUseTempTrackingTableroom_runtime getusetemptrackingtableroom_runtime2 = IDLE;
            getusetemptrackingtableroom_runtimeArr = new getUseTempTrackingTableroom_runtime[2];
            getusetemptrackingtableroom_runtimeArr[1] = getusetemptrackingtableroom_runtime;
            getusetemptrackingtableroom_runtimeArr[1] = getusetemptrackingtableroom_runtime2;
        } else {
            getusetemptrackingtableroom_runtimeArr = new getUseTempTrackingTableroom_runtime[]{REQUEST_PERMISSION, IDLE};
        }
        int i4 = i2 + 75;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return getusetemptrackingtableroom_runtimeArr;
        }
        throw null;
    }

    public static getUseTempTrackingTableroom_runtime valueOf(String str) {
        getUseTempTrackingTableroom_runtime getusetemptrackingtableroom_runtime;
        int i = 2 % 2;
        int i2 = serializer + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            getusetemptrackingtableroom_runtime = (getUseTempTrackingTableroom_runtime) Enum.valueOf(getUseTempTrackingTableroom_runtime.class, str);
            int i3 = 69 / 0;
        } else {
            getusetemptrackingtableroom_runtime = (getUseTempTrackingTableroom_runtime) Enum.valueOf(getUseTempTrackingTableroom_runtime.class, str);
        }
        int i4 = serializer + 83;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return getusetemptrackingtableroom_runtime;
    }

    public static getUseTempTrackingTableroom_runtime[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (getUseTempTrackingTableroom_runtime[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
