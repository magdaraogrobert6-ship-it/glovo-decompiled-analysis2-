package com.mapbox.maps.plugin.compass;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.mapbox.maps.MapboxCameraAnimationException;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.style.layers.LayerUtils$getLayer$source$2;
import com.mapbox.maps.plugin.MapCameraPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsLifecycleListener;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$registerInternalListener$1;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$registerInternalListener$1$1$WhenMappings;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$registerInternalListener$1$1$onAnimationEnd$1;
import com.mapbox.maps.plugin.animation.animator.CameraAnimator;
import com.mapbox.maps.threading.AnimationThreadController;
import java.util.LinkedHashSet;
import o.registerInAppMessageManagerlambda2;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1 implements Animator.AnimatorListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MapCameraPlugin this$0;

    public /* synthetic */ CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1(MapCameraPlugin mapCameraPlugin, int i) {
        this.$r8$classId = i;
        this.this$0 = mapCameraPlugin;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.$r8$classId;
        animator.getClass();
        if (i != 0) {
            AnimationThreadController.INSTANCE.postOnMainThread(new LayerUtils$getLayer$source$2(this, 5, animator));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.$r8$classId;
        animator.getClass();
        if (i != 0) {
            AnimationThreadController animationThreadController = AnimationThreadController.INSTANCE;
            int i2 = 1;
            if (animationThreadController.getUsingBackgroundThread() && animator.getDuration() == 0) {
                CameraAnimationsPluginImpl cameraAnimationsPluginImpl = (CameraAnimationsPluginImpl) this.this$0;
                CameraAnimator cameraAnimator = (CameraAnimator) animator;
                registerInAppMessageManagerlambda2[] registerinappmessagemanagerlambda2Arr = CameraAnimationsPluginImpl.$$delegatedProperties;
                cameraAnimator.addInternalUpdateListener$plugin_animation_release(new CompassViewPlugin$$ExternalSyntheticLambda0(i2, new CameraAnimationsPluginImpl$registerInternalListener$1(cameraAnimationsPluginImpl, cameraAnimator)));
            }
            animationThreadController.postOnMainThread(new CameraAnimationsPluginImpl$registerInternalListener$1$1$onAnimationEnd$1(this, animator, i2));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.$r8$classId;
        animator.getClass();
        int i2 = 0;
        if (i != 0) {
            AnimationThreadController.INSTANCE.postOnMainThread(new CameraAnimationsPluginImpl$registerInternalListener$1$1$onAnimationEnd$1(this, animator, i2));
            return;
        }
        CompassViewImpl compassViewImpl = ((CompassViewPlugin) this.this$0).compassView;
        if (compassViewImpl != null) {
            compassViewImpl.setCompassVisible(false);
        } else {
            removeNodeAtDepth.serializer("compassView");
            throw null;
        }
    }

    public static final void access$finishAnimation(CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1 compassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1, Animator animator, CameraAnimationsPluginImpl.AnimationFinishStatus animationFinishStatus) {
        CameraAnimator cameraAnimator = animator instanceof CameraAnimator ? (CameraAnimator) animator : null;
        if (cameraAnimator == null) {
            throw new MapboxCameraAnimationException("Could not finish animation as it must be an instance of CameraAnimator and not null!");
        }
        CameraAnimationsPluginImpl cameraAnimationsPluginImpl = (CameraAnimationsPluginImpl) compassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1.this$0;
        LinkedHashSet linkedHashSet = cameraAnimationsPluginImpl.runningAnimatorsQueue;
        if (cameraAnimator.isInternal) {
            cameraAnimationsPluginImpl.unregisterAnimators(new ValueAnimator[]{cameraAnimator}, false);
        }
        if (cameraAnimator.skipped) {
            return;
        }
        linkedHashSet.remove(animator);
        if (linkedHashSet.isEmpty()) {
            MapboxMap mapboxMap = cameraAnimationsPluginImpl.mapTransformDelegate;
            if (mapboxMap == null) {
                removeNodeAtDepth.serializer("mapTransformDelegate");
                throw null;
            }
            mapboxMap.setUserAnimationInProgress(false);
        }
        for (CameraAnimationsLifecycleListener cameraAnimationsLifecycleListener : cameraAnimationsPluginImpl.lifecycleListeners) {
            int i = CameraAnimationsPluginImpl$registerInternalListener$1$1$WhenMappings.$EnumSwitchMapping$0[animationFinishStatus.ordinal()];
            if (i == 1) {
                cameraAnimationsLifecycleListener.onAnimatorCancelling(cameraAnimator.getType(), cameraAnimator);
            } else if (i == 2) {
                cameraAnimationsLifecycleListener.onAnimatorEnding(cameraAnimator.getType(), cameraAnimator);
            }
        }
    }
}
