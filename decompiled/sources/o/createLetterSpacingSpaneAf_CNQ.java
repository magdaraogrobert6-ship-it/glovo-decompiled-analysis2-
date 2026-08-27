package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class createLetterSpacingSpaneAf_CNQ implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ createLetterSpacingSpaneAf_CNQ[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    private final String variantName;
    public static final createLetterSpacingSpaneAf_CNQ CONTROL = new createLetterSpacingSpaneAf_CNQ("CONTROL", 0, "Control");
    public static final createLetterSpacingSpaneAf_CNQ TREATMENT_1 = new createLetterSpacingSpaneAf_CNQ("TREATMENT_1", 1, "Variation1");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 73;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        int i = 2 % 2;
        int i2 = serializer + 31;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.variantName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private createLetterSpacingSpaneAf_CNQ(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        createLetterSpacingSpaneAf_CNQ[] createletterspacingspaneaf_cnqArr$values = $values();
        $VALUES = createletterspacingspaneaf_cnqArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) createletterspacingspaneaf_cnqArr$values);
        int i = RemoteActionCompatParcelizer + 7;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 18 / 0;
        }
    }

    private static final /* synthetic */ createLetterSpacingSpaneAf_CNQ[] $values() {
        int i = 2 % 2;
        int i2 = write + 43;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        createLetterSpacingSpaneAf_CNQ[] createletterspacingspaneaf_cnqArr = {CONTROL, TREATMENT_1};
        int i5 = i3 + 49;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return createletterspacingspaneaf_cnqArr;
    }

    public static createLetterSpacingSpaneAf_CNQ valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 71;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createLetterSpacingSpaneAf_CNQ createletterspacingspaneaf_cnq = (createLetterSpacingSpaneAf_CNQ) Enum.valueOf(createLetterSpacingSpaneAf_CNQ.class, str);
        int i4 = serializer + 53;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createletterspacingspaneaf_cnq;
    }

    public static createLetterSpacingSpaneAf_CNQ[] values() {
        int i = 2 % 2;
        int i2 = write + 21;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        createLetterSpacingSpaneAf_CNQ[] createletterspacingspaneaf_cnqArr = (createLetterSpacingSpaneAf_CNQ[]) $VALUES.clone();
        int i3 = write + 119;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return createletterspacingspaneaf_cnqArr;
        }
        obj.hashCode();
        throw null;
    }
}
