package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j7 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ j7[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public static final j7 DEFAULT = new j7("DEFAULT", 0);
    public static final j7 TURN_BY_TURN = new j7("TURN_BY_TURN", 1);

    private j7(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 71;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 71;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        j7[] j7VarArr$values = $values();
        $VALUES = j7VarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) j7VarArr$values);
        int i = IconCompatParcelizer + 85;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ j7[] $values() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 87;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        j7[] j7VarArr = {DEFAULT, TURN_BY_TURN};
        int i5 = i2 + 1;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return j7VarArr;
    }

    public static j7 valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 81;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        j7 j7Var = (j7) Enum.valueOf(j7.class, str);
        int i3 = serializer + 27;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return j7Var;
    }

    public static j7[] values() {
        int i = 2 % 2;
        int i2 = write + 71;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        j7[] j7VarArr = (j7[]) $VALUES.clone();
        int i4 = write + 9;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return j7VarArr;
    }
}
