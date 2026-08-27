package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SetUserVisibleHintViolation {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ SetUserVisibleHintViolation[] $VALUES;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public static final SetUserVisibleHintViolation START = new SetUserVisibleHintViolation("START", 0);
    public static final SetUserVisibleHintViolation CENTER = new SetUserVisibleHintViolation("CENTER", 1);
    public static final SetUserVisibleHintViolation END = new SetUserVisibleHintViolation("END", 2);
    public static final SetUserVisibleHintViolation FILL = new SetUserVisibleHintViolation("FILL", 3);

    private SetUserVisibleHintViolation(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 69;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 71;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        SetUserVisibleHintViolation[] setUserVisibleHintViolationArr$values = $values();
        $VALUES = setUserVisibleHintViolationArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) setUserVisibleHintViolationArr$values);
        int i = RemoteActionCompatParcelizer + 123;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 78 / 0;
        }
    }

    public static SetUserVisibleHintViolation valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SetUserVisibleHintViolation setUserVisibleHintViolation = (SetUserVisibleHintViolation) Enum.valueOf(SetUserVisibleHintViolation.class, str);
        int i4 = read + 41;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return setUserVisibleHintViolation;
    }

    public static SetUserVisibleHintViolation[] values() {
        int i = 2 % 2;
        int i2 = serializer + 65;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SetUserVisibleHintViolation[] setUserVisibleHintViolationArr = (SetUserVisibleHintViolation[]) $VALUES.clone();
        int i4 = read + 69;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return setUserVisibleHintViolationArr;
    }

    private static final /* synthetic */ SetUserVisibleHintViolation[] $values() {
        int i = 2 % 2;
        int i2 = read + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new SetUserVisibleHintViolation[]{START, CENTER, END, FILL};
        }
        SetUserVisibleHintViolation setUserVisibleHintViolation = START;
        SetUserVisibleHintViolation setUserVisibleHintViolation2 = CENTER;
        SetUserVisibleHintViolation setUserVisibleHintViolation3 = END;
        SetUserVisibleHintViolation setUserVisibleHintViolation4 = FILL;
        SetUserVisibleHintViolation[] setUserVisibleHintViolationArr = new SetUserVisibleHintViolation[5];
        setUserVisibleHintViolationArr[1] = setUserVisibleHintViolation;
        setUserVisibleHintViolationArr[0] = setUserVisibleHintViolation2;
        setUserVisibleHintViolationArr[3] = setUserVisibleHintViolation3;
        setUserVisibleHintViolationArr[5] = setUserVisibleHintViolation4;
        return setUserVisibleHintViolationArr;
    }
}
