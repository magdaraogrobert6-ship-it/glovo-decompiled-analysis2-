package o;

import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class i8 {
    public final SharedFlowImpl IconCompatParcelizer;
    public final SharedFlowImpl read;

    public i8() {
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, null, 5);
        this.IconCompatParcelizer = sharedFlowImplRemoteActionCompatParcelizer;
        this.read = sharedFlowImplRemoteActionCompatParcelizer;
    }
}
