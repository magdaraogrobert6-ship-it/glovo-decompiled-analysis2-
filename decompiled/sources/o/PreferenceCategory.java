package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class PreferenceCategory {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ PreferenceCategory[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public static final PreferenceCategory WEB_INTEGRATION = new PreferenceCategory("WEB_INTEGRATION", 0);
    public static final PreferenceCategory DEEP_LINK = new PreferenceCategory("DEEP_LINK", 1);
    public static final PreferenceCategory EXTERNAL_URL = new PreferenceCategory("EXTERNAL_URL", 2);

    private PreferenceCategory(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 79;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i2 + 113;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        PreferenceCategory[] preferenceCategoryArr$values = $values();
        $VALUES = preferenceCategoryArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) preferenceCategoryArr$values);
        int i = RemoteActionCompatParcelizer + 57;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 98 / 0;
        }
    }

    public static PreferenceCategory valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 37;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PreferenceCategory preferenceCategory = (PreferenceCategory) Enum.valueOf(PreferenceCategory.class, str);
        int i3 = serializer + 119;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return preferenceCategory;
    }

    public static PreferenceCategory[] values() {
        int i = 2 % 2;
        int i2 = serializer + 67;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PreferenceCategory[] preferenceCategoryArr = (PreferenceCategory[]) $VALUES.clone();
        int i4 = write + 105;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return preferenceCategoryArr;
    }

    private static final /* synthetic */ PreferenceCategory[] $values() {
        PreferenceCategory[] preferenceCategoryArr;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 21;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            PreferenceCategory preferenceCategory = WEB_INTEGRATION;
            PreferenceCategory preferenceCategory2 = DEEP_LINK;
            PreferenceCategory preferenceCategory3 = EXTERNAL_URL;
            preferenceCategoryArr = new PreferenceCategory[4];
            preferenceCategoryArr[0] = preferenceCategory;
            preferenceCategoryArr[0] = preferenceCategory2;
            preferenceCategoryArr[4] = preferenceCategory3;
        } else {
            preferenceCategoryArr = new PreferenceCategory[]{WEB_INTEGRATION, DEEP_LINK, EXTERNAL_URL};
        }
        int i4 = i2 + 101;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return preferenceCategoryArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
