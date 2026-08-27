package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class containsPlayIds implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ containsPlayIds[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    private final String variantName;
    public static final containsPlayIds CONTROL = new containsPlayIds("CONTROL", 0, "Control");
    public static final containsPlayIds TREATMENT = new containsPlayIds("TREATMENT", 1, "Variation1");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 13;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 93;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 119;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.variantName;
        int i5 = i2 + 123;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private containsPlayIds(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        containsPlayIds[] containsplayidsArr$values = $values();
        $VALUES = containsplayidsArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) containsplayidsArr$values);
        int i = write + 69;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ containsPlayIds[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 101;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        containsPlayIds[] containsplayidsArr = {CONTROL, TREATMENT};
        int i5 = i2 + 73;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return containsplayidsArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static containsPlayIds valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        containsPlayIds containsplayids = (containsPlayIds) Enum.valueOf(containsPlayIds.class, str);
        int i4 = IconCompatParcelizer + 113;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return containsplayids;
    }

    public static containsPlayIds[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        containsPlayIds[] containsplayidsArr = (containsPlayIds[]) $VALUES.clone();
        int i4 = IconCompatParcelizer + 91;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return containsplayidsArr;
    }
}
