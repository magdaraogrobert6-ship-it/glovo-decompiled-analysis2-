package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;

/* JADX INFO: loaded from: classes5.dex */
final class FlowKt__ErrorsKt$retry$3 extends SuspendLambda implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).longValue();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        throw null;
    }
}
