package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1 implements Flow<Object> {
    public final /* synthetic */ FlowKt__MergeKt$flatMapConcat$$inlined$map$1 IconCompatParcelizer;

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCollect = this.IconCompatParcelizer.collect(new FlowKt__MergeKt$flattenConcat$1$1(flowCollector), shortNewsContentCardView);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : createFromParcel.INSTANCE;
    }

    public FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1(FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1) {
        this.IconCompatParcelizer = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
    }
}
