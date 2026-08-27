package o;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
final class BrazeNotificationStyleFactoryCompanion extends removeGeofencesRegisteredWithGeofencingClientlambda22 {
    final /* synthetic */ populateNotificationBuilderlambda1 read;

    public BrazeNotificationStyleFactoryCompanion(populateNotificationBuilderlambda1 populatenotificationbuilderlambda1) {
        this.read = populatenotificationbuilderlambda1;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "OTGReceiver";
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final clearandroid_sdk_base_release serializer() {
        return this.read.RemoteActionCompatParcelizer;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final void write(Context context, Intent intent) {
        populateNotificationBuilderlambda1 populatenotificationbuilderlambda1 = this.read;
        populatenotificationbuilderlambda1.IconCompatParcelizer.read();
        populateNotificationBuilderlambda1.write(populatenotificationbuilderlambda1);
        populatenotificationbuilderlambda1.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
