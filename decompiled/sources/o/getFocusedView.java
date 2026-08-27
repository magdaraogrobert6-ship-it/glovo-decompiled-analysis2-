package o;

import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getFocusedView {
    public final SharedFlowImpl RemoteActionCompatParcelizer;
    public final SharedFlowImpl write;

    public getFocusedView() {
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, IInAppMessageViewWrapper.DROP_OLDEST, 1);
        this.RemoteActionCompatParcelizer = sharedFlowImplRemoteActionCompatParcelizer;
        this.write = sharedFlowImplRemoteActionCompatParcelizer;
    }
}
