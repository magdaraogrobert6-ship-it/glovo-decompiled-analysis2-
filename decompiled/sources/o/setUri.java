package o;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes3.dex */
public class setUri extends removeGeofencesRegisteredWithGeofencingClientlambda22 {
    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "LocationReceiver";
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final void write(Context context, Intent intent) {
        Location lastLocation;
        parseLonglambda0 parselonglambda0RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context);
        Boolean bool = null;
        try {
            lastLocation = LocationResult.hasResult(intent) ? LocationResult.extractResult(intent).getLastLocation() : null;
        } catch (Exception e) {
            parselonglambda0RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to process location intent", new Object[0]);
        }
        try {
            if (LocationAvailability.hasLocationAvailability(intent) && !LocationAvailability.extractLocationAvailability(intent).isLocationAvailable()) {
                parselonglambda0RemoteActionCompatParcelizer.IconCompatParcelizer("LocationAvailability is false.", new Object[0]);
                bool = Boolean.FALSE;
            }
        } catch (Exception e2) {
            parselonglambda0RemoteActionCompatParcelizer.IconCompatParcelizer(false, e2, "Failed to get location availability from intent", new Object[0]);
        }
        if (lastLocation != null && lastLocation.isFromMockProvider()) {
            parselonglambda0RemoteActionCompatParcelizer.IconCompatParcelizer("Received mock location with coordinates: %.6f, %.6f", Double.valueOf(lastLocation.getLatitude()), Double.valueOf(lastLocation.getLongitude()));
        }
        ((setActionId) setPushUniqueId.read(setActionId.class)).IconCompatParcelizer(lastLocation, bool);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
