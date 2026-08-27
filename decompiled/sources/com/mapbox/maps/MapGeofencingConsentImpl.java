package com.mapbox.maps;

import com.mapbox.common.geofencing.GeofencingUtils;
import com.mapbox.common.geofencing.GeofencingUtilsUserConsentResponseCallback;
import com.mapbox.maps.geofencing.MapGeofencingConsent;

/* JADX INFO: loaded from: classes2.dex */
public final class MapGeofencingConsentImpl implements MapGeofencingConsent {
    @Override // com.mapbox.maps.geofencing.MapGeofencingConsent
    public boolean getUserConsent() {
        return GeofencingUtils.Companion.getUserConsent();
    }

    @Override // com.mapbox.maps.geofencing.MapGeofencingConsent
    public boolean shouldShowConsent() {
        GeofencingUtils.Companion companion = GeofencingUtils.Companion;
        return !companion.getUserConsent() || companion.isActive();
    }

    @Override // com.mapbox.maps.geofencing.MapGeofencingConsent
    public void setUserConsent(boolean z, GeofencingUtilsUserConsentResponseCallback geofencingUtilsUserConsentResponseCallback) {
        geofencingUtilsUserConsentResponseCallback.getClass();
        GeofencingUtils.Companion.setUserConsent(z, geofencingUtilsUserConsentResponseCallback);
    }
}
