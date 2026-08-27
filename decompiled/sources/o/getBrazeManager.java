package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes4.dex */
final class getBrazeManager extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ getBrazeGeofenceApi IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBrazeManager(getBrazeGeofenceApi getbrazegeofenceapi) {
        super(getbrazegeofenceapi.IconCompatParcelizer, "PhoneUsageDetector");
        this.IconCompatParcelizer = getbrazegeofenceapi;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        ControlMessage controlMessage2 = ControlMessage.PHONE_USAGE_DETECTOR_START;
        getBrazeGeofenceApi getbrazegeofenceapi = this.IconCompatParcelizer;
        if (controlMessage == controlMessage2) {
            getBrazeGeofenceApi.write(getbrazegeofenceapi);
        } else if (controlMessage == ControlMessage.PHONE_USAGE_DETECTOR_STOP) {
            getbrazegeofenceapi.write();
        }
    }
}
