package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AdjustInstance11 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ AdjustInstance11[] $VALUES;
    public static final AdjustInstance11 EXISTING_SHIFT = new AdjustInstance11("EXISTING_SHIFT", 0);
    public static final AdjustInstance11 GO_AND_START = new AdjustInstance11("GO_AND_START", 1);
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;

    private AdjustInstance11(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 9;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        AdjustInstance11[] adjustInstance11Arr$values = $values();
        $VALUES = adjustInstance11Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) adjustInstance11Arr$values);
        int i = IconCompatParcelizer + 81;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 24 / 0;
        }
    }

    private static final /* synthetic */ AdjustInstance11[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new AdjustInstance11[]{EXISTING_SHIFT, GO_AND_START};
        }
        AdjustInstance11 adjustInstance11 = EXISTING_SHIFT;
        AdjustInstance11 adjustInstance12 = GO_AND_START;
        AdjustInstance11[] adjustInstance11Arr = new AdjustInstance11[5];
        adjustInstance11Arr[1] = adjustInstance11;
        adjustInstance11Arr[0] = adjustInstance12;
        return adjustInstance11Arr;
    }

    public static AdjustInstance11 valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (AdjustInstance11) Enum.valueOf(AdjustInstance11.class, str);
        }
        int i3 = 90 / 0;
        return (AdjustInstance11) Enum.valueOf(AdjustInstance11.class, str);
    }

    public static AdjustInstance11[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        AdjustInstance11[] adjustInstance11Arr = (AdjustInstance11[]) $VALUES.clone();
        int i3 = RemoteActionCompatParcelizer + 17;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return adjustInstance11Arr;
        }
        throw null;
    }
}
