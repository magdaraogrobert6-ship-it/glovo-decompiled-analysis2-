package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class collectRangeTransitions {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ collectRangeTransitions[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    private final String backendName;
    public static final collectRangeTransitions STAGING = new collectRangeTransitions("STAGING", 0, "staging");
    public static final collectRangeTransitions PRODUCTION = new collectRangeTransitions("PRODUCTION", 1, "prod");
    public static final collectRangeTransitions TESTING = new collectRangeTransitions("TESTING", 2, "testing");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 1;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 111;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getBackendName() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 109;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.backendName;
        int i5 = i2 + 113;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private collectRangeTransitions(String str, int i, String str2) {
        super(str, i);
        this.backendName = str2;
    }

    static {
        collectRangeTransitions[] collectrangetransitionsArr$values = $values();
        $VALUES = collectrangetransitionsArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) collectrangetransitionsArr$values);
        int i = serializer + 117;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static collectRangeTransitions valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 11;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        collectRangeTransitions collectrangetransitions = (collectRangeTransitions) Enum.valueOf(collectRangeTransitions.class, str);
        int i4 = read + 23;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return collectrangetransitions;
        }
        throw null;
    }

    public static collectRangeTransitions[] values() {
        int i = 2 % 2;
        int i2 = write + 55;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        collectRangeTransitions[] collectrangetransitionsArr = (collectRangeTransitions[]) $VALUES.clone();
        int i4 = write + 25;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return collectrangetransitionsArr;
        }
        throw null;
    }

    private static final /* synthetic */ collectRangeTransitions[] $values() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 63;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        collectRangeTransitions[] collectrangetransitionsArr = {STAGING, PRODUCTION, TESTING};
        int i5 = i2 + 23;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return collectrangetransitionsArr;
        }
        throw null;
    }
}
