package o;

import android.content.Context;
import android.content.Intent;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.events.controlmessageextras.StartLocationFixRequest$Purpose;
import com.sentiance.sdk.services.ServiceForegroundMode;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaAWqeVQ6wV2yQLfCPB4VVQBNb7W4 extends r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8 {
    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda22
    public final String read() {
        return "StationaryAssistantReceiver";
    }

    @Override // o.r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8
    public final void write(Context context, Intent intent, long j) {
        if (((isGeofencesEnabledFromEnvironmentlambda1) setPushUniqueId.read(isGeofencesEnabledFromEnvironmentlambda1.class)).MediaBrowserCompatMediaItem()) {
            ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).IconCompatParcelizer(ControlMessage.LOCATION_FIX_START, r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0.IconCompatParcelizer("StationaryAssistantSingleFixRequest", ServiceForegroundMode.O_ONLY, StartLocationFixRequest$Purpose.DETECTIONS));
        }
    }

    @Override // o.r8lambdaJfuV6vastLH6WTUDrqFwpVTOyx8, o.removeGeofencesRegisteredWithGeofencingClientlambda22, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
