package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class setUrlStrategy {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ setUrlStrategy[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    private final String value;
    public static final setUrlStrategy AVAILABLE = new setUrlStrategy("AVAILABLE", 0, "available");
    public static final setUrlStrategy BREAK = new setUrlStrategy("BREAK", 1, "break");
    public static final setUrlStrategy ENDING = new setUrlStrategy("ENDING", 2, "ending");
    public static final setUrlStrategy LATE = new setUrlStrategy("LATE", 3, "late");
    public static final setUrlStrategy NOT_WORKING = new setUrlStrategy("NOT_WORKING", 4, "not_working");
    public static final setUrlStrategy READY = new setUrlStrategy("READY", 5, "ready");
    public static final setUrlStrategy STARTING = new setUrlStrategy("STARTING", 6, "starting");
    public static final setUrlStrategy TEMP_OFFLINE = new setUrlStrategy("TEMP_OFFLINE", 7, "temp_not_working");
    public static final setUrlStrategy WORKING = new setUrlStrategy("WORKING", 8, "working");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 115;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 113;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 69;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private setUrlStrategy(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        setUrlStrategy[] seturlstrategyArr$values = $values();
        $VALUES = seturlstrategyArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) seturlstrategyArr$values);
        int i = IconCompatParcelizer + 109;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static setUrlStrategy valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 43;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (setUrlStrategy) Enum.valueOf(setUrlStrategy.class, str);
        }
        throw null;
    }

    public static setUrlStrategy[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setUrlStrategy[] seturlstrategyArr = (setUrlStrategy[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 107;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return seturlstrategyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ setUrlStrategy[] $values() {
        int i = 2 % 2;
        int i2 = read + 103;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        setUrlStrategy[] seturlstrategyArr = {AVAILABLE, BREAK, ENDING, LATE, NOT_WORKING, READY, STARTING, TEMP_OFFLINE, WORKING};
        int i5 = i3 + 17;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return seturlstrategyArr;
    }
}
