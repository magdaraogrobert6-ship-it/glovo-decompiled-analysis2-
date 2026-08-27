package com.mapbox.maps.plugin.locationcomponent.animators;

import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl$$ExternalSyntheticLambda1;
import com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer;

/* JADX INFO: loaded from: classes2.dex */
public final class PuckBearingAnimator extends PuckAnimator {
    public boolean enabled;
    public final LocationComponentPluginImpl$$ExternalSyntheticLambda1 indicatorBearingChangedListener;

    @Override // com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator
    public final void updateLayer(float f, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        if (this.enabled) {
            LocationLayerRenderer locationLayerRenderer = this.locationRenderer;
            if (locationLayerRenderer != null) {
                locationLayerRenderer.setBearing(dDoubleValue);
            }
            this.indicatorBearingChangedListener.onIndicatorBearingChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PuckBearingAnimator(LocationComponentPluginImpl$$ExternalSyntheticLambda1 locationComponentPluginImpl$$ExternalSyntheticLambda1) {
        super(Evaluators.DOUBLE);
        locationComponentPluginImpl$$ExternalSyntheticLambda1.getClass();
        this.indicatorBearingChangedListener = locationComponentPluginImpl$$ExternalSyntheticLambda1;
        this.enabled = true;
    }
}
