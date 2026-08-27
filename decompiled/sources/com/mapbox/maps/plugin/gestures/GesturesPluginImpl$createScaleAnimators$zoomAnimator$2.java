package com.mapbox.maps.plugin.gestures;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.restore;

/* JADX INFO: loaded from: classes2.dex */
public final class GesturesPluginImpl$createScaleAnimators$zoomAnimator$2 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ long $animationTime;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ restore $scaleInterpolator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GesturesPluginImpl$createScaleAnimators$zoomAnimator$2(restore restoreVar, long j, int i) {
        super(1);
        this.$r8$classId = i;
        this.$scaleInterpolator = restoreVar;
        this.$animationTime = j;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        long j = this.$animationTime;
        restore restoreVar = this.$scaleInterpolator;
        if (i == 0) {
            ValueAnimator valueAnimator = (ValueAnimator) obj;
            valueAnimator.getClass();
            valueAnimator.setInterpolator(restoreVar);
            valueAnimator.setDuration(j);
            return createfromparcel;
        }
        if (i == 1) {
            ValueAnimator valueAnimator2 = (ValueAnimator) obj;
            valueAnimator2.getClass();
            valueAnimator2.setInterpolator(restoreVar);
            valueAnimator2.setDuration(j);
            return createfromparcel;
        }
        if (i != 2) {
            ValueAnimator valueAnimator3 = (ValueAnimator) obj;
            valueAnimator3.getClass();
            valueAnimator3.setInterpolator(restoreVar);
            valueAnimator3.setDuration(j);
            return createfromparcel;
        }
        ValueAnimator valueAnimator4 = (ValueAnimator) obj;
        valueAnimator4.getClass();
        valueAnimator4.setInterpolator(restoreVar);
        valueAnimator4.setDuration(j);
        return createfromparcel;
    }
}
