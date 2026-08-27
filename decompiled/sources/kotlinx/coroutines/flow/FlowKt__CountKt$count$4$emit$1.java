package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes5.dex */
final class FlowKt__CountKt$count$4$emit$1 extends ContinuationImpl {
    public final /* synthetic */ FlowKt__CountKt$count$4 RemoteActionCompatParcelizer;
    public Object read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__CountKt$count$4$emit$1(FlowKt__CountKt$count$4 flowKt__CountKt$count$4, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = flowKt__CountKt$count$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        this.RemoteActionCompatParcelizer.emit(null, this);
        return createFromParcel.INSTANCE;
    }
}
