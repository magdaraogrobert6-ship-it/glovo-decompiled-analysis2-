package com.mapbox.maps.interactions;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.interactions.FeatureState;

/* JADX INFO: loaded from: classes4.dex */
@MapboxExperimental
public interface FeatureStateCallback<FS extends FeatureState> {
    void onFeatureState(FS fs);
}
