package o;

import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdax3lltCpD3rATxa4vQpnFaaGbzP4 {
    public final SharedFlowImpl IconCompatParcelizer;
    public final SharedFlowImpl RemoteActionCompatParcelizer;

    public r8lambdax3lltCpD3rATxa4vQpnFaaGbzP4() {
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, IInAppMessageViewWrapper.DROP_OLDEST, 1);
        this.IconCompatParcelizer = sharedFlowImplRemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = sharedFlowImplRemoteActionCompatParcelizer;
    }
}
