package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.interactions.FeaturesetFeature;

/* JADX INFO: loaded from: classes5.dex */
public final class StandardPlaceLabelsFeature extends FeaturesetFeature<StandardPlaceLabelsState> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardPlaceLabelsFeature(FeaturesetFeatureId featuresetFeatureId, String str, Feature feature, StandardPlaceLabelsState standardPlaceLabelsState) {
        super(featuresetFeatureId, new StandardPlaceLabels(str), standardPlaceLabelsState, feature);
        feature.getClass();
        standardPlaceLabelsState.getClass();
    }

    @Override // com.mapbox.maps.interactions.FeaturesetFeature
    public Point getGeometry() {
        Geometry geometry = super.getGeometry();
        geometry.getClass();
        return (Point) geometry;
    }

    public final String getClass() {
        return getOriginalFeature().getStringProperty("class");
    }

    public final String getName() {
        return getOriginalFeature().getStringProperty("name");
    }
}
