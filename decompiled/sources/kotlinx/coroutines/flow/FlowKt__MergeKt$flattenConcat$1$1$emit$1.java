package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__MergeKt$flattenConcat$1$1$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ FlowKt__MergeKt$flattenConcat$1$1 read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MergeKt$flattenConcat$1$1$emit$1(FlowKt__MergeKt$flattenConcat$1$1 flowKt__MergeKt$flattenConcat$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = flowKt__MergeKt$flattenConcat$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.read.emit((Flow) null, (ShortNewsContentCardView) this);
    }
}
