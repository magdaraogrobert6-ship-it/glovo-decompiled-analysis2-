package kotlinx.coroutines.flow.internal;

import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractSharedFlowSlot<F> {
    public abstract boolean read(AbstractSharedFlow abstractSharedFlow);

    public abstract ShortNewsContentCardView[] serializer(AbstractSharedFlow abstractSharedFlow);
}
