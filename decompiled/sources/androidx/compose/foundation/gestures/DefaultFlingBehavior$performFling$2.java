package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import coil3.ExtrasKt;
import coil3.util.ContextsKt;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.BottomSheetDefaults;
import o.PlatformSelectionBehaviorsImpl;
import o.ShortNewsContentCardView;
import o.TriStateCheckbox;
import o.accessanimateWithTarget;
import o.cancelPendingWebViewPauselambda0;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.mainAxisk4lQ0M;
import o.notifyFocusedRectfoundation;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultFlingBehavior$performFling$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaMetadataCompat;
    public int RatingCompat;
    public final /* synthetic */ PlatformSelectionBehaviorsImpl RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 0;
    public cancelPendingWebViewPauselambda0 serializer;
    public final /* synthetic */ float write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(SnapFlingBehavior snapFlingBehavior, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = snapFlingBehavior;
        this.write = f;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = platformSelectionBehaviorsImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.read;
        Object obj2 = this.MediaMetadataCompat;
        if (i != 0) {
            PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = this.RemoteActionCompatParcelizer;
            return new DefaultFlingBehavior$performFling$2((SnapFlingBehavior) this.IconCompatParcelizer, this.write, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, platformSelectionBehaviorsImpl, shortNewsContentCardView);
        }
        PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl2 = this.RemoteActionCompatParcelizer;
        return new DefaultFlingBehavior$performFling$2(this.write, (notifyFocusedRectfoundation) obj2, platformSelectionBehaviorsImpl2, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((DefaultFlingBehavior$performFling$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((DefaultFlingBehavior$performFling$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [o.setRippleStatelambda1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        o.UpdatableAnimationState updatableAnimationState;
        cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0;
        final cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda1;
        Object objAccess$tryApproach;
        int i = this.read;
        float f = this.write;
        Object obj2 = this.MediaMetadataCompat;
        final int i2 = 0;
        final int i3 = 1;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.RatingCompat;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (Math.abs(f) > 1.0f) {
                    cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda2 = new cancelPendingWebViewPauselambda0(0);
                    cancelpendingwebviewpauselambda2.write = f;
                    cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda3 = new cancelPendingWebViewPauselambda0(0);
                    o.UpdatableAnimationState updatableAnimationStateRemoteActionCompatParcelizer = ContextsKt.RemoteActionCompatParcelizer(0.0f, f, 28);
                    try {
                        notifyFocusedRectfoundation notifyfocusedrectfoundation = (notifyFocusedRectfoundation) obj2;
                        accessanimateWithTarget accessanimatewithtarget = notifyfocusedrectfoundation.read;
                        UserJavascriptInterfaceBase$$ExternalSyntheticLambda12 userJavascriptInterfaceBase$$ExternalSyntheticLambda12 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(cancelpendingwebviewpauselambda3, this.RemoteActionCompatParcelizer, cancelpendingwebviewpauselambda2, notifyfocusedrectfoundation);
                        this.serializer = cancelpendingwebviewpauselambda2;
                        this.IconCompatParcelizer = updatableAnimationStateRemoteActionCompatParcelizer;
                        this.RatingCompat = 1;
                        if (SuspendAnimationKt.animateDecay(updatableAnimationStateRemoteActionCompatParcelizer, accessanimatewithtarget, false, userJavascriptInterfaceBase$$ExternalSyntheticLambda12, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        cancelpendingwebviewpauselambda0 = cancelpendingwebviewpauselambda2;
                        f = cancelpendingwebviewpauselambda0.write;
                    } catch (CancellationException unused) {
                        updatableAnimationState = updatableAnimationStateRemoteActionCompatParcelizer;
                        cancelpendingwebviewpauselambda0 = cancelpendingwebviewpauselambda2;
                        cancelpendingwebviewpauselambda0.write = ((Number) updatableAnimationState.serializer()).floatValue();
                    }
                }
            } else {
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                updatableAnimationState = (o.UpdatableAnimationState) this.IconCompatParcelizer;
                cancelpendingwebviewpauselambda0 = this.serializer;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                } catch (CancellationException unused2) {
                    cancelpendingwebviewpauselambda0.write = ((Number) updatableAnimationState.serializer()).floatValue();
                }
                f = cancelpendingwebviewpauselambda0.write;
            }
            return new Float(f);
        }
        final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) this.IconCompatParcelizer;
        BottomSheetDefaults bottomSheetDefaults = snapFlingBehavior.read;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.RatingCompat;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            float fCalculateApproachOffset = bottomSheetDefaults.calculateApproachOffset(f, mainAxisk4lQ0M.IconCompatParcelizer(snapFlingBehavior.IconCompatParcelizer, 0.0f, f));
            if (Float.isNaN(fCalculateApproachOffset)) {
                TriStateCheckbox.RemoteActionCompatParcelizer("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            cancelpendingwebviewpauselambda1 = new cancelPendingWebViewPauselambda0(0);
            float fSignum = Math.signum(f) * Math.abs(fCalculateApproachOffset);
            cancelpendingwebviewpauselambda1.write = fSignum;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new Float(fSignum));
            float f2 = cancelpendingwebviewpauselambda1.write;
            ?? r5 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.setRippleStatelambda1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj3) {
                    int i6 = i2;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                    cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda4 = cancelpendingwebviewpauselambda1;
                    float fFloatValue = ((Float) obj3).floatValue();
                    if (i6 != 0) {
                        float f3 = cancelpendingwebviewpauselambda4.write - fFloatValue;
                        cancelpendingwebviewpauselambda4.write = f3;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(Float.valueOf(f3));
                        return createfromparcel;
                    }
                    float f4 = cancelpendingwebviewpauselambda4.write - fFloatValue;
                    cancelpendingwebviewpauselambda4.write = f4;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(Float.valueOf(f4));
                    return createfromparcel;
                }
            };
            this.serializer = cancelpendingwebviewpauselambda1;
            this.RatingCompat = 1;
            objAccess$tryApproach = SnapFlingBehavior.access$tryApproach(snapFlingBehavior, this.RemoteActionCompatParcelizer, f2, this.write, r5, this);
            if (objAccess$tryApproach != coroutineSingletons2) {
            }
            return coroutineSingletons2;
        }
        if (i5 != 1) {
            if (i5 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda4 = this.serializer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        cancelpendingwebviewpauselambda1 = cancelpendingwebviewpauselambda4;
        objAccess$tryApproach = obj;
        o.UpdatableAnimationState updatableAnimationState2 = (o.UpdatableAnimationState) objAccess$tryApproach;
        float fCalculateSnapOffset = bottomSheetDefaults.calculateSnapOffset(((Number) updatableAnimationState2.serializer()).floatValue());
        if (Float.isNaN(fCalculateSnapOffset)) {
            TriStateCheckbox.RemoteActionCompatParcelizer("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        cancelpendingwebviewpauselambda1.write = fCalculateSnapOffset;
        o.UpdatableAnimationState updatableAnimationState3 = ContextsKt.read(updatableAnimationState2, 0.0f, 0.0f, 30);
        o.TrackpadScrollingLogic trackpadScrollingLogic = snapFlingBehavior.serializer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.setRippleStatelambda1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj3) {
                int i6 = i3;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda5 = cancelpendingwebviewpauselambda1;
                float fFloatValue = ((Float) obj3).floatValue();
                if (i6 != 0) {
                    float f3 = cancelpendingwebviewpauselambda5.write - fFloatValue;
                    cancelpendingwebviewpauselambda5.write = f3;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(Float.valueOf(f3));
                    return createfromparcel;
                }
                float f4 = cancelpendingwebviewpauselambda5.write - fFloatValue;
                cancelpendingwebviewpauselambda5.write = f4;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(Float.valueOf(f4));
                return createfromparcel;
            }
        };
        this.serializer = null;
        this.RatingCompat = 2;
        Object objAccess$animateWithTarget = SnapFlingBehaviorKt.access$animateWithTarget(this.RemoteActionCompatParcelizer, fCalculateSnapOffset, fCalculateSnapOffset, updatableAnimationState3, trackpadScrollingLogic, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, this);
        if (objAccess$animateWithTarget != coroutineSingletons2) {
            return objAccess$animateWithTarget;
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(float f, notifyFocusedRectfoundation notifyfocusedrectfoundation, PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = f;
        this.MediaMetadataCompat = notifyfocusedrectfoundation;
        this.RemoteActionCompatParcelizer = platformSelectionBehaviorsImpl;
    }
}
