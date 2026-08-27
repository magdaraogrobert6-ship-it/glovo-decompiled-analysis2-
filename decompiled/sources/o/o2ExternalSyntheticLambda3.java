package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o2ExternalSyntheticLambda3 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ o2ExternalSyntheticLambda3[] $VALUES;
    public static final o2 Companion;
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    private final String value;
    public static final o2ExternalSyntheticLambda3 LEGACY = new o2ExternalSyntheticLambda3("LEGACY", 0, "legacy");
    public static final o2ExternalSyntheticLambda3 NATIVE_PLUS_LEGACY_FALLBACK = new o2ExternalSyntheticLambda3("NATIVE_PLUS_LEGACY_FALLBACK", 1, "native_plus_legacy_fallback");
    public static final o2ExternalSyntheticLambda3 NATIVE_NO_FALLBACK = new o2ExternalSyntheticLambda3("NATIVE_NO_FALLBACK", 2, "native_no_fallback");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 91;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 49;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 49;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private o2ExternalSyntheticLambda3(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        o2ExternalSyntheticLambda3[] o2externalsyntheticlambda3Arr$values = $values();
        $VALUES = o2externalsyntheticlambda3Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) o2externalsyntheticlambda3Arr$values);
        Companion = new o2();
        int i = read + 1;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static o2ExternalSyntheticLambda3 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        o2ExternalSyntheticLambda3 o2externalsyntheticlambda3 = (o2ExternalSyntheticLambda3) Enum.valueOf(o2ExternalSyntheticLambda3.class, str);
        int i4 = IconCompatParcelizer + 61;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return o2externalsyntheticlambda3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static o2ExternalSyntheticLambda3[] values() {
        o2ExternalSyntheticLambda3[] o2externalsyntheticlambda3Arr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 81;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            o2externalsyntheticlambda3Arr = (o2ExternalSyntheticLambda3[]) $VALUES.clone();
            int i3 = 61 / 0;
        } else {
            o2externalsyntheticlambda3Arr = (o2ExternalSyntheticLambda3[]) $VALUES.clone();
        }
        int i4 = IconCompatParcelizer + 31;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return o2externalsyntheticlambda3Arr;
    }

    private static final /* synthetic */ o2ExternalSyntheticLambda3[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 49;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        o2ExternalSyntheticLambda3[] o2externalsyntheticlambda3Arr = {LEGACY, NATIVE_PLUS_LEGACY_FALLBACK, NATIVE_NO_FALLBACK};
        int i5 = i3 + 91;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return o2externalsyntheticlambda3Arr;
    }
}
