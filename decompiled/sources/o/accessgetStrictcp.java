package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class accessgetStrictcp {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ accessgetStrictcp[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    private final String value;
    public static final accessgetStrictcp IN_APP = new accessgetStrictcp("IN_APP", 0, "inapp");
    public static final accessgetStrictcp EXTERNAL = new accessgetStrictcp("EXTERNAL", 1, "external");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 11;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = serializer + 15;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 39;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private accessgetStrictcp(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        accessgetStrictcp[] accessgetstrictcpArr$values = $values();
        $VALUES = accessgetstrictcpArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) accessgetstrictcpArr$values);
        int i = RemoteActionCompatParcelizer + 11;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ accessgetStrictcp[] $values() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 57;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        accessgetStrictcp[] accessgetstrictcpArr = {IN_APP, EXTERNAL};
        int i5 = i2 + 55;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return accessgetstrictcpArr;
    }

    public static accessgetStrictcp valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 7;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (accessgetStrictcp) Enum.valueOf(accessgetStrictcp.class, str);
        }
        int i3 = 60 / 0;
        return (accessgetStrictcp) Enum.valueOf(accessgetStrictcp.class, str);
    }

    public static accessgetStrictcp[] values() {
        int i = 2 % 2;
        int i2 = read + 69;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessgetStrictcp[] accessgetstrictcpArr = (accessgetStrictcp[]) $VALUES.clone();
        int i4 = read + 31;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return accessgetstrictcpArr;
    }
}
