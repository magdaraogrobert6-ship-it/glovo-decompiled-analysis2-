package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class saveLong {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ saveLong[] $VALUES;
    public static final saveBoolean Companion;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    private final String key;
    public static final saveLong PRIMARY = new saveLong("PRIMARY", 0, "primary");
    public static final saveLong SECONDARY = new saveLong("SECONDARY", 1, "secondary");
    public static final saveLong DESTRUCTIVE = new saveLong("DESTRUCTIVE", 2, "destructive");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 25;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 117;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 81;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.key;
        int i4 = i3 + 79;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private saveLong(String str, int i, String str2) {
        super(str, i);
        this.key = str2;
    }

    static {
        saveLong[] savelongArr$values = $values();
        $VALUES = savelongArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) savelongArr$values);
        Companion = new saveBoolean();
        int i = RemoteActionCompatParcelizer + 47;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static saveLong valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        saveLong savelong = (saveLong) Enum.valueOf(saveLong.class, str);
        int i4 = IconCompatParcelizer + 69;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return savelong;
        }
        throw null;
    }

    public static saveLong[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (saveLong[]) $VALUES.clone();
        }
        throw null;
    }

    private static final /* synthetic */ saveLong[] $values() {
        int i = 2 % 2;
        int i2 = read + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new saveLong[]{PRIMARY, SECONDARY, DESTRUCTIVE};
        }
        saveLong savelong = PRIMARY;
        saveLong savelong2 = SECONDARY;
        saveLong savelong3 = DESTRUCTIVE;
        saveLong[] savelongArr = new saveLong[3];
        savelongArr[1] = savelong;
        savelongArr[0] = savelong2;
        savelongArr[3] = savelong3;
        return savelongArr;
    }
}
