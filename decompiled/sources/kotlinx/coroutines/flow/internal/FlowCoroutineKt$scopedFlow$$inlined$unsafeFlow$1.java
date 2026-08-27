package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.math.MathKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1 implements Flow<Object> {
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY read;

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.read, flowCollector, null);
        FlowCoroutine flowCoroutine = new FlowCoroutine(shortNewsContentCardView, shortNewsContentCardView.getContext());
        Object objStartUndspatched = MathKt.startUndspatched(flowCoroutine, true, flowCoroutine, flowCoroutineKt$scopedFlow$1$1);
        return objStartUndspatched == CoroutineSingletons.COROUTINE_SUSPENDED ? objStartUndspatched : createFromParcel.INSTANCE;
    }

    public FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        this.read = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }
}
