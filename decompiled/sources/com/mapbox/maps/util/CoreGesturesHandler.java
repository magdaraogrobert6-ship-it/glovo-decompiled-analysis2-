package com.mapbox.maps.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.mapbox.maps.MapCenterAltitudeMode;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import com.mapbox.maps.plugin.delegates.MapTransformDelegate;
import com.mapbox.maps.threading.AnimationThreadController;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class CoreGesturesHandler {
    public static int read;
    public static int serializer;
    private MapCenterAltitudeMode cachedCenterAltitudeMode;
    private final AnimatorListenerAdapter coreGestureAnimatorHandler;
    private boolean gestureAnimationStarted;
    private boolean gestureStarted;
    private final MapCameraManagerDelegate mapCameraManagerDelegate;
    private final MapTransformDelegate mapTransformDelegate;

    public final AnimatorListenerAdapter getCoreGestureAnimatorHandler() {
        return this.coreGestureAnimatorHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSetCenterAltitudeModeNeeded() {
        return this.cachedCenterAltitudeMode != MapCenterAltitudeMode.SEA;
    }

    public CoreGesturesHandler(MapTransformDelegate mapTransformDelegate, MapCameraManagerDelegate mapCameraManagerDelegate) {
        mapTransformDelegate.getClass();
        mapCameraManagerDelegate.getClass();
        this.mapTransformDelegate = mapTransformDelegate;
        this.mapCameraManagerDelegate = mapCameraManagerDelegate;
        this.cachedCenterAltitudeMode = mapCameraManagerDelegate.getCenterAltitudeMode();
        this.coreGestureAnimatorHandler = new AnimatorListenerAdapter() { // from class: com.mapbox.maps.util.CoreGesturesHandler$coreGestureAnimatorHandler$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                animator.getClass();
                super.onAnimationEnd(animator);
                AnimationThreadController animationThreadController = AnimationThreadController.INSTANCE;
                final CoreGesturesHandler coreGesturesHandler = this.this$0;
                animationThreadController.postOnMainThread(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.util.CoreGesturesHandler$coreGestureAnimatorHandler$1$onAnimationEnd$1
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m4775invoke() {
                        coreGesturesHandler.gestureAnimationStarted = false;
                        if (coreGesturesHandler.isSetCenterAltitudeModeNeeded()) {
                            coreGesturesHandler.mapCameraManagerDelegate.setCenterAltitudeMode(coreGesturesHandler.cachedCenterAltitudeMode);
                        }
                        coreGesturesHandler.mapTransformDelegate.setGestureInProgress(false);
                    }

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m4775invoke();
                        return createFromParcel.INSTANCE;
                    }
                });
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                animator.getClass();
                super.onAnimationStart(animator);
                AnimationThreadController animationThreadController = AnimationThreadController.INSTANCE;
                final CoreGesturesHandler coreGesturesHandler = this.this$0;
                animationThreadController.postOnMainThread(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.util.CoreGesturesHandler$coreGestureAnimatorHandler$1$onAnimationStart$1
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m4776invoke() {
                        coreGesturesHandler.gestureAnimationStarted = true;
                        if (coreGesturesHandler.isSetCenterAltitudeModeNeeded()) {
                            coreGesturesHandler.mapCameraManagerDelegate.setCenterAltitudeMode(MapCenterAltitudeMode.SEA);
                        }
                    }

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m4776invoke();
                        return createFromParcel.INSTANCE;
                    }
                });
            }
        };
    }

    public final void notifyCoreGestureStarted() {
        if (this.gestureStarted) {
            return;
        }
        AnimationThreadController.INSTANCE.postOnMainThread(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.util.CoreGesturesHandler.notifyCoreGestureStarted.1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4777invoke() {
                CoreGesturesHandler coreGesturesHandler = CoreGesturesHandler.this;
                coreGesturesHandler.cachedCenterAltitudeMode = coreGesturesHandler.mapCameraManagerDelegate.getCenterAltitudeMode();
                CoreGesturesHandler.this.gestureStarted = true;
                CoreGesturesHandler.this.mapTransformDelegate.setGestureInProgress(true);
                if (CoreGesturesHandler.this.isSetCenterAltitudeModeNeeded()) {
                    CoreGesturesHandler.this.mapCameraManagerDelegate.setCenterAltitudeMode(MapCenterAltitudeMode.SEA);
                }
            }

            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4777invoke();
                return createFromParcel.INSTANCE;
            }
        });
    }

    public final void notifyCoreTouchEnded() {
        if (!this.gestureStarted || this.gestureAnimationStarted) {
            return;
        }
        AnimationThreadController.INSTANCE.postOnMainThread(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.util.CoreGesturesHandler.notifyCoreTouchEnded.1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4778invoke() {
                if (CoreGesturesHandler.this.isSetCenterAltitudeModeNeeded()) {
                    CoreGesturesHandler.this.mapCameraManagerDelegate.setCenterAltitudeMode(CoreGesturesHandler.this.cachedCenterAltitudeMode);
                }
                CoreGesturesHandler.this.mapTransformDelegate.setGestureInProgress(false);
                CoreGesturesHandler.this.gestureStarted = false;
            }

            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4778invoke();
                return createFromParcel.INSTANCE;
            }
        });
    }

    public static int IconCompatParcelizer() {
        int i = read;
        int i2 = i % 6657725;
        read = i + 1;
        if (i2 != 0) {
            return serializer;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        serializer = iMaxMemory;
        return iMaxMemory;
    }
}
