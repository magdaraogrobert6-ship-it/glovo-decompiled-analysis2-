package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import o.ParentDataModifier;
import o.accessgetNumPadAddcp;
import o.accessgetNumPadDividecp;

/* JADX INFO: loaded from: classes2.dex */
public interface FusedLocationProviderClient extends accessgetNumPadAddcp {

    @Deprecated
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    @Deprecated
    public static final String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    Task flushLocations();

    @Override // o.accessgetNumPadAddcp
    /* synthetic */ accessgetNumPadDividecp getApiKey();

    Task getCurrentLocation(int i, ParentDataModifier parentDataModifier);

    Task getCurrentLocation(CurrentLocationRequest currentLocationRequest, ParentDataModifier parentDataModifier);

    Task getLastLocation();

    Task getLastLocation(LastLocationRequest lastLocationRequest);

    Task getLocationAvailability();

    @Deprecated
    Task removeDeviceOrientationUpdates(DeviceOrientationListener deviceOrientationListener);

    Task removeLocationUpdates(PendingIntent pendingIntent);

    Task removeLocationUpdates(LocationCallback locationCallback);

    Task removeLocationUpdates(LocationListener locationListener);

    @Deprecated
    Task requestDeviceOrientationUpdates(DeviceOrientationRequest deviceOrientationRequest, DeviceOrientationListener deviceOrientationListener, Looper looper);

    @Deprecated
    Task requestDeviceOrientationUpdates(DeviceOrientationRequest deviceOrientationRequest, Executor executor, DeviceOrientationListener deviceOrientationListener);

    Task requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent);

    Task requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper);

    Task requestLocationUpdates(LocationRequest locationRequest, LocationListener locationListener, Looper looper);

    Task requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationCallback locationCallback);

    Task requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationListener locationListener);

    Task setMockLocation(Location location);

    Task setMockMode(boolean z);
}
