package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class fireGlobalChangeEntries {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    static {
        int[] iArr = new int[removeScheduledCallback.values().length];
        try {
            iArr[removeScheduledCallback.PREFETCH_NATIVE_APIS.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 81;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[removeScheduledCallback.CREATE_WEBVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[removeScheduledCallback.PRELOAD_WARMUP_ASSETS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[removeScheduledCallback.FULL_PRELOAD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[removeScheduledCallback.NO_PRELOADING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[removeScheduledCallback.WEB_ASSET_CACHE_LOADING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[removeScheduledCallback.WEB_ASSET_CACHE_LOADING_LOCAL_WEB_SERVER.ordinal()] = 7;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[removeScheduledCallback.WEB_ASSET_CACHE_LOADING_LOCAL_WEB_SERVER_SSG.ordinal()] = 8;
            int i5 = read + 41;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        } catch (NoSuchFieldError unused8) {
        }
        IconCompatParcelizer = iArr;
    }
}
