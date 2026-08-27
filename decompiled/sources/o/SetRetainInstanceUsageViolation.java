package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SetRetainInstanceUsageViolation {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ SetRetainInstanceUsageViolation[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public static final SetRetainInstanceUsageViolation TOP = new SetRetainInstanceUsageViolation("TOP", 0);
    public static final SetRetainInstanceUsageViolation BOTTOM = new SetRetainInstanceUsageViolation("BOTTOM", 1);

    private SetRetainInstanceUsageViolation(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 17;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i4 = 72 / 0;
        } else {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        }
        int i5 = i2 + 7;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        SetRetainInstanceUsageViolation[] setRetainInstanceUsageViolationArr$values = $values();
        $VALUES = setRetainInstanceUsageViolationArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) setRetainInstanceUsageViolationArr$values);
        int i = serializer + 111;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ SetRetainInstanceUsageViolation[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 43;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        SetRetainInstanceUsageViolation[] setRetainInstanceUsageViolationArr = {TOP, BOTTOM};
        int i5 = i2 + 97;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return setRetainInstanceUsageViolationArr;
    }

    public static SetRetainInstanceUsageViolation valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (SetRetainInstanceUsageViolation) Enum.valueOf(SetRetainInstanceUsageViolation.class, str);
        }
        int i3 = 57 / 0;
        return (SetRetainInstanceUsageViolation) Enum.valueOf(SetRetainInstanceUsageViolation.class, str);
    }

    public static SetRetainInstanceUsageViolation[] values() {
        int i = 2 % 2;
        int i2 = write + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        SetRetainInstanceUsageViolation[] setRetainInstanceUsageViolationArr = (SetRetainInstanceUsageViolation[]) $VALUES.clone();
        int i3 = write + 75;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return setRetainInstanceUsageViolationArr;
        }
        obj.hashCode();
        throw null;
    }
}
