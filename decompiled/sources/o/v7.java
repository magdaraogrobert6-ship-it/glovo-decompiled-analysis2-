package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class v7 implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ v7[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    private final String variantName;
    public static final v7 CONTROL = new v7("CONTROL", 0, "Control");
    public static final v7 TREATMENT = new v7("TREATMENT", 1, "Variation1");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 33;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.variantName;
        }
        throw null;
    }

    private v7(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        v7[] v7VarArr$values = $values();
        $VALUES = v7VarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) v7VarArr$values);
        int i = IconCompatParcelizer + 103;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static final /* synthetic */ v7[] $values() {
        v7[] v7VarArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 41;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            v7 v7Var = CONTROL;
            v7 v7Var2 = TREATMENT;
            v7VarArr = new v7[4];
            v7VarArr[1] = v7Var;
            v7VarArr[1] = v7Var2;
        } else {
            v7VarArr = new v7[]{CONTROL, TREATMENT};
        }
        int i4 = i2 + 71;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return v7VarArr;
    }

    public static v7 valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        v7 v7Var = (v7) Enum.valueOf(v7.class, str);
        int i3 = write + 61;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return v7Var;
    }

    public static v7[] values() {
        int i = 2 % 2;
        int i2 = write + 93;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (v7[]) $VALUES.clone();
        }
        int i3 = 36 / 0;
        return (v7[]) $VALUES.clone();
    }
}
