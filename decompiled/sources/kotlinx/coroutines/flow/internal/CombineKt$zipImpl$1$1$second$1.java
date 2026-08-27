package kotlinx.coroutines.flow.internal;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.FlowCollector;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
final class CombineKt$zipImpl$1$1$second$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int IconCompatParcelizer;
    public final /* synthetic */ StateProviderImpl$special$$inlined$map$2 RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1, reason: invalid class name */
    final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 read;

        public AnonymousClass1(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) {
            this.read = inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            CombineKt$zipImpl$1$1$second$1$1$emit$1 combineKt$zipImpl$1$1$second$1$1$emit$1;
            if (shortNewsContentCardView instanceof CombineKt$zipImpl$1$1$second$1$1$emit$1) {
                combineKt$zipImpl$1$1$second$1$1$emit$1 = (CombineKt$zipImpl$1$1$second$1$1$emit$1) shortNewsContentCardView;
                int i = combineKt$zipImpl$1$1$second$1$1$emit$1.IconCompatParcelizer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    combineKt$zipImpl$1$1$second$1$1$emit$1.IconCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    combineKt$zipImpl$1$1$second$1$1$emit$1 = new CombineKt$zipImpl$1$1$second$1$1$emit$1(this, shortNewsContentCardView);
                }
            } else {
                combineKt$zipImpl$1$1$second$1$1$emit$1 = new CombineKt$zipImpl$1$1$second$1$1$emit$1(this, shortNewsContentCardView);
            }
            Object obj2 = combineKt$zipImpl$1$1$second$1$1$emit$1.read;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = combineKt$zipImpl$1$1$second$1$1$emit$1.IconCompatParcelizer;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                ProducerCoroutine producerCoroutine = (ProducerCoroutine) this.read;
                producerCoroutine.getClass();
                if (obj == null) {
                    obj = NullSurrogateKt.RemoteActionCompatParcelizer;
                }
                combineKt$zipImpl$1$1$second$1$1$emit$1.IconCompatParcelizer = 1;
                if (producerCoroutine.read.serializer(obj, (ShortNewsContentCardView) combineKt$zipImpl$1$1$second$1$1$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            }
            return createFromParcel.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        CombineKt$zipImpl$1$1$second$1 combineKt$zipImpl$1$1$second$1 = new CombineKt$zipImpl$1$1$second$1(this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        combineKt$zipImpl$1$1$second$1.serializer = obj;
        return combineKt$zipImpl$1$1$second$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((CombineKt$zipImpl$1$1$second$1) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.serializer);
            this.IconCompatParcelizer = 1;
            if (this.RemoteActionCompatParcelizer.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1$second$1(StateProviderImpl$special$$inlined$map$2 stateProviderImpl$special$$inlined$map$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = stateProviderImpl$special$$inlined$map$2;
    }
}
