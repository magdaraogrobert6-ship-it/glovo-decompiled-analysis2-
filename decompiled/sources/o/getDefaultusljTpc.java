package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getDefaultusljTpc {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getDefaultusljTpc[] $VALUES;
    public static final getDefaultusljTpc COURSE = new getDefaultusljTpc("COURSE", 0, "course");
    public static final getDefaultusljTpc HEADING = new getDefaultusljTpc("HEADING", 1, "heading");
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private final String value;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        int i3 = 95 / 0;
        return $ENTRIES;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 75;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private getDefaultusljTpc(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        getDefaultusljTpc[] getdefaultusljtpcArr$values = $values();
        $VALUES = getdefaultusljtpcArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getdefaultusljtpcArr$values);
        int i = serializer + 97;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final /* synthetic */ getDefaultusljTpc[] $values() {
        int i = 2 % 2;
        int i2 = read + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new getDefaultusljTpc[]{COURSE, HEADING};
        }
        getDefaultusljTpc getdefaultusljtpc = COURSE;
        getDefaultusljTpc getdefaultusljtpc2 = HEADING;
        getDefaultusljTpc[] getdefaultusljtpcArr = new getDefaultusljTpc[5];
        getdefaultusljtpcArr[1] = getdefaultusljtpc;
        getdefaultusljtpcArr[1] = getdefaultusljtpc2;
        return getdefaultusljtpcArr;
    }

    public static getDefaultusljTpc valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getDefaultusljTpc getdefaultusljtpc = (getDefaultusljTpc) Enum.valueOf(getDefaultusljTpc.class, str);
        int i4 = IconCompatParcelizer + 123;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return getdefaultusljtpc;
        }
        throw null;
    }

    public static getDefaultusljTpc[] values() {
        int i = 2 % 2;
        int i2 = read + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        getDefaultusljTpc[] getdefaultusljtpcArr = (getDefaultusljTpc[]) $VALUES.clone();
        int i3 = IconCompatParcelizer + 27;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 58 / 0;
        }
        return getdefaultusljtpcArr;
    }
}
