package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f7 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ f7[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public static final f7 ONE = new f7("ONE", 0);
    public static final f7 TWO = new f7("TWO", 1);
    public static final f7 THREE = new f7("THREE", 2);
    public static final f7 NONE = new f7("NONE", 3);

    private f7(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 67;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        f7[] f7VarArr$values = $values();
        $VALUES = f7VarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) f7VarArr$values);
        int i = read + 97;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 98 / 0;
        }
    }

    public static f7 valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        f7 f7Var = (f7) Enum.valueOf(f7.class, str);
        int i4 = serializer + 41;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return f7Var;
    }

    public static f7[] values() {
        int i = 2 % 2;
        int i2 = serializer + 95;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (f7[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ f7[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new f7[]{ONE, TWO, THREE, NONE};
        }
        f7 f7Var = ONE;
        f7 f7Var2 = TWO;
        f7 f7Var3 = THREE;
        f7 f7Var4 = NONE;
        f7[] f7VarArr = new f7[5];
        f7VarArr[0] = f7Var;
        f7VarArr[0] = f7Var2;
        f7VarArr[3] = f7Var3;
        f7VarArr[3] = f7Var4;
        return f7VarArr;
    }
}
