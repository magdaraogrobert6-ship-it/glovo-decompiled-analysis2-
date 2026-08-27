package o;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class handleSingleLocationUpdate extends removeGeofencesRegisteredWithGeofencingClientlambda22 {
    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "LocalAlarmBroadcastReceiver";
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final clearandroid_sdk_base_release serializer() {
        return ((handleGeofenceEventlambda3) setPushUniqueId.read(handleGeofenceEventlambda3.class)).IconCompatParcelizer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final boolean read(Intent intent) {
        return intent.getBooleanExtra("is_exact_alarm", false);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final void write(Context context, Intent intent) {
        if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
            RemoteActionCompatParcelizer(context).IconCompatParcelizer("Received broadcast: " + intent.getAction(), new Object[0]);
            r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class);
            handleGeofenceEventlambda3 handlegeofenceeventlambda3 = (handleGeofenceEventlambda3) setPushUniqueId.read(handleGeofenceEventlambda3.class);
            r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
            handlegeofenceeventlambda3.serializer((byte) 1, System.currentTimeMillis());
            return;
        }
        RemoteActionCompatParcelizer(context).write("No action found in intent", new Object[0]);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
