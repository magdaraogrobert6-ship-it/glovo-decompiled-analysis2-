package kotlinx.coroutines.flow;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes4.dex */
public final class SharedFlowSlot extends AbstractSharedFlowSlot<SharedFlowImpl<?>> {
    public CancellableContinuationImpl IconCompatParcelizer;
    public long write;

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public final boolean read(AbstractSharedFlow abstractSharedFlow) {
        SharedFlowImpl sharedFlowImpl = (SharedFlowImpl) abstractSharedFlow;
        if (this.write >= 0) {
            return false;
        }
        long j = sharedFlowImpl.MediaBrowserCompatMediaItem;
        if (j < sharedFlowImpl.write) {
            sharedFlowImpl.write = j;
        }
        this.write = j;
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public final ShortNewsContentCardView[] serializer(AbstractSharedFlow abstractSharedFlow) {
        long j = this.write;
        this.write = -1L;
        this.IconCompatParcelizer = null;
        return ((SharedFlowImpl) abstractSharedFlow).serializer(j);
    }
}
