package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.geojson.Feature;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.interactions.FeaturesetFeature;

/* JADX INFO: loaded from: classes5.dex */
public final class StandardBuildingsFeature extends FeaturesetFeature<StandardBuildingsState> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardBuildingsFeature(FeaturesetFeatureId featuresetFeatureId, String str, Feature feature, StandardBuildingsState standardBuildingsState) {
        super(featuresetFeatureId, new StandardBuildings(str), standardBuildingsState, feature);
        feature.getClass();
        standardBuildingsState.getClass();
    }

    public final String getGroup() {
        return getOriginalFeature().getStringProperty("group");
    }

    public final Double getHeight() {
        Number numberProperty = getOriginalFeature().getNumberProperty("height");
        if (numberProperty != null) {
            return Double.valueOf(numberProperty.doubleValue());
        }
        return null;
    }

    public final Double getMinHeight() {
        Number numberProperty = getOriginalFeature().getNumberProperty("min_height");
        if (numberProperty != null) {
            return Double.valueOf(numberProperty.doubleValue());
        }
        return null;
    }
}
