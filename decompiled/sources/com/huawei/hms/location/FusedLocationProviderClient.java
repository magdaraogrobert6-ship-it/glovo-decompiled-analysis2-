package com.huawei.hms.location;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.huawei.hms.locationSdk.d0;
import com.huawei.hms.locationSdk.t;
import com.huawei.hms.locationSdk.v0;
import com.huawei.hms.support.api.entity.location.offlinelocation.OfflineLocationRequest;
import com.huawei.hms.support.api.location.common.LocationClientStateManager;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes2.dex */
public class FusedLocationProviderClient {
    public static final String KEY_MOCK_LOCATION = "mockLocation";
    public static final String KEY_VERTICAL_ACCURACY = "verticalAccuracy";
    private static final String TAG = "FusedLocationProviderClient";
    private d0 locationClient;
    private final Context mContext;

    public setShouldUseDispatchDrawui disableBackgroundLocation() {
        return this.locationClient.d();
    }

    public setShouldUseDispatchDrawui enableBackgroundLocation(int i, Notification notification) {
        return this.locationClient.a(i, notification);
    }

    public FusedLocationProviderClient(Activity activity) {
        this.mContext = activity.getApplicationContext();
        this.locationClient = t.b(activity, (v0) null);
    }

    public setShouldUseDispatchDrawui flushLocations() {
        LocationClientStateManager.getInstance().resetCache();
        return this.locationClient.c();
    }

    public setShouldUseDispatchDrawui getLastLocation() {
        LocationClientStateManager.getInstance().resetCache();
        return this.locationClient.b();
    }

    public setShouldUseDispatchDrawui getLastLocationWithAddress(LocationRequest locationRequest) {
        LocationClientStateManager.getInstance().resetCache();
        return this.locationClient.a(locationRequest);
    }

    public setShouldUseDispatchDrawui getLocationAvailability() {
        LocationClientStateManager.getInstance().resetCache();
        return this.locationClient.a();
    }

    public setShouldUseDispatchDrawui getOfflineLocation(OfflineLocationRequest offlineLocationRequest) {
        LocationClientStateManager.getInstance().resetCache();
        return this.locationClient.a(offlineLocationRequest);
    }

    public setShouldUseDispatchDrawui removeLocationUpdates(PendingIntent pendingIntent) {
        LocationClientStateManager.getInstance().resetCache();
        return this.locationClient.a(pendingIntent);
    }

    public setShouldUseDispatchDrawui requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        LocationClientStateManager.getInstance().resetCache();
        return this.locationClient.a(locationRequest, pendingIntent);
    }

    public setShouldUseDispatchDrawui requestLocationUpdatesEx(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        LocationClientStateManager.getInstance().resetCache();
        return this.locationClient.b(locationRequest, locationCallback, looper);
    }

    public setShouldUseDispatchDrawui setMockLocation(Location location) {
        LocationClientStateManager.getInstance().resetCache();
        return this.locationClient.a(location);
    }

    public setShouldUseDispatchDrawui setMockMode(boolean z) {
        LocationClientStateManager.getInstance().resetCache();
        return this.locationClient.a(z);
    }

    public setShouldUseDispatchDrawui removeLocationUpdates(LocationCallback locationCallback) {
        LocationClientStateManager.getInstance().resetCache();
        return this.locationClient.a(locationCallback);
    }

    public setShouldUseDispatchDrawui requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        LocationClientStateManager.getInstance().resetCache();
        return this.locationClient.a(locationRequest, locationCallback, looper);
    }

    public FusedLocationProviderClient(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.locationClient = t.b(applicationContext, (v0) null);
    }
}
