package o;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaOFk6ADiHGUByXl2hN9xb3lUDtsA extends removeGeofencesRegisteredWithGeofencingClientlambda22 {
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
        RemoteActionCompatParcelizer(context).IconCompatParcelizer("Activity transition update received. Informing FGS helper.", new Object[0]);
        ((r8lambdaNFajLtzW3BPOO80Rlt2TGeVAl4) setPushUniqueId.read(r8lambdaNFajLtzW3BPOO80Rlt2TGeVAl4.class)).serializer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
