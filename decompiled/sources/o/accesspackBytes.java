package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class accesspackBytes implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ accesspackBytes[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    private final String variantName;
    public static final accesspackBytes CONTROL = new accesspackBytes("CONTROL", 0, "Control");
    public static final accesspackBytes TREATMENT_1 = new accesspackBytes("TREATMENT_1", 1, "Variation1");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        int i = 2 % 2;
        int i2 = write + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i4 = 55 / 0;
        } else {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        }
        int i5 = i3 + 9;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 49;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.variantName;
        int i5 = i2 + 125;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private accesspackBytes(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        accesspackBytes[] accesspackbytesArr$values = $values();
        $VALUES = accesspackbytesArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) accesspackbytesArr$values);
        int i = serializer + 49;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final /* synthetic */ accesspackBytes[] $values() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 99;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        accesspackBytes[] accesspackbytesArr = {CONTROL, TREATMENT_1};
        int i5 = i2 + 45;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return accesspackbytesArr;
    }

    public static accesspackBytes valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 35;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accesspackBytes accesspackbytes = (accesspackBytes) Enum.valueOf(accesspackBytes.class, str);
        int i4 = write + 83;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return accesspackbytes;
    }

    public static accesspackBytes[] values() {
        int i = 2 % 2;
        int i2 = write + 101;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (accesspackBytes[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
