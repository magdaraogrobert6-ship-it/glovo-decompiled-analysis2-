package com.mapbox.search.base.location;

import com.mapbox.geojson.Point;
import com.mapbox.search.MapboxSearchSdk$formattedTimeProvider$2;
import com.mapbox.search.internal.bindgen.LocationProvider;
import com.mapbox.search.internal.bindgen.LonLatBBox;

/* JADX INFO: loaded from: classes3.dex */
public final class WrapperLocationProvider implements LocationProvider {
    public final LocationEngineAdapter locationProvider;

    @Override // com.mapbox.search.internal.bindgen.LocationProvider
    public final LonLatBBox getViewport() {
        return null;
    }

    @Override // com.mapbox.search.internal.bindgen.LocationProvider
    public final Point getLocation() {
        return this.locationProvider.getLocation();
    }

    public WrapperLocationProvider(LocationEngineAdapter locationEngineAdapter, MapboxSearchSdk$formattedTimeProvider$2 mapboxSearchSdk$formattedTimeProvider$2) {
        this.locationProvider = locationEngineAdapter;
    }
}
