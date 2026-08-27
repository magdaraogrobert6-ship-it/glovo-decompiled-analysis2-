package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.createFromParcel;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowKt__MergeKt$flatMapLatest$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public /* synthetic */ FlowCollector IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            throw null;
        }
        if (i == 1) {
            FlowCollector flowCollector = this.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.IconCompatParcelizer = null;
            this.RemoteActionCompatParcelizer = 2;
            if (FlowKt.emitAll(flowCollector, (Flow) obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createFromParcel.INSTANCE;
    }
}
