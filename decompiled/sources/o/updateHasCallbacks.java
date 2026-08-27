package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class updateHasCallbacks {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ updateHasCallbacks[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public static final updateHasCallbacks Initial = new updateHasCallbacks("Initial", 0);
    public static final updateHasCallbacks CenterButton = new updateHasCallbacks("CenterButton", 1);
    public static final updateHasCallbacks MapVisibleAreaChange = new updateHasCallbacks("MapVisibleAreaChange", 2);

    private updateHasCallbacks(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 37;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 81;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    static {
        updateHasCallbacks[] updatehascallbacksArr$values = $values();
        $VALUES = updatehascallbacksArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) updatehascallbacksArr$values);
        int i = write + 1;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static updateHasCallbacks valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        updateHasCallbacks updatehascallbacks = (updateHasCallbacks) Enum.valueOf(updateHasCallbacks.class, str);
        int i4 = IconCompatParcelizer + 97;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return updatehascallbacks;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static updateHasCallbacks[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        updateHasCallbacks[] updatehascallbacksArr = (updateHasCallbacks[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 109;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return updatehascallbacksArr;
    }

    private static final /* synthetic */ updateHasCallbacks[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 7;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        updateHasCallbacks[] updatehascallbacksArr = {Initial, CenterButton, MapVisibleAreaChange};
        int i5 = i2 + 81;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return updatehascallbacksArr;
    }
}
