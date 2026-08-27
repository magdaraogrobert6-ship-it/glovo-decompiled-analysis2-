package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import o.accessgetNumPad6cp;
import o.accessgetNumPadDirectionDowncp;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface FusedLocationProviderApi {

    @Deprecated
    public static final String KEY_LOCATION_CHANGED = "com.google.android.location.LOCATION";

    @Deprecated
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    accessgetNumPadDirectionDowncp flushLocations(accessgetNumPad6cp accessgetnumpad6cp);

    Location getLastLocation(accessgetNumPad6cp accessgetnumpad6cp);

    LocationAvailability getLocationAvailability(accessgetNumPad6cp accessgetnumpad6cp);

    accessgetNumPadDirectionDowncp removeLocationUpdates(accessgetNumPad6cp accessgetnumpad6cp, PendingIntent pendingIntent);

    accessgetNumPadDirectionDowncp removeLocationUpdates(accessgetNumPad6cp accessgetnumpad6cp, LocationCallback locationCallback);

    accessgetNumPadDirectionDowncp removeLocationUpdates(accessgetNumPad6cp accessgetnumpad6cp, LocationListener locationListener);

    accessgetNumPadDirectionDowncp requestLocationUpdates(accessgetNumPad6cp accessgetnumpad6cp, LocationRequest locationRequest, PendingIntent pendingIntent);

    accessgetNumPadDirectionDowncp requestLocationUpdates(accessgetNumPad6cp accessgetnumpad6cp, LocationRequest locationRequest, LocationCallback locationCallback, Looper looper);

    accessgetNumPadDirectionDowncp requestLocationUpdates(accessgetNumPad6cp accessgetnumpad6cp, LocationRequest locationRequest, LocationListener locationListener);

    accessgetNumPadDirectionDowncp requestLocationUpdates(accessgetNumPad6cp accessgetnumpad6cp, LocationRequest locationRequest, LocationListener locationListener, Looper looper);

    accessgetNumPadDirectionDowncp setMockLocation(accessgetNumPad6cp accessgetnumpad6cp, Location location);

    accessgetNumPadDirectionDowncp setMockMode(accessgetNumPad6cp accessgetnumpad6cp, boolean z);
}
