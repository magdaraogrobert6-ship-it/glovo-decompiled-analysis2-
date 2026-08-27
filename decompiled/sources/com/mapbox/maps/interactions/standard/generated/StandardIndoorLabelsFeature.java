package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.geojson.Feature;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.interactions.FeaturesetFeature;

/* JADX INFO: loaded from: classes5.dex */
public final class StandardIndoorLabelsFeature extends FeaturesetFeature<StandardIndoorLabelsState> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardIndoorLabelsFeature(FeaturesetFeatureId featuresetFeatureId, String str, Feature feature, StandardIndoorLabelsState standardIndoorLabelsState) {
        super(featuresetFeatureId, new StandardIndoorLabels(str), standardIndoorLabelsState, feature);
        feature.getClass();
        standardIndoorLabelsState.getClass();
    }

    public final String getClass() {
        return getOriginalFeature().getStringProperty("class");
    }

    public final String getName() {
        return getOriginalFeature().getStringProperty("name");
    }

    public final String getShapeType() {
        return getOriginalFeature().getStringProperty("shape_type");
    }

    public final String getType() {
        return getOriginalFeature().getStringProperty("type");
    }
}
