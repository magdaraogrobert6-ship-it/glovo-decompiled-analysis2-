package bo.app;

import com.braze.location.BrazeInternalGeofenceApi;
import com.braze.location.IBrazeGeofenceApi;
import com.braze.storage.GeofenceDataStoreProvider;

/* JADX INFO: loaded from: classes.dex */
public final class x1 {
    public final GeofenceDataStoreProvider a;
    public final IBrazeGeofenceApi b;

    public x1(GeofenceDataStoreProvider geofenceDataStoreProvider) {
        geofenceDataStoreProvider.getClass();
        this.a = geofenceDataStoreProvider;
        IBrazeGeofenceApi iBrazeGeofenceApi = null;
        try {
            Object objNewInstance = BrazeInternalGeofenceApi.class.getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass();
            iBrazeGeofenceApi = (IBrazeGeofenceApi) objNewInstance;
        } catch (Exception unused) {
        }
        this.b = iBrazeGeofenceApi;
    }
}
