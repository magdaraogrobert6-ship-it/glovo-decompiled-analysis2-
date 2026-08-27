package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.geojson.Feature;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.interactions.FeaturesetFeature;

/* JADX INFO: loaded from: classes5.dex */
public final class StandardLandmarkIconsFeature extends FeaturesetFeature<StandardLandmarkIconsState> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardLandmarkIconsFeature(FeaturesetFeatureId featuresetFeatureId, String str, Feature feature, StandardLandmarkIconsState standardLandmarkIconsState) {
        super(featuresetFeatureId, new StandardLandmarkIcons(str), standardLandmarkIconsState, feature);
        feature.getClass();
        standardLandmarkIconsState.getClass();
    }

    public final String getLandmarkId() {
        return getOriginalFeature().getStringProperty("id");
    }

    public final String getName() {
        return getOriginalFeature().getStringProperty("name");
    }

    public final String getNameEn() {
        return getOriginalFeature().getStringProperty("name_en");
    }

    public final String getShortName() {
        return getOriginalFeature().getStringProperty("short_name");
    }

    public final String getShortNameEn() {
        return getOriginalFeature().getStringProperty("short_name_en");
    }

    public final String getType() {
        return getOriginalFeature().getStringProperty("type");
    }
}
