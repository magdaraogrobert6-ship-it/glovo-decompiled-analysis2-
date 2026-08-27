package com.mapbox.common.module;

import androidx.sqlite.SQLite;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MapboxHttpClientKt {
    private static final List<String> ALLOW_FROM_BACKGROUND_LIST = SQLite.read("https://api.mapbox.com/sdk-sessions/v1", "https://events.mapbox.com", "https://config.mapbox.com", "https://api-events-staging.tilestream.net", "https://api-events-config-staging.tilestream.net", "https://cloudfront-staging.tilestream.net", "https://api.stla.mapbox.com/sdk-sessions", "https://events.stla.mapbox.com", "https://config.stla.mapbox.com", "https://api.stla-preprod.mapbox.com/sdk-sessions", "https://events.stla-preprod.mapbox.com", "https://config.stla-preprod.mapbox.com");
}
