package com.mapbox.maps.plugin.animation.animator;

import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.plugin.animation.CameraAnimatorOptions;
import com.mapbox.maps.plugin.animation.CameraAnimatorType;
import com.mapbox.maps.plugin.animation.CameraAnimatorsFactory$getFlyTo$animators$4;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraZoomAnimator extends CameraAnimator {
    public final CameraAnimatorType type;

    @Override // com.mapbox.maps.plugin.animation.animator.CameraAnimator
    public final CameraAnimatorType getType() {
        return this.type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraZoomAnimator(CameraAnimatorOptions cameraAnimatorOptions, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(Evaluators$POINT$1.INSTANCE$1, cameraAnimatorOptions);
        EdgeInsets edgeInsets = Evaluators.zeroEdgeInsets;
        this.type = CameraAnimatorType.ZOOM;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
        }
    }

    public CameraZoomAnimator(CameraAnimatorsFactory$getFlyTo$animators$4 cameraAnimatorsFactory$getFlyTo$animators$4, CameraAnimatorOptions cameraAnimatorOptions, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(cameraAnimatorsFactory$getFlyTo$animators$4, cameraAnimatorOptions);
        this.type = CameraAnimatorType.ZOOM;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
        }
    }
}
