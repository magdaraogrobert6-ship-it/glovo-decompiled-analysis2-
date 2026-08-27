package o;

import android.content.Context;
import android.content.Intent;
import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
public class getShouldRefreshBanners extends r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8 {
    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "TransitionTimeoutReceiver";
    }

    private static getGeofenceTransitionPendingIntent serializer(Context context, long j) {
        getGeofenceTransitionPendingIntent.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new getGeofenceTransitionPendingIntent.RemoteActionCompatParcelizer("geofence-transition-timeout", context);
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer(false);
        remoteActionCompatParcelizer.read(j);
        remoteActionCompatParcelizer.serializer(null, getShouldRefreshBanners.class);
        remoteActionCompatParcelizer.write(true);
        return remoteActionCompatParcelizer.write();
    }

    @Override // o.r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8
    public final void write(Context context, Intent intent, long j) {
        RemoteActionCompatParcelizer(context).IconCompatParcelizer("geofence transition timeout", new Object[0]);
        ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).IconCompatParcelizer(ControlMessage.GEOFENCE_TRANSITION_TIMEOUT, (Object) null);
    }

    public static void read(Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, long j) {
        getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.ALARM_SCHEDULE, serializer(context, j));
    }

    public static void serializer(Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations) {
        getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.ALARM_CANCEL, serializer(context, 0L));
    }

    @Override // o.r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8, o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
