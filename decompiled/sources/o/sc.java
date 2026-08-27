package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class sc {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ sc[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    public static final sc SCHEDULE = new sc("SCHEDULE", 0, "schedule");
    public static final sc START_NOW = new sc("START_NOW", 1, "start_now");
    private static int read = 0;
    private static int write = 1;
    private final String key;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 1;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 29;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 47;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 31;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private sc(String str, int i, String str2) {
        super(str, i);
        this.key = str2;
    }

    private static final /* synthetic */ sc[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        sc[] scVarArr = {SCHEDULE, START_NOW};
        int i5 = i3 + 105;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return scVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        sc[] scVarArr$values = $values();
        $VALUES = scVarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) scVarArr$values);
        int i = write + 89;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static sc valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 13;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (sc) Enum.valueOf(sc.class, str);
        }
        throw null;
    }

    public static sc[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        sc[] scVarArr = (sc[]) $VALUES.clone();
        int i4 = read + 11;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return scVarArr;
        }
        throw null;
    }
}
