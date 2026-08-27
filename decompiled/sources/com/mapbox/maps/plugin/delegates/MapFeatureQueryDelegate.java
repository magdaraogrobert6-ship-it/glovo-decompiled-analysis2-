package com.mapbox.maps.plugin.delegates;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.QueryRenderedFeaturesCallback;
import com.mapbox.maps.QueryRenderedRasterValuesCallback;
import com.mapbox.maps.QuerySourceFeaturesCallback;
import com.mapbox.maps.RenderedQueryGeometry;
import com.mapbox.maps.RenderedQueryOptions;
import com.mapbox.maps.RenderedRasterQueryOptions;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.SourceQueryOptions;

/* JADX INFO: loaded from: classes2.dex */
public interface MapFeatureQueryDelegate {
    Cancelable queryRenderedFeatures(RenderedQueryGeometry renderedQueryGeometry, RenderedQueryOptions renderedQueryOptions, QueryRenderedFeaturesCallback queryRenderedFeaturesCallback);

    Cancelable queryRenderedRasterValues(ScreenCoordinate screenCoordinate, RenderedRasterQueryOptions renderedRasterQueryOptions, QueryRenderedRasterValuesCallback queryRenderedRasterValuesCallback);

    Cancelable querySourceFeatures(String str, SourceQueryOptions sourceQueryOptions, QuerySourceFeaturesCallback querySourceFeaturesCallback);
}
