package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowKt__ReduceKt$fold$2<T> implements FlowCollector {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        FlowKt__ReduceKt$fold$2$emit$1 flowKt__ReduceKt$fold$2$emit$1;
        if (shortNewsContentCardView instanceof FlowKt__ReduceKt$fold$2$emit$1) {
            flowKt__ReduceKt$fold$2$emit$1 = (FlowKt__ReduceKt$fold$2$emit$1) shortNewsContentCardView;
            int i = flowKt__ReduceKt$fold$2$emit$1.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$fold$2$emit$1.serializer = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$fold$2$emit$1 = new FlowKt__ReduceKt$fold$2$emit$1(this, shortNewsContentCardView);
            }
        } else {
            flowKt__ReduceKt$fold$2$emit$1 = new FlowKt__ReduceKt$fold$2$emit$1(this, shortNewsContentCardView);
        }
        Object obj2 = flowKt__ReduceKt$fold$2$emit$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ReduceKt$fold$2$emit$1.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj2);
        throw null;
    }
}
