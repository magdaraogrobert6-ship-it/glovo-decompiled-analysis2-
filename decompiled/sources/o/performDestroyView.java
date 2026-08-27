package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class performDestroyView {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ performDestroyView[] $VALUES;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public static final performDestroyView DEFAULT = new performDestroyView("DEFAULT", 0);
    public static final performDestroyView DF_ENABLED_WORKING = new performDestroyView("DF_ENABLED_WORKING", 1);
    public static final performDestroyView DF_ENABLED_PAUSED = new performDestroyView("DF_ENABLED_PAUSED", 2);
    public static final performDestroyView TURN_BY_TURN_NAVIGATION = new performDestroyView("TURN_BY_TURN_NAVIGATION", 3);
    public static final performDestroyView DF_ENABLED_STACKED_DELIVERY_LIST = new performDestroyView("DF_ENABLED_STACKED_DELIVERY_LIST", 4);
    public static final performDestroyView LAST_STOP = new performDestroyView("LAST_STOP", 5);

    private performDestroyView(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 39;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        performDestroyView[] performdestroyviewArr$values = $values();
        $VALUES = performdestroyviewArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) performdestroyviewArr$values);
        int i = read + 23;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static performDestroyView valueOf(String str) {
        performDestroyView performdestroyview;
        int i = 2 % 2;
        int i2 = write + 57;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            performdestroyview = (performDestroyView) Enum.valueOf(performDestroyView.class, str);
            int i3 = 70 / 0;
        } else {
            performdestroyview = (performDestroyView) Enum.valueOf(performDestroyView.class, str);
        }
        int i4 = serializer + 47;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return performdestroyview;
    }

    public static performDestroyView[] values() {
        int i = 2 % 2;
        int i2 = serializer + 35;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        performDestroyView[] performdestroyviewArr = (performDestroyView[]) $VALUES.clone();
        int i3 = serializer + 79;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return performdestroyviewArr;
        }
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ performDestroyView[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        performDestroyView[] performdestroyviewArr = {DEFAULT, DF_ENABLED_WORKING, DF_ENABLED_PAUSED, TURN_BY_TURN_NAVIGATION, DF_ENABLED_STACKED_DELIVERY_LIST, LAST_STOP};
        int i5 = i3 + 33;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return performdestroyviewArr;
    }
}
