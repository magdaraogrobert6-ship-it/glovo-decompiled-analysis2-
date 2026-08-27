package com.mapbox.maps.plugin.animation;

import android.os.Trace;
import com.mapbox.common.MapboxTracing;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.animation.animator.CameraAnimator;
import com.mapbox.maps.plugin.compass.CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraAnimationsPluginImpl$registerInternalListener$1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ CameraAnimator $animator;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ CameraAnimationsPluginImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraAnimationsPluginImpl$registerInternalListener$1(CameraAnimationsPluginImpl cameraAnimationsPluginImpl, CameraAnimator cameraAnimator) {
        super(0);
        this.this$0 = cameraAnimationsPluginImpl;
        this.$animator = cameraAnimator;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        CameraAnimator cameraAnimator = this.$animator;
        CameraAnimationsPluginImpl cameraAnimationsPluginImpl = this.this$0;
        if (i == 0) {
            cameraAnimator.addInternalListener$plugin_animation_release(new CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1(cameraAnimationsPluginImpl, 1));
            return createfromparcel;
        }
        if (!cameraAnimator.canceled && !cameraAnimator.endedManually) {
            cameraAnimationsPluginImpl.runningAnimatorsQueue.add(cameraAnimator);
            if (cameraAnimator.getType() == CameraAnimatorType.ANCHOR) {
                cameraAnimationsPluginImpl.setAnchor((ScreenCoordinate) cameraAnimator.getAnimatedValue());
            } else {
                CameraAnimationsUtils.updateCameraValue(cameraAnimator, cameraAnimator.getAnimatedValue(), cameraAnimationsPluginImpl.cameraOptionsBuilder);
                if (MapboxTracing.INSTANCE.getPlatformTracingEnabled()) {
                    Trace.beginSection("mbx: ".concat("maps-sdk: CameraAnimations#commitChanges#" + cameraAnimator.getType().name()));
                    try {
                        cameraAnimationsPluginImpl.commitChanges();
                    } finally {
                        Trace.endSection();
                    }
                } else {
                    cameraAnimationsPluginImpl.commitChanges();
                }
            }
        }
        return createfromparcel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraAnimationsPluginImpl$registerInternalListener$1(CameraAnimator cameraAnimator, CameraAnimationsPluginImpl cameraAnimationsPluginImpl) {
        super(0);
        this.$animator = cameraAnimator;
        this.this$0 = cameraAnimationsPluginImpl;
    }
}
