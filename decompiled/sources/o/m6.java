package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class m6 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ m6[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public static final m6 Faster = new m6("Faster", 0);
    public static final m6 Slower = new m6("Slower", 1);
    public static final m6 Same = new m6("Same", 2);

    private m6(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 3;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i4 = 36 / 0;
        } else {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        }
        int i5 = i2 + 13;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        m6[] m6VarArr$values = $values();
        $VALUES = m6VarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) m6VarArr$values);
        int i = IconCompatParcelizer + 73;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 45 / 0;
        }
    }

    public static m6 valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 91;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        m6 m6Var = (m6) Enum.valueOf(m6.class, str);
        int i4 = RemoteActionCompatParcelizer + 71;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return m6Var;
    }

    public static m6[] values() {
        m6[] m6VarArr;
        int i = 2 % 2;
        int i2 = write + 111;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            m6VarArr = (m6[]) $VALUES.clone();
            int i3 = 31 / 0;
        } else {
            m6VarArr = (m6[]) $VALUES.clone();
        }
        int i4 = RemoteActionCompatParcelizer + 91;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return m6VarArr;
    }

    private static final /* synthetic */ m6[] $values() {
        m6[] m6VarArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            m6 m6Var = Faster;
            m6 m6Var2 = Slower;
            m6 m6Var3 = Same;
            m6VarArr = new m6[5];
            m6VarArr[1] = m6Var;
            m6VarArr[0] = m6Var2;
            m6VarArr[3] = m6Var3;
        } else {
            m6VarArr = new m6[]{Faster, Slower, Same};
        }
        int i4 = i3 + 61;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return m6VarArr;
    }
}
