package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class bitsNeedForSizeUnchecked {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ bitsNeedForSizeUnchecked[] $VALUES;
    public static final constrainHeightK40F9xA Companion;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    private final String key;
    public static final bitsNeedForSizeUnchecked DISABLED = new bitsNeedForSizeUnchecked("DISABLED", 0, "disabled");
    public static final bitsNeedForSizeUnchecked RUNNING = new bitsNeedForSizeUnchecked("RUNNING", 1, "running");
    public static final bitsNeedForSizeUnchecked COMPLETED = new bitsNeedForSizeUnchecked("COMPLETED", 2, "completed");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 35;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 79;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = serializer + 75;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.key;
        }
        throw null;
    }

    private bitsNeedForSizeUnchecked(String str, int i, String str2) {
        super(str, i);
        this.key = str2;
    }

    static {
        bitsNeedForSizeUnchecked[] bitsneedforsizeuncheckedArr$values = $values();
        $VALUES = bitsneedforsizeuncheckedArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) bitsneedforsizeuncheckedArr$values);
        Companion = new constrainHeightK40F9xA();
        int i = RemoteActionCompatParcelizer + 7;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 76 / 0;
        }
    }

    public final boolean isDone() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 5;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this != COMPLETED) {
            return false;
        }
        int i4 = i2 + 29;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = i2 + 71;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }

    public static bitsNeedForSizeUnchecked valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 89;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (bitsNeedForSizeUnchecked) Enum.valueOf(bitsNeedForSizeUnchecked.class, str);
        }
        throw null;
    }

    public static bitsNeedForSizeUnchecked[] values() {
        int i = 2 % 2;
        int i2 = serializer + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (bitsNeedForSizeUnchecked[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ bitsNeedForSizeUnchecked[] $values() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 103;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        bitsNeedForSizeUnchecked[] bitsneedforsizeuncheckedArr = {DISABLED, RUNNING, COMPLETED};
        int i5 = i2 + 57;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
        return bitsneedforsizeuncheckedArr;
    }
}
