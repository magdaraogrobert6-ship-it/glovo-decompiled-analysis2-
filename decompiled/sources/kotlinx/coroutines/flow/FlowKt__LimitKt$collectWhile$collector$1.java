package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowKt__LimitKt$collectWhile$collector$1 implements FlowCollector<Object> {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        FlowKt__LimitKt$collectWhile$collector$1$emit$1 flowKt__LimitKt$collectWhile$collector$1$emit$1;
        if (shortNewsContentCardView instanceof FlowKt__LimitKt$collectWhile$collector$1$emit$1) {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = (FlowKt__LimitKt$collectWhile$collector$1$emit$1) shortNewsContentCardView;
            int i = flowKt__LimitKt$collectWhile$collector$1$emit$1.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$collectWhile$collector$1$emit$1.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$collectWhile$collector$1$emit$1 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, shortNewsContentCardView);
            }
        } else {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, shortNewsContentCardView);
        }
        Object obj2 = flowKt__LimitKt$collectWhile$collector$1$emit$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__LimitKt$collectWhile$collector$1$emit$1.IconCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            flowKt__LimitKt$collectWhile$collector$1$emit$1.read = this;
            flowKt__LimitKt$collectWhile$collector$1$emit$1.IconCompatParcelizer = 1;
            throw null;
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1 = flowKt__LimitKt$collectWhile$collector$1$emit$1.read;
        ExtrasKt.RemoteActionCompatParcelizer(obj2);
        if (((Boolean) obj2).booleanValue()) {
            return createFromParcel.INSTANCE;
        }
        throw new AbortFlowException(flowKt__LimitKt$collectWhile$collector$1);
    }
}
