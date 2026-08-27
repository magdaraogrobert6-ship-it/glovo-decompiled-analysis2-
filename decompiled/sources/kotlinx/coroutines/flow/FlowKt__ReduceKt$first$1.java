package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createInAppMessageEventSubscriber;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__ReduceKt$first$1<T> extends ContinuationImpl {
    public int RemoteActionCompatParcelizer;
    public createInAppMessageEventSubscriber read;
    public FlowKt__ReduceKt$first$$inlined$collectWhile$1 serializer;
    public /* synthetic */ Object write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return FlowKt.first(null, this);
    }

    public FlowKt__ReduceKt$first$1(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
