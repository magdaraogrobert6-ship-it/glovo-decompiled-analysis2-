package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g5 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ g5[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public static final g5 ALWAYS = new g5("ALWAYS", 0);
    public static final g5 IF_MAP_CENTERED_MANUALLY = new g5("IF_MAP_CENTERED_MANUALLY", 1);
    public static final g5 NEVER = new g5("NEVER", 2);

    private g5(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 77;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 109;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        g5[] g5VarArr$values = $values();
        $VALUES = g5VarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) g5VarArr$values);
        int i = RemoteActionCompatParcelizer + 17;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 96 / 0;
        }
    }

    public static g5 valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 89;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        g5 g5Var = (g5) Enum.valueOf(g5.class, str);
        int i4 = write + 75;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return g5Var;
        }
        throw null;
    }

    public static g5[] values() {
        int i = 2 % 2;
        int i2 = write + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        g5[] g5VarArr = (g5[]) $VALUES.clone();
        int i4 = write + 39;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return g5VarArr;
    }

    private static final /* synthetic */ g5[] $values() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 81;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        g5[] g5VarArr = {ALWAYS, IF_MAP_CENTERED_MANUALLY, NEVER};
        int i5 = i2 + 105;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return g5VarArr;
    }
}
