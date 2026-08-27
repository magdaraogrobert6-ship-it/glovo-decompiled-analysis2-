package o;

import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class setRegisteredPushToken {
    public final SharedFlowImpl RemoteActionCompatParcelizer;
    public final SharedFlowImpl read;

    public setRegisteredPushToken() {
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, null, 5);
        this.read = sharedFlowImplRemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = sharedFlowImplRemoteActionCompatParcelizer;
    }
}
