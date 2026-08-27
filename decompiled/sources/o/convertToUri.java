package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class convertToUri {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ convertToUri[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    private final String value;
    public static final convertToUri TIME = new convertToUri("TIME", 0, "HH:mm");
    public static final convertToUri NAME_OF_DAY = new convertToUri("NAME_OF_DAY", 1, "EEE");
    public static final convertToUri NAME_OF_MONTH = new convertToUri("NAME_OF_MONTH", 2, "MMM");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 51;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        int i3 = 37 / 0;
        return $ENTRIES;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = read + 123;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.value;
        }
        int i3 = 75 / 0;
        return this.value;
    }

    private convertToUri(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        convertToUri[] converttouriArr$values = $values();
        $VALUES = converttouriArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) converttouriArr$values);
        int i = serializer + 15;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static convertToUri valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (convertToUri) Enum.valueOf(convertToUri.class, str);
        }
        throw null;
    }

    public static convertToUri[] values() {
        convertToUri[] converttouriArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 75;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            converttouriArr = (convertToUri[]) $VALUES.clone();
            int i3 = 98 / 0;
        } else {
            converttouriArr = (convertToUri[]) $VALUES.clone();
        }
        int i4 = read + 117;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return converttouriArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ convertToUri[] $values() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 3;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        convertToUri[] converttouriArr = {TIME, NAME_OF_DAY, NAME_OF_MONTH};
        int i5 = i2 + 115;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return converttouriArr;
    }
}
