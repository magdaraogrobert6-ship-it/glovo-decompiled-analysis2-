package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class readSystemProperty implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ readSystemProperty[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private final String variantName;
    public static final readSystemProperty CONTROL = new readSystemProperty("CONTROL", 0, "Control");
    public static final readSystemProperty TREATMENT = new readSystemProperty("TREATMENT", 1, "Variation1");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 39;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        int i = 2 % 2;
        int i2 = read + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.variantName;
        }
        int i3 = 60 / 0;
        return this.variantName;
    }

    private readSystemProperty(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        readSystemProperty[] readsystempropertyArr$values = $values();
        $VALUES = readsystempropertyArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) readsystempropertyArr$values);
        int i = serializer + 59;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ readSystemProperty[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new readSystemProperty[]{CONTROL, TREATMENT};
        }
        readSystemProperty readsystemproperty = CONTROL;
        readSystemProperty readsystemproperty2 = TREATMENT;
        readSystemProperty[] readsystempropertyArr = new readSystemProperty[2];
        readsystempropertyArr[1] = readsystemproperty;
        readsystempropertyArr[1] = readsystemproperty2;
        return readsystempropertyArr;
    }

    public static readSystemProperty valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 101;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        readSystemProperty readsystemproperty = (readSystemProperty) Enum.valueOf(readSystemProperty.class, str);
        int i4 = read + 35;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return readsystemproperty;
    }

    public static readSystemProperty[] values() {
        readSystemProperty[] readsystempropertyArr;
        int i = 2 % 2;
        int i2 = read + 105;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            readsystempropertyArr = (readSystemProperty[]) $VALUES.clone();
            int i3 = 99 / 0;
        } else {
            readsystempropertyArr = (readSystemProperty[]) $VALUES.clone();
        }
        int i4 = read + 43;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return readsystempropertyArr;
        }
        throw null;
    }
}
