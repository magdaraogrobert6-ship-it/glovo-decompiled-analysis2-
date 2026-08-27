package o;

import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class performActivityCreated {
    public final SharedFlowImpl read;
    public final SharedFlowImpl write;

    public performActivityCreated() {
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, IInAppMessageViewWrapper.DROP_OLDEST, 1);
        this.write = sharedFlowImplRemoteActionCompatParcelizer;
        this.read = sharedFlowImplRemoteActionCompatParcelizer;
    }
}
