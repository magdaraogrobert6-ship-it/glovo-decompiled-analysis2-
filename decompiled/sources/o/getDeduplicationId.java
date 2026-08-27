package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getDeduplicationId {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getDeduplicationId[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public static final getDeduplicationId CURRENT = new getDeduplicationId("CURRENT", 0);
    public static final getDeduplicationId LATE = new getDeduplicationId("LATE", 1);
    public static final getDeduplicationId NEXT = new getDeduplicationId("NEXT", 2);
    public static final getDeduplicationId UPCOMING = new getDeduplicationId("UPCOMING", 3);

    private getDeduplicationId(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 17;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 91;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        getDeduplicationId[] getdeduplicationidArr$values = $values();
        $VALUES = getdeduplicationidArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getdeduplicationidArr$values);
        int i = read + 119;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static getDeduplicationId valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (getDeduplicationId) Enum.valueOf(getDeduplicationId.class, str);
        }
        int i3 = 13 / 0;
        return (getDeduplicationId) Enum.valueOf(getDeduplicationId.class, str);
    }

    public static getDeduplicationId[] values() {
        int i = 2 % 2;
        int i2 = write + 95;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (getDeduplicationId[]) $VALUES.clone();
        }
        throw null;
    }

    private static final /* synthetic */ getDeduplicationId[] $values() {
        int i = 2 % 2;
        int i2 = write + 101;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new getDeduplicationId[]{CURRENT, LATE, NEXT, UPCOMING};
        }
        getDeduplicationId getdeduplicationid = CURRENT;
        getDeduplicationId getdeduplicationid2 = LATE;
        getDeduplicationId getdeduplicationid3 = NEXT;
        getDeduplicationId getdeduplicationid4 = UPCOMING;
        getDeduplicationId[] getdeduplicationidArr = new getDeduplicationId[4];
        getdeduplicationidArr[1] = getdeduplicationid;
        getdeduplicationidArr[1] = getdeduplicationid2;
        getdeduplicationidArr[3] = getdeduplicationid3;
        getdeduplicationidArr[5] = getdeduplicationid4;
        return getdeduplicationidArr;
    }
}
