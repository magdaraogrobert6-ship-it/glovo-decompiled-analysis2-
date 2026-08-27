package com.mapbox.maps.plugin.animation.animator;

import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.animation.CameraAnimatorOptions;
import com.mapbox.maps.plugin.animation.CameraAnimatorType;
import java.io.Serializable;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraAnchorAnimator extends CameraAnimator {
    public static final CameraAnchorAnimator$Companion$anchorEvaluator$1 anchorEvaluator = new CameraTypeEvaluator() { // from class: com.mapbox.maps.plugin.animation.animator.CameraAnchorAnimator$Companion$anchorEvaluator$1
        @Override // android.animation.TypeEvaluator
        public final Object evaluate(float f, Object obj, Object obj2) {
            return (ScreenCoordinate) Evaluators.SCREEN_COORDINATE.evaluate(f, (ScreenCoordinate) obj, (ScreenCoordinate) obj2);
        }

        @Override // com.mapbox.maps.plugin.animation.animator.CameraTypeEvaluator
        public final boolean canSkip(Serializable serializable, Object obj, Object[] objArr) {
            serializable.getClass();
            obj.getClass();
            objArr.getClass();
            return false;
        }
    };
    public final CameraAnimatorType type;

    @Override // com.mapbox.maps.plugin.animation.animator.CameraAnimator
    public final CameraAnimatorType getType() {
        return this.type;
    }

    public CameraAnchorAnimator(CameraAnimatorOptions cameraAnimatorOptions, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(anchorEvaluator, cameraAnimatorOptions);
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
        }
        this.type = CameraAnimatorType.ANCHOR;
    }
}
