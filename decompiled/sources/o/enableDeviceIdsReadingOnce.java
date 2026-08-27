package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class enableDeviceIdsReadingOnce {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ enableDeviceIdsReadingOnce[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private final String value;
    public static final enableDeviceIdsReadingOnce POOR = new enableDeviceIdsReadingOnce("POOR", 0, "poor");
    public static final enableDeviceIdsReadingOnce OKAY = new enableDeviceIdsReadingOnce("OKAY", 1, "okay");
    public static final enableDeviceIdsReadingOnce GOOD = new enableDeviceIdsReadingOnce("GOOD", 2, "good");
    public static final enableDeviceIdsReadingOnce EXCELLENT = new enableDeviceIdsReadingOnce("EXCELLENT", 3, "excellent");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 55;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValue() {
        String str;
        int i = 2 % 2;
        int i2 = read + 95;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            str = this.value;
            int i4 = 25 / 0;
        } else {
            str = this.value;
        }
        int i5 = i3 + 11;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private enableDeviceIdsReadingOnce(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        enableDeviceIdsReadingOnce[] enabledeviceidsreadingonceArr$values = $values();
        $VALUES = enabledeviceidsreadingonceArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) enabledeviceidsreadingonceArr$values);
        int i = serializer + 99;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 80 / 0;
        }
    }

    public static enableDeviceIdsReadingOnce valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 35;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        enableDeviceIdsReadingOnce enabledeviceidsreadingonce = (enableDeviceIdsReadingOnce) Enum.valueOf(enableDeviceIdsReadingOnce.class, str);
        int i4 = IconCompatParcelizer + 81;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return enabledeviceidsreadingonce;
    }

    public static enableDeviceIdsReadingOnce[] values() {
        int i = 2 % 2;
        int i2 = read + 111;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        enableDeviceIdsReadingOnce[] enabledeviceidsreadingonceArr = (enableDeviceIdsReadingOnce[]) $VALUES.clone();
        int i4 = read + 3;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return enabledeviceidsreadingonceArr;
    }

    private static final /* synthetic */ enableDeviceIdsReadingOnce[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        enableDeviceIdsReadingOnce[] enabledeviceidsreadingonceArr = {POOR, OKAY, GOOD, EXCELLENT};
        int i5 = i3 + 107;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return enabledeviceidsreadingonceArr;
    }
}
