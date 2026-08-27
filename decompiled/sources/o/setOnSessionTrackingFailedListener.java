package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class setOnSessionTrackingFailedListener {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ setOnSessionTrackingFailedListener[] $VALUES;
    public static final setProcessName Companion;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    private final String value;
    public static final setOnSessionTrackingFailedListener PUSH_NOTIFICATION = new setOnSessionTrackingFailedListener("PUSH_NOTIFICATION", 0, "push_notification");
    public static final setOnSessionTrackingFailedListener PULL_TO_REFRESH = new setOnSessionTrackingFailedListener("PULL_TO_REFRESH", 1, "pull_down_gesture");
    public static final setOnSessionTrackingFailedListener ENTER_FOREGROUND = new setOnSessionTrackingFailedListener("ENTER_FOREGROUND", 2, "enter_foreground");
    public static final setOnSessionTrackingFailedListener SMART_POLLING = new setOnSessionTrackingFailedListener("SMART_POLLING", 3, "smart_polling");
    public static final setOnSessionTrackingFailedListener SOCKET_EVENT = new setOnSessionTrackingFailedListener("SOCKET_EVENT", 4, "socket_event");
    public static final setOnSessionTrackingFailedListener NAFATH_TWEETY = new setOnSessionTrackingFailedListener("NAFATH_TWEETY", 5, "nafath_tweety");
    public static final setOnSessionTrackingFailedListener FIRESTORE = new setOnSessionTrackingFailedListener("FIRESTORE", 6, "firestore");
    public static final setOnSessionTrackingFailedListener OTHER = new setOnSessionTrackingFailedListener("OTHER", 7, "other");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 71;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 23;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 81;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 85;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private setOnSessionTrackingFailedListener(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [o.setProcessName] */
    static {
        setOnSessionTrackingFailedListener[] setonsessiontrackingfailedlistenerArr$values = $values();
        $VALUES = setonsessiontrackingfailedlistenerArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) setonsessiontrackingfailedlistenerArr$values);
        Companion = new Object() { // from class: o.setProcessName
        };
        int i = RemoteActionCompatParcelizer + 49;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static setOnSessionTrackingFailedListener valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setOnSessionTrackingFailedListener setonsessiontrackingfailedlistener = (setOnSessionTrackingFailedListener) Enum.valueOf(setOnSessionTrackingFailedListener.class, str);
        int i4 = read + 67;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return setonsessiontrackingfailedlistener;
    }

    public static setOnSessionTrackingFailedListener[] values() {
        int i = 2 % 2;
        int i2 = read + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (setOnSessionTrackingFailedListener[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ setOnSessionTrackingFailedListener[] $values() {
        int i = 2 % 2;
        int i2 = read + 97;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        setOnSessionTrackingFailedListener[] setonsessiontrackingfailedlistenerArr = {PUSH_NOTIFICATION, PULL_TO_REFRESH, ENTER_FOREGROUND, SMART_POLLING, SOCKET_EVENT, NAFATH_TWEETY, FIRESTORE, OTHER};
        int i5 = i3 + 71;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return setonsessiontrackingfailedlistenerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
