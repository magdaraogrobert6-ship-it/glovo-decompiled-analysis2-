package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class createAutoMigrations {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ createAutoMigrations[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public static final createAutoMigrations PICKUP = new createAutoMigrations("PICKUP", 0);
    public static final createAutoMigrations DROPOFF = new createAutoMigrations("DROPOFF", 1);

    private createAutoMigrations(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 21;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        createAutoMigrations[] createautomigrationsArr$values = $values();
        $VALUES = createautomigrationsArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) createautomigrationsArr$values);
        int i = IconCompatParcelizer + 29;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 7 / 0;
        }
    }

    private static final /* synthetic */ createAutoMigrations[] $values() {
        int i = 2 % 2;
        int i2 = write + 31;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        createAutoMigrations[] createautomigrationsArr = {PICKUP, DROPOFF};
        int i5 = i3 + 41;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return createautomigrationsArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static createAutoMigrations valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        createAutoMigrations createautomigrations = (createAutoMigrations) Enum.valueOf(createAutoMigrations.class, str);
        int i3 = write + 35;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return createautomigrations;
    }

    public static createAutoMigrations[] values() {
        int i = 2 % 2;
        int i2 = read + 93;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createAutoMigrations[] createautomigrationsArr = (createAutoMigrations[]) $VALUES.clone();
        int i4 = write + 65;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return createautomigrationsArr;
    }
}
