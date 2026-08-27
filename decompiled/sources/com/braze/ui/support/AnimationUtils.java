package com.braze.ui.support;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class AnimationUtils {
    private static final Interpolator accelerateInterpolator = new AccelerateInterpolator();
    private static final Interpolator decelerateInterpolator = new DecelerateInterpolator();

    public static final Animation setAnimationParams(Animation animation, long j, boolean z) {
        animation.getClass();
        animation.setDuration(j);
        if (z) {
            animation.setInterpolator(accelerateInterpolator);
            return animation;
        }
        animation.setInterpolator(decelerateInterpolator);
        return animation;
    }

    public static final Animation createHorizontalAnimation(float f, float f2, long j, boolean z) {
        return setAnimationParams(new TranslateAnimation(1, f, 1, f2, 2, 0.0f, 2, 0.0f), j, z);
    }

    public static final Animation createVerticalAnimation(float f, float f2, long j, boolean z) {
        return setAnimationParams(new TranslateAnimation(2, 0.0f, 2, 0.0f, 1, f, 1, f2), j, z);
    }
}
