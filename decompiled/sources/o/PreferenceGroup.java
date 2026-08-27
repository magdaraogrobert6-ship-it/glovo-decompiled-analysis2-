package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class PreferenceGroup {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ PreferenceGroup[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public static final PreferenceGroup WEB_INTEGRATION = new PreferenceGroup("WEB_INTEGRATION", 0);
    public static final PreferenceGroup DEEP_LINK = new PreferenceGroup("DEEP_LINK", 1);

    private PreferenceGroup(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 87;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 19;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        PreferenceGroup[] preferenceGroupArr$values = $values();
        $VALUES = preferenceGroupArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) preferenceGroupArr$values);
        int i = read + 111;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ PreferenceGroup[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        PreferenceGroup[] preferenceGroupArr = {WEB_INTEGRATION, DEEP_LINK};
        int i5 = i3 + 25;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return preferenceGroupArr;
    }

    public static PreferenceGroup valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        PreferenceGroup preferenceGroup = (PreferenceGroup) Enum.valueOf(PreferenceGroup.class, str);
        int i3 = RemoteActionCompatParcelizer + 79;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 85 / 0;
        }
        return preferenceGroup;
    }

    public static PreferenceGroup[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 85;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PreferenceGroup[] preferenceGroupArr = (PreferenceGroup[]) $VALUES.clone();
        int i4 = IconCompatParcelizer + 107;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return preferenceGroupArr;
    }
}
