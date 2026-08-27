package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__EmittersKt$invokeSafely$1<T> extends ContinuationImpl {
    public /* synthetic */ Object read;
    public int serializer;
    public Throwable write;

    public FlowKt__EmittersKt$invokeSafely$1(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        return FlowKt__EmittersKt.access$invokeSafely$FlowKt__EmittersKt(null, null, null, this);
    }
}
