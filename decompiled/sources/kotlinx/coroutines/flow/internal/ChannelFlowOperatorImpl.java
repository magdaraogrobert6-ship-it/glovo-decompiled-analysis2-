package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.IInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;

/* JADX INFO: loaded from: classes4.dex */
public final class ChannelFlowOperatorImpl<T> extends ChannelFlowOperator<T, T> {
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Flow IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow RemoteActionCompatParcelizer(TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        return new ChannelFlowOperatorImpl(i, textAnnouncementContentCardView, iInAppMessageViewWrapper, this.IconCompatParcelizer);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public final Object flowCollect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCollect = this.IconCompatParcelizer.collect(flowCollector, shortNewsContentCardView);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : createFromParcel.INSTANCE;
    }

    public ChannelFlowOperatorImpl(Flow flow, TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper, int i2) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 2) != 0 ? r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write : textAnnouncementContentCardView, (i2 & 8) != 0 ? IInAppMessageViewWrapper.SUSPEND : iInAppMessageViewWrapper, flow);
    }

    public ChannelFlowOperatorImpl(int i, TextAnnouncementContentCardView textAnnouncementContentCardView, IInAppMessageViewWrapper iInAppMessageViewWrapper, Flow flow) {
        super(i, textAnnouncementContentCardView, iInAppMessageViewWrapper, flow);
    }
}
