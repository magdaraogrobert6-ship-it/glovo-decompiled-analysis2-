package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class executeAsList {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ executeAsList[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public static final executeAsList RXP = new executeAsList("RXP", 0);
    public static final executeAsList RAVL = new executeAsList("RAVL", 1);
    public static final executeAsList RACC = new executeAsList("RACC", 2);
    public static final executeAsList OA = new executeAsList("OA", 3);
    public static final executeAsList OTW = new executeAsList("OTW", 4);
    public static final executeAsList PUDO = new executeAsList("PUDO", 5);
    public static final executeAsList DF = new executeAsList("DF", 6);
    public static final executeAsList INFRA = new executeAsList("INFRA", 7);

    private executeAsList(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 81;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    static {
        executeAsList[] executeaslistArr$values = $values();
        $VALUES = executeaslistArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) executeaslistArr$values);
        int i = RemoteActionCompatParcelizer + 55;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static executeAsList valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        executeAsList executeaslist = (executeAsList) Enum.valueOf(executeAsList.class, str);
        int i4 = read + 53;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return executeaslist;
    }

    public static executeAsList[] values() {
        int i = 2 % 2;
        int i2 = read + 19;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        executeAsList[] executeaslistArr = (executeAsList[]) $VALUES.clone();
        int i3 = write + 9;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return executeaslistArr;
        }
        throw null;
    }

    private static final /* synthetic */ executeAsList[] $values() {
        int i = 2 % 2;
        int i2 = read + 27;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        executeAsList[] executeaslistArr = {RXP, RAVL, RACC, OA, OTW, PUDO, DF, INFRA};
        int i5 = i3 + 121;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return executeaslistArr;
    }
}
