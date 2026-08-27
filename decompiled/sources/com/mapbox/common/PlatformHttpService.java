package com.mapbox.common;

import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import com.mapbox.common.experimental.wss_backend.Service;
import com.mapbox.common.module.MapboxHttpClient;
import com.mapbox.common.module.cronet.CronetClientDetail;
import com.mapbox.common.module.okhttp.OkHttpClientDetail;
import com.mapbox.common.module.okhttp.WssBackend;

/* JADX INFO: loaded from: classes5.dex */
public final class PlatformHttpService {
    public static final PlatformHttpService INSTANCE = new PlatformHttpService();
    private static final String USE_LEGACY_SERVICE_KEY = "com.mapbox.common.use_legacy_http_service";
    private static final boolean forceLegacyService;

    private PlatformHttpService() {
    }

    static {
        boolean z = false;
        try {
            Context context = MapboxSDKCommon.INSTANCE.getContext();
            z = context.getPackageManager().getApplicationInfo(context.getPackageName(), Fields.SpotShadowColor).metaData.getBoolean(USE_LEGACY_SERVICE_KEY, false);
        } catch (Throwable unused) {
        }
        if (z) {
            FeatureTelemetryCounter.create("common/network/http3/CronetDisabledWithManifestFlag").increment();
        }
        forceLegacyService = z;
    }

    public static final Service createPlatformWssService() {
        return new WssBackend();
    }

    public static final com.mapbox.common.http_backend.Service createPlatformHttpService() {
        return !forceLegacyService ? new MapboxHttpClient(new CronetClientDetail(new OkHttpClientDetail())) : new MapboxHttpClient(new OkHttpClientDetail());
    }
}
