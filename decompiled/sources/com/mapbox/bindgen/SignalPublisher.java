package com.mapbox.bindgen;

import androidx.room.Room;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.Cancelable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes5.dex */
public final class SignalPublisher {
    public static final SignalPublisher INSTANCE = new SignalPublisher();

    /* JADX INFO: renamed from: com.mapbox.bindgen.SignalPublisher$create$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM $register;
        private /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$register, shortNewsContentCardView);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                final InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.L$0;
                try {
                    final Cancelable cancelable = (Cancelable) this.$register.invoke(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.bindgen.SignalPublisher$create$1$cancelable$1
                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m4531invoke(Output output) {
                            ((ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1).b_(output);
                        }

                        {
                            super(1);
                        }

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m4531invoke(obj2);
                            return createFromParcel.INSTANCE;
                        }
                    });
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.bindgen.SignalPublisher.create.1.1
                        {
                            super(0);
                        }

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m4530invoke();
                            return createFromParcel.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m4530invoke() {
                            try {
                                cancelable.cancel();
                            } catch (Exception unused) {
                            }
                        }
                    };
                    this.label = 1;
                    if (Room.awaitClose(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Exception e) {
                    ((ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1).IconCompatParcelizer((Throwable) e);
                    return createfromparcel;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createfromparcel;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$register = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass1) create(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    private SignalPublisher() {
    }

    public final <Output> Flow<Output> create(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        return FlowKt.write(new AnonymousClass1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, null));
    }
}
