package com.mapbox.maps.plugin.locationcomponent.animators;

import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl$$ExternalSyntheticLambda2;
import com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer;

/* JADX INFO: loaded from: classes2.dex */
public final class PuckAccuracyRadiusAnimator extends PuckAnimator {
    public int accuracyCircleBorderColor;
    public int accuracyCircleColor;
    public final LocationComponentPluginImpl$$ExternalSyntheticLambda2 accuracyRadiusChangedListener;

    @Override // com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator
    public final void updateLayer(float f, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        if (!this.enabled) {
            LocationLayerRenderer locationLayerRenderer = this.locationRenderer;
            if (locationLayerRenderer != null) {
                locationLayerRenderer.setAccuracyRadius(0.0f);
                return;
            }
            return;
        }
        float f2 = (float) dDoubleValue;
        float f3 = 0.0f < f2 ? f2 : 0.0f;
        LocationLayerRenderer locationLayerRenderer2 = this.locationRenderer;
        if (locationLayerRenderer2 != null) {
            locationLayerRenderer2.setAccuracyRadius(f3);
        }
        LocationLayerRenderer locationLayerRenderer3 = this.locationRenderer;
        if (locationLayerRenderer3 != null) {
            locationLayerRenderer3.styleAccuracy(this.accuracyCircleColor, this.accuracyCircleBorderColor);
        }
        this.accuracyRadiusChangedListener.onIndicatorAccuracyRadiusChanged();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PuckAccuracyRadiusAnimator(LocationComponentPluginImpl$$ExternalSyntheticLambda2 locationComponentPluginImpl$$ExternalSyntheticLambda2) {
        super(Evaluators.DOUBLE);
        locationComponentPluginImpl$$ExternalSyntheticLambda2.getClass();
        this.accuracyRadiusChangedListener = locationComponentPluginImpl$$ExternalSyntheticLambda2;
        this.accuracyCircleColor = -16776961;
        this.accuracyCircleBorderColor = -16776961;
    }
}
