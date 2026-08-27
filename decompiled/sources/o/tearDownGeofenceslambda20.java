package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes4.dex */
final class tearDownGeofenceslambda20 extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ analyticsEnabledForGeofenceId serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tearDownGeofenceslambda20(analyticsEnabledForGeofenceId analyticsenabledforgeofenceid) {
        super(analyticsenabledforgeofenceid.serializer, "HarshEventDetector");
        this.serializer = analyticsenabledforgeofenceid;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        ControlMessage controlMessage2 = ControlMessage.HARSH_EVENT_DETECTOR_START;
        analyticsEnabledForGeofenceId analyticsenabledforgeofenceid = this.serializer;
        if (controlMessage == controlMessage2) {
            analyticsEnabledForGeofenceId.IconCompatParcelizer(analyticsenabledforgeofenceid);
        } else if (controlMessage == ControlMessage.HARSH_EVENT_DETECTOR_STOP) {
            analyticsenabledforgeofenceid.serializer();
        }
    }
}
