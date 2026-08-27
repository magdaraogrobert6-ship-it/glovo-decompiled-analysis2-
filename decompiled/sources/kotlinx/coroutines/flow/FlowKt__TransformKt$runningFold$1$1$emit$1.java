package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createInAppMessageEventSubscriber;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__TransformKt$runningFold$1$1$emit$1 extends ContinuationImpl {
    public createInAppMessageEventSubscriber IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public Object read;
    public final /* synthetic */ FlowKt__TransformKt$runningFold$1$1 serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$runningFold$1$1$emit$1(FlowKt__TransformKt$runningFold$1$1 flowKt__TransformKt$runningFold$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = flowKt__TransformKt$runningFold$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.serializer.emit(null, this);
    }
}
