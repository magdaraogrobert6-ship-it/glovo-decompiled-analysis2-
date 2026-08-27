package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
final class BrazeActionReceiveronReceive3 extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ handleGeofenceEventlambda3 IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeActionReceiveronReceive3(handleGeofenceEventlambda3 handlegeofenceeventlambda3, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "AlarmManager");
        this.IconCompatParcelizer = handlegeofenceeventlambda3;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        if (obj instanceof getGeofenceTransitionPendingIntent) {
            getGeofenceTransitionPendingIntent getgeofencetransitionpendingintent = (getGeofenceTransitionPendingIntent) obj;
            ControlMessage controlMessage2 = ControlMessage.ALARM_SCHEDULE;
            handleGeofenceEventlambda3 handlegeofenceeventlambda3 = this.IconCompatParcelizer;
            if (controlMessage == controlMessage2) {
                handleGeofenceEventlambda3.write(handlegeofenceeventlambda3, getgeofencetransitionpendingintent);
            } else if (controlMessage == ControlMessage.ALARM_CANCEL) {
                handleGeofenceEventlambda3.IconCompatParcelizer(handlegeofenceeventlambda3, getgeofencetransitionpendingintent);
            }
        }
    }
}
