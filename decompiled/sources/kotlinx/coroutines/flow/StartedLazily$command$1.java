package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.cancelPendingWebViewPause;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
final class StartedLazily$command$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ StateFlow write;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1, reason: invalid class name */
    final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ cancelPendingWebViewPause RemoteActionCompatParcelizer;
        public final /* synthetic */ FlowCollector read;

        public AnonymousClass1(cancelPendingWebViewPause cancelpendingwebviewpause, FlowCollector flowCollector) {
            this.RemoteActionCompatParcelizer = cancelpendingwebviewpause;
            this.read = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object emit(int i, ShortNewsContentCardView shortNewsContentCardView) {
            StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
            if (shortNewsContentCardView instanceof StartedLazily$command$1$1$emit$1) {
                startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) shortNewsContentCardView;
                int i2 = startedLazily$command$1$1$emit$1.RemoteActionCompatParcelizer;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    startedLazily$command$1$1$emit$1.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
                } else {
                    startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, shortNewsContentCardView);
                }
            } else {
                startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, shortNewsContentCardView);
            }
            Object obj = startedLazily$command$1$1$emit$1.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = startedLazily$command$1$1$emit$1.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (i > 0) {
                cancelPendingWebViewPause cancelpendingwebviewpause = this.RemoteActionCompatParcelizer;
                if (!cancelpendingwebviewpause.IconCompatParcelizer) {
                    cancelpendingwebviewpause.IconCompatParcelizer = true;
                    SharingCommand sharingCommand = SharingCommand.START;
                    startedLazily$command$1$1$emit$1.RemoteActionCompatParcelizer = 1;
                    if (this.read.emit(sharingCommand, startedLazily$command$1$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return createfromparcel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            return emit(((Number) obj).intValue(), shortNewsContentCardView);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.write, shortNewsContentCardView);
        startedLazily$command$1.read = obj;
        return startedLazily$command$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((StartedLazily$command$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.serializer;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(new cancelPendingWebViewPause(), (FlowCollector) this.read);
            this.serializer = 1;
            if (this.write.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        DrawableTransformation.read();
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(StateFlow stateFlow, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = stateFlow;
    }
}
