package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import o.ShortNewsContentCardView;
import o.onBackCancelledlambda3;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public FlowCollector RemoteActionCompatParcelizer;
    public BufferedChannel.BufferedChannelIterator read;
    public onBackCancelledlambda3 serializer;
    public boolean write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaSessionCompatQueueItem = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(null, null, false, this);
    }

    public FlowKt__ChannelsKt$emitAllImpl$1(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
