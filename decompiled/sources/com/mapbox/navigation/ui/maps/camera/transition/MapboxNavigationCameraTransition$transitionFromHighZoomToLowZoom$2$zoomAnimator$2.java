package com.mapbox.navigation.ui.maps.camera.transition;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2 INSTANCE;
    public static final MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2 INSTANCE$1;
    public static final MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2 INSTANCE$2;
    public static final MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2 INSTANCE$3;
    public static final MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2 INSTANCE$4;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    static {
        int i = 1;
        INSTANCE$1 = new MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2(i, i);
        INSTANCE = new MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2(i, 0);
        INSTANCE$2 = new MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2(i, 2);
        INSTANCE$3 = new MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2(i, 3);
        INSTANCE$4 = new MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2(i, 4);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            ValueAnimator valueAnimator = (ValueAnimator) obj;
            valueAnimator.getClass();
            valueAnimator.setStartDelay(0L);
            valueAnimator.setDuration(1800L);
            valueAnimator.setInterpolator(MapboxNavigationCameraTransitionKt.SLOW_OUT_SLOW_IN_INTERPOLATOR);
            return createfromparcel;
        }
        if (i == 1) {
            ValueAnimator valueAnimator2 = (ValueAnimator) obj;
            valueAnimator2.getClass();
            valueAnimator2.setStartDelay(800L);
            valueAnimator2.setDuration(1000L);
            valueAnimator2.setInterpolator(MapboxNavigationCameraTransitionKt.SLOW_OUT_SLOW_IN_INTERPOLATOR);
            return createfromparcel;
        }
        if (i == 2) {
            ValueAnimator valueAnimator3 = (ValueAnimator) obj;
            valueAnimator3.getClass();
            valueAnimator3.setStartDelay(600L);
            valueAnimator3.setDuration(1200L);
            valueAnimator3.setInterpolator(MapboxNavigationCameraTransitionKt.SLOW_OUT_SLOW_IN_INTERPOLATOR);
            return createfromparcel;
        }
        if (i != 3) {
            ValueAnimator valueAnimator4 = (ValueAnimator) obj;
            valueAnimator4.getClass();
            valueAnimator4.setStartDelay(0L);
            valueAnimator4.setDuration(1200L);
            valueAnimator4.setInterpolator(MapboxNavigationCameraTransitionKt.SLOW_OUT_SLOW_IN_INTERPOLATOR);
            return createfromparcel;
        }
        ValueAnimator valueAnimator5 = (ValueAnimator) obj;
        valueAnimator5.getClass();
        valueAnimator5.setStartDelay(0L);
        valueAnimator5.setDuration(1000L);
        valueAnimator5.setInterpolator(MapboxNavigationCameraTransitionKt.SLOW_OUT_SLOW_IN_INTERPOLATOR);
        return createfromparcel;
    }
}
