package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class lambda322 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ lambda322[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    public static final lambda322 TITLE = new lambda322("TITLE", 0);
    public static final lambda322 SUBTITLE = new lambda322("SUBTITLE", 1);
    public static final lambda322 NORMAL = new lambda322("NORMAL", 2);

    private lambda322(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 97;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    static {
        lambda322[] lambda322VarArr$values = $values();
        $VALUES = lambda322VarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) lambda322VarArr$values);
        int i = read + 25;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static lambda322 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        lambda322 lambda322Var = (lambda322) Enum.valueOf(lambda322.class, str);
        int i4 = IconCompatParcelizer + 75;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return lambda322Var;
    }

    public static lambda322[] values() {
        int i = 2 % 2;
        int i2 = write + 13;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        lambda322[] lambda322VarArr = (lambda322[]) $VALUES.clone();
        int i4 = IconCompatParcelizer + 57;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return lambda322VarArr;
    }

    private static final /* synthetic */ lambda322[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 119;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new lambda322[]{TITLE, SUBTITLE, NORMAL};
        }
        lambda322 lambda322Var = TITLE;
        lambda322 lambda322Var2 = SUBTITLE;
        lambda322 lambda322Var3 = NORMAL;
        lambda322[] lambda322VarArr = new lambda322[5];
        lambda322VarArr[0] = lambda322Var;
        lambda322VarArr[0] = lambda322Var2;
        lambda322VarArr[4] = lambda322Var3;
        return lambda322VarArr;
    }
}
