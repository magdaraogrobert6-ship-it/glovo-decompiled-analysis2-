package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.FusibleFlow;
import o.IInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;

/* JADX INFO: loaded from: classes4.dex */
final class ReadonlyStateFlow<T> implements StateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    public final /* synthetic */ StateFlow read;

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        return this.read.collect(flowCollector, shortNewsContentCardView);
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public final Object read() {
        return this.read.read();
    }

    public ReadonlyStateFlow(MutableStateFlow mutableStateFlow) {
        this.read = mutableStateFlow;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow serializer(TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        return (((i < 0 || i >= 2) && i != -2) || iInAppMessageViewWrapper != IInAppMessageViewWrapper.DROP_OLDEST) ? SharedFlowKt.IconCompatParcelizer(this, textAnnouncementContentCardView, i, iInAppMessageViewWrapper) : this;
    }
}
