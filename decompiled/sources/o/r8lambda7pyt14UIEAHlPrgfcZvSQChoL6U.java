package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public static final r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U SAFETY = new r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U("SAFETY", 0);
    public static final r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U BIOMETRIC_AUTHENTICATION = new r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U("BIOMETRIC_AUTHENTICATION", 1);
    public static final r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U MAP_METRICS = new r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U("MAP_METRICS", 2);
    public static final r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U NAVER_ROUTE_PREVIEW = new r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U("NAVER_ROUTE_PREVIEW", 3);
    public static final r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U NAVIGATION_AVOID_HIGHWAYS = new r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U("NAVIGATION_AVOID_HIGHWAYS", 4);
    public static final r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U NAVIGATION_AVOID_TOLLS = new r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U("NAVIGATION_AVOID_TOLLS", 5);

    private r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 13;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 13;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    static {
        r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U[] r8lambda7pyt14uieahlprgfczvsqchol6uArr$values = $values();
        $VALUES = r8lambda7pyt14uieahlprgfczvsqchol6uArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) r8lambda7pyt14uieahlprgfczvsqchol6uArr$values);
        int i = write + 63;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U r8lambda7pyt14uieahlprgfczvsqchol6u = (r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U) Enum.valueOf(r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.class, str);
        int i3 = serializer + 115;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return r8lambda7pyt14uieahlprgfczvsqchol6u;
    }

    public static r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U[] values() {
        int i = 2 % 2;
        int i2 = read + 99;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U[] r8lambda7pyt14uieahlprgfczvsqchol6uArr = (r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U[]) $VALUES.clone();
        int i4 = read + 15;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambda7pyt14uieahlprgfczvsqchol6uArr;
    }

    private static final /* synthetic */ r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U[] $values() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 61;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U[] r8lambda7pyt14uieahlprgfczvsqchol6uArr = {SAFETY, BIOMETRIC_AUTHENTICATION, MAP_METRICS, NAVER_ROUTE_PREVIEW, NAVIGATION_AVOID_HIGHWAYS, NAVIGATION_AVOID_TOLLS};
        int i5 = i2 + 19;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambda7pyt14uieahlprgfczvsqchol6uArr;
        }
        throw null;
    }
}
