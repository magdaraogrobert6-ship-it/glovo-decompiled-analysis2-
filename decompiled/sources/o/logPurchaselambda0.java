package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class logPurchaselambda0 implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ logPurchaselambda0[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    private final String variantName;
    public static final logPurchaselambda0 CONTROL = new logPurchaselambda0("CONTROL", 0, "Control");
    public static final logPurchaselambda0 TREATMENT = new logPurchaselambda0("TREATMENT", 1, "Variation1");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 3;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 17;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        int i = 2 % 2;
        int i2 = write + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.variantName;
        }
        throw null;
    }

    private logPurchaselambda0(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        logPurchaselambda0[] logpurchaselambda0Arr$values = $values();
        $VALUES = logpurchaselambda0Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) logpurchaselambda0Arr$values);
        int i = serializer + 51;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final /* synthetic */ logPurchaselambda0[] $values() {
        logPurchaselambda0[] logpurchaselambda0Arr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 51;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            logPurchaselambda0 logpurchaselambda0 = CONTROL;
            logPurchaselambda0 logpurchaselambda1 = TREATMENT;
            logpurchaselambda0Arr = new logPurchaselambda0[5];
            logpurchaselambda0Arr[1] = logpurchaselambda0;
            logpurchaselambda0Arr[1] = logpurchaselambda1;
        } else {
            logpurchaselambda0Arr = new logPurchaselambda0[]{CONTROL, TREATMENT};
        }
        int i4 = i2 + 101;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return logpurchaselambda0Arr;
    }

    public static logPurchaselambda0 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        logPurchaselambda0 logpurchaselambda0 = (logPurchaselambda0) Enum.valueOf(logPurchaselambda0.class, str);
        int i4 = IconCompatParcelizer + 75;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return logpurchaselambda0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static logPurchaselambda0[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 89;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (logPurchaselambda0[]) $VALUES.clone();
        }
        throw null;
    }
}
