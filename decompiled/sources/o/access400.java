package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class access400 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ access400[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public static final access400 Loading = new access400("Loading", 0);
    public static final access400 Available = new access400("Available", 1);
    public static final access400 Unavailable = new access400("Unavailable", 2);

    private access400(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 101;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i4 = 34 / 0;
        } else {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        }
        int i5 = i2 + 53;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        access400[] access400VarArr$values = $values();
        $VALUES = access400VarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) access400VarArr$values);
        int i = write + 85;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static access400 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (access400) Enum.valueOf(access400.class, str);
        }
        int i3 = 87 / 0;
        return (access400) Enum.valueOf(access400.class, str);
    }

    public static access400[] values() {
        int i = 2 % 2;
        int i2 = read + 97;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        access400[] access400VarArr = (access400[]) $VALUES.clone();
        int i3 = read + 75;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 52 / 0;
        }
        return access400VarArr;
    }

    private static final /* synthetic */ access400[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new access400[]{Loading, Available, Unavailable};
        }
        access400 access400Var = Loading;
        access400 access400Var2 = Available;
        access400 access400Var3 = Unavailable;
        access400[] access400VarArr = new access400[3];
        access400VarArr[0] = access400Var;
        access400VarArr[0] = access400Var2;
        access400VarArr[4] = access400Var3;
        return access400VarArr;
    }
}
