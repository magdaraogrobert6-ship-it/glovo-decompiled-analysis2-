package com.mapbox.common.geofencing;

/* JADX INFO: loaded from: classes5.dex */
public interface GeofencingObserver {
    void onDwell(GeofencingEvent geofencingEvent);

    void onEntry(GeofencingEvent geofencingEvent);

    void onError(GeofencingError geofencingError);

    void onExit(GeofencingEvent geofencingEvent);

    void onUserConsentChanged(boolean z);
}
