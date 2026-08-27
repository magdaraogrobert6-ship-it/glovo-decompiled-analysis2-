package com.mapbox.module;

import androidx.annotation.Keep;
import com.mapbox.maps.module.telemetry.MapTelemetryImpl;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class Mapbox_MapTelemetryModuleConfiguration {
    private static final boolean enableConfiguration = false;
    public static final Mapbox_MapTelemetryModuleConfiguration INSTANCE = new Mapbox_MapTelemetryModuleConfiguration();
    private static final Class<MapTelemetryImpl> implClass = MapTelemetryImpl.class;

    private Mapbox_MapTelemetryModuleConfiguration() {
    }

    public static final boolean getEnableConfiguration() {
        return enableConfiguration;
    }

    public static /* synthetic */ void getEnableConfiguration$annotations() {
    }

    public static final Class<MapTelemetryImpl> getImplClass() {
        return implClass;
    }

    public static /* synthetic */ void getImplClass$annotations() {
    }
}
