package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class setSelection {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ setSelection[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public static final setSelection INITIAL = new setSelection("INITIAL", 0);
    public static final setSelection NOT_LOGGED_IN = new setSelection("NOT_LOGGED_IN", 1);
    public static final setSelection LOGGED_IN = new setSelection("LOGGED_IN", 2);
    public static final setSelection LOGOUT_REQUESTED = new setSelection("LOGOUT_REQUESTED", 3);
    public static final setSelection LOGOUT_STARTED = new setSelection("LOGOUT_STARTED", 4);

    private setSelection(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 99;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 19;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        setSelection[] setselectionArr$values = $values();
        $VALUES = setselectionArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) setselectionArr$values);
        int i = read + 79;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static setSelection valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setSelection setselection = (setSelection) Enum.valueOf(setSelection.class, str);
        int i4 = RemoteActionCompatParcelizer + 3;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setselection;
    }

    public static setSelection[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setSelection[] setselectionArr = (setSelection[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 35;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return setselectionArr;
    }

    private static final /* synthetic */ setSelection[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        setSelection[] setselectionArr = {INITIAL, NOT_LOGGED_IN, LOGGED_IN, LOGOUT_REQUESTED, LOGOUT_STARTED};
        int i5 = i3 + 111;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return setselectionArr;
    }
}
