package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class EditTextPreferenceSavedState {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ EditTextPreferenceSavedState[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public static final EditTextPreferenceSavedState WEB_INTEGRATION = new EditTextPreferenceSavedState("WEB_INTEGRATION", 0);
    public static final EditTextPreferenceSavedState DEEP_LINK = new EditTextPreferenceSavedState("DEEP_LINK", 1);
    public static final EditTextPreferenceSavedState EXTERNAL_URL = new EditTextPreferenceSavedState("EXTERNAL_URL", 2);

    private EditTextPreferenceSavedState(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 75;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 45;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        EditTextPreferenceSavedState[] editTextPreferenceSavedStateArr$values = $values();
        $VALUES = editTextPreferenceSavedStateArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) editTextPreferenceSavedStateArr$values);
        int i = serializer + 99;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EditTextPreferenceSavedState valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 37;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        EditTextPreferenceSavedState editTextPreferenceSavedState = (EditTextPreferenceSavedState) Enum.valueOf(EditTextPreferenceSavedState.class, str);
        int i4 = IconCompatParcelizer + 77;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return editTextPreferenceSavedState;
    }

    public static EditTextPreferenceSavedState[] values() {
        int i = 2 % 2;
        int i2 = write + 49;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        EditTextPreferenceSavedState[] editTextPreferenceSavedStateArr = (EditTextPreferenceSavedState[]) $VALUES.clone();
        int i3 = write + 43;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return editTextPreferenceSavedStateArr;
    }

    private static final /* synthetic */ EditTextPreferenceSavedState[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new EditTextPreferenceSavedState[]{WEB_INTEGRATION, DEEP_LINK, EXTERNAL_URL};
        }
        EditTextPreferenceSavedState editTextPreferenceSavedState = WEB_INTEGRATION;
        EditTextPreferenceSavedState editTextPreferenceSavedState2 = DEEP_LINK;
        EditTextPreferenceSavedState editTextPreferenceSavedState3 = EXTERNAL_URL;
        EditTextPreferenceSavedState[] editTextPreferenceSavedStateArr = new EditTextPreferenceSavedState[5];
        editTextPreferenceSavedStateArr[1] = editTextPreferenceSavedState;
        editTextPreferenceSavedStateArr[0] = editTextPreferenceSavedState2;
        editTextPreferenceSavedStateArr[2] = editTextPreferenceSavedState3;
        return editTextPreferenceSavedStateArr;
    }
}
