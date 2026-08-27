package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.FusibleFlow;
import o.IInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;

/* JADX INFO: loaded from: classes4.dex */
final class ReadonlySharedFlow<T> implements SharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    public final /* synthetic */ SharedFlowImpl IconCompatParcelizer;

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow serializer(TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        return SharedFlowKt.IconCompatParcelizer(this, textAnnouncementContentCardView, i, iInAppMessageViewWrapper);
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        return SharedFlowImpl.collect$suspendImpl(this.IconCompatParcelizer, flowCollector, shortNewsContentCardView);
    }

    public ReadonlySharedFlow(SharedFlowImpl sharedFlowImpl) {
        this.IconCompatParcelizer = sharedFlowImpl;
    }
}
