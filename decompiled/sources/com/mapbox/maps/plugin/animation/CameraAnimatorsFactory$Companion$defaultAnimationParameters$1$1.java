package com.mapbox.maps.plugin.animation;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1 INSTANCE;
    public static final CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1 INSTANCE$1;
    public static final CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1 INSTANCE$2;
    public static final CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1 INSTANCE$3;
    public static final CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1 INSTANCE$4;
    public static final CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1 INSTANCE$5;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            ValueAnimator valueAnimator = (ValueAnimator) obj;
            valueAnimator.getClass();
            valueAnimator.setDuration(300L);
            valueAnimator.setInterpolator(CameraAnimatorsFactory.DEFAULT_INTERPOLATOR);
            return createfromparcel;
        }
        if (i == 1) {
            ValueAnimator valueAnimator2 = (ValueAnimator) obj;
            valueAnimator2.getClass();
            valueAnimator2.setDuration(300L);
            valueAnimator2.setInterpolator(CameraAnimatorsFactory.DEFAULT_INTERPOLATOR);
            return createfromparcel;
        }
        if (i == 2) {
            ValueAnimator valueAnimator3 = (ValueAnimator) obj;
            valueAnimator3.getClass();
            valueAnimator3.setDuration(300L);
            valueAnimator3.setInterpolator(CameraAnimatorsFactory.DEFAULT_INTERPOLATOR);
            return createfromparcel;
        }
        if (i == 3) {
            ValueAnimator valueAnimator4 = (ValueAnimator) obj;
            valueAnimator4.getClass();
            valueAnimator4.setDuration(300L);
            valueAnimator4.setInterpolator(CameraAnimatorsFactory.DEFAULT_INTERPOLATOR);
            return createfromparcel;
        }
        if (i != 4) {
            ValueAnimator valueAnimator5 = (ValueAnimator) obj;
            valueAnimator5.getClass();
            valueAnimator5.setDuration(300L);
            valueAnimator5.setInterpolator(CameraAnimatorsFactory.DEFAULT_INTERPOLATOR);
            return createfromparcel;
        }
        ValueAnimator valueAnimator6 = (ValueAnimator) obj;
        valueAnimator6.getClass();
        valueAnimator6.setDuration(300L);
        valueAnimator6.setInterpolator(CameraAnimatorsFactory.DEFAULT_INTERPOLATOR);
        return createfromparcel;
    }

    static {
        int i = 1;
        INSTANCE = new CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1(i, 0);
        INSTANCE$1 = new CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1(i, i);
        INSTANCE$2 = new CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1(i, 2);
        INSTANCE$3 = new CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1(i, 3);
        INSTANCE$4 = new CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1(i, 4);
        INSTANCE$5 = new CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1(i, 5);
    }
}
