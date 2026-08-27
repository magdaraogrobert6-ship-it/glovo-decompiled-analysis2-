package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createInAppMessageEventSubscriber;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__ReduceKt$firstOrNull$1<T> extends ContinuationImpl {
    public createInAppMessageEventSubscriber IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1 read;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return FlowKt.firstOrNull(null, this);
    }

    public FlowKt__ReduceKt$firstOrNull$1(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
