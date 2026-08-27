package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    private final String variantName;
    public static final r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU CONTROL = new r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU("CONTROL", 0, "Control");
    public static final r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU TREATMENT_1 = new r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU("TREATMENT_1", 1, "Variation1");
    public static final r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU TREATMENT_2 = new r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU("TREATMENT_2", 2, "Variation2");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 89;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 5;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.variantName;
        }
        throw null;
    }

    private r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU[] r8lambdag9a6qgviejvi1lyj11plcxf2jsuArr$values = $values();
        $VALUES = r8lambdag9a6qgviejvi1lyj11plcxf2jsuArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) r8lambdag9a6qgviejvi1lyj11plcxf2jsuArr$values);
        int i = serializer + 53;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU valueOf(String str) {
        r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU r8lambdag9a6qgviejvi1lyj11plcxf2jsu;
        int i = 2 % 2;
        int i2 = read + 101;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            r8lambdag9a6qgviejvi1lyj11plcxf2jsu = (r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU) Enum.valueOf(r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU.class, str);
            int i3 = 94 / 0;
        } else {
            r8lambdag9a6qgviejvi1lyj11plcxf2jsu = (r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU) Enum.valueOf(r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU.class, str);
        }
        int i4 = read + 9;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambdag9a6qgviejvi1lyj11plcxf2jsu;
        }
        throw null;
    }

    public static r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU[] r8lambdag9a6qgviejvi1lyj11plcxf2jsuArr = (r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU[]) $VALUES.clone();
        int i4 = read + 95;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return r8lambdag9a6qgviejvi1lyj11plcxf2jsuArr;
    }

    private static final /* synthetic */ r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 23;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU[]{CONTROL, TREATMENT_1, TREATMENT_2};
        }
        r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU r8lambdag9a6qgviejvi1lyj11plcxf2jsu = CONTROL;
        r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU r8lambdag9a6qgviejvi1lyj11plcxf2jsu2 = TREATMENT_1;
        r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU r8lambdag9a6qgviejvi1lyj11plcxf2jsu3 = TREATMENT_2;
        r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU[] r8lambdag9a6qgviejvi1lyj11plcxf2jsuArr = new r8lambdaG9A6QGvIEjVI1lyj11PLCxf2JSU[2];
        r8lambdag9a6qgviejvi1lyj11plcxf2jsuArr[0] = r8lambdag9a6qgviejvi1lyj11plcxf2jsu;
        r8lambdag9a6qgviejvi1lyj11plcxf2jsuArr[0] = r8lambdag9a6qgviejvi1lyj11plcxf2jsu2;
        r8lambdag9a6qgviejvi1lyj11plcxf2jsuArr[5] = r8lambdag9a6qgviejvi1lyj11plcxf2jsu3;
        return r8lambdag9a6qgviejvi1lyj11plcxf2jsuArr;
    }
}
