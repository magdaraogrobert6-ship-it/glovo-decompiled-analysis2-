package com.mapbox.common.location;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes2.dex */
public interface DeviceLocationProvider extends LocationProvider {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static String getName(DeviceLocationProvider deviceLocationProvider) {
            return "mapbox-user-defined";
        }
    }

    String getName();

    void removeLocationUpdates(PendingIntent pendingIntent);

    void requestLocationUpdates(PendingIntent pendingIntent) throws SecurityException;
}
