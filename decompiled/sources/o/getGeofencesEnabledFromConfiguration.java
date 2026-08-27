package o;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
public class getGeofencesEnabledFromConfiguration extends removeGeofencesRegisteredWithGeofencingClientlambda22 {
    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final boolean read(Intent intent) {
        return true;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "UpgradeBroadcastReceiver";
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final void write(Context context, Intent intent) {
        RemoteActionCompatParcelizer(context).serializer("App upgraded", new Object[0]);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
