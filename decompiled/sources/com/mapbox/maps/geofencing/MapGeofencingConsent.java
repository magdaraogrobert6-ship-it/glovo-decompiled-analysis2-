package com.mapbox.maps.geofencing;

import com.mapbox.common.geofencing.GeofencingUtilsUserConsentResponseCallback;

/* JADX INFO: loaded from: classes2.dex */
public interface MapGeofencingConsent {
    boolean getUserConsent();

    void setUserConsent(boolean z, GeofencingUtilsUserConsentResponseCallback geofencingUtilsUserConsentResponseCallback);

    boolean shouldShowConsent();
}
