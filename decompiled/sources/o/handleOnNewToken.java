package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
final class handleOnNewToken extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ onMessageReceived read;

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        ControlMessage controlMessage2 = ControlMessage.MOTION_ACTIVITY_START_SINGLE;
        onMessageReceived onmessagereceived = this.read;
        if (controlMessage == controlMessage2) {
            onMessageReceived.serializer(onmessagereceived);
            return;
        }
        if (controlMessage == ControlMessage.MOTION_ACTIVITY_STOP_SINGLE) {
            onmessagereceived.write();
        } else if (controlMessage == ControlMessage.MOTION_ACTIVITY_START_CONTINUOUS) {
            onMessageReceived.IconCompatParcelizer(onmessagereceived);
        } else if (controlMessage == ControlMessage.MOTION_ACTIVITY_STOP_CONTINUOUS) {
            onmessagereceived.RemoteActionCompatParcelizer();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public handleOnNewToken(onMessageReceived onmessagereceived, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "MotionActivityDetector");
        this.read = onmessagereceived;
    }
}
