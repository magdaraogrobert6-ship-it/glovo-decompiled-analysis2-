package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__MergeKt$flattenConcat$1$1<T> implements FlowCollector {
    public final /* synthetic */ FlowCollector RemoteActionCompatParcelizer;

    public FlowKt__MergeKt$flattenConcat$1$1(FlowCollector flowCollector) {
        this.RemoteActionCompatParcelizer = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Flow flow, ShortNewsContentCardView shortNewsContentCardView) {
        FlowKt__MergeKt$flattenConcat$1$1$emit$1 flowKt__MergeKt$flattenConcat$1$1$emit$1;
        if (shortNewsContentCardView instanceof FlowKt__MergeKt$flattenConcat$1$1$emit$1) {
            flowKt__MergeKt$flattenConcat$1$1$emit$1 = (FlowKt__MergeKt$flattenConcat$1$1$emit$1) shortNewsContentCardView;
            int i = flowKt__MergeKt$flattenConcat$1$1$emit$1.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__MergeKt$flattenConcat$1$1$emit$1.write = i - Integer.MIN_VALUE;
            } else {
                flowKt__MergeKt$flattenConcat$1$1$emit$1 = new FlowKt__MergeKt$flattenConcat$1$1$emit$1(this, shortNewsContentCardView);
            }
        } else {
            flowKt__MergeKt$flattenConcat$1$1$emit$1 = new FlowKt__MergeKt$flattenConcat$1$1$emit$1(this, shortNewsContentCardView);
        }
        Object obj = flowKt__MergeKt$flattenConcat$1$1$emit$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__MergeKt$flattenConcat$1$1$emit$1.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            flowKt__MergeKt$flattenConcat$1$1$emit$1.write = 1;
            if (FlowKt.emitAll(this.RemoteActionCompatParcelizer, flow, flowKt__MergeKt$flattenConcat$1$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createFromParcel.INSTANCE;
    }
}
