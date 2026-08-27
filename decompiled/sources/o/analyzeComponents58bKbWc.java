package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class analyzeComponents58bKbWc implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ analyzeComponents58bKbWc[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    private final String variantName;
    public static final analyzeComponents58bKbWc CONTROL = new analyzeComponents58bKbWc("CONTROL", 0, "Control");
    public static final analyzeComponents58bKbWc TREATMENT = new analyzeComponents58bKbWc("TREATMENT", 1, "Variation1");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i4 = 47 / 0;
        } else {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        }
        int i5 = i3 + 69;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.variantName;
        int i4 = i3 + 43;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private analyzeComponents58bKbWc(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        analyzeComponents58bKbWc[] analyzecomponents58bkbwcArr$values = $values();
        $VALUES = analyzecomponents58bkbwcArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) analyzecomponents58bkbwcArr$values);
        int i = IconCompatParcelizer + 45;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ analyzeComponents58bKbWc[] $values() {
        int i = 2 % 2;
        int i2 = read + 51;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new analyzeComponents58bKbWc[]{CONTROL, TREATMENT};
        }
        analyzeComponents58bKbWc analyzecomponents58bkbwc = CONTROL;
        analyzeComponents58bKbWc analyzecomponents58bkbwc2 = TREATMENT;
        analyzeComponents58bKbWc[] analyzecomponents58bkbwcArr = new analyzeComponents58bKbWc[5];
        analyzecomponents58bkbwcArr[0] = analyzecomponents58bkbwc;
        analyzecomponents58bkbwcArr[0] = analyzecomponents58bkbwc2;
        return analyzecomponents58bkbwcArr;
    }

    public static analyzeComponents58bKbWc valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (analyzeComponents58bKbWc) Enum.valueOf(analyzeComponents58bKbWc.class, str);
        }
        int i3 = 16 / 0;
        return (analyzeComponents58bKbWc) Enum.valueOf(analyzeComponents58bKbWc.class, str);
    }

    public static analyzeComponents58bKbWc[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        analyzeComponents58bKbWc[] analyzecomponents58bkbwcArr = (analyzeComponents58bKbWc[]) $VALUES.clone();
        int i3 = read + 107;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return analyzecomponents58bkbwcArr;
    }
}
