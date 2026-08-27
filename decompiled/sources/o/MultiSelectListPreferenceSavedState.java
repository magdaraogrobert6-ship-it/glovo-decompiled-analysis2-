package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class MultiSelectListPreferenceSavedState {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ MultiSelectListPreferenceSavedState[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public static final MultiSelectListPreferenceSavedState NEUTRAL = new MultiSelectListPreferenceSavedState("NEUTRAL", 0);
    public static final MultiSelectListPreferenceSavedState SUCCESS = new MultiSelectListPreferenceSavedState("SUCCESS", 1);
    public static final MultiSelectListPreferenceSavedState CRITICAL = new MultiSelectListPreferenceSavedState("CRITICAL", 2);
    public static final MultiSelectListPreferenceSavedState ALERT = new MultiSelectListPreferenceSavedState("ALERT", 3);

    private MultiSelectListPreferenceSavedState(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 101;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i2 + 37;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        MultiSelectListPreferenceSavedState[] multiSelectListPreferenceSavedStateArr$values = $values();
        $VALUES = multiSelectListPreferenceSavedStateArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) multiSelectListPreferenceSavedStateArr$values);
        int i = serializer + 45;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static MultiSelectListPreferenceSavedState valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 61;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        MultiSelectListPreferenceSavedState multiSelectListPreferenceSavedState = (MultiSelectListPreferenceSavedState) Enum.valueOf(MultiSelectListPreferenceSavedState.class, str);
        int i4 = write + 13;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return multiSelectListPreferenceSavedState;
    }

    public static MultiSelectListPreferenceSavedState[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        MultiSelectListPreferenceSavedState[] multiSelectListPreferenceSavedStateArr = (MultiSelectListPreferenceSavedState[]) $VALUES.clone();
        int i4 = write + 5;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return multiSelectListPreferenceSavedStateArr;
        }
        throw null;
    }

    private static final /* synthetic */ MultiSelectListPreferenceSavedState[] $values() {
        MultiSelectListPreferenceSavedState[] multiSelectListPreferenceSavedStateArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 87;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            multiSelectListPreferenceSavedStateArr = new MultiSelectListPreferenceSavedState[]{NEUTRAL, SUCCESS, CRITICAL};
            multiSelectListPreferenceSavedStateArr[2] = ALERT;
        } else {
            multiSelectListPreferenceSavedStateArr = new MultiSelectListPreferenceSavedState[]{NEUTRAL, SUCCESS, CRITICAL, ALERT};
        }
        int i4 = i2 + 35;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return multiSelectListPreferenceSavedStateArr;
    }
}
