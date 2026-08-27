package o;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8 extends removeGeofencesRegisteredWithGeofencingClientlambda22 {
    public abstract void write(Context context, Intent intent, long j);

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final void write(Context context, Intent intent) {
        long longExtra = intent.getLongExtra("alarm_trigger_time", -1L);
        if (longExtra != -1) {
            write(context, intent, longExtra);
        } else {
            RemoteActionCompatParcelizer(context).RemoteActionCompatParcelizer("Alarm trigger time not present in intent", new Object[0]);
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
