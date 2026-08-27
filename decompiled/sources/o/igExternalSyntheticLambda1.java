package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class igExternalSyntheticLambda1 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ igExternalSyntheticLambda1[] $VALUES;
    public static final ih Companion;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    private final String value;
    public static final igExternalSyntheticLambda1 NONE = new igExternalSyntheticLambda1("NONE", 0, "");
    public static final igExternalSyntheticLambda1 YIELD = new igExternalSyntheticLambda1("YIELD", 1, "yield");
    public static final igExternalSyntheticLambda1 IO = new igExternalSyntheticLambda1("IO", 2, "io");
    public static final igExternalSyntheticLambda1 IO_YIELD = new igExternalSyntheticLambda1("IO_YIELD", 3, "io_yield");
    public static final igExternalSyntheticLambda1 COMPUTATION = new igExternalSyntheticLambda1("COMPUTATION", 4, "computation");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 81;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i2 + 91;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = read + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.value;
        int i4 = i3 + 79;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    private igExternalSyntheticLambda1(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        igExternalSyntheticLambda1[] igexternalsyntheticlambda1Arr$values = $values();
        $VALUES = igexternalsyntheticlambda1Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) igexternalsyntheticlambda1Arr$values);
        Companion = new ih();
        int i = write + 113;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static igExternalSyntheticLambda1 valueOf(String str) {
        igExternalSyntheticLambda1 igexternalsyntheticlambda1;
        int i = 2 % 2;
        int i2 = read + 53;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            igexternalsyntheticlambda1 = (igExternalSyntheticLambda1) Enum.valueOf(igExternalSyntheticLambda1.class, str);
            int i3 = 72 / 0;
        } else {
            igexternalsyntheticlambda1 = (igExternalSyntheticLambda1) Enum.valueOf(igExternalSyntheticLambda1.class, str);
        }
        int i4 = read + 27;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return igexternalsyntheticlambda1;
    }

    public static igExternalSyntheticLambda1[] values() {
        int i = 2 % 2;
        int i2 = read + 71;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        igExternalSyntheticLambda1[] igexternalsyntheticlambda1Arr = (igExternalSyntheticLambda1[]) $VALUES.clone();
        int i4 = serializer + 117;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return igexternalsyntheticlambda1Arr;
    }

    private static final /* synthetic */ igExternalSyntheticLambda1[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 97;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        igExternalSyntheticLambda1[] igexternalsyntheticlambda1Arr = {NONE, YIELD, IO, IO_YIELD, COMPUTATION};
        int i5 = i3 + 57;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return igexternalsyntheticlambda1Arr;
    }
}
