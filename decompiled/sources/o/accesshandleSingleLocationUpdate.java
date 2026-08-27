package o;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public class accesshandleSingleLocationUpdate extends removeGeofencesRegisteredWithGeofencingClientlambda22 {
    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final boolean read(Intent intent) {
        return true;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "ActivityTransitionChangeReceiver";
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final void write(Context context, Intent intent) {
        ((r8lambdagOO4V9ME2CU2X5ntv9kK0bIySLE) setPushUniqueId.read(r8lambdagOO4V9ME2CU2X5ntv9kK0bIySLE.class)).IconCompatParcelizer(intent);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
