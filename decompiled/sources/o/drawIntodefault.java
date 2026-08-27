package o;

import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class drawIntodefault {
    public static final SharedFlowImpl RemoteActionCompatParcelizer;
    public static final SharedFlow serializer;

    static {
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 64, null, 4);
        RemoteActionCompatParcelizer = sharedFlowImplRemoteActionCompatParcelizer;
        serializer = FlowKt.read(sharedFlowImplRemoteActionCompatParcelizer);
    }
}
