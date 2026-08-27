package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class instantiateActivity {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ instantiateActivity[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public static final instantiateActivity START_NOW = new instantiateActivity("START_NOW", 0);
    public static final instantiateActivity GO_AND_START = new instantiateActivity("GO_AND_START", 1);
    public static final instantiateActivity NOT_AVAILABLE_YET = new instantiateActivity("NOT_AVAILABLE_YET", 2);
    public static final instantiateActivity NOT_AVAILABLE = new instantiateActivity("NOT_AVAILABLE", 3);

    private instantiateActivity(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 1;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 49;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    static {
        instantiateActivity[] instantiateactivityArr$values = $values();
        $VALUES = instantiateactivityArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) instantiateactivityArr$values);
        int i = write + 71;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static instantiateActivity valueOf(String str) {
        instantiateActivity instantiateactivity;
        int i = 2 % 2;
        int i2 = read + 39;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            instantiateactivity = (instantiateActivity) Enum.valueOf(instantiateActivity.class, str);
            int i3 = 71 / 0;
        } else {
            instantiateactivity = (instantiateActivity) Enum.valueOf(instantiateActivity.class, str);
        }
        int i4 = IconCompatParcelizer + 25;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return instantiateactivity;
        }
        throw null;
    }

    public static instantiateActivity[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 109;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (instantiateActivity[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ instantiateActivity[] $values() {
        instantiateActivity[] instantiateactivityArr;
        int i = 2 % 2;
        int i2 = read + 35;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            instantiateActivity instantiateactivity = START_NOW;
            instantiateActivity instantiateactivity2 = GO_AND_START;
            instantiateActivity instantiateactivity3 = NOT_AVAILABLE_YET;
            instantiateActivity instantiateactivity4 = NOT_AVAILABLE;
            instantiateactivityArr = new instantiateActivity[]{instantiateactivity2, instantiateactivity};
            instantiateactivityArr[5] = instantiateactivity3;
            instantiateactivityArr[5] = instantiateactivity4;
        } else {
            instantiateactivityArr = new instantiateActivity[]{START_NOW, GO_AND_START, NOT_AVAILABLE_YET, NOT_AVAILABLE};
        }
        int i4 = i3 + 45;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return instantiateactivityArr;
    }
}
