package o;

import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class reenqueueInAppMessageandroid_sdk_base_release implements requestGeofences {
    public final SharedFlowImpl read;
    public final SharedFlowImpl write;

    public reenqueueInAppMessageandroid_sdk_base_release() {
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, IInAppMessageViewWrapper.DROP_OLDEST);
        this.read = sharedFlowImplRemoteActionCompatParcelizer;
        this.write = sharedFlowImplRemoteActionCompatParcelizer;
    }
}
