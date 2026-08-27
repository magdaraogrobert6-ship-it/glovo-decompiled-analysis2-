package com.mapbox.maps.plugin.animation.animator;

import com.mapbox.maps.plugin.animation.CameraAnimatorOptions;
import com.mapbox.maps.plugin.animation.CameraAnimatorType;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraPaddingAnimator extends CameraAnimator {
    public final CameraAnimatorType type;

    @Override // com.mapbox.maps.plugin.animation.animator.CameraAnimator
    public final CameraAnimatorType getType() {
        return this.type;
    }

    public CameraPaddingAnimator(CameraAnimatorOptions cameraAnimatorOptions, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(Evaluators.EDGE_INSET, cameraAnimatorOptions);
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
        }
        this.type = CameraAnimatorType.PADDING;
    }
}
