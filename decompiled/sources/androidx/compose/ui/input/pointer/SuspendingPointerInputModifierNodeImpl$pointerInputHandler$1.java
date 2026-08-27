package androidx.compose.ui.input.pointer;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    int label;

    public SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1(ShortNewsContentCardView<? super SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1> shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
        return new SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1(shortNewsContentCardView);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createFromParcel.INSTANCE;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(PointerInputScope pointerInputScope, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        return ((SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1) create(pointerInputScope, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
    }
}
