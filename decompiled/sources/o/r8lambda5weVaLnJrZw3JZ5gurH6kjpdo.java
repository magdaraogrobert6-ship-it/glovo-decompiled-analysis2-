package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda5weVaLnJrZw3JZ5gurH6kjpdo {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ r8lambda5weVaLnJrZw3JZ5gurH6kjpdo[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public static final r8lambda5weVaLnJrZw3JZ5gurH6kjpdo CHAT_LANGUAGE = new r8lambda5weVaLnJrZw3JZ5gurH6kjpdo("CHAT_LANGUAGE", 0);
    public static final r8lambda5weVaLnJrZw3JZ5gurH6kjpdo APPEARANCE = new r8lambda5weVaLnJrZw3JZ5gurH6kjpdo("APPEARANCE", 1);
    public static final r8lambda5weVaLnJrZw3JZ5gurH6kjpdo NAVIGATION = new r8lambda5weVaLnJrZw3JZ5gurH6kjpdo("NAVIGATION", 2);
    public static final r8lambda5weVaLnJrZw3JZ5gurH6kjpdo OPEN_SOURCE_LICENSES = new r8lambda5weVaLnJrZw3JZ5gurH6kjpdo("OPEN_SOURCE_LICENSES", 3);
    public static final r8lambda5weVaLnJrZw3JZ5gurH6kjpdo DEVELOPER_MENU = new r8lambda5weVaLnJrZw3JZ5gurH6kjpdo("DEVELOPER_MENU", 4);
    public static final r8lambda5weVaLnJrZw3JZ5gurH6kjpdo DATA_PRIVACY_SETTINGS = new r8lambda5weVaLnJrZw3JZ5gurH6kjpdo("DATA_PRIVACY_SETTINGS", 5);

    private r8lambda5weVaLnJrZw3JZ5gurH6kjpdo(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 95;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 35;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        r8lambda5weVaLnJrZw3JZ5gurH6kjpdo[] r8lambda5wevalnjrzw3jz5gurh6kjpdoArr$values = $values();
        $VALUES = r8lambda5wevalnjrzw3jz5gurh6kjpdoArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) r8lambda5wevalnjrzw3jz5gurh6kjpdoArr$values);
        int i = IconCompatParcelizer + 93;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static r8lambda5weVaLnJrZw3JZ5gurH6kjpdo valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 1;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (r8lambda5weVaLnJrZw3JZ5gurH6kjpdo) Enum.valueOf(r8lambda5weVaLnJrZw3JZ5gurH6kjpdo.class, str);
        }
        int i3 = 30 / 0;
        return (r8lambda5weVaLnJrZw3JZ5gurH6kjpdo) Enum.valueOf(r8lambda5weVaLnJrZw3JZ5gurH6kjpdo.class, str);
    }

    public static r8lambda5weVaLnJrZw3JZ5gurH6kjpdo[] values() {
        int i = 2 % 2;
        int i2 = read + 79;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        r8lambda5weVaLnJrZw3JZ5gurH6kjpdo[] r8lambda5wevalnjrzw3jz5gurh6kjpdoArr = (r8lambda5weVaLnJrZw3JZ5gurH6kjpdo[]) $VALUES.clone();
        int i3 = read + 13;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 12 / 0;
        }
        return r8lambda5wevalnjrzw3jz5gurh6kjpdoArr;
    }

    private static final /* synthetic */ r8lambda5weVaLnJrZw3JZ5gurH6kjpdo[] $values() {
        int i = 2 % 2;
        int i2 = write + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambda5weVaLnJrZw3JZ5gurH6kjpdo[] r8lambda5wevalnjrzw3jz5gurh6kjpdoArr = {CHAT_LANGUAGE, APPEARANCE, NAVIGATION, OPEN_SOURCE_LICENSES, DEVELOPER_MENU, DATA_PRIVACY_SETTINGS};
        int i5 = i3 + 83;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
        return r8lambda5wevalnjrzw3jz5gurh6kjpdoArr;
    }
}
