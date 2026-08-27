package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes5.dex */
final class FlowKt__ErrorsKt$retry$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        ((FlowKt__ErrorsKt$retry$1) create((Throwable) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        return Boolean.TRUE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return Boolean.TRUE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new FlowKt__ErrorsKt$retry$1(2, shortNewsContentCardView);
    }

    public FlowKt__ErrorsKt$retry$1(int i, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
    }
}
