package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ve implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ ve[] $VALUES;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    private final String variantName;
    public static final ve CONTROL = new ve("CONTROL", 0, "Control");
    public static final ve TREATMENT = new ve("TREATMENT", 1, "Variation1");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 123;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 41;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 67;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.variantName;
        int i5 = i2 + 119;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private ve(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        ve[] veVarArr$values = $values();
        $VALUES = veVarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) veVarArr$values);
        int i = RemoteActionCompatParcelizer + 17;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ ve[] $values() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 69;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ve[] veVarArr = {CONTROL, TREATMENT};
        int i5 = i2 + 93;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return veVarArr;
    }

    public static ve valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 43;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ve veVar = (ve) Enum.valueOf(ve.class, str);
        int i4 = read + 31;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return veVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ve[] values() {
        ve[] veVarArr;
        int i = 2 % 2;
        int i2 = write + 109;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            veVarArr = (ve[]) $VALUES.clone();
            int i3 = 15 / 0;
        } else {
            veVarArr = (ve[]) $VALUES.clone();
        }
        int i4 = write + 31;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return veVarArr;
    }
}
