package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaRnojXNNDF2P_Mdhz2GGZemHOBXg extends removeGeofencesRegisteredWithGeofencingClientlambda22 {
    static final IntentFilter IconCompatParcelizer = new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED");

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "PowerSaveModeChangeReceiver";
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final void write(Context context, Intent intent) {
        ((r8lambdaI90we4_tg_9aaM1nBxPMKmLPck) setPushUniqueId.read(r8lambdaI90we4_tg_9aaM1nBxPMKmLPck.class)).read();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
