package o;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
final class removeGeofencesRegisteredWithGeofencingClientlambda1 extends removeGeofencesRegisteredWithGeofencingClientlambda22 {
    final /* synthetic */ removeGeofencesRegisteredWithGeofencingClientlambda00 RemoteActionCompatParcelizer;

    public removeGeofencesRegisteredWithGeofencingClientlambda1(removeGeofencesRegisteredWithGeofencingClientlambda00 removegeofencesregisteredwithgeofencingclientlambda00) {
        this.RemoteActionCompatParcelizer = removegeofencesregisteredwithgeofencingclientlambda00;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "ChargingStateReceiver";
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final clearandroid_sdk_base_release serializer() {
        return this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final void write(Context context, Intent intent) {
        removeGeofencesRegisteredWithGeofencingClientlambda00 removegeofencesregisteredwithgeofencingclientlambda00 = this.RemoteActionCompatParcelizer;
        removegeofencesregisteredwithgeofencingclientlambda00.RemoteActionCompatParcelizer(removeGeofencesRegisteredWithGeofencingClientlambda00.serializer(removegeofencesregisteredwithgeofencingclientlambda00));
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
