package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class accessgetPhrasecp {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ accessgetPhrasecp[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    private final String value;
    public static final accessgetPhrasecp AVAILABLE = new accessgetPhrasecp("AVAILABLE", 0, "true");
    public static final accessgetPhrasecp UNAVAILABLE = new accessgetPhrasecp("UNAVAILABLE", 1, "false");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        int i3 = 84 / 0;
        return $ENTRIES;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = read + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 115;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private accessgetPhrasecp(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    private static final /* synthetic */ accessgetPhrasecp[] $values() {
        accessgetPhrasecp[] accessgetphrasecpArr;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 43;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            accessgetPhrasecp accessgetphrasecp = AVAILABLE;
            accessgetPhrasecp accessgetphrasecp2 = UNAVAILABLE;
            accessgetphrasecpArr = new accessgetPhrasecp[5];
            accessgetphrasecpArr[0] = accessgetphrasecp;
            accessgetphrasecpArr[0] = accessgetphrasecp2;
        } else {
            accessgetphrasecpArr = new accessgetPhrasecp[]{AVAILABLE, UNAVAILABLE};
        }
        int i4 = i2 + 61;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return accessgetphrasecpArr;
    }

    static {
        accessgetPhrasecp[] accessgetphrasecpArr$values = $values();
        $VALUES = accessgetphrasecpArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) accessgetphrasecpArr$values);
        int i = RemoteActionCompatParcelizer + 53;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 39 / 0;
        }
    }

    public static accessgetPhrasecp valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 55;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessgetPhrasecp accessgetphrasecp = (accessgetPhrasecp) Enum.valueOf(accessgetPhrasecp.class, str);
        int i4 = write + 47;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return accessgetphrasecp;
    }

    public static accessgetPhrasecp[] values() {
        accessgetPhrasecp[] accessgetphrasecpArr;
        int i = 2 % 2;
        int i2 = read + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            accessgetphrasecpArr = (accessgetPhrasecp[]) $VALUES.clone();
            int i3 = 32 / 0;
        } else {
            accessgetphrasecpArr = (accessgetPhrasecp[]) $VALUES.clone();
        }
        int i4 = write + 93;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return accessgetphrasecpArr;
        }
        throw null;
    }
}
