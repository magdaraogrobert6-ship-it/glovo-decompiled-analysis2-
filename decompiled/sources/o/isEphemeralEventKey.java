package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class isEphemeralEventKey {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ isEphemeralEventKey[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    private final String value;
    public static final isEphemeralEventKey BECOME_AVAILABLE = new isEphemeralEventKey("BECOME_AVAILABLE", 0, "become_available");
    public static final isEphemeralEventKey START_EXISTING_SHIFT = new isEphemeralEventKey("START_EXISTING_SHIFT", 1, "start_existing_shift");
    public static final isEphemeralEventKey START_UNASSIGNED_SHIFT = new isEphemeralEventKey("START_UNASSIGNED_SHIFT", 2, "start_unassigned_shift");
    public static final isEphemeralEventKey START_ON_DEMAND = new isEphemeralEventKey("START_ON_DEMAND", 3, "start_on_demand");
    public static final isEphemeralEventKey START_WORK_NOW = new isEphemeralEventKey("START_WORK_NOW", 4, "freelancing_start");
    public static final isEphemeralEventKey START_WORK_NOW_LOW_FILL = new isEphemeralEventKey("START_WORK_NOW_LOW_FILL", 5, "freelance_low_fill_start");
    public static final isEphemeralEventKey GO_AND_START_LOW_FILL = new isEphemeralEventKey("GO_AND_START_LOW_FILL", 6, "freelance_low_fill_go_and_start");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 25;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i4 = 28 / 0;
        } else {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        }
        int i5 = i2 + 89;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = serializer + 109;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.value;
        }
        throw null;
    }

    private isEphemeralEventKey(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        isEphemeralEventKey[] isephemeraleventkeyArr$values = $values();
        $VALUES = isephemeraleventkeyArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) isephemeraleventkeyArr$values);
        int i = read + 63;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 95 / 0;
        }
    }

    public static isEphemeralEventKey valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 27;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        isEphemeralEventKey isephemeraleventkey = (isEphemeralEventKey) Enum.valueOf(isEphemeralEventKey.class, str);
        int i4 = serializer + 83;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return isephemeraleventkey;
    }

    public static isEphemeralEventKey[] values() {
        int i = 2 % 2;
        int i2 = serializer + 121;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        isEphemeralEventKey[] isephemeraleventkeyArr = (isEphemeralEventKey[]) $VALUES.clone();
        int i4 = serializer + 95;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return isephemeraleventkeyArr;
    }

    private static final /* synthetic */ isEphemeralEventKey[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 83;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        isEphemeralEventKey[] isephemeraleventkeyArr = {BECOME_AVAILABLE, START_EXISTING_SHIFT, START_UNASSIGNED_SHIFT, START_ON_DEMAND, START_WORK_NOW, START_WORK_NOW_LOW_FILL, GO_AND_START_LOW_FILL};
        int i5 = i3 + 77;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return isephemeraleventkeyArr;
    }
}
