package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class isTrackingEnabled {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ isTrackingEnabled[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    private final String value;
    public static final isTrackingEnabled AVAILABLE = new isTrackingEnabled("AVAILABLE", 0, "available");
    public static final isTrackingEnabled ENDING = new isTrackingEnabled("ENDING", 1, "ending");
    public static final isTrackingEnabled LATE = new isTrackingEnabled("LATE", 2, "late");
    public static final isTrackingEnabled NOT_WORKING = new isTrackingEnabled("NOT_WORKING", 3, "not_working");
    public static final isTrackingEnabled ON_PAID_BREAK = new isTrackingEnabled("ON_PAID_BREAK", 4, "on_paid_break");
    public static final isTrackingEnabled ON_BREAK = new isTrackingEnabled("ON_BREAK", 5, "on_break");
    public static final isTrackingEnabled READY = new isTrackingEnabled("READY", 6, "ready");
    public static final isTrackingEnabled STARTING = new isTrackingEnabled("STARTING", 7, "starting");
    public static final isTrackingEnabled SUSPENDED = new isTrackingEnabled("SUSPENDED", 8, "suspended");
    public static final isTrackingEnabled WORKING = new isTrackingEnabled("WORKING", 9, "working");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 47;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i4 = 44 / 0;
        } else {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        }
        int i5 = i2 + 109;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isTrackingEnabled(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        isTrackingEnabled[] istrackingenabledArr$values = $values();
        $VALUES = istrackingenabledArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) istrackingenabledArr$values);
        int i = read + 41;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static isTrackingEnabled valueOf(String str) {
        isTrackingEnabled istrackingenabled;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            istrackingenabled = (isTrackingEnabled) Enum.valueOf(isTrackingEnabled.class, str);
            int i3 = 18 / 0;
        } else {
            istrackingenabled = (isTrackingEnabled) Enum.valueOf(isTrackingEnabled.class, str);
        }
        int i4 = IconCompatParcelizer + 37;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return istrackingenabled;
    }

    public static isTrackingEnabled[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        isTrackingEnabled[] istrackingenabledArr = (isTrackingEnabled[]) $VALUES.clone();
        int i4 = IconCompatParcelizer + 35;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return istrackingenabledArr;
    }

    private static final /* synthetic */ isTrackingEnabled[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        isTrackingEnabled[] istrackingenabledArr = {AVAILABLE, ENDING, LATE, NOT_WORKING, ON_PAID_BREAK, ON_BREAK, READY, STARTING, SUSPENDED, WORKING};
        int i5 = i3 + 47;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return istrackingenabledArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
