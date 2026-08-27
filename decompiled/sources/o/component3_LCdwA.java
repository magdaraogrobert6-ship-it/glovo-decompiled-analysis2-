package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class component3_LCdwA {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ component3_LCdwA[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    private final String rawValue;
    public static final component3_LCdwA PHOTO = new component3_LCdwA("PHOTO", 0, "photo");
    public static final component3_LCdwA USE_PHOTO = new component3_LCdwA("USE_PHOTO", 1, "use_photo");
    public static final component3_LCdwA RETAKE = new component3_LCdwA("RETAKE", 2, "retake");
    public static final component3_LCdwA CANCEL = new component3_LCdwA("CANCEL", 3, "cancel");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 3;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public final String getRawValue() {
        int i = 2 % 2;
        int i2 = serializer + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.rawValue;
        }
        int i3 = 97 / 0;
        return this.rawValue;
    }

    private component3_LCdwA(String str, int i, String str2) {
        super(str, i);
        this.rawValue = str2;
    }

    static {
        component3_LCdwA[] component3_lcdwaArr$values = $values();
        $VALUES = component3_lcdwaArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) component3_lcdwaArr$values);
        int i = write + 41;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static component3_LCdwA valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        component3_LCdwA component3_lcdwa = (component3_LCdwA) Enum.valueOf(component3_LCdwA.class, str);
        int i4 = read + 45;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return component3_lcdwa;
    }

    public static component3_LCdwA[] values() {
        int i = 2 % 2;
        int i2 = serializer + 125;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (component3_LCdwA[]) $VALUES.clone();
        }
        throw null;
    }

    private static final /* synthetic */ component3_LCdwA[] $values() {
        int i = 2 % 2;
        int i2 = read + 71;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        component3_LCdwA[] component3_lcdwaArr = {PHOTO, USE_PHOTO, RETAKE, CANCEL};
        int i5 = i3 + 59;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return component3_lcdwaArr;
    }
}
