package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g1 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ g1[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public static final g1 CIRCLE = new g1("CIRCLE", 0);
    public static final g1 ROUNDED_SQUARE = new g1("ROUNDED_SQUARE", 1);

    private g1(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 77;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 75;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    static {
        g1[] g1VarArr$values = $values();
        $VALUES = g1VarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) g1VarArr$values);
        int i = serializer + 43;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ g1[] $values() {
        g1[] g1VarArr;
        int i = 2 % 2;
        int i2 = read + 15;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            g1 g1Var = CIRCLE;
            g1 g1Var2 = ROUNDED_SQUARE;
            g1VarArr = new g1[2];
            g1VarArr[1] = g1Var;
            g1VarArr[1] = g1Var2;
        } else {
            g1VarArr = new g1[]{CIRCLE, ROUNDED_SQUARE};
        }
        int i4 = i3 + 89;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return g1VarArr;
    }

    public static g1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 73;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        g1 g1Var = (g1) Enum.valueOf(g1.class, str);
        int i4 = write + 125;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return g1Var;
    }

    public static g1[] values() {
        int i = 2 % 2;
        int i2 = read + 77;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (g1[]) $VALUES.clone();
        }
        throw null;
    }
}
