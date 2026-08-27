package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class subscribeToChangeUserEvents {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ subscribeToChangeUserEvents[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public static final subscribeToChangeUserEvents APPLICANT = new subscribeToChangeUserEvents("APPLICANT", 0);
    public static final subscribeToChangeUserEvents RIDER = new subscribeToChangeUserEvents("RIDER", 1);
    public static final subscribeToChangeUserEvents SKIP = new subscribeToChangeUserEvents("SKIP", 2);

    private subscribeToChangeUserEvents(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 13;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 37;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        subscribeToChangeUserEvents[] subscribetochangeusereventsArr$values = $values();
        $VALUES = subscribetochangeusereventsArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) subscribetochangeusereventsArr$values);
        int i = RemoteActionCompatParcelizer + 33;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static subscribeToChangeUserEvents valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 21;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        subscribeToChangeUserEvents subscribetochangeuserevents = (subscribeToChangeUserEvents) Enum.valueOf(subscribeToChangeUserEvents.class, str);
        int i4 = write + 117;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return subscribetochangeuserevents;
    }

    public static subscribeToChangeUserEvents[] values() {
        int i = 2 % 2;
        int i2 = read + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        subscribeToChangeUserEvents[] subscribetochangeusereventsArr = (subscribeToChangeUserEvents[]) $VALUES.clone();
        int i4 = write + 97;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return subscribetochangeusereventsArr;
    }

    private static final /* synthetic */ subscribeToChangeUserEvents[] $values() {
        subscribeToChangeUserEvents[] subscribetochangeusereventsArr;
        int i = 2 % 2;
        int i2 = write + 1;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            subscribeToChangeUserEvents subscribetochangeuserevents = APPLICANT;
            subscribeToChangeUserEvents subscribetochangeuserevents2 = RIDER;
            subscribeToChangeUserEvents subscribetochangeuserevents3 = SKIP;
            subscribetochangeusereventsArr = new subscribeToChangeUserEvents[3];
            subscribetochangeusereventsArr[1] = subscribetochangeuserevents;
            subscribetochangeusereventsArr[0] = subscribetochangeuserevents2;
            subscribetochangeusereventsArr[4] = subscribetochangeuserevents3;
        } else {
            subscribetochangeusereventsArr = new subscribeToChangeUserEvents[]{APPLICANT, RIDER, SKIP};
        }
        int i4 = i3 + 109;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return subscribetochangeusereventsArr;
    }
}
