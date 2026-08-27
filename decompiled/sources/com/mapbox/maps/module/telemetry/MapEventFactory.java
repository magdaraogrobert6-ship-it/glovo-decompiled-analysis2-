package com.mapbox.maps.module.telemetry;

import android.os.Bundle;
import com.mapbox.common.TelemetrySystemUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class MapEventFactory {
    public static final MapEventFactory INSTANCE = new MapEventFactory();

    private MapEventFactory() {
    }

    public final MapLoadEvent buildMapLoadEvent(PhoneState phoneState) {
        phoneState.getClass();
        return new MapLoadEvent(TelemetrySystemUtils.obtainUniversalUniqueIdentifier(), phoneState);
    }

    public final PerformanceEvent buildPerformanceEvent(PhoneState phoneState, String str, Bundle bundle) {
        phoneState.getClass();
        str.getClass();
        bundle.getClass();
        return new PerformanceEvent(phoneState, str, bundle);
    }
}
