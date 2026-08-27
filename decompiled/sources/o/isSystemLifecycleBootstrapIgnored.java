package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class isSystemLifecycleBootstrapIgnored implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ isSystemLifecycleBootstrapIgnored[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    private final String variantName;
    public static final isSystemLifecycleBootstrapIgnored CONTROL = new isSystemLifecycleBootstrapIgnored("CONTROL", 0, "Control");
    public static final isSystemLifecycleBootstrapIgnored VARIATION1 = new isSystemLifecycleBootstrapIgnored("VARIATION1", 1, "Variation1");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 17;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i2 + 7;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 111;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.variantName;
        int i5 = i2 + 105;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private isSystemLifecycleBootstrapIgnored(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        isSystemLifecycleBootstrapIgnored[] issystemlifecyclebootstrapignoredArr$values = $values();
        $VALUES = issystemlifecyclebootstrapignoredArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) issystemlifecyclebootstrapignoredArr$values);
        int i = RemoteActionCompatParcelizer + 83;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 46 / 0;
        }
    }

    private static final /* synthetic */ isSystemLifecycleBootstrapIgnored[] $values() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 81;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        isSystemLifecycleBootstrapIgnored[] issystemlifecyclebootstrapignoredArr = {CONTROL, VARIATION1};
        int i5 = i2 + 93;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return issystemlifecyclebootstrapignoredArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static isSystemLifecycleBootstrapIgnored valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (isSystemLifecycleBootstrapIgnored) Enum.valueOf(isSystemLifecycleBootstrapIgnored.class, str);
        }
        int i3 = 3 / 0;
        return (isSystemLifecycleBootstrapIgnored) Enum.valueOf(isSystemLifecycleBootstrapIgnored.class, str);
    }

    public static isSystemLifecycleBootstrapIgnored[] values() {
        int i = 2 % 2;
        int i2 = serializer + 61;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        isSystemLifecycleBootstrapIgnored[] issystemlifecyclebootstrapignoredArr = (isSystemLifecycleBootstrapIgnored[]) $VALUES.clone();
        int i4 = serializer + 51;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return issystemlifecyclebootstrapignoredArr;
        }
        throw null;
    }
}
