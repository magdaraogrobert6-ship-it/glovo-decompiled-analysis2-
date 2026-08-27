package com.mapbox.maps.plugin.animation;

import android.animation.Animator;
import android.animation.TypeEvaluator;
import androidx.datastore.core.SingleProcessDataStore$file$2;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.MapboxCameraAnimationException;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.plugin.animation.animator.CameraAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraTypeEvaluator;
import com.mapbox.maps.plugin.compass.CompassViewPlugin$$ExternalSyntheticLambda0;
import com.mapbox.maps.plugin.compass.CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1;
import com.mapbox.maps.threading.AnimationThreadController;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraAnimationsPluginImpl$registerInternalListener$1$1$onAnimationEnd$1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ Animator $animation;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CameraAnimationsPluginImpl$registerInternalListener$1$1$onAnimationEnd$1(CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1 compassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1, Animator animator, int i) {
        super(0);
        this.$r8$classId = i;
        this.this$0 = compassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1;
        this.$animation = animator;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Serializable center;
        int i = this.$r8$classId;
        Animator animator = this.$animation;
        CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1 compassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1 = this.this$0;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1.access$finishAnimation(compassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1, animator, CameraAnimationsPluginImpl.AnimationFinishStatus.ENDED);
            return createfromparcel;
        }
        createFromParcel createfromparcel2 = null;
        CameraAnimator cameraAnimator = animator instanceof CameraAnimator ? (CameraAnimator) animator : null;
        if (cameraAnimator != null) {
            CameraAnimationsPluginImpl cameraAnimationsPluginImpl = (CameraAnimationsPluginImpl) compassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1.this$0;
            if (cameraAnimator.canceled) {
                return createfromparcel;
            }
            SingleProcessDataStore$file$2 singleProcessDataStore$file$2 = cameraAnimationsPluginImpl.getCurrentCameraState;
            CopyOnWriteArraySet copyOnWriteArraySet = cameraAnimationsPluginImpl.lifecycleListeners;
            singleProcessDataStore$file$2.getClass();
            if (!cameraAnimator.skipped) {
                if (cameraAnimator.targets.length == 0) {
                    MapboxLogger.logE("Mbgl-CameraManager", "Skipped animation " + cameraAnimator.getType().name() + " with no targets!");
                    cameraAnimator.skipped = true;
                } else {
                    switch (CameraAnimator.WhenMappings.$EnumSwitchMapping$0[cameraAnimator.getType().ordinal()]) {
                        case 1:
                            center = ((CameraState) singleProcessDataStore$file$2.invoke()).getCenter();
                            center.getClass();
                            break;
                        case 2:
                            center = Double.valueOf(((CameraState) singleProcessDataStore$file$2.invoke()).getZoom());
                            break;
                        case 3:
                            center = CameraAnimator.ZERO_SCREEN_COORDINATE;
                            break;
                        case 4:
                            center = ((CameraState) singleProcessDataStore$file$2.invoke()).getPadding();
                            center.getClass();
                            break;
                        case 5:
                            center = Double.valueOf(((CameraState) singleProcessDataStore$file$2.invoke()).getBearing());
                            break;
                        case 6:
                            center = Double.valueOf(((CameraState) singleProcessDataStore$file$2.invoke()).getPitch());
                            break;
                        default:
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                    }
                    Object obj = cameraAnimator.startValue;
                    if (obj == null) {
                        obj = center;
                    }
                    Object[] objArrResolveAnimationObjectValues = cameraAnimator.resolveAnimationObjectValues(obj);
                    TypeEvaluator typeEvaluator = cameraAnimator.evaluator;
                    if ((typeEvaluator instanceof CameraTypeEvaluator) && ((CameraTypeEvaluator) typeEvaluator).canSkip(center, obj, objArrResolveAnimationObjectValues)) {
                        cameraAnimator.skipped = true;
                    } else {
                        cameraAnimator.setObjectValues(Arrays.copyOf(objArrResolveAnimationObjectValues, objArrResolveAnimationObjectValues.length));
                    }
                }
            }
            if (cameraAnimator.skipped) {
                return createfromparcel;
            }
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((CameraAnimationsLifecycleListener) it.next()).onAnimatorStarting(cameraAnimator.getType(), cameraAnimator, cameraAnimator.owner);
            }
            MapboxMap mapboxMap = cameraAnimationsPluginImpl.mapTransformDelegate;
            if (mapboxMap == null) {
                removeNodeAtDepth.serializer("mapTransformDelegate");
                throw null;
            }
            mapboxMap.setUserAnimationInProgress(true);
            for (CameraAnimator cameraAnimator2 : new HashSet(cameraAnimationsPluginImpl.animators)) {
                if (cameraAnimator2.getType() == cameraAnimator.getType() && cameraAnimator2.isRunning() && !cameraAnimator2.equals(cameraAnimator)) {
                    Iterator it2 = copyOnWriteArraySet.iterator();
                    while (it2.hasNext()) {
                        ((CameraAnimationsLifecycleListener) it2.next()).onAnimatorInterrupting(cameraAnimator.getType(), cameraAnimator2, cameraAnimator);
                    }
                    AnimationThreadController.INSTANCE.postOnAnimatorThread(new CameraAnimator.C01401(cameraAnimator2, 2));
                }
            }
            if (!AnimationThreadController.INSTANCE.getUsingBackgroundThread() || cameraAnimator.getDuration() != 0) {
                cameraAnimator.addInternalUpdateListener$plugin_animation_release(new CompassViewPlugin$$ExternalSyntheticLambda0(1, new CameraAnimationsPluginImpl$registerInternalListener$1(cameraAnimationsPluginImpl, cameraAnimator)));
            }
            createfromparcel2 = createfromparcel;
        }
        if (createfromparcel2 != null) {
            return createfromparcel;
        }
        throw new MapboxCameraAnimationException("Could not start animation as it must be an instance of CameraAnimator and not null!");
    }
}
