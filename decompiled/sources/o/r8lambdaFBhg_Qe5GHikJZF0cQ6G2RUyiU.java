package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    public static final r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU SUCCESS = new r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU("SUCCESS", 0);
    public static final r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU FAILED = new r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU("FAILED", 1);
    public static final r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU CLOSED_BY_USER = new r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU("CLOSED_BY_USER", 2);

    private r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    static {
        r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU[] r8lambdafbhg_qe5ghikjzf0cq6g2ruyiuArr$values = $values();
        $VALUES = r8lambdafbhg_qe5ghikjzf0cq6g2ruyiuArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) r8lambdafbhg_qe5ghikjzf0cq6g2ruyiuArr$values);
        int i = read + 41;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 85;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU r8lambdafbhg_qe5ghikjzf0cq6g2ruyiu = (r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU) Enum.valueOf(r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU.class, str);
        int i4 = IconCompatParcelizer + 77;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return r8lambdafbhg_qe5ghikjzf0cq6g2ruyiu;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU[] r8lambdafbhg_qe5ghikjzf0cq6g2ruyiuArr = (r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 63;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdafbhg_qe5ghikjzf0cq6g2ruyiuArr;
    }

    private static final /* synthetic */ r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 59;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU[] r8lambdafbhg_qe5ghikjzf0cq6g2ruyiuArr = {SUCCESS, FAILED, CLOSED_BY_USER};
        int i5 = i2 + 125;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdafbhg_qe5ghikjzf0cq6g2ruyiuArr;
        }
        throw null;
    }
}
