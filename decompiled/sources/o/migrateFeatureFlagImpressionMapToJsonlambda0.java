package o;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
public class migrateFeatureFlagImpressionMapToJsonlambda0 extends removeGeofencesRegisteredWithGeofencingClientlambda22 {
    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final boolean read(Intent intent) {
        return true;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "TimezoneChangeReceiver";
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final void write(Context context, Intent intent) {
        r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class);
        migrateFeatureFlagImpressionMapToJsonlambda20 migratefeatureflagimpressionmaptojsonlambda20 = (migrateFeatureFlagImpressionMapToJsonlambda20) setPushUniqueId.read(migrateFeatureFlagImpressionMapToJsonlambda20.class);
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        migratefeatureflagimpressionmaptojsonlambda20.IconCompatParcelizer(System.currentTimeMillis());
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
