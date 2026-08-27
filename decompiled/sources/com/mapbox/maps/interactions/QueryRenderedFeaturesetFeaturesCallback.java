package com.mapbox.maps.interactions;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.interactions.FeaturesetFeature;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@MapboxExperimental
public interface QueryRenderedFeaturesetFeaturesCallback<FF extends FeaturesetFeature<?>> {
    void onQueryRenderedFeatures(List<? extends FF> list);
}
