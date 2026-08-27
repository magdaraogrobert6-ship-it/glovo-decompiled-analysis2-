package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.unit.Dp;
import coil3.ExtrasKt;
import coil3.util.ContextsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.BottomSheetScaffoldKt;
import o.PlatformSelectionBehaviorsImpl;
import o.TrackpadScrollingLogic;
import o.TransformGestureDetectorKt;
import o.UpdatableAnimationState;
import o.accessanimateWithTarget;
import o.cancelPendingWebViewPauselambda0;
import o.handlePressInteraction;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setRipplePropertiesbiQXAtU;
import o.setRippleState;

/* JADX INFO: loaded from: classes.dex */
public abstract class SnapFlingBehaviorKt {
    public static final float read = Dp.m3673constructorimpl(400.0f);

    public static final float RemoteActionCompatParcelizer(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object access$animateWithTarget(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, float f, float f2, UpdatableAnimationState updatableAnimationState, TrackpadScrollingLogic trackpadScrollingLogic, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) {
        handlePressInteraction handlepressinteraction;
        UpdatableAnimationState updatableAnimationState2;
        float f3;
        cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0;
        float f4 = f;
        if (continuationImpl instanceof handlePressInteraction) {
            handlepressinteraction = (handlePressInteraction) continuationImpl;
            int i = handlepressinteraction.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                handlepressinteraction.read = i - Integer.MIN_VALUE;
            } else {
                handlepressinteraction = new handlePressInteraction(continuationImpl);
            }
        } else {
            handlepressinteraction = new handlePressInteraction(continuationImpl);
        }
        handlePressInteraction handlepressinteraction2 = handlepressinteraction;
        Object obj = handlepressinteraction2.MediaSessionCompatQueueItem;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = handlepressinteraction2.read;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda1 = new cancelPendingWebViewPauselambda0(0);
            float fFloatValue = ((Number) updatableAnimationState.serializer()).floatValue();
            Float f5 = new Float(f4);
            boolean z = ((Number) updatableAnimationState.serializer()).floatValue() == 0.0f;
            BottomSheetScaffoldKt bottomSheetScaffoldKt = new BottomSheetScaffoldKt(f2, cancelpendingwebviewpauselambda1, platformSelectionBehaviorsImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, 1);
            updatableAnimationState2 = updatableAnimationState;
            handlepressinteraction2.RemoteActionCompatParcelizer = updatableAnimationState2;
            handlepressinteraction2.IconCompatParcelizer = cancelpendingwebviewpauselambda1;
            handlepressinteraction2.write = f4;
            handlepressinteraction2.serializer = fFloatValue;
            handlepressinteraction2.read = 1;
            f3 = fFloatValue;
            if (SuspendAnimationKt.animateTo(updatableAnimationState, f5, trackpadScrollingLogic, !z, bottomSheetScaffoldKt, handlepressinteraction2) == coroutineSingletons) {
                return coroutineSingletons;
            }
            cancelpendingwebviewpauselambda0 = cancelpendingwebviewpauselambda1;
        } else if (i2 == 1) {
            float f6 = handlepressinteraction2.serializer;
            float f7 = handlepressinteraction2.write;
            cancelpendingwebviewpauselambda0 = handlepressinteraction2.IconCompatParcelizer;
            UpdatableAnimationState updatableAnimationState3 = handlepressinteraction2.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            f3 = f6;
            f4 = f7;
            updatableAnimationState2 = updatableAnimationState3;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        return new setRippleState(new Float(f4 - cancelpendingwebviewpauselambda0.write), ContextsKt.read(updatableAnimationState2, 0.0f, RemoteActionCompatParcelizer(((Number) updatableAnimationState2.serializer()).floatValue(), f3), 29));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$animateDecay(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, float f, UpdatableAnimationState updatableAnimationState, accessanimateWithTarget accessanimatewithtarget, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) {
        setRipplePropertiesbiQXAtU setripplepropertiesbiqxatu;
        UpdatableAnimationState updatableAnimationState2;
        cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0;
        float f2;
        if (continuationImpl instanceof setRipplePropertiesbiQXAtU) {
            setripplepropertiesbiqxatu = (setRipplePropertiesbiQXAtU) continuationImpl;
            int i = setripplepropertiesbiqxatu.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                setripplepropertiesbiqxatu.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                setripplepropertiesbiqxatu = new setRipplePropertiesbiQXAtU(continuationImpl);
            }
        } else {
            setripplepropertiesbiqxatu = new setRipplePropertiesbiQXAtU(continuationImpl);
        }
        Object obj = setripplepropertiesbiqxatu.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = setripplepropertiesbiqxatu.IconCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda1 = new cancelPendingWebViewPauselambda0(0);
            boolean z = ((Number) updatableAnimationState.serializer()).floatValue() == 0.0f;
            BottomSheetScaffoldKt bottomSheetScaffoldKt = new BottomSheetScaffoldKt(f, cancelpendingwebviewpauselambda1, platformSelectionBehaviorsImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, 0);
            setripplepropertiesbiqxatu.RemoteActionCompatParcelizer = updatableAnimationState;
            setripplepropertiesbiqxatu.write = cancelpendingwebviewpauselambda1;
            setripplepropertiesbiqxatu.read = f;
            setripplepropertiesbiqxatu.IconCompatParcelizer = 1;
            if (SuspendAnimationKt.animateDecay(updatableAnimationState, accessanimatewithtarget, !z, bottomSheetScaffoldKt, setripplepropertiesbiqxatu) == coroutineSingletons) {
                return coroutineSingletons;
            }
            updatableAnimationState2 = updatableAnimationState;
            cancelpendingwebviewpauselambda0 = cancelpendingwebviewpauselambda1;
            f2 = f;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = setripplepropertiesbiqxatu.read;
            cancelpendingwebviewpauselambda0 = setripplepropertiesbiqxatu.write;
            updatableAnimationState2 = setripplepropertiesbiqxatu.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return new setRippleState(new Float(f2 - cancelpendingwebviewpauselambda0.write), updatableAnimationState2);
    }

    public static final void write(TransformGestureDetectorKt transformGestureDetectorKt, PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, float f) {
        float f2;
        try {
            f2 = platformSelectionBehaviorsImpl.read(f);
        } catch (CancellationException unused) {
            transformGestureDetectorKt.write();
            f2 = 0.0f;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Float.valueOf(f2));
        if (Math.abs(f - f2) > 0.5f) {
            transformGestureDetectorKt.write();
        }
    }
}
