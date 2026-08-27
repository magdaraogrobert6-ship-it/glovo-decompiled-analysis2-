package com.mapbox.maps.plugin.locationcomponent.animators;

import com.mapbox.geojson.Point;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl$$ExternalSyntheticLambda0;
import com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer;
import com.mapbox.maps.plugin.locationcomponent.OnIndicatorPositionChangedListener;

/* JADX INFO: loaded from: classes2.dex */
public final class PuckPositionAnimator extends PuckAnimator {
    public final OnIndicatorPositionChangedListener indicatorPositionChangedListener;

    @Override // com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator
    public final void updateLayer(float f, Object obj) {
        Point point = (Point) obj;
        point.getClass();
        LocationLayerRenderer locationLayerRenderer = this.locationRenderer;
        if (locationLayerRenderer != null) {
            locationLayerRenderer.setLatLng(point);
        }
        this.indicatorPositionChangedListener.onIndicatorPositionChanged(point);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PuckPositionAnimator(LocationComponentPluginImpl$$ExternalSyntheticLambda0 locationComponentPluginImpl$$ExternalSyntheticLambda0) {
        super(Evaluators.POINT);
        locationComponentPluginImpl$$ExternalSyntheticLambda0.getClass();
        this.indicatorPositionChangedListener = locationComponentPluginImpl$$ExternalSyntheticLambda0;
    }
}
