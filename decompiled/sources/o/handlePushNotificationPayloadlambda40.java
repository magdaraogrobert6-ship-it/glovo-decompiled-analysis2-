package o;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
final class handlePushNotificationPayloadlambda40 extends removeGeofencesRegisteredWithGeofencingClientlambda22 {
    final /* synthetic */ handlePushNotificationPayloadlambda0 IconCompatParcelizer;

    public handlePushNotificationPayloadlambda40(handlePushNotificationPayloadlambda0 handlepushnotificationpayloadlambda0) {
        this.IconCompatParcelizer = handlepushnotificationpayloadlambda0;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "KeyguardStateReceiver";
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final clearandroid_sdk_base_release serializer() {
        return this.IconCompatParcelizer.MediaMetadataCompat;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final void write(Context context, Intent intent) {
        if (((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked()) {
            return;
        }
        handlePushNotificationPayloadlambda0 handlepushnotificationpayloadlambda0 = this.IconCompatParcelizer;
        handlepushnotificationpayloadlambda0.serializer.IconCompatParcelizer("Keyguard unlocked", new Object[0]);
        handlePushNotificationPayloadlambda0.read(handlepushnotificationpayloadlambda0);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
