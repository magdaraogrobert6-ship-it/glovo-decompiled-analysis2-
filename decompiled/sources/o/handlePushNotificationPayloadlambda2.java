package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
final class handlePushNotificationPayloadlambda2 extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ handlePushNotificationPayloadlambda0 IconCompatParcelizer;

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        ControlMessage controlMessage2 = ControlMessage.KEYGUARD_STATE_DETECTOR_START;
        handlePushNotificationPayloadlambda0 handlepushnotificationpayloadlambda0 = this.IconCompatParcelizer;
        if (controlMessage == controlMessage2) {
            handlepushnotificationpayloadlambda0.read();
        } else if (controlMessage == ControlMessage.KEYGUARD_STATE_DETECTOR_STOP) {
            handlepushnotificationpayloadlambda0.RemoteActionCompatParcelizer();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public handlePushNotificationPayloadlambda2(handlePushNotificationPayloadlambda0 handlepushnotificationpayloadlambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "KeyguardStateDetector");
        this.IconCompatParcelizer = handlepushnotificationpayloadlambda0;
    }
}
