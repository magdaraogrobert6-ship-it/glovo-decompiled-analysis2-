package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class getChanges {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getChanges[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    private final String typeName;
    public static final getChanges WIFI = new getChanges("WIFI", 0, "wifi");
    public static final getChanges CELLULAR = new getChanges("CELLULAR", 1, "cellular");
    public static final getChanges OTHERS = new getChanges("OTHERS", 2, "others");
    public static final getChanges INACTIVE = new getChanges("INACTIVE", 3, "inactive");
    public static final getChanges NO_SERVICES_FOUND = new getChanges("NO_SERVICES_FOUND", 4, "no_services_found");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 83;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getTypeName() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.typeName;
        }
        int i3 = 93 / 0;
        return this.typeName;
    }

    private getChanges(String str, int i, String str2) {
        super(str, i);
        this.typeName = str2;
    }

    static {
        getChanges[] getchangesArr$values = $values();
        $VALUES = getchangesArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getchangesArr$values);
        int i = write + 13;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 32 / 0;
        }
    }

    public static getChanges valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 111;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getChanges getchanges = (getChanges) Enum.valueOf(getChanges.class, str);
        int i3 = IconCompatParcelizer + 3;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return getchanges;
    }

    public static getChanges[] values() {
        int i = 2 % 2;
        int i2 = read + 117;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getChanges[] getchangesArr = (getChanges[]) $VALUES.clone();
        int i4 = IconCompatParcelizer + 67;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getchangesArr;
    }

    private static final /* synthetic */ getChanges[] $values() {
        int i = 2 % 2;
        int i2 = read + 115;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        getChanges[] getchangesArr = {WIFI, CELLULAR, OTHERS, INACTIVE, NO_SERVICES_FOUND};
        int i5 = i3 + 63;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return getchangesArr;
        }
        throw null;
    }
}
