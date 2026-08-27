package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdav9lEwuigriKPLoepmU9DzDAsGns {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ r8lambdav9lEwuigriKPLoepmU9DzDAsGns[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public static final r8lambdav9lEwuigriKPLoepmU9DzDAsGns STANDALONE_ITEM = new r8lambdav9lEwuigriKPLoepmU9DzDAsGns("STANDALONE_ITEM", 0);
    public static final r8lambdav9lEwuigriKPLoepmU9DzDAsGns ACCORDION_NESTED_ITEM = new r8lambdav9lEwuigriKPLoepmU9DzDAsGns("ACCORDION_NESTED_ITEM", 1);

    private r8lambdav9lEwuigriKPLoepmU9DzDAsGns(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 9;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i4 = 71 / 0;
        } else {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        }
        int i5 = i2 + 125;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        r8lambdav9lEwuigriKPLoepmU9DzDAsGns[] r8lambdav9lewuigrikploepmu9dzdasgnsArr$values = $values();
        $VALUES = r8lambdav9lewuigrikploepmu9dzdasgnsArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) r8lambdav9lewuigrikploepmu9dzdasgnsArr$values);
        int i = RemoteActionCompatParcelizer + 49;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ r8lambdav9lEwuigriKPLoepmU9DzDAsGns[] $values() {
        int i = 2 % 2;
        int i2 = write + 53;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new r8lambdav9lEwuigriKPLoepmU9DzDAsGns[]{STANDALONE_ITEM, ACCORDION_NESTED_ITEM};
        }
        r8lambdav9lEwuigriKPLoepmU9DzDAsGns r8lambdav9lewuigrikploepmu9dzdasgns = STANDALONE_ITEM;
        r8lambdav9lEwuigriKPLoepmU9DzDAsGns r8lambdav9lewuigrikploepmu9dzdasgns2 = ACCORDION_NESTED_ITEM;
        r8lambdav9lEwuigriKPLoepmU9DzDAsGns[] r8lambdav9lewuigrikploepmu9dzdasgnsArr = new r8lambdav9lEwuigriKPLoepmU9DzDAsGns[5];
        r8lambdav9lewuigrikploepmu9dzdasgnsArr[0] = r8lambdav9lewuigrikploepmu9dzdasgns;
        r8lambdav9lewuigrikploepmu9dzdasgnsArr[0] = r8lambdav9lewuigrikploepmu9dzdasgns2;
        return r8lambdav9lewuigrikploepmu9dzdasgnsArr;
    }

    public static r8lambdav9lEwuigriKPLoepmU9DzDAsGns valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 89;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdav9lEwuigriKPLoepmU9DzDAsGns r8lambdav9lewuigrikploepmu9dzdasgns = (r8lambdav9lEwuigriKPLoepmU9DzDAsGns) Enum.valueOf(r8lambdav9lEwuigriKPLoepmU9DzDAsGns.class, str);
        int i4 = write + 11;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdav9lewuigrikploepmu9dzdasgns;
    }

    public static r8lambdav9lEwuigriKPLoepmU9DzDAsGns[] values() {
        int i = 2 % 2;
        int i2 = write + 47;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (r8lambdav9lEwuigriKPLoepmU9DzDAsGns[]) $VALUES.clone();
        }
        throw null;
    }
}
