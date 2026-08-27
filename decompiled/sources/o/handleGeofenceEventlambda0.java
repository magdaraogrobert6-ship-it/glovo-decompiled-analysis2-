package o;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
final class handleGeofenceEventlambda0 extends removeGeofencesRegisteredWithGeofencingClientlambda22 {
    final /* synthetic */ handleGeofenceEventlambda3 write;

    public handleGeofenceEventlambda0(handleGeofenceEventlambda3 handlegeofenceeventlambda3) {
        this.write = handlegeofenceeventlambda3;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "DeviceIdleModeChangedReceiver";
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final clearandroid_sdk_base_release serializer() {
        return this.write.RemoteActionCompatParcelizer;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final void write(Context context, Intent intent) {
        handleGeofenceEventlambda3 handlegeofenceeventlambda3 = this.write;
        if (handlegeofenceeventlambda3.RatingCompat.isDeviceIdleMode()) {
            handlegeofenceeventlambda3.IconCompatParcelizer.IconCompatParcelizer("Idle mode activated", new Object[0]);
        } else {
            handlegeofenceeventlambda3.IconCompatParcelizer.IconCompatParcelizer("Idle mode deactivated", new Object[0]);
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
