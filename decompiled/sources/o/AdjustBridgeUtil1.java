package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AdjustBridgeUtil1 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ AdjustBridgeUtil1[] $VALUES;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public static final AdjustBridgeUtil1 TOP = new AdjustBridgeUtil1("TOP", 0);
    public static final AdjustBridgeUtil1 BOTTOM = new AdjustBridgeUtil1("BOTTOM", 1);

    private AdjustBridgeUtil1(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 5;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 69;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        AdjustBridgeUtil1[] adjustBridgeUtil1Arr$values = $values();
        $VALUES = adjustBridgeUtil1Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) adjustBridgeUtil1Arr$values);
        int i = serializer + 81;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ AdjustBridgeUtil1[] $values() {
        int i = 2 % 2;
        int i2 = write + 91;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        AdjustBridgeUtil1[] adjustBridgeUtil1Arr = {TOP, BOTTOM};
        int i5 = i3 + 41;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return adjustBridgeUtil1Arr;
    }

    public static AdjustBridgeUtil1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AdjustBridgeUtil1 adjustBridgeUtil1 = (AdjustBridgeUtil1) Enum.valueOf(AdjustBridgeUtil1.class, str);
        int i4 = write + 39;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return adjustBridgeUtil1;
    }

    public static AdjustBridgeUtil1[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AdjustBridgeUtil1[] adjustBridgeUtil1Arr = (AdjustBridgeUtil1[]) $VALUES.clone();
        int i4 = write + 21;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return adjustBridgeUtil1Arr;
    }
}
