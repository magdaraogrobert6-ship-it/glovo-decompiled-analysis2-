package o;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
final class handlePushNotificationPayloadlambda12 extends removeGeofencesRegisteredWithGeofencingClientlambda22 {
    final /* synthetic */ handlePushNotificationPayloadlambda14 IconCompatParcelizer;

    public handlePushNotificationPayloadlambda12(handlePushNotificationPayloadlambda14 handlepushnotificationpayloadlambda14) {
        this.IconCompatParcelizer = handlepushnotificationpayloadlambda14;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "ScreenStateReceiver";
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final clearandroid_sdk_base_release serializer() {
        return this.IconCompatParcelizer.MediaSessionCompatQueueItem;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final void write(Context context, Intent intent) {
        String action = intent.getAction();
        action.getClass();
        boolean zEquals = action.equals("android.intent.action.SCREEN_OFF");
        handlePushNotificationPayloadlambda14 handlepushnotificationpayloadlambda14 = this.IconCompatParcelizer;
        if (zEquals) {
            handlepushnotificationpayloadlambda14.serializer();
        } else if (action.equals("android.intent.action.SCREEN_ON")) {
            handlepushnotificationpayloadlambda14.read();
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
