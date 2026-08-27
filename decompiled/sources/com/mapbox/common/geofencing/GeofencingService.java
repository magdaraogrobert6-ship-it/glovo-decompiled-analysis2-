package com.mapbox.common.geofencing;

import com.mapbox.geojson.Feature;

/* JADX INFO: loaded from: classes5.dex */
public interface GeofencingService {
    void addFeature(Feature feature, AddFeatureCallback addFeatureCallback);

    void addObserver(GeofencingObserver geofencingObserver, AddObserverCallback addObserverCallback);

    void clearFeatures(ClearFeaturesCallback clearFeaturesCallback);

    void configure(GeofencingOptions geofencingOptions, ConfigureCallback configureCallback);

    void getFeature(String str, GetFeatureCallback getFeatureCallback);

    void getOptions(GetOptionsCallback getOptionsCallback);

    void removeFeature(String str, RemoveFeatureCallback removeFeatureCallback);

    void removeObserver(GeofencingObserver geofencingObserver, RemoveObserverCallback removeObserverCallback);
}
