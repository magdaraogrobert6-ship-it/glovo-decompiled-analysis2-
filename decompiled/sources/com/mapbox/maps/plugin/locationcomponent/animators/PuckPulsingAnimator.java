package com.mapbox.maps.plugin.locationcomponent.animators;

import android.view.animation.PathInterpolator;
import androidx.transition.Transition$3;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class PuckPulsingAnimator extends PuckAnimator {
    public static final PathInterpolator PULSING_DEFAULT_INTERPOLATOR = new PathInterpolator(0.0f, 0.0f, 0.25f, 1.0f);
    public double maxRadius;
    public final float pixelRatio;
    public final boolean pulseFadeEnabled;
    public int pulsingColor;

    public PuckPulsingAnimator(float f) {
        super(Evaluators.DOUBLE);
        this.pixelRatio = f;
        this.maxRadius = ((double) f) * 10.0d;
        this.pulsingColor = -16776961;
        this.pulseFadeEnabled = true;
        setDuration(ConstantsKt.DEFAULT_REQUEST_TIMEOUT);
        setRepeatMode(1);
        setRepeatCount(-1);
        setInterpolator(PULSING_DEFAULT_INTERPOLATOR);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator
    public final void updateLayer(float f, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        float fWrite = this.pulseFadeEnabled ? RangesKt.write(1.0f - ((float) (dDoubleValue / this.maxRadius)), 0.0f, 1.0f) : 1.0f;
        LocationLayerRenderer locationLayerRenderer = this.locationRenderer;
        if (locationLayerRenderer != null) {
            locationLayerRenderer.updatePulsingUi(this.pulsingColor, (float) dDoubleValue, Float.valueOf(f > 0.1f ? fWrite : 0.0f));
        }
    }

    public final void animateInfinite() {
        if (this.maxRadius <= 0.0d) {
            this.maxRadius = ((double) this.pixelRatio) * 10.0d;
        }
        if (!isRunning()) {
            animate(new Double[]{Double.valueOf(0.0d), Double.valueOf(this.maxRadius)}, null);
        }
        addListener(new Transition$3(10, this));
    }
}
