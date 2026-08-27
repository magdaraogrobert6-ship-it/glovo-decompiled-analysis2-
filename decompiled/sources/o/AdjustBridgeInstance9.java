package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AdjustBridgeInstance9 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ AdjustBridgeInstance9[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public static final AdjustBridgeInstance9 NUMERIC = new AdjustBridgeInstance9("NUMERIC", 0);
    public static final AdjustBridgeInstance9 ALPHA_NUMERIC = new AdjustBridgeInstance9("ALPHA_NUMERIC", 1);

    private AdjustBridgeInstance9(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        AdjustBridgeInstance9[] adjustBridgeInstance9Arr$values = $values();
        $VALUES = adjustBridgeInstance9Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) adjustBridgeInstance9Arr$values);
        int i = serializer + 119;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ AdjustBridgeInstance9[] $values() {
        AdjustBridgeInstance9[] adjustBridgeInstance9Arr;
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 41;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            AdjustBridgeInstance9 adjustBridgeInstance9 = NUMERIC;
            AdjustBridgeInstance9 adjustBridgeInstance10 = ALPHA_NUMERIC;
            adjustBridgeInstance9Arr = new AdjustBridgeInstance9[4];
            adjustBridgeInstance9Arr[1] = adjustBridgeInstance9;
            adjustBridgeInstance9Arr[0] = adjustBridgeInstance10;
        } else {
            adjustBridgeInstance9Arr = new AdjustBridgeInstance9[]{NUMERIC, ALPHA_NUMERIC};
        }
        int i4 = i2 + 3;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return adjustBridgeInstance9Arr;
    }

    public static AdjustBridgeInstance9 valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 77;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AdjustBridgeInstance9 adjustBridgeInstance9 = (AdjustBridgeInstance9) Enum.valueOf(AdjustBridgeInstance9.class, str);
        int i4 = read + 97;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return adjustBridgeInstance9;
    }

    public static AdjustBridgeInstance9[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (AdjustBridgeInstance9[]) $VALUES.clone();
        }
        throw null;
    }
}
