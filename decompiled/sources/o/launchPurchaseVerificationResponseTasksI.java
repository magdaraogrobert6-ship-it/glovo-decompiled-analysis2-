package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class launchPurchaseVerificationResponseTasksI implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ launchPurchaseVerificationResponseTasksI[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    private final String variantName;
    public static final launchPurchaseVerificationResponseTasksI CONTROL = new launchPurchaseVerificationResponseTasksI("CONTROL", 0, "Control");
    public static final launchPurchaseVerificationResponseTasksI TREATMENT_1 = new launchPurchaseVerificationResponseTasksI("TREATMENT_1", 1, "Variation1");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 67;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 59;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 83;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.variantName;
        int i4 = i2 + 49;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    private launchPurchaseVerificationResponseTasksI(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        launchPurchaseVerificationResponseTasksI[] launchpurchaseverificationresponsetasksiArr$values = $values();
        $VALUES = launchpurchaseverificationresponsetasksiArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) launchpurchaseverificationresponsetasksiArr$values);
        int i = write + 97;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 93 / 0;
        }
    }

    private static final /* synthetic */ launchPurchaseVerificationResponseTasksI[] $values() {
        launchPurchaseVerificationResponseTasksI[] launchpurchaseverificationresponsetasksiArr;
        int i = 2 % 2;
        int i2 = serializer + 77;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            launchPurchaseVerificationResponseTasksI launchpurchaseverificationresponsetasksi = CONTROL;
            launchPurchaseVerificationResponseTasksI launchpurchaseverificationresponsetasksi2 = TREATMENT_1;
            launchpurchaseverificationresponsetasksiArr = new launchPurchaseVerificationResponseTasksI[3];
            launchpurchaseverificationresponsetasksiArr[1] = launchpurchaseverificationresponsetasksi;
            launchpurchaseverificationresponsetasksiArr[0] = launchpurchaseverificationresponsetasksi2;
        } else {
            launchpurchaseverificationresponsetasksiArr = new launchPurchaseVerificationResponseTasksI[]{CONTROL, TREATMENT_1};
        }
        int i4 = i3 + 79;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return launchpurchaseverificationresponsetasksiArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static launchPurchaseVerificationResponseTasksI valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 55;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        launchPurchaseVerificationResponseTasksI launchpurchaseverificationresponsetasksi = (launchPurchaseVerificationResponseTasksI) Enum.valueOf(launchPurchaseVerificationResponseTasksI.class, str);
        int i4 = read + 121;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return launchpurchaseverificationresponsetasksi;
        }
        throw null;
    }

    public static launchPurchaseVerificationResponseTasksI[] values() {
        int i = 2 % 2;
        int i2 = serializer + 87;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        launchPurchaseVerificationResponseTasksI[] launchpurchaseverificationresponsetasksiArr = (launchPurchaseVerificationResponseTasksI[]) $VALUES.clone();
        int i4 = serializer + 73;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return launchpurchaseverificationresponsetasksiArr;
    }
}
