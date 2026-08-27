package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes4.dex */
final class StateFlowSlot extends AbstractSharedFlowSlot<StateFlowImpl<?>> {
    public final AtomicReference IconCompatParcelizer = new AtomicReference(null);

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public final boolean read(AbstractSharedFlow abstractSharedFlow) {
        AtomicReference atomicReference = this.IconCompatParcelizer;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(StateFlowKt.RemoteActionCompatParcelizer);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public final ShortNewsContentCardView[] serializer(AbstractSharedFlow abstractSharedFlow) {
        this.IconCompatParcelizer.set(null);
        return AbstractSharedFlowKt.serializer;
    }
}
