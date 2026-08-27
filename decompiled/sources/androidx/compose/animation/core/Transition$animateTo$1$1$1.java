package androidx.compose.animation.core;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt;
import kotlin.math.MathKt;
import kotlinx.coroutines.YieldKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class Transition$animateTo$1$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Transition read;
    public float serializer;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        Transition$animateTo$1$1$1 transition$animateTo$1$1$1 = new Transition$animateTo$1$1$1(this.read, shortNewsContentCardView);
        transition$animateTo$1$1$1.IconCompatParcelizer = obj;
        return transition$animateTo$1$1$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((Transition$animateTo$1$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout;
        final float f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.write;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.IconCompatParcelizer;
            f = SuspendAnimationKt.read(getcontentviewgroupparentlayout.getCoroutineContext());
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = this.serializer;
            getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        while (YieldKt.write(getcontentviewgroupparentlayout)) {
            final Transition transition = this.read;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.heightInVpY3zN4default
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj2) {
                    long jLongValue = ((Long) obj2).longValue();
                    androidx.compose.animation.core.Transition transition2 = transition;
                    boolean zSerializer = transition2.serializer();
                    PopulateViewStructure_androidKt populateViewStructure_androidKt = transition2.RatingCompat;
                    if (!zSerializer) {
                        onCreateVirtualViewTranslationRequestsui oncreatevirtualviewtranslationrequestsui = (onCreateVirtualViewTranslationRequestsui) populateViewStructure_androidKt;
                        if (oncreatevirtualviewtranslationrequestsui.RemoteActionCompatParcelizer() == Long.MIN_VALUE) {
                            oncreatevirtualviewtranslationrequestsui.write(jLongValue);
                            ((onShowTranslationui) ((PopulateViewStructure_androidKtpopulate7) transition2.MediaSessionCompatToken.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY)).setValue(Boolean.TRUE);
                        }
                        long jRemoteActionCompatParcelizer = jLongValue - oncreatevirtualviewtranslationrequestsui.RemoteActionCompatParcelizer();
                        float f2 = f;
                        if (f2 != 0.0f) {
                            jRemoteActionCompatParcelizer = MathKt.read(jRemoteActionCompatParcelizer / ((double) f2));
                        }
                        transition2.serializer(jRemoteActionCompatParcelizer);
                        transition2.onFrame$animation_core(jRemoteActionCompatParcelizer, f2 == 0.0f);
                    }
                    return createFromParcel.INSTANCE;
                }
            };
            this.IconCompatParcelizer = getcontentviewgroupparentlayout;
            this.serializer = f;
            this.write = 1;
            if (TextStreamsKt.read(getContext()).withFrameNanos(r8lambdaunavo3sxub_pc9xroryotnrlvsm, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1$1(Transition transition, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = transition;
    }
}
