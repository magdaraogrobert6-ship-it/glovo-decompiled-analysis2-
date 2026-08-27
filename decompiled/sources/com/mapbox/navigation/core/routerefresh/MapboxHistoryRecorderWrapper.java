package com.mapbox.navigation.core.routerefresh;

import android.os.SystemClock;
import com.mapbox.navigation.base.internal.route.RoutesResponse;
import com.mapbox.navigation.core.history.MapboxHistoryRecorder;
import o.isCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxHistoryRecorderWrapper {
    public final MapboxHistoryRecorder historyRecorder;

    public void routeResponseIsParsed(RoutesResponse.Metadata metadata) {
        this.historyRecorder.pushHistory("directions_response_parsing", isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("\n                {\n                \"response_wait_duration\": " + metadata.responseWaitMillis + ",\n                \"response_parse_duration\": " + metadata.responseParseMillis + ",\n                \"response_parse_thread\": \"" + metadata.responseParseThread + "\",\n                \"native_wait_duration\": " + metadata.nativeWaitMillis + ",\n                \"native_parse_duration\": " + metadata.nativeParseMillis + ",\n                \"main_thread_wait_duration\": " + (SystemClock.elapsedRealtime() - metadata.createdAtElapsedMillis) + "\n                }\n                "));
    }

    public MapboxHistoryRecorderWrapper(MapboxHistoryRecorder mapboxHistoryRecorder, int i) {
        mapboxHistoryRecorder.getClass();
        if (i != 1) {
            this.historyRecorder = mapboxHistoryRecorder;
        } else {
            this.historyRecorder = mapboxHistoryRecorder;
        }
    }
}
