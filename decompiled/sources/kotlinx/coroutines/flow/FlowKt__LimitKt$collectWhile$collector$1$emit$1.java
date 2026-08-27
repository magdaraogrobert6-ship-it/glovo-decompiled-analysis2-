package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowKt__LimitKt$collectWhile$collector$1$emit$1 extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ FlowKt__LimitKt$collectWhile$collector$1 RemoteActionCompatParcelizer;
    public FlowKt__LimitKt$collectWhile$collector$1 read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$collectWhile$collector$1$emit$1(FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = flowKt__LimitKt$collectWhile$collector$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        this.RemoteActionCompatParcelizer.emit(null, this);
        return createFromParcel.INSTANCE;
    }
}
