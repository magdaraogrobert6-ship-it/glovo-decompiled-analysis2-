package com.mapbox.maps.plugin.animation;

import com.mapbox.maps.plugin.animation.animator.CameraAnimator;

/* JADX INFO: loaded from: classes2.dex */
public interface CameraAnimationsLifecycleListener {
    void onAnimatorCancelling(CameraAnimatorType cameraAnimatorType, CameraAnimator cameraAnimator);

    void onAnimatorEnding(CameraAnimatorType cameraAnimatorType, CameraAnimator cameraAnimator);

    void onAnimatorInterrupting(CameraAnimatorType cameraAnimatorType, CameraAnimator cameraAnimator, CameraAnimator cameraAnimator2);

    void onAnimatorStarting(CameraAnimatorType cameraAnimatorType, CameraAnimator cameraAnimator, String str);
}
