package o;

/* JADX INFO: loaded from: classes3.dex */
public enum ActivityHandler {
    ALREADY_AVAILABLE_NOT_REQUESTED,
    REQUESTED;

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 91;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = serializer + 91;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ActivityHandler valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (ActivityHandler) Enum.valueOf(ActivityHandler.class, str);
        }
        int i3 = 58 / 0;
        return (ActivityHandler) Enum.valueOf(ActivityHandler.class, str);
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static ActivityHandler[] valuesCustom() {
        int i = 2 % 2;
        int i2 = read + 93;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ActivityHandler[] activityHandlerArr = (ActivityHandler[]) values().clone();
        int i4 = write + 61;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return activityHandlerArr;
    }
}
