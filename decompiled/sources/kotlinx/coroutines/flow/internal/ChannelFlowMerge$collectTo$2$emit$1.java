package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes5.dex */
final class ChannelFlowMerge$collectTo$2$emit$1 extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public Flow read;
    public Object serializer;
    public final /* synthetic */ ChannelFlowMerge.AnonymousClass2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowMerge$collectTo$2$emit$1(ChannelFlowMerge.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.write.emit((Flow) null, (ShortNewsContentCardView) this);
    }
}
