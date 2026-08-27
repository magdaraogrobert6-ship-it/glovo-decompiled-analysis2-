package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class requestContentCardsRefreshFromCache {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ requestContentCardsRefreshFromCache[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    private final String loggingName;
    private final String selfieTrigger;
    private final String value;
    public static final requestContentCardsRefreshFromCache ID_VERIFICATION_IN_LOGIN = new requestContentCardsRefreshFromCache("ID_VERIFICATION_IN_LOGIN", 0, "LOGIN", "Login", "login");
    public static final requestContentCardsRefreshFromCache ID_VERIFICATION_IN_START_WORKING = new requestContentCardsRefreshFromCache("ID_VERIFICATION_IN_START_WORKING", 1, "START_WORKING", "Start Working", "start_shift");
    public static final requestContentCardsRefreshFromCache ID_VERIFICATION_IN_MID_SHIFT = new requestContentCardsRefreshFromCache("ID_VERIFICATION_IN_MID_SHIFT", 2, "MID_SHIFT", "Mid Shift", "mid_shift");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 85;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getLoggingName() {
        int i = 2 % 2;
        int i2 = serializer + 39;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.loggingName;
        }
        throw null;
    }

    public final String getSelfieTrigger() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.selfieTrigger;
        int i4 = i3 + 65;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = serializer + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 91;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return str;
    }

    private requestContentCardsRefreshFromCache(String str, int i, String str2, String str3, String str4) {
        super(str, i);
        this.value = str2;
        this.loggingName = str3;
        this.selfieTrigger = str4;
    }

    public static requestContentCardsRefreshFromCache valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        requestContentCardsRefreshFromCache requestcontentcardsrefreshfromcache = (requestContentCardsRefreshFromCache) Enum.valueOf(requestContentCardsRefreshFromCache.class, str);
        int i4 = serializer + 31;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return requestcontentcardsrefreshfromcache;
        }
        throw null;
    }

    public static requestContentCardsRefreshFromCache[] values() {
        int i = 2 % 2;
        int i2 = serializer + 61;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        requestContentCardsRefreshFromCache[] requestcontentcardsrefreshfromcacheArr = (requestContentCardsRefreshFromCache[]) $VALUES.clone();
        int i4 = IconCompatParcelizer + 9;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return requestcontentcardsrefreshfromcacheArr;
    }

    private static final /* synthetic */ requestContentCardsRefreshFromCache[] $values() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 73;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        requestContentCardsRefreshFromCache[] requestcontentcardsrefreshfromcacheArr = {ID_VERIFICATION_IN_LOGIN, ID_VERIFICATION_IN_START_WORKING, ID_VERIFICATION_IN_MID_SHIFT};
        int i5 = i2 + 11;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return requestcontentcardsrefreshfromcacheArr;
    }

    static {
        requestContentCardsRefreshFromCache[] requestcontentcardsrefreshfromcacheArr$values = $values();
        $VALUES = requestcontentcardsrefreshfromcacheArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) requestcontentcardsrefreshfromcacheArr$values);
        int i = write + 35;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
