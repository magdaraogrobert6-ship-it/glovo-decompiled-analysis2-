package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createInAppMessageEventSubscriber;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__ReduceKt$first$3<T> extends ContinuationImpl {
    public int IconCompatParcelizer;
    public FlowKt__ReduceKt$first$$inlined$collectWhile$2 RemoteActionCompatParcelizer;
    public createInAppMessageEventSubscriber read;
    public /* synthetic */ Object serializer;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return FlowKt.first(null, null, this);
    }

    public FlowKt__ReduceKt$first$3(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
