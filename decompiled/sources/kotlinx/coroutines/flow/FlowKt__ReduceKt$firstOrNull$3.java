package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.createInAppMessageEventSubscriber;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__ReduceKt$firstOrNull$3<T> extends ContinuationImpl {
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 serializer;
    public createInAppMessageEventSubscriber write;

    public FlowKt__ReduceKt$firstOrNull$3(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return FlowKt.firstOrNull(null, null, this);
    }
}
