package o;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public class getBitmapFromDiskCachelambda01 extends removeGeofencesRegisteredWithGeofencingClientlambda22 {
    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "BootCompletedReceiver";
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final void write(Context context, Intent intent) {
        RemoteActionCompatParcelizer(context).IconCompatParcelizer("Boot completed received", new Object[0]);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = (getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class);
        r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class);
        getVerticalAccuracy getverticalaccuracy = (getVerticalAccuracy) setPushUniqueId.read(getVerticalAccuracy.class);
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        r8lambda7hSNgpBpNnHwzu2sYrBtefYqHlQ r8lambda7hsngpbpnnhwzu2syrbtefyqhlq = new r8lambda7hSNgpBpNnHwzu2sYrBtefYqHlQ();
        getverticalaccuracy.getClass();
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jCurrentTimeMillis);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.addOnUserLeaveHintListener = r8lambda7hsngpbpnnhwzu2syrbtefyqhlq;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        getanalyticsenabledenterannotations.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
