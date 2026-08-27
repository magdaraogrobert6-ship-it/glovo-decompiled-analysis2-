package com.mapbox.maps.plugin.locationcomponent.animators;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.mapbox.maps.plugin.compass.CompassViewPlugin$$ExternalSyntheticLambda0;
import com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer;
import com.mapbox.maps.threading.AnimationThreadController;
import java.util.Arrays;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PuckAnimator extends ValueAnimator {
    public static final LinearInterpolator DEFAULT_INTERPOLATOR = new LinearInterpolator();
    public boolean enabled;
    public LocationLayerRenderer locationRenderer;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM updateListener;
    public final ValueAnimator userConfiguredAnimator;

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator$animate$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ PuckAnimator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(PuckAnimator puckAnimator, int i) {
            super(0);
            this.$r8$classId = i;
            this.this$0 = puckAnimator;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Object invoke() {
            int i = this.$r8$classId;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            PuckAnimator puckAnimator = this.this$0;
            if (i == 0) {
                puckAnimator.start();
                return createfromparcel;
            }
            if (i == 1) {
                puckAnimator.userConfiguredAnimator.start();
                return createfromparcel;
            }
            boolean zIsRunning = puckAnimator.isRunning();
            ValueAnimator valueAnimator = puckAnimator.userConfiguredAnimator;
            if (zIsRunning) {
                puckAnimator.cancel();
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            return createfromparcel;
        }
    }

    public abstract void updateLayer(float f, Object obj);

    @Override // android.animation.ValueAnimator
    public final void setObjectValues(Object... objArr) {
        objArr.getClass();
        super.setObjectValues(Arrays.copyOf(objArr, objArr.length));
    }

    public PuckAnimator(TypeEvaluator typeEvaluator) {
        setObjectValues(new Object[0]);
        super.setEvaluator(typeEvaluator);
        super.addUpdateListener(new CompassViewPlugin$$ExternalSyntheticLambda0(2, this));
        setDuration(1000L);
        setInterpolator(DEFAULT_INTERPOLATOR);
        ValueAnimator valueAnimatorClone = clone();
        this.userConfiguredAnimator = valueAnimatorClone;
        valueAnimatorClone.setDuration(getDuration());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator clone() {
        ValueAnimator valueAnimatorClone = super.clone();
        valueAnimatorClone.getClass();
        return valueAnimatorClone;
    }

    public final void animate(Object[] objArr, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        cancelRunning();
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm == null) {
            setObjectValues(Arrays.copyOf(objArr, objArr.length));
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new AnonymousClass1(this, 0));
        } else {
            ValueAnimator valueAnimator = this.userConfiguredAnimator;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(valueAnimator);
            valueAnimator.setObjectValues(Arrays.copyOf(objArr, objArr.length));
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new AnonymousClass1(this, 1));
        }
    }

    public final void cancelRunning() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new AnonymousClass1(this, 2));
    }
}
