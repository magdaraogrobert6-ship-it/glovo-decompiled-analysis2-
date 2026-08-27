package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class removeScheduledCallback {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ removeScheduledCallback[] $VALUES;
    public static final recalculateRectIfDirty Companion;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    private final String value;
    public static final removeScheduledCallback NO_PRELOADING = new removeScheduledCallback("NO_PRELOADING", 0, "");
    public static final removeScheduledCallback PREFETCH_NATIVE_APIS = new removeScheduledCallback("PREFETCH_NATIVE_APIS", 1, "prefetch_native_apis");
    public static final removeScheduledCallback WEB_ASSET_CACHE_LOADING = new removeScheduledCallback("WEB_ASSET_CACHE_LOADING", 2, "web_asset_cache_loading");
    public static final removeScheduledCallback WEB_ASSET_CACHE_LOADING_LOCAL_WEB_SERVER = new removeScheduledCallback("WEB_ASSET_CACHE_LOADING_LOCAL_WEB_SERVER", 3, "web_asset_cache_loading_local_web_server");
    public static final removeScheduledCallback WEB_ASSET_CACHE_LOADING_LOCAL_WEB_SERVER_SSG = new removeScheduledCallback("WEB_ASSET_CACHE_LOADING_LOCAL_WEB_SERVER_SSG", 4, "web_asset_cache_loading_local_web_server_ssg");
    public static final removeScheduledCallback CREATE_WEBVIEW = new removeScheduledCallback("CREATE_WEBVIEW", 5, "create_webview");
    public static final removeScheduledCallback PRELOAD_WARMUP_ASSETS = new removeScheduledCallback("PRELOAD_WARMUP_ASSETS", 6, "preload_warmup_assets");
    public static final removeScheduledCallback FULL_PRELOAD = new removeScheduledCallback("FULL_PRELOAD", 7, "full_preload");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 83;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = write + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.value;
        int i4 = i3 + 69;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    private removeScheduledCallback(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        removeScheduledCallback[] removescheduledcallbackArr$values = $values();
        $VALUES = removescheduledcallbackArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) removescheduledcallbackArr$values);
        Companion = new recalculateRectIfDirty();
        int i = RemoteActionCompatParcelizer + 3;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static removeScheduledCallback valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 11;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (removeScheduledCallback) Enum.valueOf(removeScheduledCallback.class, str);
        }
        throw null;
    }

    public static removeScheduledCallback[] values() {
        int i = 2 % 2;
        int i2 = write + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        removeScheduledCallback[] removescheduledcallbackArr = (removeScheduledCallback[]) $VALUES.clone();
        int i4 = read + 81;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return removescheduledcallbackArr;
    }

    private static final /* synthetic */ removeScheduledCallback[] $values() {
        int i = 2 % 2;
        int i2 = read + 41;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        removeScheduledCallback[] removescheduledcallbackArr = {NO_PRELOADING, PREFETCH_NATIVE_APIS, WEB_ASSET_CACHE_LOADING, WEB_ASSET_CACHE_LOADING_LOCAL_WEB_SERVER, WEB_ASSET_CACHE_LOADING_LOCAL_WEB_SERVER_SSG, CREATE_WEBVIEW, PRELOAD_WARMUP_ASSETS, FULL_PRELOAD};
        int i5 = i3 + 91;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return removescheduledcallbackArr;
    }
}
