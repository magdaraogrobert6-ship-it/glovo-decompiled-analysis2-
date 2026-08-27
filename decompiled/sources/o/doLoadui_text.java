package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class doLoadui_text {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ doLoadui_text[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    private final String value;
    public static final doLoadui_text NEUTRAL_PALE = new doLoadui_text("NEUTRAL_PALE", 0, "neutral_pale");
    public static final doLoadui_text WHITE_PALE = new doLoadui_text("WHITE_PALE", 1, "white_pale");
    public static final doLoadui_text GREEN = new doLoadui_text("GREEN", 2, "green");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 65;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 103;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 85;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return str;
    }

    private doLoadui_text(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        doLoadui_text[] doloadui_textArr$values = $values();
        $VALUES = doloadui_textArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) doloadui_textArr$values);
        int i = serializer + 125;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static doLoadui_text valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 125;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        doLoadui_text doloadui_text = (doLoadui_text) Enum.valueOf(doLoadui_text.class, str);
        int i4 = write + 75;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return doloadui_text;
    }

    public static doLoadui_text[] values() {
        int i = 2 % 2;
        int i2 = write + 13;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        doLoadui_text[] doloadui_textArr = (doLoadui_text[]) $VALUES.clone();
        int i3 = IconCompatParcelizer + 17;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 13 / 0;
        }
        return doloadui_textArr;
    }

    private static final /* synthetic */ doLoadui_text[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 17;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        doLoadui_text[] doloadui_textArr = {NEUTRAL_PALE, WHITE_PALE, GREEN};
        int i5 = i2 + 33;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return doloadui_textArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
