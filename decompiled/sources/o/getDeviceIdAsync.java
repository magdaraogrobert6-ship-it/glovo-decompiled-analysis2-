package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getDeviceIdAsync {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getDeviceIdAsync[] $VALUES;
    public static final getDeviceIdAsync BINARY = new getDeviceIdAsync("BINARY", 0, "binary");
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private final String value;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 97;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 91;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private getDeviceIdAsync(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    private static final /* synthetic */ getDeviceIdAsync[] $values() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 5;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getDeviceIdAsync[] getdeviceidasyncArr = {BINARY};
        int i5 = i2 + 39;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return getdeviceidasyncArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        getDeviceIdAsync[] getdeviceidasyncArr$values = $values();
        $VALUES = getdeviceidasyncArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getdeviceidasyncArr$values);
        int i = read + 83;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static getDeviceIdAsync valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getDeviceIdAsync getdeviceidasync = (getDeviceIdAsync) Enum.valueOf(getDeviceIdAsync.class, str);
        int i4 = serializer + 13;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getdeviceidasync;
    }

    public static getDeviceIdAsync[] values() {
        int i = 2 % 2;
        int i2 = serializer + 101;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (getDeviceIdAsync[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
