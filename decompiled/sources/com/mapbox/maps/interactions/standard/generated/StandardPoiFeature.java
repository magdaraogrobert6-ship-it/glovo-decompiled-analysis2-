package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.interactions.FeaturesetFeature;

/* JADX INFO: loaded from: classes5.dex */
public final class StandardPoiFeature extends FeaturesetFeature<StandardPoiState> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardPoiFeature(FeaturesetFeatureId featuresetFeatureId, String str, Feature feature, StandardPoiState standardPoiState) {
        super(featuresetFeatureId, new StandardPoi(str), standardPoiState, feature);
        feature.getClass();
        standardPoiState.getClass();
    }

    @Override // com.mapbox.maps.interactions.FeaturesetFeature
    public Point getGeometry() {
        Geometry geometry = super.getGeometry();
        geometry.getClass();
        return (Point) geometry;
    }

    public final String getAirportRef() {
        return getOriginalFeature().getStringProperty("airport_ref");
    }

    public final String getClass() {
        return getOriginalFeature().getStringProperty("class");
    }

    public final String getGroup() {
        return getOriginalFeature().getStringProperty("group");
    }

    public final String getMaki() {
        return getOriginalFeature().getStringProperty("maki");
    }

    public final String getName() {
        return getOriginalFeature().getStringProperty("name");
    }

    public final String getTransitMode() {
        return getOriginalFeature().getStringProperty("transit_mode");
    }

    public final String getTransitNetwork() {
        return getOriginalFeature().getStringProperty("transit_network");
    }

    public final String getTransitStopType() {
        return getOriginalFeature().getStringProperty("transit_stop_type");
    }
}
