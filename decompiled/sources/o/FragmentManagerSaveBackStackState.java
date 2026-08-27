package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class FragmentManagerSaveBackStackState {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ FragmentManagerSaveBackStackState[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public static final FragmentManagerSaveBackStackState DEFAULT = new FragmentManagerSaveBackStackState("DEFAULT", 0);
    public static final FragmentManagerSaveBackStackState ACCEPTING_DELIVERIES = new FragmentManagerSaveBackStackState("ACCEPTING_DELIVERIES", 1);
    public static final FragmentManagerSaveBackStackState ACCEPTING_DELIVERIES_NO_HELP_CENTER = new FragmentManagerSaveBackStackState("ACCEPTING_DELIVERIES_NO_HELP_CENTER", 2);
    public static final FragmentManagerSaveBackStackState TURN_BY_TURN_NAVIGATION = new FragmentManagerSaveBackStackState("TURN_BY_TURN_NAVIGATION", 3);
    public static final FragmentManagerSaveBackStackState LAST_STOP = new FragmentManagerSaveBackStackState("LAST_STOP", 4);

    private FragmentManagerSaveBackStackState(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        FragmentManagerSaveBackStackState[] fragmentManagerSaveBackStackStateArr$values = $values();
        $VALUES = fragmentManagerSaveBackStackStateArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) fragmentManagerSaveBackStackStateArr$values);
        int i = serializer + 7;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static FragmentManagerSaveBackStackState valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 111;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FragmentManagerSaveBackStackState fragmentManagerSaveBackStackState = (FragmentManagerSaveBackStackState) Enum.valueOf(FragmentManagerSaveBackStackState.class, str);
        int i4 = read + 83;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return fragmentManagerSaveBackStackState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FragmentManagerSaveBackStackState[] values() {
        FragmentManagerSaveBackStackState[] fragmentManagerSaveBackStackStateArr;
        int i = 2 % 2;
        int i2 = write + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            fragmentManagerSaveBackStackStateArr = (FragmentManagerSaveBackStackState[]) $VALUES.clone();
            int i3 = 35 / 0;
        } else {
            fragmentManagerSaveBackStackStateArr = (FragmentManagerSaveBackStackState[]) $VALUES.clone();
        }
        int i4 = write + 123;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return fragmentManagerSaveBackStackStateArr;
        }
        throw null;
    }

    private static final /* synthetic */ FragmentManagerSaveBackStackState[] $values() {
        int i = 2 % 2;
        int i2 = read + 65;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        FragmentManagerSaveBackStackState[] fragmentManagerSaveBackStackStateArr = {DEFAULT, ACCEPTING_DELIVERIES, ACCEPTING_DELIVERIES_NO_HELP_CENTER, TURN_BY_TURN_NAVIGATION, LAST_STOP};
        int i5 = i3 + 87;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return fragmentManagerSaveBackStackStateArr;
    }
}
