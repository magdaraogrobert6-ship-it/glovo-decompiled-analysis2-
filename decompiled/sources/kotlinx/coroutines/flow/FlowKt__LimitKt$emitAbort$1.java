package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__LimitKt$emitAbort$1<T> extends ContinuationImpl {
    public Object RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        return FlowKt__LimitKt.access$emitAbort$FlowKt__LimitKt(null, null, null, this);
    }

    public FlowKt__LimitKt$emitAbort$1(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
