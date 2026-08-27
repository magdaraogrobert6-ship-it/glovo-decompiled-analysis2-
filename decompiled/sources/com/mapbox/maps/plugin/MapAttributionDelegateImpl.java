package com.mapbox.maps.plugin;

import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.mapbox.maps.module.MapTelemetry;

/* JADX INFO: loaded from: classes2.dex */
public final class MapAttributionDelegateImpl {
    public final MapGeofencingConsent mapGeofencingConsent;
    public final MapTelemetry mapTelemetry;
    public final MapboxMap mapboxMap;

    public MapAttributionDelegateImpl(MapboxMap mapboxMap, MapTelemetry mapTelemetry, MapGeofencingConsent mapGeofencingConsent) {
        this.mapboxMap = mapboxMap;
        this.mapTelemetry = mapTelemetry;
        this.mapGeofencingConsent = mapGeofencingConsent;
    }
}
