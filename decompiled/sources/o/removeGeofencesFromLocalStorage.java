package o;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
final class removeGeofencesFromLocalStorage extends removeGeofencesRegisteredWithGeofencingClientlambda22 {
    final /* synthetic */ removeGeofencesRegisteredWithGeofencingClientlambda00 read;

    public removeGeofencesFromLocalStorage(removeGeofencesRegisteredWithGeofencingClientlambda00 removegeofencesregisteredwithgeofencingclientlambda00) {
        this.read = removegeofencesregisteredwithgeofencingclientlambda00;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "BatteryStatusReceiver";
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final clearandroid_sdk_base_release serializer() {
        return this.read.MediaBrowserCompatMediaItem;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final void write(Context context, Intent intent) {
        this.read.RemoteActionCompatParcelizer(intent);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
