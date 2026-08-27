package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class enableBridgeSecurity {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ enableBridgeSecurity[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    @onItemDismisslambda0
    public static final enableBridgeSecurity PRIMARY_BIG = new enableBridgeSecurity("PRIMARY_BIG", 0);
    public static final enableBridgeSecurity PRIMARY_SMALL = new enableBridgeSecurity("PRIMARY_SMALL", 1);

    @onItemDismisslambda0
    public static final enableBridgeSecurity SECONDARY_BIG = new enableBridgeSecurity("SECONDARY_BIG", 2);
    public static final enableBridgeSecurity SECONDARY_SMALL = new enableBridgeSecurity("SECONDARY_SMALL", 3);

    @onItemDismisslambda0
    public static final enableBridgeSecurity TERTIARY = new enableBridgeSecurity("TERTIARY", 4);

    private enableBridgeSecurity(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 115;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 113;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        enableBridgeSecurity[] enablebridgesecurityArr$values = $values();
        $VALUES = enablebridgesecurityArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) enablebridgesecurityArr$values);
        int i = read + 111;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static enableBridgeSecurity valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        enableBridgeSecurity enablebridgesecurity = (enableBridgeSecurity) Enum.valueOf(enableBridgeSecurity.class, str);
        int i4 = serializer + 75;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return enablebridgesecurity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static enableBridgeSecurity[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        enableBridgeSecurity[] enablebridgesecurityArr = (enableBridgeSecurity[]) $VALUES.clone();
        int i4 = serializer + 107;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return enablebridgesecurityArr;
    }

    private static final /* synthetic */ enableBridgeSecurity[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        enableBridgeSecurity[] enablebridgesecurityArr = {PRIMARY_BIG, PRIMARY_SMALL, SECONDARY_BIG, SECONDARY_SMALL, TERTIARY};
        int i5 = i3 + 13;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return enablebridgesecurityArr;
    }
}
