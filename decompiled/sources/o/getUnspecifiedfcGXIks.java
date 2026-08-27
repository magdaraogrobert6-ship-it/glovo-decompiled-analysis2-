package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getUnspecifiedfcGXIks {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getUnspecifiedfcGXIks[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public static final getUnspecifiedfcGXIks IN_APP = new getUnspecifiedfcGXIks("IN_APP", 0);
    public static final getUnspecifiedfcGXIks EXTERNAL_APP = new getUnspecifiedfcGXIks("EXTERNAL_APP", 1);

    private getUnspecifiedfcGXIks(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 123;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        getUnspecifiedfcGXIks[] getunspecifiedfcgxiksArr$values = $values();
        $VALUES = getunspecifiedfcgxiksArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getunspecifiedfcgxiksArr$values);
        int i = serializer + 41;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final /* synthetic */ getUnspecifiedfcGXIks[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        getUnspecifiedfcGXIks[] getunspecifiedfcgxiksArr = {IN_APP, EXTERNAL_APP};
        int i5 = i3 + 19;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getunspecifiedfcgxiksArr;
    }

    public static getUnspecifiedfcGXIks valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (getUnspecifiedfcGXIks) Enum.valueOf(getUnspecifiedfcGXIks.class, str);
        }
        throw null;
    }

    public static getUnspecifiedfcGXIks[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (getUnspecifiedfcGXIks[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
