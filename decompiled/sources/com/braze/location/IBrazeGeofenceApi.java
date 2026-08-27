package com.braze.location;

import android.app.PendingIntent;
import android.content.Context;
import com.braze.models.BrazeGeofence;
import com.braze.storage.GeofenceDataStoreProvider;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface IBrazeGeofenceApi {
    void deleteRegisteredGeofenceCache(GeofenceDataStoreProvider geofenceDataStoreProvider);

    PendingIntent getGeofenceTransitionPendingIntent(Context context);

    void registerGeofences(Context context, List<BrazeGeofence> list, PendingIntent pendingIntent, GeofenceDataStoreProvider geofenceDataStoreProvider);

    void teardownGeofences(Context context, PendingIntent pendingIntent);
}
