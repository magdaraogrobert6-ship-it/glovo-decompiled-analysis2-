package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public static final r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08 CAMERA = new r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08("CAMERA", 0);
    public static final r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08 LOCATION = new r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08("LOCATION", 1);
    public static final r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08 NOTIFICATION = new r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08("NOTIFICATION", 2);
    public static final r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08 ACTIVITY_RECOGNITION = new r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08("ACTIVITY_RECOGNITION", 3);
    public static final r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08 BLUETOOTH_SCAN = new r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08("BLUETOOTH_SCAN", 4);

    private r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 81;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 45;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08[] r8lambda60pwjrj_ieyypznb7gugmuamr08Arr$values = $values();
        $VALUES = r8lambda60pwjrj_ieyypznb7gugmuamr08Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) r8lambda60pwjrj_ieyypznb7gugmuamr08Arr$values);
        int i = write + 101;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08 r8lambda60pwjrj_ieyypznb7gugmuamr08 = (r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08) Enum.valueOf(r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.class, str);
        int i3 = IconCompatParcelizer + 89;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return r8lambda60pwjrj_ieyypznb7gugmuamr08;
    }

    public static r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 65;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08[] r8lambda60pwjrj_ieyypznb7gugmuamr08Arr = {CAMERA, LOCATION, NOTIFICATION, ACTIVITY_RECOGNITION, BLUETOOTH_SCAN};
        int i5 = i2 + 59;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda60pwjrj_ieyypznb7gugmuamr08Arr;
    }
}
