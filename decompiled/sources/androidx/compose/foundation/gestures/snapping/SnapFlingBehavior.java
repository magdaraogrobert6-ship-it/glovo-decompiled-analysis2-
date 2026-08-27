package androidx.compose.foundation.gestures.snapping;

import androidx.camera.view.PendingValue;
import androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2;
import androidx.compose.foundation.gestures.ScrollableKt;
import coil3.ExtrasKt;
import coil3.util.ContextsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import o.BottomSheetDefaults;
import o.PlatformSelectionBehaviorsImpl;
import o.RippleNode;
import o.ShortNewsContentCardView;
import o.TextFieldSizeNode;
import o.TrackpadScrollingLogic;
import o.accessanimateWithTarget;
import o.constructorimpl;
import o.getAllClearedRouteIds;
import o.getAllRenderedRouteIds;
import o.getCieXyz;
import o.mainAxisk4lQ0M;
import o.mouseSelection;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setRippleState;
import o.setRippleStatelambda1;

/* JADX INFO: loaded from: classes.dex */
public final class SnapFlingBehavior implements constructorimpl {
    public final accessanimateWithTarget IconCompatParcelizer;
    public final BottomSheetDefaults read;
    public final TrackpadScrollingLogic serializer;
    public final mouseSelection write = ScrollableKt.serializer;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        return this.read.hashCode() + ((this.IconCompatParcelizer.hashCode() + (iHashCode * 31)) * 31);
    }

    public SnapFlingBehavior(BottomSheetDefaults bottomSheetDefaults, accessanimateWithTarget accessanimatewithtarget, TrackpadScrollingLogic trackpadScrollingLogic) {
        this.read = bottomSheetDefaults;
        this.IconCompatParcelizer = accessanimatewithtarget;
        this.serializer = trackpadScrollingLogic;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$tryApproach(SnapFlingBehavior snapFlingBehavior, PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, float f, float f2, setRippleStatelambda1 setripplestatelambda1, ContinuationImpl continuationImpl) {
        RippleNode rippleNode;
        PendingValue pendingValue;
        Object objAccess$animateDecay;
        if (continuationImpl instanceof RippleNode) {
            rippleNode = (RippleNode) continuationImpl;
            int i = rippleNode.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                rippleNode.serializer = i - Integer.MIN_VALUE;
            } else {
                rippleNode = new RippleNode(snapFlingBehavior, continuationImpl);
            }
        } else {
            rippleNode = new RippleNode(snapFlingBehavior, continuationImpl);
        }
        Object obj = rippleNode.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rippleNode.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return ContextsKt.RemoteActionCompatParcelizer(f, f2, 28);
            }
            rippleNode.serializer = 1;
            accessanimateWithTarget accessanimatewithtarget = snapFlingBehavior.IconCompatParcelizer;
            int i3 = 16;
            if (Math.abs(mainAxisk4lQ0M.IconCompatParcelizer(accessanimatewithtarget, 0.0f, f2)) >= Math.abs(f)) {
                pendingValue = new PendingValue(i3, accessanimatewithtarget);
            } else {
                pendingValue = new PendingValue(17, snapFlingBehavior.serializer);
            }
            Float f3 = new Float(f);
            Float f4 = new Float(f2);
            if (pendingValue.write != 16) {
                float fFloatValue = f3.floatValue();
                float fFloatValue2 = f4.floatValue();
                objAccess$animateDecay = SnapFlingBehaviorKt.access$animateWithTarget(platformSelectionBehaviorsImpl, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, ContextsKt.RemoteActionCompatParcelizer(0.0f, fFloatValue2, 28), (TrackpadScrollingLogic) pendingValue.serializer, setripplestatelambda1, rippleNode);
                if (objAccess$animateDecay != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objAccess$animateDecay = (setRippleState) objAccess$animateDecay;
                }
            } else {
                objAccess$animateDecay = SnapFlingBehaviorKt.access$animateDecay(platformSelectionBehaviorsImpl, f3.floatValue(), ContextsKt.RemoteActionCompatParcelizer(0.0f, f4.floatValue(), 28), (accessanimateWithTarget) pendingValue.serializer, setripplestatelambda1, rippleNode);
                if (objAccess$animateDecay != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objAccess$animateDecay = (setRippleState) objAccess$animateDecay;
                }
            }
            obj = objAccess$animateDecay;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return ((setRippleState) obj).RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{snapFlingBehavior.serializer, this.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{snapFlingBehavior.IconCompatParcelizer, this.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{snapFlingBehavior.read, this.read}, getCieXyz.write())).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fling(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) throws Throwable {
        getAllClearedRouteIds getallclearedrouteids;
        if (continuationImpl instanceof getAllClearedRouteIds) {
            getallclearedrouteids = (getAllClearedRouteIds) continuationImpl;
            int i = getallclearedrouteids.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getallclearedrouteids.serializer = i - Integer.MIN_VALUE;
            } else {
                getallclearedrouteids = new getAllClearedRouteIds(this, continuationImpl);
            }
        } else {
            getallclearedrouteids = new getAllClearedRouteIds(this, continuationImpl);
        }
        Object objWithContext = getallclearedrouteids.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getallclearedrouteids.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            DefaultFlingBehavior$performFling$2 defaultFlingBehavior$performFling$2 = new DefaultFlingBehavior$performFling$2(this, f, r8lambdaunavo3sxub_pc9xroryotnrlvsm, platformSelectionBehaviorsImpl, null);
            getallclearedrouteids.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            getallclearedrouteids.serializer = 1;
            objWithContext = BuildersKt.withContext(this.write, defaultFlingBehavior$performFling$2, getallclearedrouteids);
            if (objWithContext == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = getallclearedrouteids.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        }
        setRippleState setripplestate = (setRippleState) objWithContext;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new Float(0.0f));
        return setripplestate;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object performFling(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) throws Throwable {
        getAllRenderedRouteIds getallrenderedrouteids;
        if (continuationImpl instanceof getAllRenderedRouteIds) {
            getallrenderedrouteids = (getAllRenderedRouteIds) continuationImpl;
            int i = getallrenderedrouteids.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getallrenderedrouteids.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                getallrenderedrouteids = new getAllRenderedRouteIds(this, continuationImpl);
            }
        } else {
            getallrenderedrouteids = new getAllRenderedRouteIds(this, continuationImpl);
        }
        Object objFling = getallrenderedrouteids.RemoteActionCompatParcelizer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getallrenderedrouteids.IconCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFling);
            getallrenderedrouteids.IconCompatParcelizer = 1;
            objFling = fling(platformSelectionBehaviorsImpl, f, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getallrenderedrouteids);
            if (objFling == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFling);
        }
        setRippleState setripplestate = (setRippleState) objFling;
        return new Float(setripplestate.IconCompatParcelizer.floatValue() != 0.0f ? ((Number) setripplestate.RemoteActionCompatParcelizer.serializer()).floatValue() : 0.0f);
    }

    @Override // o.constructorimpl
    public Object performFling(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, float f, ShortNewsContentCardView shortNewsContentCardView) {
        return performFling(platformSelectionBehaviorsImpl, f, TextFieldSizeNode.RemoteActionCompatParcelizer, (ContinuationImpl) shortNewsContentCardView);
    }
}
