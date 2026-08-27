package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AdjustBridgeInstance2 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ AdjustBridgeInstance2[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public static final AdjustBridgeInstance2 SELECTED = new AdjustBridgeInstance2("SELECTED", 0);
    public static final AdjustBridgeInstance2 DESELECTED = new AdjustBridgeInstance2("DESELECTED", 1);

    private AdjustBridgeInstance2(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i4 = 80 / 0;
        } else {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        }
        int i5 = i3 + 83;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        AdjustBridgeInstance2[] adjustBridgeInstance2Arr$values = $values();
        $VALUES = adjustBridgeInstance2Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) adjustBridgeInstance2Arr$values);
        int i = write + 25;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ AdjustBridgeInstance2[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        AdjustBridgeInstance2[] adjustBridgeInstance2Arr = {SELECTED, DESELECTED};
        int i5 = i3 + 39;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 29 / 0;
        }
        return adjustBridgeInstance2Arr;
    }

    public static AdjustBridgeInstance2 valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 51;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (AdjustBridgeInstance2) Enum.valueOf(AdjustBridgeInstance2.class, str);
        }
        int i3 = 19 / 0;
        return (AdjustBridgeInstance2) Enum.valueOf(AdjustBridgeInstance2.class, str);
    }

    public static AdjustBridgeInstance2[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AdjustBridgeInstance2[] adjustBridgeInstance2Arr = (AdjustBridgeInstance2[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 23;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return adjustBridgeInstance2Arr;
        }
        throw null;
    }
}
