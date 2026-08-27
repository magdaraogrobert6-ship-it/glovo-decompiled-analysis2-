package com.braze.location;

import com.braze.models.BrazeGeofence;
import com.google.android.gms.location.Geofence;

/* JADX INFO: loaded from: classes.dex */
public final class GooglePlayLocationUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Geofence toGeofence(BrazeGeofence brazeGeofence) {
        brazeGeofence.getClass();
        Geofence.Builder builder = new Geofence.Builder();
        builder.setRequestId(brazeGeofence.getId()).setCircularRegion(brazeGeofence.getLatitude(), brazeGeofence.getLongitude(), brazeGeofence.getRadiusMeter()).setNotificationResponsiveness(brazeGeofence.getNotificationResponsivenessMs()).setExpirationDuration(-1L);
        boolean enterEvents = brazeGeofence.getEnterEvents();
        int i = enterEvents;
        if (brazeGeofence.getExitEvents()) {
            i = (enterEvents ? 1 : 0) | 2;
        }
        builder.setTransitionTypes(i);
        Geofence geofenceBuild = builder.build();
        geofenceBuild.getClass();
        return geofenceBuild;
    }
}
