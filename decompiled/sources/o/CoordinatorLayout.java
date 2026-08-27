package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class CoordinatorLayout implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ CoordinatorLayout[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private final String variantName;
    public static final CoordinatorLayout CONTROL = new CoordinatorLayout("CONTROL", 0, "Control");
    public static final CoordinatorLayout TREATMENT_1 = new CoordinatorLayout("TREATMENT_1", 1, "Variation1");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 37;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        int i3 = 97 / 0;
        return $ENTRIES;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.variantName;
        int i5 = i3 + 73;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CoordinatorLayout(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        CoordinatorLayout[] coordinatorLayoutArr$values = $values();
        $VALUES = coordinatorLayoutArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) coordinatorLayoutArr$values);
        int i = RemoteActionCompatParcelizer + 47;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 88 / 0;
        }
    }

    private static final /* synthetic */ CoordinatorLayout[] $values() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 39;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        CoordinatorLayout[] coordinatorLayoutArr = {CONTROL, TREATMENT_1};
        int i5 = i2 + 105;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return coordinatorLayoutArr;
    }

    public static CoordinatorLayout valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 51;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) Enum.valueOf(CoordinatorLayout.class, str);
        int i4 = read + 49;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return coordinatorLayout;
    }

    public static CoordinatorLayout[] values() {
        int i = 2 % 2;
        int i2 = read + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (CoordinatorLayout[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
