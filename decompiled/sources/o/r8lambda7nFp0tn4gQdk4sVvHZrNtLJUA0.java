package o;

import android.content.Context;
import android.content.Intent;
import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambda7nFp0tn4gQdk4sVvHZrNtLJUA0 extends r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8 {
    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "MovingStateTimeoutReceiver";
    }

    @Override // o.r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8
    public final void write(Context context, Intent intent, long j) {
        RemoteActionCompatParcelizer(context).IconCompatParcelizer("Moving state timeout received", new Object[0]);
        String stringExtra = intent.getStringExtra("name");
        if (stringExtra == null) {
            RemoteActionCompatParcelizer(context).RemoteActionCompatParcelizer("Null state received", new Object[0]);
        } else {
            ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).IconCompatParcelizer(ControlMessage.MOVING_STATE_TIMEOUT, new r8lambdausxx_nBCDjux6DjI7stc6kTRA(stringExtra, j));
        }
    }

    @Override // o.r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8, o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
