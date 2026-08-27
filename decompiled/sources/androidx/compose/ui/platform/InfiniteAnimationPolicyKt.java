package androidx.compose.ui.platform;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt {

    /* JADX INFO: renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM $onFrame;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(ShortNewsContentCardView<?> shortNewsContentCardView) {
            return new AnonymousClass2(this.$onFrame, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.$onFrame;
            this.label = 1;
            Object objWithFrameNanos = TextStreamsKt.read(getContext()).withFrameNanos(r8lambdaunavo3sxub_pc9xroryotnrlvsm, this);
            return objWithFrameNanos == coroutineSingletons ? coroutineSingletons : objWithFrameNanos;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView<? super AnonymousClass2> shortNewsContentCardView) {
            super(1, shortNewsContentCardView);
            this.$onFrame = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(ShortNewsContentCardView<? super R> shortNewsContentCardView) {
            return ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    public static final <R> Object withInfiniteAnimationFrameNanos(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView<? super R> shortNewsContentCardView) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) shortNewsContentCardView.getContext().get(InfiniteAnimationPolicy.Key);
        return infiniteAnimationPolicy == null ? TextStreamsKt.read(shortNewsContentCardView.getContext()).withFrameNanos(r8lambdaunavo3sxub_pc9xroryotnrlvsm, shortNewsContentCardView) : infiniteAnimationPolicy.onInfiniteOperation(new AnonymousClass2(r8lambdaunavo3sxub_pc9xroryotnrlvsm, null), shortNewsContentCardView);
    }
}
