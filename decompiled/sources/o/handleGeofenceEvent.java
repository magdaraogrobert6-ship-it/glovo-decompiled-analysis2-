package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
final class handleGeofenceEvent extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ r8lambdagOO4V9ME2CU2X5ntv9kK0bIySLE write;

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        r8lambdagOO4V9ME2CU2X5ntv9kK0bIySLE r8lambdagoo4v9me2cu2x5ntv9kk0biysle = this.write;
        if (!r8lambdagoo4v9me2cu2x5ntv9kk0biysle.MediaMetadataCompat.IconCompatParcelizer()) {
            r8lambdagoo4v9me2cu2x5ntv9kk0biysle.read.IconCompatParcelizer("Activity transitions requested but not supported", new Object[0]);
            return;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (controlMessage == ControlMessage.ACTIVITY_TRANSITION_START) {
                r8lambdagOO4V9ME2CU2X5ntv9kK0bIySLE.serializer(r8lambdagoo4v9me2cu2x5ntv9kk0biysle, str);
            } else if (controlMessage == ControlMessage.ACTIVITY_TRANSITION_STOP) {
                r8lambdagOO4V9ME2CU2X5ntv9kK0bIySLE.IconCompatParcelizer(r8lambdagoo4v9me2cu2x5ntv9kk0biysle, str);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public handleGeofenceEvent(r8lambdagOO4V9ME2CU2X5ntv9kK0bIySLE r8lambdagoo4v9me2cu2x5ntv9kk0biysle, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "ActivityTransitionDetectorService");
        this.write = r8lambdagoo4v9me2cu2x5ntv9kk0biysle;
    }
}
