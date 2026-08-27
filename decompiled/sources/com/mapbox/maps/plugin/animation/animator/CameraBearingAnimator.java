package com.mapbox.maps.plugin.animation.animator;

import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.plugin.animation.CameraAnimatorOptions;
import com.mapbox.maps.plugin.animation.CameraAnimatorType;
import com.mapbox.maps.util.MathUtils;
import o.onContentCardClicked;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraBearingAnimator extends CameraAnimator {
    public final CameraAnimatorType type;
    public final boolean useShortestPath;

    @Override // com.mapbox.maps.plugin.animation.animator.CameraAnimator
    public final CameraAnimatorType getType() {
        return this.type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraBearingAnimator(CameraAnimatorOptions cameraAnimatorOptions, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(Evaluators$POINT$1.INSTANCE$1, cameraAnimatorOptions);
        EdgeInsets edgeInsets = Evaluators.zeroEdgeInsets;
        this.useShortestPath = true;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
        }
        this.type = CameraAnimatorType.BEARING;
    }

    @Override // com.mapbox.maps.plugin.animation.animator.CameraAnimator
    public final Object[] resolveAnimationObjectValues(Object obj) {
        obj.getClass();
        if (!this.useShortestPath) {
            return super.resolveAnimationObjectValues(obj);
        }
        MathUtils mathUtils = MathUtils.INSTANCE;
        Object[] objArr = this.targets;
        int length = objArr.length + 1;
        double[] dArr = new double[length];
        int i = 0;
        while (i < length) {
            dArr[i] = i == 0 ? ((Double) obj).doubleValue() : ((Double[]) objArr)[i - 1].doubleValue();
            i++;
        }
        return onContentCardClicked.IconCompatParcelizer(mathUtils.prepareOptimalBearingPath(dArr));
    }
}
