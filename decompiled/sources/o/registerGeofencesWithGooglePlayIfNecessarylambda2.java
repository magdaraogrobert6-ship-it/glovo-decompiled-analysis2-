package o;

import android.content.Context;
import android.content.Intent;
import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
public class registerGeofencesWithGooglePlayIfNecessarylambda2 extends r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8 {
    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "SdkDetectionTimeoutReceiver";
    }

    private static getGeofenceTransitionPendingIntent serializer(Context context, long j) {
        getGeofenceTransitionPendingIntent.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new getGeofenceTransitionPendingIntent.RemoteActionCompatParcelizer("sdk-detection-timeout", context);
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer(false);
        remoteActionCompatParcelizer.read(j);
        remoteActionCompatParcelizer.serializer(null, registerGeofencesWithGooglePlayIfNecessarylambda2.class);
        remoteActionCompatParcelizer.write(true);
        return remoteActionCompatParcelizer.write();
    }

    @Override // o.r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8
    public final void write(Context context, Intent intent, long j) {
        RemoteActionCompatParcelizer(context).IconCompatParcelizer("sdk detection timeout", new Object[0]);
        ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).IconCompatParcelizer(ControlMessage.OTG_CHECK, (Object) null);
    }

    public static void RemoteActionCompatParcelizer(Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, long j) {
        getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.ALARM_SCHEDULE, serializer(context, j));
    }

    public static void read(Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations) {
        getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.ALARM_CANCEL, serializer(context, 0L));
    }

    @Override // o.r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8, o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
