package com.braze.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.braze.Constants;
import com.braze.models.BrazeGeofence;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.support.IntentUtils;
import com.google.android.gms.location.LocationServices;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeInternalGeofenceApi implements IBrazeGeofenceApi {
    @Override // com.braze.location.IBrazeGeofenceApi
    public void deleteRegisteredGeofenceCache(GeofenceDataStoreProvider geofenceDataStoreProvider) {
        geofenceDataStoreProvider.getClass();
        GooglePlayLocationUtils.deleteRegisteredGeofenceCache(geofenceDataStoreProvider);
    }

    @Override // com.braze.location.IBrazeGeofenceApi
    public void registerGeofences(Context context, List<BrazeGeofence> list, PendingIntent pendingIntent, GeofenceDataStoreProvider geofenceDataStoreProvider) {
        context.getClass();
        list.getClass();
        pendingIntent.getClass();
        geofenceDataStoreProvider.getClass();
        GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary$default(context, list, pendingIntent, geofenceDataStoreProvider, null, null, 48, null);
    }

    @Override // com.braze.location.IBrazeGeofenceApi
    public void teardownGeofences(Context context, PendingIntent pendingIntent) {
        context.getClass();
        pendingIntent.getClass();
        LocationServices.getGeofencingClient(context).removeGeofences(pendingIntent);
    }

    @Override // com.braze.location.IBrazeGeofenceApi
    public PendingIntent getGeofenceTransitionPendingIntent(Context context) {
        context.getClass();
        Intent intent = new Intent(Constants.BRAZE_ACTION_RECEIVER_GEOFENCE_UPDATE_INTENT_ACTION).setClass(context, BrazeActionReceiver.class);
        intent.getClass();
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, IntentUtils.getMutablePendingIntentFlags() | 134217728);
        broadcast.getClass();
        return broadcast;
    }
}
