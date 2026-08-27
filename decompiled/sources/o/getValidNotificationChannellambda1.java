package o;

import android.content.Context;
import android.content.Intent;
import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
public class getValidNotificationChannellambda1 extends r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8 {
    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "PayloadBatcherAlarmReceiver";
    }

    @Override // o.r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8
    public final void write(Context context, Intent intent, long j) {
        RemoteActionCompatParcelizer(context).IconCompatParcelizer("payload batcher alarm triggered", new Object[0]);
        ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).IconCompatParcelizer(ControlMessage.PAYLOAD_BATCHER_TRIGGERED, (Object) null);
    }

    @Override // o.r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8, o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
