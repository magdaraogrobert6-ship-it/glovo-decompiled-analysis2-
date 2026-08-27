package o;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
final class addNotificationActions extends removeGeofencesRegisteredWithGeofencingClientlambda22 {
    final /* synthetic */ addNotificationActionslambda1 RemoteActionCompatParcelizer;

    public addNotificationActions(addNotificationActionslambda1 addnotificationactionslambda1) {
        this.RemoteActionCompatParcelizer = addnotificationactionslambda1;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "TimeTickReceiver";
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final clearandroid_sdk_base_release serializer() {
        return this.RemoteActionCompatParcelizer.MediaSessionCompatToken;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final void write(Context context, Intent intent) {
        addNotificationActionslambda1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
