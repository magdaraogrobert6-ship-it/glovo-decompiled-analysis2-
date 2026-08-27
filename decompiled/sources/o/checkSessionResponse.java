package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class checkSessionResponse implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ checkSessionResponse[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    private final String variantName;
    public static final checkSessionResponse CONTROL = new checkSessionResponse("CONTROL", 0, "Control");
    public static final checkSessionResponse TREATMENT = new checkSessionResponse("TREATMENT", 1, "Variation1");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 9;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.variantName;
        int i5 = i2 + 35;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private checkSessionResponse(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        checkSessionResponse[] checksessionresponseArr$values = $values();
        $VALUES = checksessionresponseArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) checksessionresponseArr$values);
        int i = write + 13;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ checkSessionResponse[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 93;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        checkSessionResponse[] checksessionresponseArr = {CONTROL, TREATMENT};
        int i5 = i2 + 59;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return checksessionresponseArr;
    }

    public static checkSessionResponse valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (checkSessionResponse) Enum.valueOf(checkSessionResponse.class, str);
        }
        throw null;
    }

    public static checkSessionResponse[] values() {
        int i = 2 % 2;
        int i2 = read + 69;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        checkSessionResponse[] checksessionresponseArr = (checkSessionResponse[]) $VALUES.clone();
        int i4 = IconCompatParcelizer + 41;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return checksessionresponseArr;
    }
}
