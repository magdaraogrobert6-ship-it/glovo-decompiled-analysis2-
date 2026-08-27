package o;

import android.content.Context;
import android.content.Intent;
import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaL0wABdg1w7ncGmnjQmv9JKCiVJ0 extends r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8 {
    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "PowerInfoUpdateAlarmReceiver";
    }

    @Override // o.r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8
    public final void write(Context context, Intent intent, long j) {
        RemoteActionCompatParcelizer(context).IconCompatParcelizer("PowerInfoUpdateAlarm triggered", new Object[0]);
        ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).IconCompatParcelizer(ControlMessage.CHECK_POWER_INFO, (Object) null);
    }

    @Override // o.r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8, o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
