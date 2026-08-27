package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public static final r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug SHOW = new r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug("SHOW", 0);
    public static final r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug HIDE = new r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug("HIDE", 1);

    private r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 99;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        obj.hashCode();
        throw null;
    }

    static {
        r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug[] r8lambdayr4ccli8vozbdisfgdrbywq9ugArr$values = $values();
        $VALUES = r8lambdayr4ccli8vozbdisfgdrbywq9ugArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) r8lambdayr4ccli8vozbdisfgdrbywq9ugArr$values);
        int i = RemoteActionCompatParcelizer + 93;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 7 / 0;
        }
    }

    private static final /* synthetic */ r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug[]{SHOW, HIDE};
        }
        r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug r8lambdayr4ccli8vozbdisfgdrbywq9ug = SHOW;
        r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug r8lambdayr4ccli8vozbdisfgdrbywq9ug2 = HIDE;
        r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug[] r8lambdayr4ccli8vozbdisfgdrbywq9ugArr = new r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug[5];
        r8lambdayr4ccli8vozbdisfgdrbywq9ugArr[1] = r8lambdayr4ccli8vozbdisfgdrbywq9ug;
        r8lambdayr4ccli8vozbdisfgdrbywq9ugArr[0] = r8lambdayr4ccli8vozbdisfgdrbywq9ug2;
        return r8lambdayr4ccli8vozbdisfgdrbywq9ugArr;
    }

    public static r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 55;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug r8lambdayr4ccli8vozbdisfgdrbywq9ug = (r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug) Enum.valueOf(r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug.class, str);
        int i4 = read + 7;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdayr4ccli8vozbdisfgdrbywq9ug;
    }

    public static r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug[] values() {
        int i = 2 % 2;
        int i2 = read + 47;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug[] r8lambdayr4ccli8vozbdisfgdrbywq9ugArr = (r8lambdayR4Ccli8VOZbdisFGdrBYWq9ug[]) $VALUES.clone();
        int i4 = read + 31;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdayr4ccli8vozbdisfgdrbywq9ugArr;
    }
}
